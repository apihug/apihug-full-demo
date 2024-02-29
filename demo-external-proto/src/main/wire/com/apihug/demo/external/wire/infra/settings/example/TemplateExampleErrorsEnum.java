package com.apihug.demo.external.wire.infra.settings.example;

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
    value = "com/apihug/demo/external/proto/infra/settings/example/error.proto",
    pluginVersion = "0.6.1-RELEASE",
    entity = "TemplateExampleErrorsEnum",
    kind = Kind.ENUM
)
public enum TemplateExampleErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("external").setTitle("UNDEFINED");

  public static final Error THIS_IS_WRONG = new Error();

  public static final Error THIS_IS_BAD = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    THIS_IS_WRONG.setDomain("external");
    THIS_IS_WRONG.setCode(1024);
    THIS_IS_WRONG.setDescription("this is wrong example");
    THIS_IS_WRONG.setDescriptionZhCN("示范错误");
    THIS_IS_WRONG.setTitle("THIS_IS_WRONG");
    THIS_IS_WRONG.setTips("This always happen when you not remove this template sample");
    THIS_IS_WRONG.setPhase(Phase.DOMAIN);
    THIS_IS_WRONG.setSeverity(Severity.FATAL);
    _ERRORS_MAP.put("THIS_IS_WRONG", THIS_IS_WRONG);
    ERRORS.add(THIS_IS_WRONG);
    THIS_IS_BAD.setDomain("external");
    THIS_IS_BAD.setCode(1025);
    THIS_IS_BAD.setDescription("this is bad");
    THIS_IS_BAD.setDescriptionZhCN("还没有移除呢");
    THIS_IS_BAD.setTitle("THIS_IS_BAD");
    THIS_IS_BAD.setTips("If you see this, meaning you copy the template code here");
    THIS_IS_BAD.setPhase(Phase.CONTROLLER);
    THIS_IS_BAD.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("THIS_IS_BAD", THIS_IS_BAD);
    ERRORS.add(THIS_IS_BAD);
    ERRORS_MAP = Collections.unmodifiableMap(_ERRORS_MAP);
  }

  @Override
  public String domain() {
    return "external";
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
