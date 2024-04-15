package com.apihug.demo.user.wire.domain.dsl;

import com.apihug.demo.user.wire.domain.AccountEntity;
import hope.common.persistence.Column;
import hope.common.persistence.Types;
import hope.common.spring.data.persistence.repository.dsl.DSL;
import hope.common.spring.data.persistence.repository.sql.ColumnMix;
import hope.common.spring.data.persistence.wire.Auditable;
import hope.common.spring.data.persistence.wire.Deletable;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.springframework.data.relational.core.sql.Comparison;
import org.springframework.data.relational.core.sql.SQL;
import org.springframework.data.relational.core.sql.Table;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

@Generated("H.O.P.E. Infra Team")
public interface AccountEntityDSL extends DSL<AccountEntity> {
  Table table = Table.create("DEMO_USER_ACCOUNT").as("_demo_user_account");

  @Override
  default Table table() {
    return table;
  }

  @Override
  default boolean isIdentifiable() {
    return true;
  }

  @Override
  default ColumnMix idColumn() {
    return _Identifiable_.ID;
  }

  @Override
  default boolean isAuditable() {
    return true;
  }

  @Override
  default Auditable auditable() {
    return _Auditable_.INSTANCE;
  }

  @Override
  default boolean isSoftDeletable() {
    return true;
  }

  @Override
  default Deletable deletable() {
    return _Deletable_.INSTANCE;
  }

  @Override
  default boolean isVersionable() {
    return true;
  }

  @Override
  default ColumnMix versionColumn() {
    return _Versionable_.VERSION;
  }

  @Override
  default boolean isTenantable() {
    return true;
  }

  @Override
  default ColumnMix tenantColumn() {
    return _Tenantable_.TENANT_ID;
  }

  @Override
  default Map<String, ColumnMix> fieldColumnMap() {
    return ColumnsMap.field2Column;
  }

  @Override
  default Object[] parameters(AccountEntity entity, Object[] carrier, int beginIndex) {
    carrier[beginIndex + 0] = entity.getName();
    carrier[beginIndex + 1] = entity.getEmail();
    carrier[beginIndex + 2] = entity.getFrontendColor();
    LocalDateTime _3 = entity.getLongTime();
    carrier[beginIndex + 3] = _3 == null ? null : Timestamp.valueOf(_3);
    carrier[beginIndex + 4] = entity.getAddress();
    carrier[beginIndex + 5] = entity.getAge();
    return carrier;
  }

  @Override
  default String domain() {
    return "user";
  }

  @Override
  default boolean isDefault() {
    return true;
  }

  @Override
  default Class domainClass() {
    return AccountEntity.class;
  }

  interface _Identifiable_ {
    ColumnMix ID = ColumnMix.of(table, 
    	new Column()
    		.setName("ID")
    		.setFieldName("id")
    		.setClz("java.lang.Long")
    		.setUnique(true)
    		.setInsertable(false)
    		.setUpdatable(false)
    		.setSortable(true)
    		.setType(Types.BIGINT));
  }

  interface _Auditable_ extends Auditable {
    _Auditable_ INSTANCE = new _Auditable_() {};

    ColumnMix CREATED_AT = ColumnMix.of(table, 
    	new Column()
    		.setName("CREATED_AT")
    		.setFieldName("createdAt")
    		.setClz("java.time.LocalDateTime")
    		.setType(Types.TIMESTAMP)
    		.setUpdatable(false)
    		.setSortable(true)
    		.setDescription("Created time of the record"));

    ColumnMix CREATED_BY = ColumnMix.of(table, 
    	new Column()
    		.setName("CREATED_BY")
    		.setFieldName("createdBy")
    		.setClz("java.lang.Long")
    		.setType(Types.INTEGER)
    		.setDescription("Identify of who create the record"));

    ColumnMix UPDATED_AT = ColumnMix.of(table, 
    	new Column()
    		.setName("UPDATED_AT")
    		.setFieldName("updatedAt")
    		.setClz("java.time.LocalDateTime")
    		.setType(Types.TIMESTAMP)
    		.setSortable(true)
    		.setDescription("Updated time of the record"));

    ColumnMix UPDATED_BY = ColumnMix.of(table, 
    	new Column()
    		.setName("UPDATED_BY")
    		.setFieldName("updatedBy")
    		.setClz("java.lang.Long")
    		.setType(Types.INTEGER)
    		.setDescription("Identify of who update the record"));

