package com.apihug.demo.order.wire.api.admin.request;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "delete the order by ID"
)
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/request/request.proto",
    pluginVersion = "0.6.0-RELEASE",
    entity = "DeleteOrderRequest",
    kind = Kind.MESSAGE
)
public class DeleteOrderRequest {
  private static final long serialVersionUID = 0L;

  @Max(1)
  @Schema(
      description = "id of this order",
      maximum = "1.0",
      example = "111",
      defaultValue = 111
  )
  protected Long orderId;

  @NotBlank
  @Size(
      max = 122,
      min = 5
  )
  @Schema(
      description = "reason why delete this order",
      maxLength = 122,
      minLength = 5,
      example = "wrong placed",
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String reason;

  public Long getOrderId() {
    return orderId;
  }

  public DeleteOrderRequest setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public DeleteOrderRequest setReason(String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("DeleteOrderRequest{");
    builder.append("orderId=").append(orderId);
    builder.append(", reason=").append(reason);
    return builder.append('}').toString();
  }
}
