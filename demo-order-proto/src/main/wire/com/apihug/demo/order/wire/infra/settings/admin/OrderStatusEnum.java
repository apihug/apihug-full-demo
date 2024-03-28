package com.apihug.demo.order.wire.infra.settings.admin;

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
        "NORMAL",
        "DELETED"
    },
    example = "NORMAL",
    description = "Status of the order"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/demo/order/proto/infra/settings/admin/constant.proto",
    pluginVersion = "0.7.4-RELEASE",
    entity = "OrderStatusEnum",
    kind = Kind.ENUM
)
public enum OrderStatusEnum implements Enumeration<OrderStatusEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  NORMAL(1, "normal status", "order is ok"),

  DELETED(2, "deleted status", "order is gone");

  public static final List<String> VALUES;

  public static final List<OrderStatusEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, OrderStatusEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, OrderStatusEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<OrderStatusEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<OrderStatusEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, OrderStatusEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, OrderStatusEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (OrderStatusEnum each : OrderStatusEnum.values()) {
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
    new EnumerationsHelper<OrderStatusEnum>() {

    @Override
    public OrderStatusEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public OrderStatusEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<OrderStatusEnum> supportClz() {
    	return OrderStatusEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<OrderStatusEnum> supportEnumerations() {
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

  OrderStatusEnum(int code, String description, String descriptionZhCN, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.descriptionZhCN = descriptionZhCN;
    this.deprecated = deprecated;
  }

  OrderStatusEnum(int code, String description, String descriptionZhCN) {
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
  public List<OrderStatusEnum> supportEnumerations() {
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
  public OrderStatusEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public OrderStatusEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
