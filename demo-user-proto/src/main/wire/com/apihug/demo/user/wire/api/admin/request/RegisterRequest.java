package com.apihug.demo.user.wire.api.admin.request;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "Register a user"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/admin/request/request.proto",
    pluginVersion = "0.6.3-RELEASE",
    entity = "RegisterRequest",
    kind = Kind.MESSAGE
)
public class RegisterRequest {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Size(
      max = 32
  )
  @Schema(
      description = "name of the user",
      maxLength = 32,
      required = true,
      example = "My Lord"
  )
  protected String name;

  @Email
  @Schema(
      description = "email address of this user"
  )
  protected String email;

  @NotBlank
  @Size(
      max = 32,
      min = 5
  )
  @Schema(
      description = "password of this account",
      maxLength = 32,
      minLength = 5,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String password;

  public String getName() {
    return name;
  }

  public RegisterRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public RegisterRequest setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public RegisterRequest setPassword(String password) {
    this.password = password;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("RegisterRequest{");
    builder.append("name=").append(name);
    builder.append(", email=").append(email);
    builder.append(", password=").append(password);
    return builder.append('}').toString();
  }
}
