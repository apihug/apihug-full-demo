package com.apihug.demo.user.wire.domain.bootstrap.config;

import hope.common.spring.data.config.HopeDataProperties;
import hope.common.spring.data.persistence.context.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;

public class UserPersistenceContext implements PersistenceContext<Long, Long> {

  @Autowired(required = false)
  protected HopeDataProperties properties;

  @Override
  public Long defaultUserId() {
    return properties != null ? properties.getDefaultUserId() : 0L;
  }

  @Override
  public Long defaultTenant() {
    return properties != null ? properties.getDefaultTenantId() : 0L;
  }

  @Override
  public Class identifierClass() {
    return Long.class;
  }

  @Override
  public Class tenantClass() {
    return Long.class;
  }

  @Override
  public String domain() {
    return "user";
  }

  @Override
  public boolean isDefault() {
    return true;
  }
}