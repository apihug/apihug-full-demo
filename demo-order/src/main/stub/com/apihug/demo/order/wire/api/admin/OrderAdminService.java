package com.apihug.demo.order.wire.api.admin;

import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

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
  default void sayHello(SimpleResultBuilder<String> builder) {
    builder.notImplemented();
  }

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
  default void addOrder(SimpleResultBuilder<OrderAddedResponse> builder,
      AddOrderRequest addOrderRequest) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Authorities: [ORDER_ADD, ORDER_DELETE]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /order/admin/delete-order}
   * 	<p>{@code delete order }
   */
  default void deleteOrder(SimpleResultBuilder<OrderDeletedResponse> builder,
      DeleteOrderRequest deleteOrderRequest) {
    builder.notImplemented();
  }
}
