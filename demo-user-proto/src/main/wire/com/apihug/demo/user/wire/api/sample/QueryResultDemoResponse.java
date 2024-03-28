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
    description = "demo for return query result"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/sample/sample.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "QueryResultDemoResponse",
    kind = Kind.MESSAGE
)
public class QueryResultDemoResponse {
  private static final long serialVersionUID = 0L;

  @Schema(
      description = "name of god"
  )
  protected String name;

  @Schema(
      description = "remark of the name"
  )
  protected String remark;

  @NotBlank
  @Size(
      max = 32,
      min = 2
  )
  @Schema(
      description = "name of the user",
      maxLength = 32,
      minLength = 2,
      requiredMode = Schema.RequiredMode.REQUIRED,
      example = "aaron",
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String jakeName;

  @NotEmpty
  @NotBlank
  @Schema(
      description = "blue is good",
      requiredMode = Schema.RequiredMode.REQUIRED,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String blue;

  @NotEmpty
  @NotBlank
  @Schema(
      description = "cat is bad",
      requiredMode = Schema.RequiredMode.REQUIRED,
      extensions = @Extension(name = "x-hope-validation", properties = @ExtensionProperty(name = "blank", value = "false"))
  )
  protected String catName;

  public String getName() {
    return name;
  }

  public QueryResultDemoResponse setName(String name) {
    this.name = name;
    return this;
  }

  public String getRemark() {
    return remark;
  }

  public QueryResultDemoResponse setRemark(String remark) {
    this.remark = remark;
    return this;
  }

  public String getJakeName() {
    return jakeName;
  }

  public QueryResultDemoResponse setJakeName(String jakeName) {
    this.jakeName = jakeName;
    return this;
  }

  public String getBlue() {
    return blue;
  }

  public QueryResultDemoResponse setBlue(String blue) {
    this.blue = blue;
    return this;
  }

  public String getCatName() {
    return catName;
  }

  public QueryResultDemoResponse setCatName(String catName) {
    this.catName = catName;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("QueryResultDemoResponse{");
    builder.append("name=").append(name);
    builder.append(", remark=").append(remark);
    builder.append(", jakeName=").append(jakeName);
    builder.append(", blue=").append(blue);
    builder.append(", catName=").append(catName);
    return builder.append('}').toString();
  }
}
