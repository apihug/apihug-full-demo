package com.apihug.demo.inventory.wire.infra.settings.admin;

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
    value = "com/apihug/demo/inventory/proto/infra/settings/admin/error.proto",
    pluginVersion = "0.6.6-RELEASE",
    entity = "InventoryErrorsEnum",
    kind = Kind.ENUM
)
public enum InventoryErrorsEnum implements Errors {
  INSTANCE;

  public static final List<Error> ERRORS = new ArrayList();

  public static final Map<String, Error> ERRORS_MAP;

  public static final Error UNDEFINED = Error.unknown().setDomain("inventory").setTitle("UNDEFINED");

  public static final Error STOCK_IN_FULL = new Error();

  public static final Error STOCK_OUT_EMPTY = new Error();

  public static final Error STORAGE_CAN_NOT_DELETE = new Error();

  static {
    Map<String, Error> _ERRORS_MAP = new LinkedHashMap<>();
    STOCK_IN_FULL.setDomain("inventory");
    STOCK_IN_FULL.setCode(1001023);
    STOCK_IN_FULL.setDescription("stock in fail as the storage is full");
    STOCK_IN_FULL.setDescriptionZhCN("full of goods");
    STOCK_IN_FULL.setTitle("STOCK_IN_FULL");
    STOCK_IN_FULL.setTips("please contract your admin ");
    STOCK_IN_FULL.setPhase(Phase.DOMAIN);
    STOCK_IN_FULL.setSeverity(Severity.FATAL);
    _ERRORS_MAP.put("STOCK_IN_FULL", STOCK_IN_FULL);
    ERRORS.add(STOCK_IN_FULL);
    STOCK_OUT_EMPTY.setDomain("inventory");
    STOCK_OUT_EMPTY.setCode(1001024);
    STOCK_OUT_EMPTY.setDescription("stock out fail as the storage is empty");
    STOCK_OUT_EMPTY.setDescriptionZhCN("empty of goods");
    STOCK_OUT_EMPTY.setTitle("STOCK_OUT_EMPTY");
    STOCK_OUT_EMPTY.setTips("please contract your admin");
    STOCK_OUT_EMPTY.setPhase(Phase.DOMAIN);
    STOCK_OUT_EMPTY.setSeverity(Severity.WARN);
    _ERRORS_MAP.put("STOCK_OUT_EMPTY", STOCK_OUT_EMPTY);
    ERRORS.add(STOCK_OUT_EMPTY);
    STORAGE_CAN_NOT_DELETE.setDomain("inventory");
    STORAGE_CAN_NOT_DELETE.setCode(2);
    STORAGE_CAN_NOT_DELETE.setDescription("Storage still using maybe");
    STORAGE_CAN_NOT_DELETE.setDescriptionZhCN("can not delete it just");
    STORAGE_CAN_NOT_DELETE.setTitle("STORAGE_CAN_NOT_DELETE");
    STORAGE_CAN_NOT_DELETE.setTips("please ask your boss");
    STORAGE_CAN_NOT_DELETE.setPhase(Phase.DOMAIN);
    STORAGE_CAN_NOT_DELETE.setSeverity(Severity.ERROR);
    STORAGE_CAN_NOT_DELETE.setHttpStatus(HttpStatus.BAD_REQUEST);
    _ERRORS_MAP.put("STORAGE_CAN_NOT_DELETE", STORAGE_CAN_NOT_DELETE);
    ERRORS.add(STORAGE_CAN_NOT_DELETE);
    ERRORS_MAP = Collections.unmodifiableMap(_ERRORS_MAP);
  }

  @Override
  public String domain() {
    return "inventory";
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
