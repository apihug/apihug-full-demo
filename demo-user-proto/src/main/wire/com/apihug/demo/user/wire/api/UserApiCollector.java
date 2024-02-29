package com.apihug.demo.user.wire.api;

import com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum;
import com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum;
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        res.setNullable(false);
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
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "true");
        res.setExtensions(_extensions);
        res.setNullable(false);
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
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.admin.UserStatusEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_admin_UserStatusEnum();
    // Build for Enum :com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum
    _build_component_com_apihug_demo_user_wire_infra_settings_UserAuthorityEnum();
    // Build for Component : com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse
    _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerRegisteredResponse();
    // Build for Component : com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse
    _build_component_com_apihug_demo_user_wire_api_admin_response_CustomerPasswordUpdatedResponse();
    // Build for Component : com.apihug.demo.user.wire.api.admin.request.RegisterRequest
    _build_component_com_apihug_demo_user_wire_api_admin_request_RegisterRequest();
    // Build for Component : com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest
    _build_component_com_apihug_demo_user_wire_api_admin_request_ChangePasswordRequest();
    // Build For Service com.apihug.demo.user.wire.api.admin.UserAdminService
    _build_service_com_apihug_demo_user_wire_api_admin_UserAdminService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
