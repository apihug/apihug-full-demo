package com.apihug.demo.user.wire.infra.settings.sample;

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
    value = "com/apihug/demo/user/proto/infra/settings/sample/error.proto",
    pluginVersion = "0.7.0-RELEASE",
    entity = "ExampleErrorsEnum",
    kind = Kind.ENUM
)
public enum ExampleErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("user").setTitle("UNDEFINED");

  public static final Error EXAMPLE_ERROR_BIG = new Error();

  public static final Error EXAMPLE_ERROR_SMALL = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    EXAMPLE_ERROR_BIG.setDomain("user");
    EXAMPLE_ERROR_BIG.setCode(1002023);
    EXAMPLE_ERROR_BIG.setDescription("this is big wrong");
    EXAMPLE_ERROR_BIG.setDescriptionZhCN("wrong*3");
    EXAMPLE_ERROR_BIG.setTitle("EXAMPLE_ERROR_BIG");
    EXAMPLE_ERROR_BIG.setTips("please contract your admin +3");
    EXAMPLE_ERROR_BIG.setPhase(Phase.DOMAIN);
    EXAMPLE_ERROR_BIG.setSeverity(Severity.FATAL);
    _ERRORS_MAP.put("EXAMPLE_ERROR_BIG", EXAMPLE_ERROR_BIG);
    ERRORS.add(EXAMPLE_ERROR_BIG);
    EXAMPLE_ERROR_SMALL.setDomain("user");
    EXAMPLE_ERROR_SMALL.setCode(1002024);
    EXAMPLE_ERROR_SMALL.setDescription("this is small wrong");
    EXAMPLE_ERROR_SMALL.setDescriptionZhCN("wrong*2");
    EXAMPLE_ERROR_SMALL.setTitle("EXAMPLE_ERROR_SMALL");
    EXAMPLE_ERROR_SMALL.setTips("please contract your admin +1");
    EXAMPLE_ERROR_SMALL.setPhase(Phase.DOMAIN);
    EXAMPLE_ERROR_SMALL.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("EXAMPLE_ERROR_SMALL", EXAMPLE_ERROR_SMALL);
    ERRORS.add(EXAMPLE_ERROR_SMALL);
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
