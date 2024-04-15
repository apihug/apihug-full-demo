package com.apihug.demo.user.wire.domain.bootstrap.config;

import hope.common.spring.audit.AuditContext;
import hope.common.spring.data.persistence.context.PersistenceContext;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

public interface UserJdbcSupport {
  JdbcOperations jdbcTemplate();

  NamedParameterJdbcOperations namedJdbcTemplate();

  <Identify, Tenant> AuditContext<Identify, Tenant> auditContext();

  <Identify, Tenant> PersistenceContext<Identify, Tenant> persistenceContext();
}