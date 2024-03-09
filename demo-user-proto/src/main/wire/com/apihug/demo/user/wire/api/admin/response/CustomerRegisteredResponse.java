package com.apihug.demo.user.wire.api.admin.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.time.LocalDateTime;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "customer registered successfully"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/admin/response/response.proto",
    pluginVersion = "0.6.5-RELEASE",
    entity = "CustomerRegisteredResponse",
    kind = Kind.MESSAGE
)
public class CustomerRegisteredResponse {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "name of the user",
      maxLength = 32,
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "My Lord"
  )
  protected String name;

  @Schema(
      description = "id of this customer",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "1024",
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected Long customerId;

  @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss"
  )
  @Schema(
      description = "date of registered",
      format = "date-time"
  )
  protected LocalDateTime registerDate;

  public String getName() {
    return name;
  }

  public CustomerRegisteredResponse setName(String name) {
    this.name = name;
    return this;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public CustomerRegisteredResponse setCustomerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  public LocalDateTime getRegisterDate() {
    return registerDate;
  }

  public CustomerRegisteredResponse setRegisterDate(LocalDateTime registerDate) {
    this.registerDate = registerDate;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("CustomerRegisteredResponse{");
    builder.append("name=").append(name);
    builder.append(", customerId=").append(customerId);
    builder.append(", registerDate=").append(registerDate);
    return builder.append('}').toString();
  }
}
