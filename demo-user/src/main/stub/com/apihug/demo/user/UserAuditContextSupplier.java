package com.apihug.demo.user;

import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import hope.common.spring.data.persistence.context.PersistenceContext;
import hope.common.spring.security.Customer;
import hope.common.spring.security.context.HopeContextHolder;
import hope.common.spring.util.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuditContextSupplier implements AuditContextSupplier {

  protected final PersistenceContext persistenceContext;

  protected final AuditContext auditContext;

  public UserAuditContextSupplier(
      @Autowired(required = false) PersistenceContext _persistenceContext) {

    this.persistenceContext =
        _persistenceContext == null ? PersistenceContext.DEFAULT : _persistenceContext;

    AuditContext.AuditContextBuilder builder = AuditContext.builder();

    // Current persistent context
    final Object userId = persistenceContext.defaultUserId();
    final Object tenantId = persistenceContext.defaultTenant();

    // Persistent context Identify type is java.lang.Long
    builder.identifier(NumberUtils.toLong(userId));

    // Persistent context Tenant type is java.lang.Long
    builder.tenant(NumberUtils.toLong(tenantId));

    auditContext = builder.build();
  }

  @Override
  public <Identify, Tenant> AuditContext<Identify, Tenant> get() {
    final Customer customer = HopeContextHolder.getContext();
    if (customer != null && !customer.isAnonymous()) {
      return AuditContext.from(customer);
    }
    return auditContext;
  }
}