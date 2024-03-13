package com.apihug.demo.inventory.wire.api.storage.request;

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
    description = "delete a storage location"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/storage/request/request.proto",
    pluginVersion = "0.6.9-RELEASE",
    entity = "DeleteStorageLocationRequest",
    kind = Kind.MESSAGE
)
public class DeleteStorageLocationRequest {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "id of this storage location",
      example = "11",
      defaultValue = "1"
  )
  protected Long storageLocationId;

  @Schema(
      description = "reason of delete it",
      example = "no happy"
  )
  protected String reason;

  public Long getStorageLocationId() {
    return storageLocationId;
  }

  public DeleteStorageLocationRequest setStorageLocationId(Long storageLocationId) {
    this.storageLocationId = storageLocationId;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public DeleteStorageLocationRequest setReason(String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("DeleteStorageLocationRequest{");
    builder.append("storageLocationId=").append(storageLocationId);
    builder.append(", reason=").append(reason);
    return builder.append('}').toString();
  }
}
