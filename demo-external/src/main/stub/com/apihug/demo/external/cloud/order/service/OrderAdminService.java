package com.apihug.demo.external.cloud.order.service;

import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import java.lang.String;
import javax.annotation.Generated;

/**
 * Admin to control order
 */
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/api.proto",
    entity = "OrderAdminService",
    kind = Kind.CLIENT
)
@Generated("H.O.P.E. Infra Team")
public interface OrderAdminService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Anonymous: true</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /order/admin/hello-world}
   * 	<p>{@code hello from the admin server}
   */
  String sayHello();

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Authorities: [ORDER_ADD]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /order/admin/add-order}
   * 	<p>{@code add order}
   */
  OrderAddedResponse addOrder(AddOrderRequest addOrderRequest);
}
