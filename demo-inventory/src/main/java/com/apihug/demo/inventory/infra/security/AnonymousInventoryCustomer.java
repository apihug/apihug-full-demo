package com.apihug.demo.inventory.infra.security;

import hope.common.spring.security.internal.ImmutableCustomer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;

public class AnonymousInventoryCustomer extends InventoryCustomer {
  static final AnonymousInventoryCustomer INSTANCE = new AnonymousInventoryCustomer();

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
  public AnonymousInventoryCustomer setId(Long id) {
    throw ImmutableCustomer.ImmutableExceptions.setId;
  }

  @Override
  public AnonymousInventoryCustomer setTenantId(Long tenantId) {
    throw ImmutableCustomer.ImmutableExceptions.setTenantId;
  }

  @Override
  public AnonymousInventoryCustomer setAccount(String account) {
    throw ImmutableCustomer.ImmutableExceptions.setAccount;
  }

  @Override
  public AnonymousInventoryCustomer setActive(boolean active) {
    throw ImmutableCustomer.ImmutableExceptions.setActive;
  }

  @Override
  public AnonymousInventoryCustomer setAuthorities(Collection<String> authorities) {
    throw ImmutableCustomer.ImmutableExceptions.setAuthorities;
  }

  @Override
  public AnonymousInventoryCustomer setName(String name) {
    throw ImmutableCustomer.ImmutableExceptions.setName;
  }

  @Override
  public AnonymousInventoryCustomer setRoles(Collection<String> roles) {
    throw ImmutableCustomer.ImmutableExceptions.setRoles;
  }
}
