package com.apihug.demo.inventory.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class InventorySecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<InventoryCustomer> {
  @Override
  public InventoryCustomer create() {
    return new InventoryCustomer();
  }

  @Override
  public Customer anonymous() {
    return AnonymousInventoryCustomer.INSTANCE;
  }

  @Override
  public Class tenantClz() {
    return Long.class;
  }

  @Override
  public Class identifierClz() {
    return Long.class;
  }
}
