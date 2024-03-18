package com.apihug.demo.user.wire.infra.settings.good;

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
    value = "com/apihug/demo/user/proto/infra/settings/good/error.proto",
    pluginVersion = "0.7.2-RELEASE",
    entity = "GoodErrorsEnum",
    kind = Kind.ENUM
)
public enum GoodErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("user").setTitle("UNDEFINED");

  public static final Error BROKEN_BOX = new Error();

  public static final Error OUT_OF_DATE = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    BROKEN_BOX.setDomain("user");
    BROKEN_BOX.setCode(1007023);
    BROKEN_BOX.setDescription("this is big wrong");
    BROKEN_BOX.setDescriptionZhCN("wrong*3");
    BROKEN_BOX.setTitle("BROKEN_BOX");
    BROKEN_BOX.setTips("please contract your admin +3");
    BROKEN_BOX.setPhase(Phase.DOMAIN);
    BROKEN_BOX.setSeverity(Severity.FATAL);
    _ERRORS_MAP.put("BROKEN_BOX", BROKEN_BOX);
    ERRORS.add(BROKEN_BOX);
    OUT_OF_DATE.setDomain("user");
    OUT_OF_DATE.setCode(1007024);
    OUT_OF_DATE.setDescription("this is small wrong");
    OUT_OF_DATE.setDescriptionZhCN("wrong*2");
    OUT_OF_DATE.setTitle("OUT_OF_DATE");
    OUT_OF_DATE.setTips("please contract your admin +1");
    OUT_OF_DATE.setPhase(Phase.DOMAIN);
    OUT_OF_DATE.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("OUT_OF_DATE", OUT_OF_DATE);
    ERRORS.add(OUT_OF_DATE);
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
