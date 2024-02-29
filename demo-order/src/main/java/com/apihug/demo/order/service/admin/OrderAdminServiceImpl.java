package com.apihug.demo.order.service.admin;

import com.apihug.demo.order.wire.api.admin.OrderAdminService;
import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse;
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
 * Admin to control order
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-02-29 17:40:21"
)
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/api.proto",
    entity = "OrderAdminService",
    kind = Kind.RPC
)
public class OrderAdminServiceImpl implements OrderAdminService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public OrderAdminServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
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
  public void addOrder(final SimpleResultBuilder<OrderAddedResponse> builder,
      final AddOrderRequest addOrderRequest) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void deleteOrder(final SimpleResultBuilder<OrderDeletedResponse> builder,
      final DeleteOrderRequest deleteOrderRequest) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
