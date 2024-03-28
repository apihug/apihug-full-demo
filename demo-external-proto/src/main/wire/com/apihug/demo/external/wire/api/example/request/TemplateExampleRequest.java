package com.apihug.demo.external.wire.api.example.request;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "This is a template example request,REMOVE IT"
)
@ProtoFrom(
    value = "com/apihug/demo/external/proto/api/example/request/example.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "TemplateExampleRequest",
    kind = Kind.MESSAGE
)
public class TemplateExampleRequest {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Schema(
      description = "user input name",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "Jake"
  )
  protected String name;

  @Email
  @Schema(
      description = "user input email",
      example = "jake@bigger.com"
  )
  protected String email;

  public String getName() {
    return name;
  }

  public TemplateExampleRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public TemplateExampleRequest setEmail(String email) {
    this.email = email;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("TemplateExampleRequest{");
    builder.append("name=").append(name);
    builder.append(", email=").append(email);
    return builder.append('}').toString();
  }
}
