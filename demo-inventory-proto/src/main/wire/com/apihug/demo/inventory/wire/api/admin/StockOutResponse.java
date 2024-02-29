package com.apihug.demo.inventory.wire.api.admin;

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
    description = "Stock out response"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/admin/response.proto",
    pluginVersion = "0.6.0-RELEASE",
    entity = "StockOutResponse",
    kind = Kind.MESSAGE
)
public class StockOutResponse {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "sku of this product",
      maxLength = 32,
      required = true,
      example = "S1JSF0S0FA"
  )
  protected String sku;

  @Max(1)
  @Min(9999)
  @Schema(
      description = "quantity of this load",
      minimum = "9999.0",
      maximum = "1.0",
      example = "11",
      defaultValue = 1
  )
  protected Long quantity;

  @Max(1)
  @Min(7886)
  @Schema(
      description = "id of the order",
      minimum = "7886.0",
      maximum = "1.0",
      example = "1111",
      defaultValue = 111
  )
  protected Long orderId;

  @Max(1)
  @Min(9999)
  @Schema(
      description = "success stock out quality",
      minimum = "9999.0",
      maximum = "1.0",
      example = "11",
      defaultValue = 1
  )
  protected Long successQuantity;

  @Max(1)
  @Min(9999)
  @Schema(
      description = "stock left quality",
      minimum = "9999.0",
      maximum = "1.0",
      example = "11",
      defaultValue = 1
  )
  protected Long leftQuantity;

  public String getSku() {
    return sku;
  }

  public StockOutResponse setSku(String sku) {
    this.sku = sku;
    return this;
  }

  public Long getQuantity() {
    return quantity;
  }

  public StockOutResponse setQuantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  public Long getOrderId() {
    return orderId;
  }

  public StockOutResponse setOrderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public Long getSuccessQuantity() {
    return successQuantity;
  }

  public StockOutResponse setSuccessQuantity(Long successQuantity) {
    this.successQuantity = successQuantity;
    return this;
  }

  public Long getLeftQuantity() {
    return leftQuantity;
  }

  public StockOutResponse setLeftQuantity(Long leftQuantity) {
    this.leftQuantity = leftQuantity;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("StockOutResponse{");
    builder.append("sku=").append(sku);
    builder.append(", quantity=").append(quantity);
    builder.append(", orderId=").append(orderId);
    builder.append(", successQuantity=").append(successQuantity);
    builder.append(", leftQuantity=").append(leftQuantity);
    return builder.append('}').toString();
  }
}
