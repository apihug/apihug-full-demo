package com.apihug.demo.inventory.wire.api.storage.request;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "Add a new storage location"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/storage/request/request.proto",
    pluginVersion = "0.6.3-RELEASE",
    entity = "AddStorageLocationRequest",
    kind = Kind.MESSAGE
)
public class AddStorageLocationRequest {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "name of the location",
      maxLength = 32,
      required = true,
      example = "A1-112-5B"
  )
  protected String name;

  @Schema(
      description = "comment of this"
  )
  protected String remark;

  public String getName() {
    return name;
  }

  public AddStorageLocationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public AddStorageLocationRequest setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("AddStorageLocationRequest{");
    builder.append("name=").append(name);
    builder.append(", remark=").append(remark);
    return builder.append('}').toString();
  }
}
