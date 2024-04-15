package com.apihug.demo.user.wire.domain.repository;

import com.apihug.demo.user.wire.domain.AccountEntity;
import com.apihug.demo.user.wire.domain.bootstrap.config.UserJdbcSupport;
import com.apihug.demo.user.wire.domain.dsl.AccountEntityDSL;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.data.persistence.CollapseHelper;
import hope.common.spring.data.persistence.spring.HopeJdbc;
import java.lang.Iterable;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@SuppressWarnings("Duplicates")
public interface AccountEntityRepository extends HopeJdbc<AccountEntity>, UserJdbcSupport, AccountEntityDSL, ListCrudRepository<AccountEntity, Long> {
  Logger __AccountEntityLogger = LoggerFactory.getLogger(AccountEntity.class);

  @Override
  default Logger logger() {
    return __AccountEntityLogger;
  }

  default void _save(AccountEntity entity) {
    final AuditContext<Long, Long> ctx = auditContext();
    if (entity.getId() == null) {
      entity.setCreatedBy(ctx.getIdentifier());
      entity.setCreatedAt(LocalDateTime.now());
      entity.setVersion(persistenceContext().versionFrom());
      entity.setTenantId(ctx.getTenant());
    } else {
      entity.setUpdatedBy(ctx.getIdentifier());
      entity.setUpdatedAt(LocalDateTime.now());
      entity.setVersion(entity.getVersion() + 1);
    }
  }

  default void _saveAll(Iterable<? extends AccountEntity> entities) {
    final AuditContext<Long, Long> ctx = auditContext();
    final LocalDateTime now = LocalDateTime.now();
    final Long version = persistenceContext().versionFrom();
    entities.forEach(entity -> {
      if (entity.getId() == null) {
        entity.setCreatedBy(ctx.getIdentifier());
        entity.setCreatedAt(now);
        entity.setVersion(version);
        entity.setTenantId(ctx.getTenant());
      } else {
        entity.setUpdatedBy(ctx.getIdentifier());
        entity.setUpdatedAt(now);
        entity.setVersion(entity.getVersion() + 1);
      }
    } );
  }

  @Override
  default <S extends AccountEntity> S save(S entity) {
    _save(entity);
    return operations().save(entity);
  }

  @Override
  default <S extends AccountEntity> List<S> saveAll(Iterable<S> entities) {
    _saveAll(entities);
    return (List<S>) operations().saveAll(entities);
  }

  default void _deleteById(Long id) {
    final LocalDateTime now = LocalDateTime.now();
    namedJdbcTemplate().update(_SQL._DELETE_BY_ID, Map.of("deleted", true, "who" , auditContext().getIdentifier(), "when" , now, "id", id, "_deleted", false));
  }

  default void _deleteAllById(Iterable<? extends Long> ids) {
    final LocalDateTime now = LocalDateTime.now();
    namedJdbcTemplate().update(_SQL._DELETE_ALL_BY_ID, Map.of("deleted", true, "who" , auditContext().getIdentifier(), "when" , now, "ids", ids, "_deleted", false));
  }

  @Override
  default void deleteById(Long id) {
    _deleteById(id);
  }

  @Override
  default void delete(AccountEntity entity) {
    deleteById(entity.getId());
  }

  @Override
  default void deleteAll(Iterable<? extends AccountEntity> entities) {
    List<Long> ids = new ArrayList<>();
    entities.forEach(e -> ids.add(e.getId()));
    _deleteAllById(ids);
  }

  Optional<AccountEntity> findByIdAndTenantId(Long id, Long tenantId);

  default Optional<AccountEntity> findByIdAndCurrentTenant(Long id) {
    return findByIdAndTenantId(id, (Long) auditContext().getTenant());
  }

  boolean existsByIdAndTenantId(Long id, Long tenantId);

  default boolean existsByIdAndCurrentTenantId(Long id) {
    return existsByIdAndTenantId(id, (Long) auditContext().getTenant());
  }

  List<AccountEntity> findAllByIdInAndTenantId(List<Long> ids, Long tenantId);

  default List<AccountEntity> findAllByIdInAndCurrentTenantId(List<Long> ids) {
    return findAllByIdInAndTenantId(ids, (Long) auditContext().getTenant());
  }

  List<AccountEntity> findAllByTenantId(Long tenantId);

  default List<AccountEntity> findAllByCurrentTenantId() {
    return findAllByTenantId((Long) auditContext().getTenant());
  }

  default int update(final AccountEntity updated) {
    Optional<AccountEntity> existOptional = findById(updated.getId());
    if (existOptional.isPresent()) {
      AccountEntity exist = existOptional.get();
      return merge(exist, updated);
    }
    return 0;
  }

  default int merge(final AccountEntity exist, final AccountEntity updated) {
    final AuditContext ctx = auditContext();
    final LocalDateTime now = LocalDateTime.now();
    final Map<String, Object> args = new HashMap<>();
    args.put("id", exist.getId());
    args.put("frontendColor", CollapseHelper.collapse(AccountEntity::getFrontendColor, updated, exist));
    args.put("longTime", CollapseHelper.collapse(AccountEntity::getLongTime, updated, exist));
    args.put("address", CollapseHelper.collapse(AccountEntity::getAddress, updated, exist));
    args.put("age", CollapseHelper.collapse(AccountEntity::getAge, updated, exist));
    args.put("when", now);
    args.put("who", ctx.getIdentifier());
    args.put("version", exist.getVersion());
    return namedJdbcTemplate().update(_SQL._UPDATE, args);
  }

  default int updateByCurrentTenant(final AccountEntity updated) {
    Optional<AccountEntity> existOptional = findByIdAndCurrentTenant(updated.getId());
    if (existOptional.isPresent()) {
      AccountEntity exist = existOptional.get();
      return merge(exist, updated);
    }
    return 0;
  }

  @Transactional
  @Modifying
  default int deleteByVersion(Long id, Long version) {
    final Map<String, Object> args = new HashMap<>();
    args.put("deleted", true);
    args.put("who", auditContext().getIdentifier());
    args.put("when", LocalDateTime.now());
    args.put("id", id);
    args.put("version", version);
    args.put("_deleted", false);
    return namedJdbcTemplate().update(_SQL._DELETE_BY_VERSION, args);
  }

  /**
   * Those are H.O.P.E. generated SQL, do not modify manually, it will be overwritten every time !
   */
  interface _SQL {
    String _DELETE_BY_ID = "UPDATE DEMO_USER_ACCOUNT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = VERSION + 1 WHERE `ID` = :id AND `DELETED` = :_deleted";

    String _DELETE_ALL_BY_ID = "UPDATE DEMO_USER_ACCOUNT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = VERSION + 1 WHERE `ID` IN (:ids) AND `DELETED` = :_deleted";

    String _UPDATE = "UPDATE DEMO_USER_ACCOUNT SET `FRONTEND_COLOR` = :frontendColor, `LONG_TIME` = :longTime, `ADDRESS` = :address, `AGE` = :age, UPDATED_AT = :when, UPDATED_BY = :who, VERSION = VERSION + 1 WHERE `ID` = :id AND `VERSION` = :version";

    String _DELETE_BY_VERSION = "UPDATE DEMO_USER_ACCOUNT SET `DELETED` = :deleted, `DELETED_BY` = :who, `DELETED_AT` = :when, `UPDATED_BY` = :who, `UPDATED_AT` = :when, `VERSION` = `VERSION` + 1 WHERE `ID` = :id AND `VERSION` = :version AND `DELETED` = :_deleted";
  }
}
