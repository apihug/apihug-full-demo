package com.apihug.demo.user.wire.api;

import com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum;
import com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum;
import com.apihug.demo.user.wire.infra.settings.good.GoodLevelEnum;
import com.apihug.demo.user.wire.infra.settings.sample.ExampleEnum;
import com.apihug.demo.user.wire.infra.settings.sample.ExampleHappyLevelEnum;
import hope.common.Builder;
import hope.common.service.Collector;
import hope.common.service.api.Authorization;
import hope.common.service.api.Component;
import hope.common.service.api.ComponentItem;
import hope.common.service.api.Validation;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.SpecVersion;
import io.swagger.v3.oas.models.callbacks.Callback;
import io.swagger.v3.oas.models.examples.Example;
import io.swagger.v3.oas.models.headers.Header;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.links.Link;
import io.swagger.v3.oas.models.media.Schema;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.parameters.RequestBody;
import io.swagger.v3.oas.models.responses.ApiResponse;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public final class UserApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
  public static final String COMPONENTS_SCHEMAS_REF = Components.COMPONENTS_SCHEMAS_REF;

  protected final OpenAPI api;

  protected final Map<String, Map> servicesContext = new LinkedHashMap();

  protected final Map<String, Map> pathsContext = new LinkedHashMap();

  protected final Map<String, Schema> schemas = new LinkedHashMap();

  protected final Map<String, ApiResponse> responses = new LinkedHashMap();

  protected final Map<String, Parameter> parameters = new LinkedHashMap();

  protected final Map<String, Example> examples = new LinkedHashMap();

  protected final Map<String, RequestBody> requestBodies = new LinkedHashMap();

  protected final Map<String, Header> headers = new LinkedHashMap();

  protected final Map<String, SecurityScheme> securitySchemes = new LinkedHashMap();

  protected final Map<String, Link> links = new LinkedHashMap();

  protected final Map<String, Callback> callbacks = new LinkedHashMap();

  protected final Map<String, Tag> tags = new LinkedHashMap();

  protected final Map<String, Object> extensions = new LinkedHashMap();

  protected final Map<String, String> pathClzMap = new HashMap();

  protected final Map<String, Set<String>> clzPathMap = new HashMap();

  protected final Map<String, Map> clzContextMap = new LinkedHashMap();

  protected final Map<String, Component> componentMap = new LinkedHashMap();

  public UserApiCollector() {
    this.api =  new OpenAPI();
    Components components = new Components();
    components.setSchemas(schemas);
    components.responses(responses);
    components.setParameters(parameters);
    components.setRequestBodies(requestBodies);
    components.setHeaders(headers);
    components.setExamples(examples);
    components.setSecuritySchemes(securitySchemes);
    components.setLinks(links);
    components.setCallbacks(callbacks);
    components.setExtensions(extensions);
    api.components(components);
    api.setPaths(new Paths());
    _init();
  }

  @Override
  public OpenAPI getApi() {
    return api;
  }

  @Override
  public Map<String, Map> getServicesContext() {
    return servicesContext;
  }

  @Override
  public Map<String, Map> getPathsContext() {
    return pathsContext;
  }

  @Override
  public Map<String, Schema> getSchemas() {
    return schemas;
  }

  @Override
  public Map<String, ApiResponse> getResponses() {
    return responses;
  }

  @Override
  public Map<String, Parameter> getParameters() {
    return parameters;
  }

  @Override
  public Map<String, Example> getExamples() {
    return examples;
  }

  @Override
  public Map<String, RequestBody> getRequestBodies() {
    return requestBodies;
  }

  @Override
  public Map<String, Header> getHeaders() {
    return headers;
  }

  @Override
  public Map<String, SecurityScheme> getSecuritySchemes() {
    return securitySchemes;
  }

  @Override
  public Map<String, Link> getLinks() {
    return links;
  }

  @Override
  public Map<String, Callback> getCallbacks() {
    return callbacks;
  }

  @Override
  public Map<String, Tag> getTags() {
    return tags;
  }

  @Override
  public Map<String, Object> getExtensions() {
    return extensions;
  }

  @Override
  public Map<String, String> getPathClzMap() {
    return pathClzMap;
  }

  @Override
  public Map<String, Set<String>> getClzPathMap() {
    return clzPathMap;
  }

  @Override
  public Map<String, Map> getClzContextMap() {
    return clzContextMap;
  }

  @Override
  public Map<String, Component> getComponentMap() {
    return componentMap;
  }

  public void registerPathClz(String path, String clz) {
    pathClzMap.put(path, clz);
    clzPathMap.computeIfAbsent(clz, s -> new LinkedHashSet<>()).add(path);
  }

  private final void _build_component_com_apihug_demo_user_wire_infra_settings_UserAuthorityEnum() {
    //  Build of the component: UserAuthorityEnum proto: com/apihug/demo/user/proto/infra/settings/authority.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum", res);
    res.setClzName("com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum");
    res.setEnumClz(true);
    res.setName("UserAuthorityEnum");
    res.setPayload(new Builder<Schema<UserAuthorityEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("User domain's authorities list");
        List<UserAuthorityEnum> values  = new ArrayList();
        values.add(UserAuthorityEnum.USER_ADD);
        values.add(UserAuthorityEnum.USER_DELETE);
        res.setDefault(UserAuthorityEnum.USER_ADD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_user_wire_infra_settings_sample_ExampleEnum(
      ) {
    //  Build of the component: ExampleEnum proto: com/apihug/demo/user/proto/infra/settings/sample/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.infra.settings.sample.ExampleEnum", res);
    res.setClzName("com.apihug.demo.user.wire.infra.settings.sample.ExampleEnum");
    res.setEnumClz(true);
    res.setName("ExampleEnum");
    res.setPayload(new Builder<Schema<ExampleEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Enum");
        List<ExampleEnum> values  = new ArrayList();
        values.add(ExampleEnum.EXAMPLE_ENUM_GOOD);
        values.add(ExampleEnum.EXAMPLE_ENUM_BAD);
        res.setDefault(ExampleEnum.EXAMPLE_ENUM_GOOD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_user_wire_infra_settings_sample_ExampleHappyLevelEnum(
      ) {
    //  Build of the component: ExampleHappyLevelEnum proto: com/apihug/demo/user/proto/infra/settings/sample/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.infra.settings.sample.ExampleHappyLevelEnum", res);
    res.setClzName("com.apihug.demo.user.wire.infra.settings.sample.ExampleHappyLevelEnum");
    res.setEnumClz(true);
    res.setName("ExampleHappyLevelEnum");
    res.setPayload(new Builder<Schema<ExampleHappyLevelEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("a happy lavel of a demo");
        List<ExampleHappyLevelEnum> values  = new ArrayList();
        values.add(ExampleHappyLevelEnum.SAD);
        values.add(ExampleHappyLevelEnum.HAPPY);
        values.add(ExampleHappyLevelEnum.SUPER_HAPPY);
        res.setDefault(ExampleHappyLevelEnum.SAD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_user_wire_infra_settings_good_GoodLevelEnum(
      ) {
    //  Build of the component: GoodLevelEnum proto: com/apihug/demo/user/proto/infra/settings/good/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.infra.settings.good.GoodLevelEnum", res);
    res.setClzName("com.apihug.demo.user.wire.infra.settings.good.GoodLevelEnum");
    res.setEnumClz(true);
    res.setName("GoodLevelEnum");
    res.setPayload(new Builder<Schema<GoodLevelEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Enum");
        List<GoodLevelEnum> values  = new ArrayList();
        values.add(GoodLevelEnum.VERY_GOOD);
        values.add(GoodLevelEnum.VERY_BAD);
        res.setDefault(GoodLevelEnum.VERY_GOOD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_user_wire_infra_settings_admin_UserStatusEnum(
      ) {
    //  Build of the component: UserStatusEnum proto: com/apihug/demo/user/proto/infra/settings/admin/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum", res);
    res.setClzName("com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum");
    res.setEnumClz(true);
    res.setName("UserStatusEnum");
    res.setPayload(new Builder<Schema<UserStatusEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("User management status");
        List<UserStatusEnum> values  = new ArrayList();
        values.add(UserStatusEnum.NORMAL);
        values.add(UserStatusEnum.BLOCKED);
        res.setDefault(UserStatusEnum.NORMAL);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerRegisteredResponse(
      ) {
    //  Build of the component: CustomerRegisteredResponse proto: com/apihug/demo/user/proto/api/admin/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse", res);
    res.setClzName("com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse");
    res.setName("CustomerRegisteredResponse");
    res.setProtoFrom("com/apihug/demo/user/proto/api/admin/response/response.proto");
    res.setProtoEntity("CustomerRegisteredResponse");
    res.setDescription("customer registered successfully");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("customer registered successfully");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 customer_id
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.Long");
    _1.setName("customer_id");
    _1.setFieldName("customerId");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this customer");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setNullable(false);
        res.setExample("1024");
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 register_date
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.time.LocalDateTime");
    _2.setName("register_date");
    _2.setFieldName("registerDate");
    _2.setDateFormat("YYYY_MM_DD_HH_MM_SS");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("date of registered");
        res.setFormat("date-time");
        res.setSpecVersion(SpecVersion.V30);
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _2.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("timeGap", 2);
        res.put("dir", "PAST");
        res.put("timeUnit", "MINUTES");
        res.put("name", "date");
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerPasswordUpdatedResponse(
      ) {
    //  Build of the component: CustomerPasswordUpdatedResponse proto: com/apihug/demo/user/proto/api/admin/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse", res);
    res.setClzName("com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse");
    res.setName("CustomerPasswordUpdatedResponse");
    res.setProtoFrom("com/apihug/demo/user/proto/api/admin/response/response.proto");
    res.setProtoEntity("CustomerPasswordUpdatedResponse");
    res.setDescription("password updated response");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("password updated response");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 customer_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("customer_id");
    _0.setFieldName("customerId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this customer");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("1024");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("max", 12000l);
        res.put("min", 12l);
        res.put("name", "number");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 updated_date
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.time.LocalDateTime");
    _1.setName("updated_date");
    _1.setFieldName("updatedDate");
    _1.setDateFormat("YYYY_MM_DD_HH_MM_SS");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("date of this password updated");
        res.setFormat("date-time");
        res.setSpecVersion(SpecVersion.V30);
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _1.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("timeGap", 2);
        res.put("dir", "PAST");
        res.put("timeUnit", "MINUTES");
        res.put("name", "date");
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_sample_TimeDemoRequest() {
    //  Build of the component: TimeDemoRequest proto: com/apihug/demo/user/proto/api/sample/time.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.sample.TimeDemoRequest", res);
    res.setClzName("com.apihug.demo.user.wire.api.sample.TimeDemoRequest");
    res.setName("TimeDemoRequest");
    res.setProtoFrom("com/apihug/demo/user/proto/api/sample/time.proto");
    res.setProtoEntity("TimeDemoRequest");
    res.setDescription("demo to show how use the time");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("demo to show how use the time");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 first_date_time
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.time.LocalDateTime");
    _1.setName("first_date_time");
    _1.setFieldName("firstDateTime");
    _1.setDateFormat("YYYY_MM_DD_HH_MM_SS");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("first demo field for date time");
        res.setFormat("date-time");
        res.setSpecVersion(SpecVersion.V30);
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 second_date
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.time.LocalDate");
    _2.setName("second_date");
    _2.setFieldName("secondDate");
    _2.setCustomizedDateFormat("yyyy-MM-dd");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("second demo example for date");
        res.setFormat("date");
        res.setSpecVersion(SpecVersion.V30);
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        res.setCustomizedDateFormat("yyyy-MM-dd");
        res.setTimeConstraintType("PAST");
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_admin_request_RegisterRequest(
      ) {
    //  Build of the component: RegisterRequest proto: com/apihug/demo/user/proto/api/admin/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.admin.request.RegisterRequest", res);
    res.setClzName("com.apihug.demo.user.wire.api.admin.request.RegisterRequest");
    res.setName("RegisterRequest");
    res.setProtoFrom("com/apihug/demo/user/proto/api/admin/request/request.proto");
    res.setProtoEntity("RegisterRequest");
    res.setDescription("Register a user");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Register a user");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 email
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("email");
    _1.setFieldName("email");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("email address of this user");
        res.setFormat("email");
        res.setSpecVersion(SpecVersion.V30);
        res.setTypes(Set.of("string"));
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        res.setEmail(true);
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 password
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.String");
    _2.setName("password");
    _2.setFieldName("password");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("password of this account");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setMaxLength(32);
        res.setMinLength(5);
        res.setNullable(false);
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_admin_request_ChangePasswordRequest(
      ) {
    //  Build of the component: ChangePasswordRequest proto: com/apihug/demo/user/proto/api/admin/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest", res);
    res.setClzName("com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest");
    res.setName("ChangePasswordRequest");
    res.setProtoFrom("com/apihug/demo/user/proto/api/admin/request/request.proto");
    res.setProtoEntity("ChangePasswordRequest");
    res.setDescription("Change my password request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Change my password request");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 customer_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("customer_id");
    _0.setFieldName("customerId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this customer");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 new_password
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("new_password");
    _1.setFieldName("newPassword");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("new password");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setMaxLength(32);
        res.setMinLength(5);
        res.setNullable(false);
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 reason
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.String");
    _2.setName("reason");
    _2.setFieldName("reason");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("reason of change the password");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("password stolen");
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_sample_MockDemoRequest() {
    //  Build of the component: MockDemoRequest proto: com/apihug/demo/user/proto/api/sample/mock.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.sample.MockDemoRequest", res);
    res.setClzName("com.apihug.demo.user.wire.api.sample.MockDemoRequest");
    res.setName("MockDemoRequest");
    res.setProtoFrom("com/apihug/demo/user/proto/api/sample/mock.proto");
    res.setProtoEntity("MockDemoRequest");
    res.setDescription("This is an example request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("This is an example request");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _0.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 chinese_name
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("chinese_name");
    _1.setFieldName("chineseName");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name for chinese people");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setNullable(false);
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _1.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("type", "NAME");
        res.put("name", "cname");
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 china_address
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.String");
    _2.setName("china_address");
    _2.setFieldName("chinaAddress");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("address of china");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setNullable(false);
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _2.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("type", "ADDRESS");
        res.put("withPrefix", true);
        res.put("name", "caddress");
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_sample_RequiredDemoRequest() {
    //  Build of the component: RequiredDemoRequest proto: com/apihug/demo/user/proto/api/sample/sample.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.sample.RequiredDemoRequest", res);
    res.setClzName("com.apihug.demo.user.wire.api.sample.RequiredDemoRequest");
    res.setName("RequiredDemoRequest");
    res.setProtoFrom("com/apihug/demo/user/proto/api/sample/sample.proto");
    res.setProtoEntity("RequiredDemoRequest");
    res.setDescription("This is an example request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("This is an example request");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the user");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("My Lord");
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 another
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("another");
    _1.setFieldName("another");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("another not blank sample");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setNullable(false);
        res.setExample("another not blank");
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 an_another
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.String");
    _2.setName("an_another");
    _2.setFieldName("anAnother");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("another min length example");
        res.setSpecVersion(SpecVersion.V30);
        res.setMinLength(2);
        res.setNullable(false);
        res.setExample("another min length");
        return res;
      }
    }.build());
    _2.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_2);
    // Add field 3 hidden_field
    ComponentItem<Schema> _3 = new ComponentItem();
    _3.setClz("java.lang.Long");
    _3.setName("hidden_field");
    _3.setFieldName("hiddenField");
    _3.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("do not touch me directly you can not see me");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("1024");
        return res;
      }
    }.build());
    _3.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_3);
    // Add field 4 my_son_name
    ComponentItem<Schema> _4 = new ComponentItem();
    _4.setClz("java.lang.String");
    _4.setName("my_son_name");
    _4.setFieldName("mySonName");
    _4.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of my son");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setNullable(false);
        return res;
      }
    }.build());
    _4.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    _4.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("type", "NAME");
        res.put("name", "cname");
        return res;
      }
    }.build());
    res.addItem(_4);
  }

  private final void _build_component_com_apihug_demo_user_wire_api_sample_QueryResultDemoResponse(
      ) {
    //  Build of the component: QueryResultDemoResponse proto: com/apihug/demo/user/proto/api/sample/sample.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse", res);
    res.setClzName("com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse");
    res.setName("QueryResultDemoResponse");
    res.setProtoFrom("com/apihug/demo/user/proto/api/sample/sample.proto");
    res.setProtoEntity("QueryResultDemoResponse");
    res.setDescription("demo for return query result");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("demo for return query result");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 name
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("name");
    _0.setFieldName("name");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of god");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    _0.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 remark
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("remark");
    _1.setFieldName("remark");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("remark of the name");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    _1.setValidation(new Builder<Validation>() {
      @Override
      public Validation build() {
        Validation res = new Validation();
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_service_com_apihug_demo_user_wire_api_sample_SampleDemoService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.user.wire.api.sample.SampleDemoService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.user.wire.api.sample.SampleDemoService", s-> new LinkedHashMap());
    sc.put("description", "api hug online demo project");
    sc.put("protoFrom", "com/apihug/demo/user/proto/api/sample/api.proto");
    sc.put("protoEntity", "SampleDemoService");
    sc.put("basePath", "/example-demo");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/example-demo/page-a-sample"
    sc_paths.add("/example-demo/page-a-sample");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/example-demo/page-a-sample", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "PageQuery");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", true);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("Demo how to query a page result");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/example-demo/list-a-sample"
    sc_paths.add("/example-demo/list-a-sample");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/example-demo/list-a-sample", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "GET");
    _sc_paths_item_2.put("method", "ListQuery");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", true);
    _sc_paths_item_2.put("priority", "LOW");
    _sc_paths_item_2.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_2.put("responseRef", "com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("query return a list");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.demo.user.wire.api.sample.SampleDemoService
    // ----------------------------------------------------
  }

  private final void _build_service_com_apihug_demo_user_wire_api_good_GoodService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.user.wire.api.good.GoodService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.user.wire.api.good.GoodService", s-> new LinkedHashMap());
    sc.put("description", "Service for good");
    sc.put("protoFrom", "com/apihug/demo/user/proto/api/good/good.proto");
    sc.put("protoEntity", "GoodService");
    sc.put("basePath", "/good");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/good/hello-world"
    sc_paths.add("/good/hello-world");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/good/hello-world", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "SayHello");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("project");
        operation.setTags(_tags);
        operation.setDescription("Say hello to the world");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/good/do-something"
    sc_paths.add("/good/do-something");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/good/do-something", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "DoSomthing");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "HIGH");
    _sc_paths_item_2.put("requestRef", "com.apihug.demo.user.wire.api.sample.RequiredDemoRequest");
    _sc_paths_item_2.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("just do something funny");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.demo.user.wire.api.good.GoodService
    // ----------------------------------------------------
  }

  private final void _build_service_com_apihug_demo_user_wire_api_admin_UserAdminService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.user.wire.api.admin.UserAdminService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.user.wire.api.admin.UserAdminService", s-> new LinkedHashMap());
    sc.put("description", "User admin server");
    sc.put("protoFrom", "com/apihug/demo/user/proto/api/admin/api.proto");
    sc.put("protoEntity", "UserAdminService");
    sc.put("basePath", "/user/admin");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/user/admin/say-hello"
    sc_paths.add("/user/admin/say-hello");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/user/admin/say-hello", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "GET");
    _sc_paths_item_1.put("method", "SayHello");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "MIDDLE");
    _sc_paths_item_1.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        List<String> _tags = new ArrayList();
        _tags.add("project");
        operation.setTags(_tags);
        operation.setDescription("Hello from the user admin server");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = Authorization.ANONYMOUS;
        return res;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/user/admin/register"
    sc_paths.add("/user/admin/register");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/user/admin/register", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "RegisterCustomer");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "CRITICAL");
    _sc_paths_item_2.put("requestRef", "com.apihug.demo.user.wire.api.admin.request.RegisterRequest");
    _sc_paths_item_2.put("responseRef", "com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("admin try to register a new customer");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(UserAuthorityEnum.USER_ADD);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // --------------------------
    // Register Path of this Service: [3] "/user/admin/change-password"
    sc_paths.add("/user/admin/change-password");
    Map _sc_paths_item_3 = pathsContext.computeIfAbsent("/user/admin/change-password", s-> new LinkedHashMap());
    _sc_paths_item_3.put("action", "POST");
    _sc_paths_item_3.put("method", "ChangePassword");
    _sc_paths_item_3.put("wrapper", true);
    _sc_paths_item_3.put("pageable", false);
    _sc_paths_item_3.put("request", false);
    _sc_paths_item_3.put("response", false);
    _sc_paths_item_3.put("session", false);
    _sc_paths_item_3.put("inputPlural", false);
    _sc_paths_item_3.put("outputPlural", false);
    _sc_paths_item_3.put("priority", "HIGH");
    _sc_paths_item_3.put("requestRef", "com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest");
    _sc_paths_item_3.put("responseRef", "com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse");
    _sc_paths_item_3.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("use to reset the password after password forgot");
        return operation;
      }
    }.build());
    _sc_paths_item_3.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(UserAuthorityEnum.USER_ADD);
        res.addAuthority(UserAuthorityEnum.USER_DELETE);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_3.put("group", "CUSTOMER");
    _sc_paths_item_3.put("empty", false);
    // END-[Service Context] com.apihug.demo.user.wire.api.admin.UserAdminService
    // ----------------------------------------------------
  }

  private final void _merger_api() {
    Info _info =  new Info();
    Contact _contact =  new Contact();
    License _license =  new License();
    ExternalDocumentation _external_documentation =  new ExternalDocumentation();
    Map<String,Object> _infoExtensions =  new LinkedHashMap();
    Map<String,Object> _extensions =  new LinkedHashMap();
    Map<String,Object> _lsExtensions =  new LinkedHashMap();
    Map<String,Object> _ctExtensions =  new LinkedHashMap();
    Map<String,Object> _ex_doc_extensions =  new LinkedHashMap();
    api.setInfo(_info);
    api.setExtensions(_extensions);
    _external_documentation.setExtensions(_ex_doc_extensions);
    api.setExternalDocs(_external_documentation);
    _contact.setExtensions(_ctExtensions);
    _info.setContact(_contact);
    _license.setExtensions(_lsExtensions);
    _info.setLicense(_license);
    _info.setExtensions(_infoExtensions);
    new Builder<String>() {
      @Override
      public String build() {
        _info.setTitle("demo-user-proto");
        _info.setDescription("proto lib of  user management module");
        _info.setVersion("0.1.1-RELEASE");
        _contact.setName("developer@apihug.com");
        _contact.setUrl("https://github.com/apihug/");
        _contact.setEmail("developer@apihug.com");
        _external_documentation.setUrl("https://github.com/apihug/");
        _external_documentation.setDescription("Hope is the best thing");
        return "DONE";
      }
    }.build();
    tags.put("sample", new Builder<Tag>() {
      @Override
      public Tag build() {
        Tag res  = new Tag();
        res.setName("sample");
        res.setDescription("Sample Tag");
        return res;
      }
    }.build());
  }

  private void _init() {
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_UserAuthorityEnum();
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.sample.ExampleEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_sample_ExampleEnum();
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.sample.ExampleHappyLevelEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_sample_ExampleHappyLevelEnum();
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.good.GoodLevelEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_good_GoodLevelEnum();
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_admin_UserStatusEnum();
    // Build for Component : com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse
    _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerRegisteredResponse();
    // Build for Component : com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse
    _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerPasswordUpdatedResponse();
    // Build for Component : com.apihug.demo.user.wire.api.sample.TimeDemoRequest
    _build_component_com_apihug_demo_user_wire_api_sample_TimeDemoRequest();
    // Build for Component : com.apihug.demo.user.wire.api.admin.request.RegisterRequest
    _build_component_com_apihug_demo_user_wire_api_admin_request_RegisterRequest();
    // Build for Component : com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest
    _build_component_com_apihug_demo_user_wire_api_admin_request_ChangePasswordRequest();
    // Build for Component : com.apihug.demo.user.wire.api.sample.MockDemoRequest
    _build_component_com_apihug_demo_user_wire_api_sample_MockDemoRequest();
    // Build for Component : com.apihug.demo.user.wire.api.sample.RequiredDemoRequest
    _build_component_com_apihug_demo_user_wire_api_sample_RequiredDemoRequest();
    // Build for Component : com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse
    _build_component_com_apihug_demo_user_wire_api_sample_QueryResultDemoResponse();
    // Build For Service com.apihug.demo.user.wire.api.sample.SampleDemoService
    _build_service_com_apihug_demo_user_wire_api_sample_SampleDemoService();
    // Build For Service com.apihug.demo.user.wire.api.good.GoodService
    _build_service_com_apihug_demo_user_wire_api_good_GoodService();
    // Build For Service com.apihug.demo.user.wire.api.admin.UserAdminService
    _build_service_com_apihug_demo_user_wire_api_admin_UserAdminService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
