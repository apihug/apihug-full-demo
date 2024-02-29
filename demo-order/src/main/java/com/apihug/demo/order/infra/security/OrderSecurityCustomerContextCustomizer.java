package com.apihug.demo.order.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.context.SecurityCustomerContextCustomizer;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import org.springframework.stereotype.Component;

@Component
public class OrderSecurityCustomerContextCustomizer implements SecurityCustomerContextCustomizer<OrderCustomer> {
  @Override
  public OrderCustomer create() {
    return new OrderCustomer();
  }

  @Override
  public Customer anonymous() {
    return AnonymousOrderCustomer.INSTANCE;
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
