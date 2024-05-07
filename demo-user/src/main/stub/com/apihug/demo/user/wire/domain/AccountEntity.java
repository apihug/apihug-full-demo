package com.apihug.demo.user.wire.domain;

import com.apihug.demo.user.wire.domain.bootstrap.customizer.Domain;
import hope.common.persistence.annotations.Description;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.springframework.data.relational.core.mapping.Column;

@Table(
    name = "DEMO_USER_ACCOUNT",
    indexes = {
        @Index(name = "IDX_DEMO_USER_ACCOUNT_NAME", columnList = "name"),
        @Index(name = "IDX_DEMO_USER_ACCOUNT_EMAIL", columnList = "email")
    }
)
@org.springframework.data.relational.core.mapping.Table("DEMO_USER_ACCOUNT")
@Generated("H.O.P.E. Infra Team")
public final class AccountEntity extends Domain<AccountEntity, Long, String> {
  @Column("name")
  @Description("name of the account")
  @jakarta.persistence.Column(
      name = "name",
      insertable = true,
      length = 32
  )
  protected String name;

  @Column("email")
  @Description("email of the account")
  @jakarta.persistence.Column(
      name = "email",
      nullable = true,
      unique = true,
      insertable = true,
      length = 64
  )
  protected String email;

  @Column("FRONTEND_COLOR")
  @Description("color of the frontend")
  @jakarta.persistence.Column(
      name = "FRONTEND_COLOR",
      nullable = true,
      insertable = true,
      updatable = true,
      length = 111
  )
  protected String frontendColor;

  @Column("longTime")
  @Description("long time ago")
  @jakarta.persistence.Column(
      name = "longTime",
      nullable = true,
      insertable = true,
      updatable = true,
      length = 255
  )
  protected LocalDateTime longTime;

  @Column("ADDRESS")
  @Description("address of my house")
  @jakarta.persistence.Column(
      name = "ADDRESS",
      nullable = true,
      insertable = true,
      updatable = true,
      length = 123
  )
  protected String address;

  @Column("AGE")
  @Description("age of my dog")
  @jakarta.persistence.Column(
      name = "AGE",
      nullable = true,
      insertable = true,
      updatable = true,
      length = 255
  )
  protected Long age;

  public String getName() {
    return name;
  }

  public AccountEntity setName(String name) {
    this.name = name;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public AccountEntity setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getFrontendColor() {
    return frontendColor;
  }

  public AccountEntity setFrontendColor(String frontendColor) {
    this.frontendColor = frontendColor;
    return this;
  }

  public LocalDateTime getLongTime() {
    return longTime;
  }

  public AccountEntity setLongTime(LocalDateTime longTime) {
    this.longTime = longTime;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public AccountEntity setAddress(String address) {
    this.address = address;
    return this;
  }

  public Long getAge() {
    return age;
  }

  public AccountEntity setAge(Long age) {
    this.age = age;
    return this;
  }
}
