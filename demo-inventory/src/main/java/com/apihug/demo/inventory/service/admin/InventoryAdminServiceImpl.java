package com.apihug.demo.inventory.service.admin;

import com.apihug.demo.inventory.wire.api.admin.InventoryAdminService;
import com.apihug.demo.inventory.wire.api.admin.StockInRequest;
import com.apihug.demo.inventory.wire.api.admin.StockInResponse;
import com.apihug.demo.inventory.wire.api.admin.StockOutRequest;
import com.apihug.demo.inventory.wire.api.admin.StockOutResponse;
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
 * inventory admin service
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-03-18 18:53:14"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/admin/api.proto",
    entity = "InventoryAdminService",
    kind = Kind.RPC
)
public class InventoryAdminServiceImpl implements InventoryAdminService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public InventoryAdminServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
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
  public void stockIn(final SimpleResultBuilder<StockInResponse> builder,
      final StockInRequest stockInRequest) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void stockOut(final SimpleResultBuilder<StockOutResponse> builder,
      final StockOutRequest stockOutRequest) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
