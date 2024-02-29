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
    description = "Stock in request"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/admin/request.proto",
    pluginVersion = "0.6.0-RELEASE",
    entity = "StockInRequest",
    kind = Kind.MESSAGE
)
public class StockInRequest {
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

  public String getSku() {
    return sku;
  }

  public StockInRequest setSku(String sku) {
    this.sku = sku;
    return this;
  }

  public Long getQuantity() {
    return quantity;
  }

  public StockInRequest setQuantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("StockInRequest{");
    builder.append("sku=").append(sku);
    builder.append(", quantity=").append(quantity);
    return builder.append('}').toString();
  }
}
