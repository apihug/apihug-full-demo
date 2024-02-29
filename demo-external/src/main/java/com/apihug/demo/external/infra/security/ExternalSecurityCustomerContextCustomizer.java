package com.apihug.demo.external.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class ExternalSecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<ExternalCustomer> {
  @Override
  public ExternalCustomer create() {
    return new ExternalCustomer();
  }

  @Override
  public Customer anonymous() {
    return AnonymousExternalCustomer.INSTANCE;
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
