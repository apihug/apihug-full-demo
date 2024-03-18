package com.apihug.demo.order.wire.infra.settings.admin;

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
    value = "com/apihug/demo/order/proto/infra/settings/admin/error.proto",
    pluginVersion = "0.7.2-RELEASE",
    entity = "OrderErrorsEnum",
    kind = Kind.ENUM
)
public enum OrderErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("order").setTitle("UNDEFINED");

  public static final Error NOT_EXIST = new Error();

  public static final Error CAN_NOT_DELETE = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    NOT_EXIST.setDomain("order");
    NOT_EXIST.setCode(1001023);
    NOT_EXIST.setDescription("order gone");
    NOT_EXIST.setDescriptionZhCN("just gone");
    NOT_EXIST.setTitle("NOT_EXIST");
    NOT_EXIST.setTips("please contract your admin");
    NOT_EXIST.setPhase(Phase.CONTROLLER);
    NOT_EXIST.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("NOT_EXIST", NOT_EXIST);
    ERRORS.add(NOT_EXIST);
    CAN_NOT_DELETE.setDomain("order");
    CAN_NOT_DELETE.setCode(1001024);
    CAN_NOT_DELETE.setDescription("order is stub can's delete");
    CAN_NOT_DELETE.setDescriptionZhCN("i do not know");
    CAN_NOT_DELETE.setTitle("CAN_NOT_DELETE");
    CAN_NOT_DELETE.setTips("please contract your admin, and kill it");
    CAN_NOT_DELETE.setPhase(Phase.DOMAIN);
    CAN_NOT_DELETE.setSeverity(Severity.ERROR);
    _ERRORS_MAP.put("CAN_NOT_DELETE", CAN_NOT_DELETE);
    ERRORS.add(CAN_NOT_DELETE);
    ERRORS_MAP = Collections.unmodifiableMap(_ERRORS_MAP);
  }

  @Override
  public String domain() {
    return "order";
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
