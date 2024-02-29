package com.apihug.demo.user.wire.infra.settings.admin;

import hope.common.api.error.Error;
import hope.common.api.error.Errors;
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
    value = "com/apihug/demo/user/proto/infra/settings/admin/error.proto",
    pluginVersion = "0.6.1-RELEASE",
    entity = "UserErrorsEnum",
    kind = Kind.ENUM
)
public enum UserErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("user").setTitle("UNDEFINED");

  public static final Error USER_EXIST = new Error();

  public static final Error USER_BLOCKED = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    USER_EXIST.setDomain("user");
    USER_EXIST.setCode(1001023);
    USER_EXIST.setDescription("customer already exist");
    USER_EXIST.setDescriptionZhCN("用户存在");
    USER_EXIST.setTitle("USER_EXIST");
    USER_EXIST.setTips("contact your admin");
    USER_EXIST.setPhase(Phase.DOMAIN);
    USER_EXIST.setSeverity(Severity.FATAL);
    _ERRORS_MAP.put("USER_EXIST", USER_EXIST);
    ERRORS.add(USER_EXIST);
    USER_BLOCKED.setDomain("user");
    USER_BLOCKED.setCode(1001024);
    USER_BLOCKED.setDescription("customer is blocked");
    USER_BLOCKED.setDescriptionZhCN("用户失效");
    USER_BLOCKED.setTitle("USER_BLOCKED");
    USER_BLOCKED.setTips("possible you do something bad, contact the admin");
    USER_BLOCKED.setPhase(Phase.DOMAIN);
    USER_BLOCKED.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("USER_BLOCKED", USER_BLOCKED);
    ERRORS.add(USER_BLOCKED);
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
