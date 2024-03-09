package com.apihug.demo.user.wire.api.admin.request;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "Change my password request"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/admin/request/request.proto",
    pluginVersion = "0.6.5-RELEASE",
    entity = "ChangePasswordRequest",
    kind = Kind.MESSAGE
)
public class ChangePasswordRequest {
  private static final long serialVersionUID = 0L;

  @NotNull
  @Schema(
      description = "id of this customer",
      requiredMode = Schema.RequiredMode.REQUIRED
  )
  protected Long customerId;

  @NotBlank
  @Size(
      max = 32,
      min = 5
  )
  @Schema(
      description = "new password",
      maxLength = 32,
      minLength = 5,
      requiredMode = Schema.RequiredMode.REQUIRED,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String newPassword;

  @Schema(
      description = "reason of change the password",
      example = "password stolen",
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "true"))
  )
  protected String reason;

  public Long getCustomerId() {
    return customerId;
  }

  public ChangePasswordRequest setCustomerId(Long customerId) {
    this.customerId = customerId;
    return this;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public ChangePasswordRequest setNewPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  public String getReason() {
    return reason;
  }

  public ChangePasswordRequest setReason(String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("ChangePasswordRequest{");
    builder.append("customerId=").append(customerId);
    builder.append(", newPassword=").append(newPassword);
    builder.append(", reason=").append(reason);
    return builder.append('}').toString();
  }
}
