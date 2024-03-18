package com.apihug.demo.user.wire.api.sample;

import com.fasterxml.jackson.annotation.JsonFormat;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
@Schema(
    description = "demo to show how use the time"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/sample/time.proto",
    pluginVersion = "0.6.9-RELEASE",
    entity = "TimeDemoRequest",
    kind = Kind.MESSAGE
)
public class TimeDemoRequest {
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

  @Future
  @JsonFormat(
      pattern = "yyyy-MM-dd HH:mm:ss"
  )
  @Schema(
      description = "first demo field for date time",
      format = "date-time"
  )
  protected LocalDateTime firstDateTime;

  @Past
  @JsonFormat(
      pattern = "yyyy-MM-dd"
  )
  @Schema(
      description = "second demo example for date",
      format = "date"
  )
  protected LocalDate secondDate;

  public String getName() {
    return name;
  }

  public TimeDemoRequest setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDateTime getFirstDateTime() {
    return firstDateTime;
  }

  public TimeDemoRequest setFirstDateTime(LocalDateTime firstDateTime) {
    this.firstDateTime = firstDateTime;
    return this;
  }

  public LocalDate getSecondDate() {
    return secondDate;
  }

  public TimeDemoRequest setSecondDate(LocalDate secondDate) {
    this.secondDate = secondDate;
    return this;
  }

  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder("TimeDemoRequest{");
    builder.append("name=").append(name);
    builder.append(", firstDateTime=").append(firstDateTime);
    builder.append(", secondDate=").append(secondDate);
    return builder.append('}').toString();
  }
}
