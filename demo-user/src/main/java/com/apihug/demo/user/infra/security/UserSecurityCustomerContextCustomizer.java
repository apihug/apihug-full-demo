package com.apihug.demo.user.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class UserSecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<UserCustomer> {
  @Override
  public UserCustomer create() {
    return new UserCustomer();
  }

  @Override
  public Customer anonymous() {
    return AnonymousUserCustomer.INSTANCE;
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
