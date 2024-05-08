package com.apihug.demo.user.wire.infra.settings.sample;

import hope.common.api.error.Error;
import hope.common.api.error.Errors;
import hope.common.api.error.HttpStatus;
import hope.common.api.error.Phase;
import hope.common.api.error.Severity;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@ProtoFrom(
    value = "com/apihug/demo/user/proto/infra/settings/sample/error.proto",
    entity = "UserErrorEnum",
    kind = Kind.ENUM
)
public enum UserErrorEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("user").setTitle("UNDEFINED");

  public static final Error NOT_EXIST = new Error();

  public static final Error STATUS_BLOCKED = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    NOT_EXIST.setDomain("user");
    NOT_EXIST.setCode(1001);
    NOT_EXIST.setDescription("name is bad");
    NOT_EXIST.setDescription2("not not exist");
    NOT_EXIST.setTitle("NOT_EXIST");
    NOT_EXIST.setTips("please correct your name");
    NOT_EXIST.setPhase(Phase.DOMAIN);
    NOT_EXIST.setSeverity(Severity.WARN);
    NOT_EXIST.setHttpStatus(HttpStatus.BAD_REQUEST);
    _ERRORS_MAP.put("NOT_EXIST", NOT_EXIST);
    ERRORS.add(NOT_EXIST);
    STATUS_BLOCKED.setDomain("user");
    STATUS_BLOCKED.setCode(1002);
    STATUS_BLOCKED.setDescription("account may illegal");
    STATUS_BLOCKED.setDescription2("contact your admin");
    STATUS_BLOCKED.setTitle("STATUS_BLOCKED");
    STATUS_BLOCKED.setTips("You are blocked");
    STATUS_BLOCKED.setPhase(Phase.DOMAIN);
    STATUS_BLOCKED.setSeverity(Severity.FATAL);
    STATUS_BLOCKED.setHttpStatus(HttpStatus.UNAUTHORIZED);
    _ERRORS_MAP.put("STATUS_BLOCKED", STATUS_BLOCKED);
    ERRORS.add(STATUS_BLOCKED);
    ERRORS_MAP = Collections.unmodifiableMap(_ERRORS_MAP);
  }

  @Override
  public String domain() {
    return "user";
  }

  @Override
  public List<Error> items() {
    return ERRORS;
  }

  @Override
  public Error map(String name) {
    return ERRORS_MAP.getOrDefault(name, UNDEFINED);
  }
}
