package com.apihug.demo.order.infra.security;

import hope.common.spring.security.internal.ImmutableCustomer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;

public class AnonymousOrderCustomer extends OrderCustomer {
  static final AnonymousOrderCustomer INSTANCE = new AnonymousOrderCustomer();

  @Override
  public Long getTenantId() {
    throw ImmutableCustomer.ImmutableExceptions.getTenantId;
  }

  @Override
  public Long getId() {
    throw ImmutableCustomer.ImmutableExceptions.getId;
  }

  @Override
  public boolean isActive() {
    return false;
  }

  @Override
  public boolean isAnonymous() {
    return true;
  }

  @Override
  public boolean hasAnyAuthorities(Collection<String> authorities) {
    return false;
  }

  @Override
  public boolean hasAnyRoles(Collection<String> roles) {
    return false;
  }

  @Override
  public boolean hasNoAuthority() {
    return true;
  }

  @Override
  public boolean hasNoRole() {
    return true;
  }

  @Override
  public AnonymousOrderCustomer setId(Long id) {
    throw ImmutableCustomer.ImmutableExceptions.setId;
  }

  @Override
  public AnonymousOrderCustomer setTenantId(Long tenantId) {
    throw ImmutableCustomer.ImmutableExceptions.setTenantId;
  }

  @Override
  public AnonymousOrderCustomer setAccount(String account) {
    throw ImmutableCustomer.ImmutableExceptions.setAccount;
  }

  @Override
  public AnonymousOrderCustomer setActive(boolean active) {
    throw ImmutableCustomer.ImmutableExceptions.setActive;
  }

  @Override
  public AnonymousOrderCustomer setAuthorities(Collection<String> authorities) {
    throw ImmutableCustomer.ImmutableExceptions.setAuthorities;
  }

  @Override
  public AnonymousOrderCustomer setName(String name) {
    throw ImmutableCustomer.ImmutableExceptions.setName;
  }

  @Override
  public AnonymousOrderCustomer setRoles(Collection<String> roles) {
    throw ImmutableCustomer.ImmutableExceptions.setRoles;
  }
}
