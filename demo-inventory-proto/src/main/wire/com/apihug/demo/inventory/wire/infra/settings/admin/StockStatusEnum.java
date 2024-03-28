package com.apihug.demo.inventory.wire.infra.settings.admin;

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
        "FAIL",
        "SUCCESS"
    },
    example = "FAIL",
    description = "enum of the stock operation"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/infra/settings/admin/constant.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "StockStatusEnum",
    kind = Kind.ENUM
)
public enum StockStatusEnum implements Enumeration<StockStatusEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  FAIL(1, "fail of stock operation", "stock illegal"),

  SUCCESS(0, "success just a sample", "sample");

  public static final List<String> VALUES;

  public static final List<StockStatusEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, StockStatusEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, StockStatusEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<StockStatusEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<StockStatusEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, StockStatusEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, StockStatusEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (StockStatusEnum each : StockStatusEnum.values()) {
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
    new EnumerationsHelper<StockStatusEnum>() {

    @Override
    public StockStatusEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public StockStatusEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<StockStatusEnum> supportClz() {
    	return StockStatusEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<StockStatusEnum> supportEnumerations() {
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

  StockStatusEnum(int code, String description, String descriptionZhCN, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.descriptionZhCN = descriptionZhCN;
    this.deprecated = deprecated;
  }

  StockStatusEnum(int code, String description, String descriptionZhCN) {
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
  public List<StockStatusEnum> supportEnumerations() {
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
  public StockStatusEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public StockStatusEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
