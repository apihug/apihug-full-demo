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
    description = "Stock in response"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/admin/response.proto",
    pluginVersion = "0.7.2-RELEASE",
    entity = "StockInResponse",
    kind = Kind.MESSAGE
)
public class StockInResponse {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "sku of this product",
      maxLength = 32,
      requiredMode = Schema.RequiredMode.REQUIRED,
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
      defaultValue = "1"
  )
  protected Long quantity;

  @Max(1)
  @Min(9999)
  @Schema(
      description = "total left quality",
      minimum = "9999.0",
      maximum = "1.0",
      example = "11",
      defaultValue = "1"
  )
  protected Long totalQuantity;

  public String getSku() {
    return sku;
  }

  public StockInResponse setSku(String sku) {
    this.sku = sku;
    return this;
  }

  public Long getQuantity() {
    return quantity;
  }

  public StockInResponse setQuantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  public Long getTotalQuantity() {
    return totalQuantity;
  }

  public StockInResponse setTotalQuantity(Long totalQuantity) {
    this.totalQuantity = totalQuantity;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("StockInResponse{");
    builder.append("sku=").append(sku);
    builder.append(", quantity=").append(quantity);
    builder.append(", totalQuantity=").append(totalQuantity);
    return builder.append('}').toString();
  }
}
