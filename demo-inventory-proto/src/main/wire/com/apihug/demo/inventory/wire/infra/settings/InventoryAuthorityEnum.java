package com.apihug.demo.inventory.wire.infra.settings;

import hope.common.enumeration.Enumeration;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import io.swagger.v3.oas.annotations.media.Schema;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Schema(
    enumAsRef = true,
    nullable = false,
    allowableValues = {
        "STOCK_IN",
        "STOCK_OUT",
        "ADD_STORAGE_LOCATION",
        "DELETE_STORAGE_LOCATION"
    },
    example = "STOCK_IN",
    description = "Inventory authorities list"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/infra/settings/authority.proto",
    pluginVersion = "0.6.3-RELEASE",
    entity = "InventoryAuthorityEnum",
    kind = Kind.ENUM
)
public enum InventoryAuthorityEnum implements Enumeration<InventoryAuthorityEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  STOCK_IN(1, "stock:in", "Authority to stock in product"),

  STOCK_OUT(2, "stock:out", "Authority to stock out product"),

  ADD_STORAGE_LOCATION(1, "stock:storage:add", "Authority to add a new storage location"),

  DELETE_STORAGE_LOCATION(2, "stock:storage:delete", "Authority to delete a storage location");

  public static final List<String> VALUES;

  public static final List<InventoryAuthorityEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, InventoryAuthorityEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, InventoryAuthorityEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<InventoryAuthorityEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<InventoryAuthorityEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, InventoryAuthorityEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, InventoryAuthorityEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (InventoryAuthorityEnum each : InventoryAuthorityEnum.values()) {
    	_VALUES.add(each.title());
    	_ENUMS.add(each);
    	_CODES.add(each.code());
    	_NAME_2_ENUM_MAP.put(each.title(), each);
    	_CODE_2_ENUM_MAP.put(each.code(), each);
    }
    VALUES = Collections.unmodifiableList(_VALUES);
    ENUMS = Collections.unmodifiableList(_ENUMS);
    CODES = Collections.unmodifiableList(_CODES);
    NAME_2_ENUM_MAP = Collections.unmodifiableMap(_NAME_2_ENUM_MAP);
    CODE_2_ENUM_MAP = Collections.unmodifiableMap(_CODE_2_ENUM_MAP);
    HELPER =
    new EnumerationsHelper<InventoryAuthorityEnum>() {

    @Override
    public InventoryAuthorityEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public InventoryAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<InventoryAuthorityEnum> supportClz() {
    	return InventoryAuthorityEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<InventoryAuthorityEnum> supportEnumerations() {
    return ENUMS;
    }

    @Override
    public List<Integer> supportCodes() {
    return CODES;
    }

    };
  }

  public final int code;

  public final String description;

  public final String descriptionZhCN;

  public final boolean deprecated;

  InventoryAuthorityEnum(int code, String description, String descriptionZhCN, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.descriptionZhCN = descriptionZhCN;
    this.deprecated = deprecated;
  }

  InventoryAuthorityEnum(int code, String description, String descriptionZhCN) {
    this(code, description, descriptionZhCN, false);
  }

  @Override
  public String title() {
    return name();
  }

  @Override
  public int code() {
    return code;
  }

  @Override
  public String description() {
    return description;
  }

  @Override
  public String descriptionZhCN() {
    return descriptionZhCN != null ? descriptionZhCN : description();
  }

  @Override
  public boolean deprecated() {
    return deprecated;
  }

  @Override
  public List<InventoryAuthorityEnum> supportEnumerations() {
    return ENUMS;
  }

  @Override
  public List<Integer> supportCodes() {
    return CODES;
  }

  @Override
  public List<String> supportValues() {
    return VALUES;
  }

  @Override
  public InventoryAuthorityEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public InventoryAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
