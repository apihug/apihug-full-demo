package com.apihug.demo.order.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.checker.QuickCustomerRoleChecker;
import org.springframework.stereotype.Component;

@Component
public class OrderQuickCustomerRoleChecker implements QuickCustomerRoleChecker<Customer> {
}
