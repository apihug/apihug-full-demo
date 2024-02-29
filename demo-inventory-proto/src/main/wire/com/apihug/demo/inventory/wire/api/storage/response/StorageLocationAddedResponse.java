package com.apihug.demo.inventory.wire.api.storage.response;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "storage location added"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/storage/response/response.proto",
    pluginVersion = "0.6.1-RELEASE",
    entity = "StorageLocationAddedResponse",
    kind = Kind.MESSAGE
)
public class StorageLocationAddedResponse {
  private static final long serialVersionUID = 0L;

  @NotNull
  @Schema(
      description = "id of this storage location",
      required = true,
      example = "11"
  )
  protected Long storageLocationId;

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

  public Long getStorageLocationId() {
    return storageLocationId;
  }

  public StorageLocationAddedResponse setStorageLocationId(Long storageLocationId) {
    this.storageLocationId = storageLocationId;
    return this;
  }

  public String getName() {
    return name;
  }

  public StorageLocationAddedResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public StorageLocationAddedResponse setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("StorageLocationAddedResponse{");
    builder.append("storageLocationId=").append(storageLocationId);
    builder.append(", name=").append(name);
    builder.append(", remark=").append(remark);
    return builder.append('}').toString();
  }
}