    @Override
    default ColumnMix createdAt() {
      return CREATED_AT;
    }

    @Override
    default ColumnMix createdBy() {
      return CREATED_BY;
    }

    @Override
    default ColumnMix updatedAt() {
      return UPDATED_AT;
    }

    @Override
    default ColumnMix updatedBy() {
      return UPDATED_BY;
    }
  }

  interface _Deletable_ extends Deletable {
    _Deletable_ INSTANCE = new _Deletable_() {};

    ColumnMix DELETED = ColumnMix.of(table, 
    	new Column()
    		.setName("DELETED")
    		.setFieldName("deleted")
    		.setClz("java.lang.Boolean")
    		.setType(Types.BIT)
    		.setDescription("Deleted flag for soft delete"));

    ColumnMix DELETED_AT = ColumnMix.of(table, 
    	new Column()
    		.setName("DELETED_AT")
    		.setFieldName("deletedAt")
    		.setClz("java.time.LocalDateTime")
    		.setType(Types.TIMESTAMP)
    		.setDescription("Deleted timestamp of this record"));

    ColumnMix DELETED_BY = ColumnMix.of(table, 
    	new Column()
    		.setName("DELETED_BY")
    		.setFieldName("deletedBy")
    		.setClz("java.lang.Long")
    		.setType(Types.INTEGER)
    		.setDescription("Identify of who delete this record"));

    @Override
    default ColumnMix deleted() {
      return DELETED;
    }

    @Override
    default ColumnMix deletedAt() {
      return DELETED_AT;
    }

    @Override
    default ColumnMix deletedBy() {
      return DELETED_BY;
    }
  }

  interface _Versionable_ {
    ColumnMix VERSION = ColumnMix.of(table, 
    	new Column()
    		.setName("VERSION")
    		.setFieldName("version")
    		.setClz("java.lang.Long")
    		.setSortable(true)
    		.setType(Types.BIGINT));
  }

  interface _Tenantable_ {
    ColumnMix TENANT_ID = ColumnMix.of(table, 
    	new Column()
    		.setName("TENANT_ID")
    		.setFieldName("tenantId")
    		.setClz("java.lang.Long")
    		.setUpdatable(false)
    		.setType(Types.INTEGER));
  }

  interface ColumnsMap {
    Map<String, ColumnMix> field2Column = 
     Map.ofEntries(

    	Map.entry("ID", _Identifiable_.ID),
    	Map.entry("NAME", Domain.Name),
    	Map.entry("EMAIL", Domain.Email),
    	Map.entry("FRONTENDCOLOR", Domain.FrontendColor),
    	Map.entry("LONGTIME", Domain.LongTime),
    	Map.entry("ADDRESS", Domain.Address),
    	Map.entry("AGE", Domain.Age),
    	// Auditable,
    	Map.entry("CREATEDAT", _Auditable_.CREATED_AT),
    	Map.entry("CREATED_BY", _Auditable_.CREATED_BY),
    	Map.entry("UPDATEDAT", _Auditable_.UPDATED_AT),
    	Map.entry("UPDATEDBY", _Auditable_.UPDATED_BY),
    	// Deletable,
    	Map.entry("DELETED", _Deletable_.DELETED),
    	Map.entry("DELETEDAT", _Deletable_.DELETED_AT),
    	Map.entry("DELETEDBY", _Deletable_.DELETED_BY),
    	// Versionable,
    	Map.entry("VERSION", _Versionable_.VERSION),
    	// Tenantable,
    	Map.entry("TENANTID", _Tenantable_.TENANT_ID)
    );
  }

  interface Domain {
    ColumnMix Name = ColumnMix.of(table, 
    	new Column().setFieldName("name")
    		.setName("NAME")
    		.setClz("java.lang.String")
    		.setType(Types.VARCHAR)
    		.setDescription("name of the account")
    		.setInsertable(true)
    		.setLength(32));

    ColumnMix Email = ColumnMix.of(table, 
    	new Column().setFieldName("email")
    		.setName("EMAIL")
    		.setClz("java.lang.String")
    		.setType(Types.VARCHAR)
    		.setDescription("email of the account")
    		.setNullable(true)
    		.setUnique(true)
    		.setInsertable(true)
    		.setLength(64));

