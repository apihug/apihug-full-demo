package com.apihug.demo.user.infra.security;

import hope.common.spring.security.internal.ImmutableCustomer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;

public class AnonymousUserCustomer extends UserCustomer {
  static final AnonymousUserCustomer INSTANCE = new AnonymousUserCustomer();

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
  public AnonymousUserCustomer setId(Long id) {
    throw ImmutableCustomer.ImmutableExceptions.setId;
  }

  @Override
  public AnonymousUserCustomer setTenantId(Long tenantId) {
    throw ImmutableCustomer.ImmutableExceptions.setTenantId;
  }

  @Override
  public AnonymousUserCustomer setAccount(String account) {
    throw ImmutableCustomer.ImmutableExceptions.setAccount;
  }

  @Override
  public AnonymousUserCustomer setActive(boolean active) {
    throw ImmutableCustomer.ImmutableExceptions.setActive;
  }

  @Override
  public AnonymousUserCustomer setAuthorities(Collection<String> authorities) {
    throw ImmutableCustomer.ImmutableExceptions.setAuthorities;
  }

  @Override
  public AnonymousUserCustomer setName(String name) {
    throw ImmutableCustomer.ImmutableExceptions.setName;
  }

  @Override
  public AnonymousUserCustomer setRoles(Collection<String> roles) {
    throw ImmutableCustomer.ImmutableExceptions.setRoles;
  }
}
