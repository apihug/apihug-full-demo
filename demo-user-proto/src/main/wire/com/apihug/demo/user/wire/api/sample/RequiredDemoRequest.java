package com.apihug.demo.user.wire.api.sample;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "This is an example request"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/sample/sample.proto",
    pluginVersion = "0.6.6-RELEASE",
    entity = "RequiredDemoRequest",
    kind = Kind.MESSAGE
)
public class RequiredDemoRequest {
  private static final long serialVersionUID = 0L;

  @NotEmpty
  @Schema(
      description = "name of the user",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "My Lord"
  )
  protected String name;

  @NotBlank
  @Schema(
      description = "another not blank sample",
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "another not blank",
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String another;

  @Size(
      min = 2
  )
  @Schema(
      description = "another min length example",
      minLength = 2,
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "another min length"
  )
  protected String anAnother;

  public String getName() {
    return name;
  }

  public RequiredDemoRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getAnother() {
    return another;
  }

  public RequiredDemoRequest setAnother(String another) {
    this.another = another;
    return this;
  }

  public String getAnAnother() {
    return anAnother;
  }

  public RequiredDemoRequest setAnAnother(String anAnother) {
    this.anAnother = anAnother;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("RequiredDemoRequest{");
    builder.append("name=").append(name);
    builder.append(", another=").append(another);
    builder.append(", anAnother=").append(anAnother);
    return builder.append('}').toString();
  }
}
