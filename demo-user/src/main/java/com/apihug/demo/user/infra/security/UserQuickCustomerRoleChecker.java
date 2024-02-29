package com.apihug.demo.user.infra.security;

import hope.common.spring.security.Customer;
import hope.common.spring.security.checker.QuickCustomerRoleChecker;
import org.springframework.stereotype.Component;

@Component
public class UserQuickCustomerRoleChecker implements QuickCustomerRoleChecker<Customer> {
}
