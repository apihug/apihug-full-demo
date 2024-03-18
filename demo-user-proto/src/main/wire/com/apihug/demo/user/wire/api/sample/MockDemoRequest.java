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
    value = "com/apihug/demo/user/proto/api/sample/mock.proto",
    pluginVersion = "0.7.0-RELEASE",
    entity = "MockDemoRequest",
    kind = Kind.MESSAGE
)
public class MockDemoRequest {
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

  @NotBlank
  @Schema(
      description = "name for chinese people",
      requiredMode = Schema.RequiredMode.REQUIRED,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String chineseName;

  @NotBlank
  @Schema(
      description = "address of china",
      requiredMode = Schema.RequiredMode.REQUIRED,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String chinaAddress;

  public String getName() {
    return name;
  }

  public MockDemoRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getChineseName() {
    return chineseName;
  }

  public MockDemoRequest setChineseName(String chineseName) {
    this.chineseName = chineseName;
    return this;
  }

  public String getChinaAddress() {
    return chinaAddress;
  }

  public MockDemoRequest setChinaAddress(String chinaAddress) {
    this.chinaAddress = chinaAddress;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("MockDemoRequest{");
    builder.append("name=").append(name);
    builder.append(", chineseName=").append(chineseName);
    builder.append(", chinaAddress=").append(chinaAddress);
    return builder.append('}').toString();
  }
}
