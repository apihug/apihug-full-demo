package com.apihug.demo.order.wire.api;

import com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum;
import com.apihug.demo.order.wire.infra.settings.admin.OrderStatusEnum;
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public final class OrderApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
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

  public OrderApiCollector() {
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

  private final void _build_component_com_apihug_demo_order_wire_infra_settings_OrderAuthorityEnum(
      ) {
    //  Build of the component: OrderAuthorityEnum proto: com/apihug/demo/order/proto/infra/settings/authority.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum", res);
    res.setClzName("com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum");
    res.setEnumClz(true);
    res.setName("OrderAuthorityEnum");
    res.setPayload(new Builder<Schema<OrderAuthorityEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Authority Enum for the project, MODIFY IT");
        List<OrderAuthorityEnum> values  = new ArrayList();
        values.add(OrderAuthorityEnum.ORDER_ADD);
        values.add(OrderAuthorityEnum.ORDER_DELETE);
        res.setDefault(OrderAuthorityEnum.ORDER_ADD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_order_wire_infra_settings_admin_OrderStatusEnum(
      ) {
    //  Build of the component: OrderStatusEnum proto: com/apihug/demo/order/proto/infra/settings/admin/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.infra.settings.admin.OrderStatusEnum", res);
    res.setClzName("com.apihug.demo.order.wire.infra.settings.admin.OrderStatusEnum");
    res.setEnumClz(true);
    res.setName("OrderStatusEnum");
    res.setPayload(new Builder<Schema<OrderStatusEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Status of the order");
        List<OrderStatusEnum> values  = new ArrayList();
        values.add(OrderStatusEnum.NORMAL);
        values.add(OrderStatusEnum.DELETED);
        res.setDefault(OrderStatusEnum.NORMAL);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_order_wire_api_admin_request_AddOrderRequest(
      ) {
    //  Build of the component: AddOrderRequest proto: com/apihug/demo/order/proto/api/admin/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.api.admin.request.AddOrderRequest", res);
    res.setClzName("com.apihug.demo.order.wire.api.admin.request.AddOrderRequest");
    res.setName("AddOrderRequest");
    res.setProtoFrom("com/apihug/demo/order/proto/api/admin/request/request.proto");
    res.setProtoEntity("AddOrderRequest");
    res.setDescription("Add order");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Add order");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 sku_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("sku_id");
    _0.setFieldName("skuId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("SKU of the product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("XSK12MADA");
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
    // Add field 1 quantity
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.Long");
    _1.setName("quantity");
    _1.setFieldName("quantity");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("quantity of this oder");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(122L, 1));
        res.setExample("1");
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
        res.put("max", 122l);
        res.put("min", 1l);
        res.put("name", "number");
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_component_com_apihug_demo_order_wire_api_admin_request_DeleteOrderRequest(
      ) {
    //  Build of the component: DeleteOrderRequest proto: com/apihug/demo/order/proto/api/admin/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest", res);
    res.setClzName("com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest");
    res.setName("DeleteOrderRequest");
    res.setProtoFrom("com/apihug/demo/order/proto/api/admin/request/request.proto");
    res.setProtoEntity("DeleteOrderRequest");
    res.setDescription("delete the order by ID");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("delete the order by ID");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 order_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("order_id");
    _0.setFieldName("orderId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this order");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setExample("111");
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
        res.put("max", 2321313l);
        res.put("min", 1l);
        res.put("name", "number");
        return res;
      }
    }.build());
    res.addItem(_0);
    // Add field 1 reason
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("reason");
    _1.setFieldName("reason");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("reason why delete this order");
        res.setSpecVersion(SpecVersion.V30);
        Map<String,String> _extensions = new LinkedHashMap();
        _extensions.put("x-hope-validation-blank", "false");
        res.setExtensions(_extensions);
        res.setMaxLength(122);
        res.setMinLength(5);
        res.setNullable(false);
        res.setExample("wrong placed");
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

  private final void _build_component_com_apihug_demo_order_wire_api_admin_response_OrderAddedResponse(
      ) {
    //  Build of the component: OrderAddedResponse proto: com/apihug/demo/order/proto/api/admin/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse", res);
    res.setClzName("com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse");
    res.setName("OrderAddedResponse");
    res.setProtoFrom("com/apihug/demo/order/proto/api/admin/response/response.proto");
    res.setProtoEntity("OrderAddedResponse");
    res.setDescription("Order placed already");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Order placed already");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 order_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("order_id");
    _0.setFieldName("orderId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this order");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("111");
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
    // Add field 1 sku_id
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("sku_id");
    _1.setFieldName("skuId");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("SKU of the product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("XSK12MADA");
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
        res.put("nature", "NAME");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_1);
    // Add field 2 quantity
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.Long");
    _2.setName("quantity");
    _2.setFieldName("quantity");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("quantity of this oder");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(122L, 1));
        res.setExample("1");
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
        res.put("max", 122l);
        res.put("min", 1l);
        res.put("name", "number");
        return res;
      }
    }.build());
    res.addItem(_2);
  }

  private final void _build_component_com_apihug_demo_order_wire_api_admin_response_OrderDeletedResponse(
      ) {
    //  Build of the component: OrderDeletedResponse proto: com/apihug/demo/order/proto/api/admin/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse", res);
    res.setClzName("com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse");
    res.setName("OrderDeletedResponse");
    res.setProtoFrom("com/apihug/demo/order/proto/api/admin/response/response.proto");
    res.setProtoEntity("OrderDeletedResponse");
    res.setDescription("order deleted response");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("order deleted response");
        res.setSpecVersion(SpecVersion.V30);
        return res;
      }
    }.build());
    // Add field 0 order_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("order_id");
    _0.setFieldName("orderId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this order");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("1111");
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
    // Add field 1 reason
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("reason");
    _1.setFieldName("reason");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("deleted reason");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("wrong");
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

  private final void _build_service_com_apihug_demo_order_wire_api_admin_OrderAdminService() {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.order.wire.api.admin.OrderAdminService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.order.wire.api.admin.OrderAdminService", s-> new LinkedHashMap());
    sc.put("description", "Admin to control order");
    sc.put("protoFrom", "com/apihug/demo/order/proto/api/admin/api.proto");
    sc.put("protoEntity", "OrderAdminService");
    sc.put("basePath", "/order/admin");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/order/admin/hello-world"
    sc_paths.add("/order/admin/hello-world");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/order/admin/hello-world", s-> new LinkedHashMap());
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
        operation.setDescription("hello from the admin server");
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
    // Register Path of this Service: [2] "/order/admin/add-order"
    sc_paths.add("/order/admin/add-order");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/order/admin/add-order", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "AddOrder");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "FATAL");
    _sc_paths_item_2.put("requestRef", "com.apihug.demo.order.wire.api.admin.request.AddOrderRequest");
    _sc_paths_item_2.put("responseRef", "com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("add order");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(OrderAuthorityEnum.ORDER_ADD);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // --------------------------
    // Register Path of this Service: [3] "/order/admin/delete-order"
    sc_paths.add("/order/admin/delete-order");
    Map _sc_paths_item_3 = pathsContext.computeIfAbsent("/order/admin/delete-order", s-> new LinkedHashMap());
    _sc_paths_item_3.put("action", "POST");
    _sc_paths_item_3.put("method", "DeleteOrder");
    _sc_paths_item_3.put("wrapper", true);
    _sc_paths_item_3.put("pageable", false);
    _sc_paths_item_3.put("request", false);
    _sc_paths_item_3.put("response", false);
    _sc_paths_item_3.put("session", false);
    _sc_paths_item_3.put("inputPlural", false);
    _sc_paths_item_3.put("outputPlural", false);
    _sc_paths_item_3.put("priority", "MIDDLE");
    _sc_paths_item_3.put("requestRef", "com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest");
    _sc_paths_item_3.put("responseRef", "com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse");
    _sc_paths_item_3.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("delete order ");
        return operation;
      }
    }.build());
    _sc_paths_item_3.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(OrderAuthorityEnum.ORDER_ADD);
        res.addAuthority(OrderAuthorityEnum.ORDER_DELETE);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_3.put("group", "CUSTOMER");
    _sc_paths_item_3.put("empty", false);
    // END-[Service Context] com.apihug.demo.order.wire.api.admin.OrderAdminService
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
        _info.setTitle("demo-order-proto");
        _info.setDescription("proto lib of  demo for api hug framework and tools");
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
    // Build for Enum :com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum
    _build_component_com_apihug_demo_order_wire_infra_settings_OrderAuthorityEnum();
    // Build for Enum :com.apihug.demo.order.wire.infra.settings.admin.OrderStatusEnum
    _build_component_com_apihug_demo_order_wire_infra_settings_admin_OrderStatusEnum();
    // Build for Component : com.apihug.demo.order.wire.api.admin.request.AddOrderRequest
    _build_component_com_apihug_demo_order_wire_api_admin_request_AddOrderRequest();
    // Build for Component : com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest
    _build_component_com_apihug_demo_order_wire_api_admin_request_DeleteOrderRequest();
    // Build for Component : com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse
    _build_component_com_apihug_demo_order_wire_api_admin_response_OrderAddedResponse();
    // Build for Component : com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse
    _build_component_com_apihug_demo_order_wire_api_admin_response_OrderDeletedResponse();
    // Build For Service com.apihug.demo.order.wire.api.admin.OrderAdminService
    _build_service_com_apihug_demo_order_wire_api_admin_OrderAdminService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
