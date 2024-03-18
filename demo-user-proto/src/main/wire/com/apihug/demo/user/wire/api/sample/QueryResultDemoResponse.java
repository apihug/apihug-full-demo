package com.apihug.demo.user.wire.api.sample;

import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
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
    pluginVersion = "0.7.0-RELEASE",
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

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("QueryResultDemoResponse{");
    builder.append("name=").append(name);
    builder.append(", remark=").append(remark);
    return builder.append('}').toString();
  }
}
