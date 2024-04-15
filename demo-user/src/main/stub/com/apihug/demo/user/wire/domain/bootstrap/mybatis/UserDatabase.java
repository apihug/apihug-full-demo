package com.apihug.demo.user.wire.domain.bootstrap.mybatis;

import com.apihug.demo.user.wire.domain.dsl.AccountEntityDSL;
import hope.common.spring.data.persistence.mybatis.AnalystHelper;
import hope.common.spring.data.persistence.wire.Wirer.Known;
import hope.common.spring.data.persistence.wire.Wirer.Mixer;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

@Generated("H.O.P.E. Infra Team")
public interface UserDatabase {
  UserDatabase.AccountEntity DEMO_USER_ACCOUNT = new AccountEntity();

  Supplier<UserDatabase.AccountEntity> DEMO_USER_ACCOUNT_ALIAS = AccountEntity::new;

  final class AccountEntity extends SqlTable {
    private final List<SqlColumn>[] _CACHE_COLUMN_LIST;

    public final SqlColumn<String> Name = AnalystHelper.mapper(AccountEntityDSL.Domain.Name, this);

    public final SqlColumn<String> Email = AnalystHelper.mapper(AccountEntityDSL.Domain.Email, this);

    public final SqlColumn<String> FrontendColor = AnalystHelper.mapper(AccountEntityDSL.Domain.FrontendColor, this);

    public final SqlColumn<LocalDateTime> LongTime = AnalystHelper.mapper(AccountEntityDSL.Domain.LongTime, this);

    public final SqlColumn<String> Address = AnalystHelper.mapper(AccountEntityDSL.Domain.Address, this);

    public final SqlColumn<Long> Age = AnalystHelper.mapper(AccountEntityDSL.Domain.Age, this);

    public final SqlColumn<Long> Id = AnalystHelper.mapper(AccountEntityDSL.Domain.Id, this);

    public final SqlColumn<LocalDateTime> CreatedAt = AnalystHelper.mapper(AccountEntityDSL.Domain.CreatedAt, this);

    public final SqlColumn<Long> CreatedBy = AnalystHelper.mapper(AccountEntityDSL.Domain.CreatedBy, this);

    public final SqlColumn<LocalDateTime> UpdatedAt = AnalystHelper.mapper(AccountEntityDSL.Domain.UpdatedAt, this);

    public final SqlColumn<Long> UpdatedBy = AnalystHelper.mapper(AccountEntityDSL.Domain.UpdatedBy, this);

    public final SqlColumn<Boolean> Deleted = AnalystHelper.mapper(AccountEntityDSL.Domain.Deleted, this);

    public final SqlColumn<LocalDateTime> DeletedAt = AnalystHelper.mapper(AccountEntityDSL.Domain.DeletedAt, this);

    public final SqlColumn<Long> DeletedBy = AnalystHelper.mapper(AccountEntityDSL.Domain.DeletedBy, this);

    public final SqlColumn<Long> Version = AnalystHelper.mapper(AccountEntityDSL.Domain.Version, this);

    public final SqlColumn<Long> TenantId = AnalystHelper.mapper(AccountEntityDSL.Domain.TenantId, this);

    public AccountEntity() {
      super("DEMO_USER_ACCOUNT");
      _CACHE_COLUMN_LIST = new List[Known._SIZE_+1];;
    }

    public boolean isIdentifiable() {
      return true;
    }

    public boolean isAuditable() {
      return true;
    }

    public boolean isSoftDeletable() {
      return true;
    }

    public boolean isVersionable() {
      return true;
    }

    public boolean isTenantable() {
      return true;
    }

    public List<SqlColumn> columnsOfDomain() {
      return columnsOf(Known.DOMAIN);
    }

    public List<SqlColumn> columnsOfIdentifiedDomain() {
      return columnsOf(Known.IDENTIFIED_DOMAIN);
    }

    public List<SqlColumn> columnsOfAll() {
      return columnsOf(Known.ALL);
    }

    public List<SqlColumn> columnsOf(Mixer kind) {
      assert kind.good() : "Exceed the range of predefined column composited kind";
      List<SqlColumn> res = _CACHE_COLUMN_LIST[kind.bit()];
      if (res == null) {
        res = new ArrayList<>();
        if (kind.idIncluded()) {
          res.add(Id);
        }
        if (kind.domainIncluded()) {
          res.add(Name);
          res.add(Email);
          res.add(FrontendColor);
          res.add(LongTime);
          res.add(Address);
          res.add(Age);
        }
        if(kind.auditIncluded()) {
          res.add(CreatedAt);
          res.add(CreatedBy);
          res.add(UpdatedAt);
          res.add(UpdatedBy);
        }
        if(kind.deleteIncluded()) {
          res.add(Deleted);
          res.add(DeletedAt);
          res.add(DeletedBy);
        }
        if(kind.versionIncluded()) {
          res.add(Version);
        }
        if(kind.tenantIncluded()) {
          res.add(TenantId);
        }
        _CACHE_COLUMN_LIST[kind.bit()] = res;
      }
      return res;
    }
  }
}
