package com.apihug.demo.order.wire.api.admin.response;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "order deleted response"
)
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/response/response.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "OrderDeletedResponse",
    kind = Kind.MESSAGE
)
public class OrderDeletedResponse {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "id of this order",
      example = "1111"
  )
  protected Long orderId;

  @Schema(
      description = "deleted reason",
      example = "wrong"
  )
  protected String reason;

  public Long getOrderId() {
    return orderId;
  }

  public OrderDeletedResponse setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public OrderDeletedResponse setReason(String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("OrderDeletedResponse{");
    builder.append("orderId=").append(orderId);
    builder.append(", reason=").append(reason);
    return builder.append('}').toString();
  }
}
