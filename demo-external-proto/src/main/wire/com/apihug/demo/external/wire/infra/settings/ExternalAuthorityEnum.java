package com.apihug.demo.external.wire.infra.settings;

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
        "USER_ADD",
        "USER_DELETE"
    },
    example = "USER_ADD",
    description = "Example Authority Enum for the project, MODIFY IT"
)
@Generated("H.O.P.E. Infra Team")
@ProtoFrom(
    value = "com/apihug/demo/external/proto/infra/settings/authority.proto",
    pluginVersion = "0.7.2-RELEASE",
    entity = "ExternalAuthorityEnum",
    kind = Kind.ENUM
)
public enum ExternalAuthorityEnum implements Enumeration<ExternalAuthorityEnum> {
  NA(-1, "Default Placeholder Should NEVER be used", "默认占位枚举请勿使用"),

  USER_ADD(1, "user:add", "Authority to remove user(Remove or modify this template sample)"),

  USER_DELETE(2, "user:remove", "Authority to delete user(Remove or modify this template sample)");

  public static final List<String> VALUES;

  public static final List<ExternalAuthorityEnum> ENUMS;

  public static final List<Integer> CODES;

  public static final Map<String, ExternalAuthorityEnum> NAME_2_ENUM_MAP;

  public static final Map<Integer, ExternalAuthorityEnum> CODE_2_ENUM_MAP;

  public static final Enumeration.EnumerationsHelper<ExternalAuthorityEnum> HELPER;

  static {
    List<String> _VALUES = new ArrayList<>();
    List<ExternalAuthorityEnum> _ENUMS = new ArrayList<>();
    List<Integer> _CODES = new ArrayList<>();
    Map<String, ExternalAuthorityEnum> _NAME_2_ENUM_MAP = new LinkedHashMap<>();
    Map<Integer, ExternalAuthorityEnum> _CODE_2_ENUM_MAP = new LinkedHashMap<>();
    for (ExternalAuthorityEnum each : ExternalAuthorityEnum.values()) {
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
    new EnumerationsHelper<ExternalAuthorityEnum>() {

    @Override
    public ExternalAuthorityEnum mapFromCode(int code) {
    	return CODE_2_ENUM_MAP.getOrDefault(code, NA);
    }

    @Override
    public ExternalAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
    	return NA;
    }
    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
    }

    @Override
    public Class<ExternalAuthorityEnum> supportClz() {
    	return ExternalAuthorityEnum.class;
    }

    @Override
    public List<String> supportValues() {
    return VALUES;
    }

    @Override
    public List<ExternalAuthorityEnum> supportEnumerations() {
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

  ExternalAuthorityEnum(int code, String description, String descriptionZhCN, boolean deprecated) {
    this.code = code;
    this.description = description;
    this.descriptionZhCN = descriptionZhCN;
    this.deprecated = deprecated;
  }

  ExternalAuthorityEnum(int code, String description, String descriptionZhCN) {
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
  public List<ExternalAuthorityEnum> supportEnumerations() {
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
  public ExternalAuthorityEnum mapFromCode(int code) {
    if (this.code == code) {
      return this;
    }

    return  CODE_2_ENUM_MAP.getOrDefault(code, NA);
  }

  @Override
  public ExternalAuthorityEnum mapFromName(String name) {
    if (name == null || name.isEmpty()) {
      return NA;
    }

    return NAME_2_ENUM_MAP.getOrDefault(name, NA);
  }
}
