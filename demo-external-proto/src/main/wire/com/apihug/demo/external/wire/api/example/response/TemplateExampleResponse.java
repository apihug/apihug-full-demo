package com.apihug.demo.external.wire.api.example.response;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "This is a template example response"
)
@ProtoFrom(
    value = "com/apihug/demo/external/proto/api/example/response/example.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "TemplateExampleResponse",
    kind = Kind.MESSAGE
)
public class TemplateExampleResponse {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "user input name",
      example = "Jake"
  )
  protected String name;

  @NotEmpty
  @Schema(
      description = "response hello",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "hello Jake"
  )
  protected String hello;

  public String getName() {
    return name;
  }

  public TemplateExampleResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getHello() {
    return hello;
  }

  public TemplateExampleResponse setHello(String hello) {
    this.hello = hello;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("TemplateExampleResponse{");
    builder.append("name=").append(name);
    builder.append(", hello=").append(hello);
    return builder.append('}').toString();
  }
}