    ColumnMix FrontendColor = ColumnMix.of(table, 
    	new Column().setFieldName("frontendColor")
    		.setName("FRONTEND_COLOR")
    		.setClz("java.lang.String")
    		.setType(Types.VARCHAR)
    		.setDescription("color of the frontend")
    		.setUpdatable(true)
    		.setNullable(true)
    		.setInsertable(true)
    		.setLength(111));

    ColumnMix LongTime = ColumnMix.of(table, 
    	new Column().setFieldName("longTime")
    		.setName("LONG_TIME")
    		.setClz("java.time.LocalDateTime")
    		.setType(Types.TIMESTAMP)
    		.setDescription("long time ago")
    		.setUpdatable(true)
    		.setNullable(true)
    		.setInsertable(true)
    		.setLength(255));

    ColumnMix Address = ColumnMix.of(table, 
    	new Column().setFieldName("address")
    		.setName("ADDRESS")
    		.setClz("java.lang.String")
    		.setType(Types.VARCHAR)
    		.setDescription("address of my house")
    		.setUpdatable(true)
    		.setNullable(true)
    		.setInsertable(true)
    		.setLength(123));

    ColumnMix Age = ColumnMix.of(table, 
    	new Column().setFieldName("age")
    		.setName("AGE")
    		.setClz("java.lang.Long")
    		.setType(Types.BIGINT)
    		.setDescription("age of my dog")
    		.setUpdatable(true)
    		.setNullable(true)
    		.setInsertable(true)
    		.setLength(255));

    List<ColumnMix> ALL = List.of(Name, Email, FrontendColor, LongTime, Address, Age);

    ColumnMix Id = _Identifiable_.ID;

    ColumnMix CreatedAt = _Auditable_.CREATED_AT;

    ColumnMix CreatedBy = _Auditable_.CREATED_BY;

    ColumnMix UpdatedAt = _Auditable_.UPDATED_AT;

    ColumnMix UpdatedBy = _Auditable_.UPDATED_BY;

    ColumnMix Deleted = _Deletable_.DELETED;

    ColumnMix DeletedAt = _Deletable_.DELETED_AT;

    ColumnMix DeletedBy = _Deletable_.DELETED_BY;

    ColumnMix Version = _Versionable_.VERSION;

    ColumnMix TenantId = _Tenantable_.TENANT_ID;
  }

  interface Template {
    ParameterizedPreparedStatementSetter<AccountEntity> SETTER = 
    (ps, entity) -> {
    ps.setString(1, entity.getName());
    ps.setString(2, entity.getEmail());
    ps.setString(3, entity.getFrontendColor());
    ps.setTimestamp(4, Timestamp.valueOf(entity.getLongTime()));
    ps.setString(5, entity.getAddress());
    ps.setLong(6, entity.getAge());
    };

    RowMapper<AccountEntity> MAPPER = new RowMapper() {
      @Override
      public AccountEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        final AccountEntity entity = new AccountEntity();
        entity.setId(rs.getLong(1));
        entity.setName(rs.getString(2));
        entity.setEmail(rs.getString(3));
        entity.setFrontendColor(rs.getString(4));
        Timestamp _5 = rs.getTimestamp(5);
        if (_5 != null) {
          entity.setLongTime(_5.toLocalDateTime());
        }
        entity.setAddress(rs.getString(6));
        entity.setAge(rs.getLong(7));
        Timestamp _8 = rs.getTimestamp(8);
        if (_8 != null) {
          entity.setCreatedAt(_8.toLocalDateTime());
        }
        entity.setCreatedBy(rs.getLong(9));
        Timestamp _10 = rs.getTimestamp(10);
        if (_10 != null) {
          entity.setUpdatedAt(_10.toLocalDateTime());
        }
        entity.setUpdatedBy(rs.getLong(11));
        Boolean _12 = rs.getBoolean(12);
        if (_12 != null) {
        entity.setDeleted(_12);
        } else {
        entity.setDeleted(false);
        }
        Timestamp _13 = rs.getTimestamp(13);
        if (_13 != null) {
          entity.setDeletedAt(_13.toLocalDateTime());
        }
        entity.setDeletedBy(rs.getLong(14));
        entity.setVersion(rs.getLong(15));
        entity.setTenantId(rs.getLong(16));
        return entity;
      }
    };
  }

  interface Segment {
    Comparison TENANT_EQUAL = _Tenantable_.TENANT_ID.column().isEqualTo(SQL.bindMarker());

    Comparison LIVE = _Deletable_.DELETED.column().isEqualTo(SQL.literalOf(false));
  }
}
