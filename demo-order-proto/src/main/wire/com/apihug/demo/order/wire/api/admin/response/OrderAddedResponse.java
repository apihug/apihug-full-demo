package com.apihug.demo.order.wire.api.admin.response;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "Order placed already"
)
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/response/response.proto",
    pluginVersion = "0.7.0-RELEASE",
    entity = "OrderAddedResponse",
    kind = Kind.MESSAGE
)
public class OrderAddedResponse {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "id of this order",
      example = "111"
  )
  protected Long orderId;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "SKU of the product",
      maxLength = 32,
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "XSK12MADA"
  )
  protected String skuId;

  @Max(1)
  @Min(122)
  @Schema(
      description = "quantity of this oder",
      minimum = "122.0",
      maximum = "1.0",
      example = "1",
      defaultValue = "1"
  )
  protected Long quantity;

  public Long getOrderId() {
    return orderId;
  }

  public OrderAddedResponse setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public String getSkuId() {
    return skuId;
  }

  public OrderAddedResponse setSkuId(String skuId) {
    this.skuId = skuId;
    return this;
  }

  public Long getQuantity() {
    return quantity;
  }

  public OrderAddedResponse setQuantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("OrderAddedResponse{");
    builder.append("orderId=").append(orderId);
    builder.append(", skuId=").append(skuId);
    builder.append(", quantity=").append(quantity);
    return builder.append('}').toString();
  }
}
