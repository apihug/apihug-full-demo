package com.apihug.demo.external.cloud.order.feign;

import com.apihug.demo.external.infra.cloud.order.DemoOrderConfiguration;
import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import hope.common.api.Result;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import jakarta.validation.Valid;
import java.lang.String;
import javax.annotation.Generated;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Admin to control order
 */
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/api.proto",
    entity = "OrderAdminService",
    kind = Kind.CLIENT
)
@FeignClient(
    value = "demo-order",
    configuration = DemoOrderConfiguration.class
)
@Generated("H.O.P.E. Infra Team")
public interface OrderAdminFeign {
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
  @GetMapping("/order/admin/hello-world")
  Result<String> sayHello();

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
  @PostMapping("/order/admin/add-order")
  Result<OrderAddedResponse> addOrder(@RequestBody @Valid final AddOrderRequest addOrderRequest);
}
