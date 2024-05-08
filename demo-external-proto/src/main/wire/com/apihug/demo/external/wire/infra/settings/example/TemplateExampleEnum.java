package com.apihug.demo.external.wire.infra.settings.example;

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
        "REMOVE_ME",
        "RIGHT_NOW"
    },
    example = "REMOVE_ME",
    description = "Remember to remove this enum this is example from template"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/demo/external/proto/infra/settings/example/constant.proto",
    entity = "TemplateExampleEnum",
    kind = Kind.ENUM
)
public enum TemplateExampleEnum implements Enumeration<TemplateExampleEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  REMOVE_ME(1, "remove me", "Please remove this example"),

  RIGHT_NOW(2, "right now", "Remove it right now");

  public static final List<String> VALUES;

  public static final List<TemplateExampleEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, TemplateExampleEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, TemplateExampleEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<TemplateExampleEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<TemplateExampleEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, TemplateExampleEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, TemplateExampleEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (TemplateExampleEnum each : TemplateExampleEnum.values()) {
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
    new EnumerationsHelper<TemplateExampleEnum>() {

    @Override
    public TemplateExampleEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public TemplateExampleEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<TemplateExampleEnum> supportClz() {
    	return TemplateExampleEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<TemplateExampleEnum> supportEnumerations() {
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

  public final String description2;

  public final boolean deprecated;

  TemplateExampleEnum(int code, String description, String description2, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.description2 = description2;
    this.deprecated = deprecated;
  }

  TemplateExampleEnum(int code, String description, String description2) {
    this(code, description, description2, false);
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
  public String description2() {
    return description2 != null ? description2 : description();
  }

  @Override
  public boolean deprecated() {
    return deprecated;
  }

  @Override
  public List<TemplateExampleEnum> supportEnumerations() {
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
  public TemplateExampleEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public TemplateExampleEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
