package com.apihug.demo.user.service.admin;

import com.apihug.demo.user.wire.api.admin.UserAdminService;
import com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest;
import com.apihug.demo.user.wire.api.admin.request.RegisterRequest;
import com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse;
import com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse;
import hope.common.guardian.annotation.Version;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import hope.common.meta.version.Type;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * User admin server
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-02-29 17:40:23"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/admin/api.proto",
    entity = "UserAdminService",
    kind = Kind.RPC
)
public class UserAdminServiceImpl implements UserAdminService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public UserAdminServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void sayHello(final SimpleResultBuilder<String> builder) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void registerCustomer(final SimpleResultBuilder<CustomerRegisteredResponse> builder,
      final RegisterRequest registerRequest) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void changePassword(final SimpleResultBuilder<CustomerPasswordUpdatedResponse> builder,
      final ChangePasswordRequest changePasswordRequest) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
