package com.apihug.demo.user.wire.api.admin.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.time.LocalDateTime;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "password updated response"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/admin/response/response.proto",
    pluginVersion = "0.6.0-RELEASE",
    entity = "CustomerPasswordUpdatedResponse",
    kind = Kind.MESSAGE
)
public class CustomerPasswordUpdatedResponse {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "id of this customer",
      example = "1024"
  )
  protected Long customerId;

  @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss"
  )
  @Schema(
      description = "date of this password updated",
      format = "date-time"
  )
  protected LocalDateTime updatedDate;

  public Long getCustomerId() {
    return customerId;
  }

  public CustomerPasswordUpdatedResponse setCustomerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  public LocalDateTime getUpdatedDate() {
    return updatedDate;
  }

  public CustomerPasswordUpdatedResponse setUpdatedDate(LocalDateTime updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("CustomerPasswordUpdatedResponse{");
    builder.append("customerId=").append(customerId);
    builder.append(", updatedDate=").append(updatedDate);
    return builder.append('}').toString();
  }
}
