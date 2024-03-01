package com.apihug.demo.inventory.wire.api;

import com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum;
import com.apihug.demo.inventory.wire.infra.settings.admin.StockStatusEnum;
import com.apihug.demo.inventory.wire.infra.settings.admin.StorageStatusEnum;
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
public final class InventoryApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
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

  public InventoryApiCollector() {
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

  private final void _build_component_com_apihug_demo_inventory_wire_infra_settings_InventoryAuthorityEnum(
      ) {
    //  Build of the component: InventoryAuthorityEnum proto: com/apihug/demo/inventory/proto/infra/settings/authority.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum", res);
    res.setClzName("com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum");
    res.setEnumClz(true);
    res.setName("InventoryAuthorityEnum");
    res.setPayload(new Builder<Schema<InventoryAuthorityEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Inventory authorities list");
        List<InventoryAuthorityEnum> values  = new ArrayList();
        values.add(InventoryAuthorityEnum.STOCK_IN);
        values.add(InventoryAuthorityEnum.STOCK_OUT);
        values.add(InventoryAuthorityEnum.ADD_STORAGE_LOCATION);
        values.add(InventoryAuthorityEnum.DELETE_STORAGE_LOCATION);
        res.setDefault(InventoryAuthorityEnum.STOCK_IN);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_inventory_wire_infra_settings_admin_StorageStatusEnum(
      ) {
    //  Build of the component: StorageStatusEnum proto: com/apihug/demo/inventory/proto/infra/settings/admin/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.infra.settings.admin.StorageStatusEnum", res);
    res.setClzName("com.apihug.demo.inventory.wire.infra.settings.admin.StorageStatusEnum");
    res.setEnumClz(true);
    res.setName("StorageStatusEnum");
    res.setPayload(new Builder<Schema<StorageStatusEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("status of a storage location status");
        List<StorageStatusEnum> values  = new ArrayList();
        values.add(StorageStatusEnum.NORMAL);
        values.add(StorageStatusEnum.BLOCKED);
        res.setDefault(StorageStatusEnum.NORMAL);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_inventory_wire_infra_settings_admin_StockStatusEnum(
      ) {
    //  Build of the component: StockStatusEnum proto: com/apihug/demo/inventory/proto/infra/settings/admin/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.infra.settings.admin.StockStatusEnum", res);
    res.setClzName("com.apihug.demo.inventory.wire.infra.settings.admin.StockStatusEnum");
    res.setEnumClz(true);
    res.setName("StockStatusEnum");
    res.setPayload(new Builder<Schema<StockStatusEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("enum of the stock operation");
        List<StockStatusEnum> values  = new ArrayList();
        values.add(StockStatusEnum.FAIL);
        values.add(StockStatusEnum.SUCCESS);
        res.setDefault(StockStatusEnum.FAIL);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_inventory_wire_api_storage_response_StorageLocationAddedResponse(
      ) {
    //  Build of the component: StorageLocationAddedResponse proto: com/apihug/demo/inventory/proto/api/storage/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse");
    res.setName("StorageLocationAddedResponse");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/storage/response/response.proto");
    res.setProtoEntity("StorageLocationAddedResponse");
    res.setDescription("storage location added");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("storage location added");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 storage_location_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("storage_location_id");
    _0.setFieldName("storageLocationId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this storage location");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("11");
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
    // Add field 1 name
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("name");
    _1.setFieldName("name");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("name of the location");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("A1-112-5B");
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
    // Add field 2 remark
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.String");
    _2.setName("remark");
    _2.setFieldName("remark");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("comment of this");
        res.setSpecVersion(SpecVersion.V30);
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

  private final void _build_component_com_apihug_demo_inventory_wire_api_storage_response_StorageLocationDeletedResponse(
      ) {
    //  Build of the component: StorageLocationDeletedResponse proto: com/apihug/demo/inventory/proto/api/storage/response/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse");
    res.setName("StorageLocationDeletedResponse");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/storage/response/response.proto");
    res.setProtoEntity("StorageLocationDeletedResponse");
    res.setDescription("Storage location deleted");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Storage location deleted");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 storage_location_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("storage_location_id");
    _0.setFieldName("storageLocationId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this storage location");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("11");
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
        res.setDescription("reason of delete it");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("no happy");
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

  private final void _build_component_com_apihug_demo_inventory_wire_api_storage_request_AddStorageLocationRequest(
      ) {
    //  Build of the component: AddStorageLocationRequest proto: com/apihug/demo/inventory/proto/api/storage/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest");
    res.setName("AddStorageLocationRequest");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/storage/request/request.proto");
    res.setProtoEntity("AddStorageLocationRequest");
    res.setDescription("Add a new storage location");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Add a new storage location");
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
        res.setDescription("name of the location");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("A1-112-5B");
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
    // Add field 1 remark
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("remark");
    _1.setFieldName("remark");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("comment of this");
        res.setSpecVersion(SpecVersion.V30);
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
  }

  private final void _build_component_com_apihug_demo_inventory_wire_api_storage_request_DeleteStorageLocationRequest(
      ) {
    //  Build of the component: DeleteStorageLocationRequest proto: com/apihug/demo/inventory/proto/api/storage/request/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest");
    res.setName("DeleteStorageLocationRequest");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/storage/request/request.proto");
    res.setProtoEntity("DeleteStorageLocationRequest");
    res.setDescription("delete a storage location");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("delete a storage location");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 storage_location_id
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.Long");
    _0.setName("storage_location_id");
    _0.setFieldName("storageLocationId");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of this storage location");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("11");
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
        res.setDescription("reason of delete it");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("no happy");
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

  private final void _build_component_com_apihug_demo_inventory_wire_api_admin_StockInResponse() {
    //  Build of the component: StockInResponse proto: com/apihug/demo/inventory/proto/api/admin/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.admin.StockInResponse", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.admin.StockInResponse");
    res.setName("StockInResponse");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/admin/response.proto");
    res.setProtoEntity("StockInResponse");
    res.setDescription("Stock in response");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Stock in response");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 sku
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("sku");
    _0.setFieldName("sku");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("sku of this product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("S1JSF0S0FA");
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
        res.setDescription("quantity of this load");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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
    // Add field 2 total_quantity
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.Long");
    _2.setName("total_quantity");
    _2.setFieldName("totalQuantity");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("total left quality");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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

  private final void _build_component_com_apihug_demo_inventory_wire_api_admin_StockOutResponse() {
    //  Build of the component: StockOutResponse proto: com/apihug/demo/inventory/proto/api/admin/response.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.admin.StockOutResponse", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.admin.StockOutResponse");
    res.setName("StockOutResponse");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/admin/response.proto");
    res.setProtoEntity("StockOutResponse");
    res.setDescription("Stock out response");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Stock out response");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 sku
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("sku");
    _0.setFieldName("sku");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("sku of this product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("S1JSF0S0FA");
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
        res.setDescription("quantity of this load");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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
    // Add field 2 order_id
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.Long");
    _2.setName("order_id");
    _2.setFieldName("orderId");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of the order");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(7886L, 1));
        res.setNullable(false);
        res.setExample("1111");
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
    // Add field 3 success_quantity
    ComponentItem<Schema> _3 = new ComponentItem();
    _3.setClz("java.lang.Long");
    _3.setName("success_quantity");
    _3.setFieldName("successQuantity");
    _3.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("success stock out quality");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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
    // Add field 4 left_quantity
    ComponentItem<Schema> _4 = new ComponentItem();
    _4.setClz("java.lang.Long");
    _4.setName("left_quantity");
    _4.setFieldName("leftQuantity");
    _4.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("stock left quality");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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
    res.addItem(_4);
  }

  private final void _build_component_com_apihug_demo_inventory_wire_api_admin_StockInRequest() {
    //  Build of the component: StockInRequest proto: com/apihug/demo/inventory/proto/api/admin/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.admin.StockInRequest", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.admin.StockInRequest");
    res.setName("StockInRequest");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/admin/request.proto");
    res.setProtoEntity("StockInRequest");
    res.setDescription("Stock in request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Stock in request");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 sku
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("sku");
    _0.setFieldName("sku");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("sku of this product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("S1JSF0S0FA");
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
        res.setDescription("quantity of this load");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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

  private final void _build_component_com_apihug_demo_inventory_wire_api_admin_StockOutRequest() {
    //  Build of the component: StockOutRequest proto: com/apihug/demo/inventory/proto/api/admin/request.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.inventory.wire.api.admin.StockOutRequest", res);
    res.setClzName("com.apihug.demo.inventory.wire.api.admin.StockOutRequest");
    res.setName("StockOutRequest");
    res.setProtoFrom("com/apihug/demo/inventory/proto/api/admin/request.proto");
    res.setProtoEntity("StockOutRequest");
    res.setDescription("Stock out request");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Stock out request");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        return res;
      }
    }.build());
    // Add field 0 sku
    ComponentItem<Schema> _0 = new ComponentItem();
    _0.setClz("java.lang.String");
    _0.setName("sku");
    _0.setFieldName("sku");
    _0.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("sku of this product");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaxLength(32);
        res.setNullable(false);
        res.setExample("S1JSF0S0FA");
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
        res.setDescription("quantity of this load");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(9999L, 1));
        res.setNullable(false);
        res.setExample("11");
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
    // Add field 2 order_id
    ComponentItem<Schema> _2 = new ComponentItem();
    _2.setClz("java.lang.Long");
    _2.setName("order_id");
    _2.setFieldName("orderId");
    _2.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("id of the order");
        res.setSpecVersion(SpecVersion.V30);
        res.setMaximum(BigDecimal.valueOf(1L, 1));
        res.setMinimum(BigDecimal.valueOf(7886L, 1));
        res.setNullable(false);
        res.setExample("1111");
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

  private final void _build_service_com_apihug_demo_inventory_wire_api_admin_InventoryAdminService(
      ) {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.inventory.wire.api.admin.InventoryAdminService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.inventory.wire.api.admin.InventoryAdminService", s-> new LinkedHashMap());
    sc.put("description", "inventory admin service");
    sc.put("protoFrom", "com/apihug/demo/inventory/proto/api/admin/api.proto");
    sc.put("protoEntity", "InventoryAdminService");
    sc.put("basePath", "/inventory/admin");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/inventory/admin/hello-world"
    sc_paths.add("/inventory/admin/hello-world");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/inventory/admin/hello-world", s-> new LinkedHashMap());
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
        operation.setDescription("hello from the inventory admin");
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
    // Register Path of this Service: [2] "/inventory/admin/stock-in"
    sc_paths.add("/inventory/admin/stock-in");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/inventory/admin/stock-in", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "StockIn");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "MIDDLE");
    _sc_paths_item_2.put("requestRef", "com.apihug.demo.inventory.wire.api.admin.StockInRequest");
    _sc_paths_item_2.put("responseRef", "com.apihug.demo.inventory.wire.api.admin.StockInResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("put good to the stock");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(InventoryAuthorityEnum.STOCK_IN);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // --------------------------
    // Register Path of this Service: [3] "/inventory/admin/stock-out"
    sc_paths.add("/inventory/admin/stock-out");
    Map _sc_paths_item_3 = pathsContext.computeIfAbsent("/inventory/admin/stock-out", s-> new LinkedHashMap());
    _sc_paths_item_3.put("action", "POST");
    _sc_paths_item_3.put("method", "StockOut");
    _sc_paths_item_3.put("wrapper", true);
    _sc_paths_item_3.put("pageable", false);
    _sc_paths_item_3.put("request", false);
    _sc_paths_item_3.put("response", false);
    _sc_paths_item_3.put("session", false);
    _sc_paths_item_3.put("inputPlural", false);
    _sc_paths_item_3.put("outputPlural", false);
    _sc_paths_item_3.put("priority", "HIGH");
    _sc_paths_item_3.put("requestRef", "com.apihug.demo.inventory.wire.api.admin.StockOutRequest");
    _sc_paths_item_3.put("responseRef", "com.apihug.demo.inventory.wire.api.admin.StockOutResponse");
    _sc_paths_item_3.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("stock out to delivery the goods to customer");
        return operation;
      }
    }.build());
    _sc_paths_item_3.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(InventoryAuthorityEnum.STOCK_OUT);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_3.put("group", "CUSTOMER");
    _sc_paths_item_3.put("empty", false);
    // END-[Service Context] com.apihug.demo.inventory.wire.api.admin.InventoryAdminService
    // ----------------------------------------------------
  }

  private final void _build_service_com_apihug_demo_inventory_wire_api_storage_InventoryStorageService(
      ) {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.inventory.wire.api.storage.InventoryStorageService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.inventory.wire.api.storage.InventoryStorageService", s-> new LinkedHashMap());
    sc.put("description", "Storage admin service");
    sc.put("protoFrom", "com/apihug/demo/inventory/proto/api/storage/api.proto");
    sc.put("protoEntity", "InventoryStorageService");
    sc.put("basePath", "/inventory/storage/admin");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/inventory/storage/admin/add-location"
    sc_paths.add("/inventory/storage/admin/add-location");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/inventory/storage/admin/add-location", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "POST");
    _sc_paths_item_1.put("method", "AddStorageLocation");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "CRITICAL");
    _sc_paths_item_1.put("requestRef", "com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest");
    _sc_paths_item_1.put("responseRef", "com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("add a new location in the storage");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(InventoryAuthorityEnum.ADD_STORAGE_LOCATION);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/inventory/storage/admin/delete-location"
    sc_paths.add("/inventory/storage/admin/delete-location");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/inventory/storage/admin/delete-location", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "DeleteStorageLocation");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "FATAL");
    _sc_paths_item_2.put("requestRef", "com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest");
    _sc_paths_item_2.put("responseRef", "com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("delete a old location");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("authorization", new Builder<Authorization>() {
      @Override
      public Authorization build() {
        Authorization res = new Authorization();
        res.addAuthority(InventoryAuthorityEnum.DELETE_STORAGE_LOCATION);
        res.setCombinator(Authorization.Combinator.AND);
        return res;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.demo.inventory.wire.api.storage.InventoryStorageService
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
        _info.setTitle("demo-inventory-proto");
        _info.setDescription("proto lib of  inventory control module");
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
    // Build for Enum :com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum
    _build_component_com_apihug_demo_inventory_wire_infra_settings_InventoryAuthorityEnum();
    // Build for Enum :com.apihug.demo.inventory.wire.infra.settings.admin.StorageStatusEnum
    _build_component_com_apihug_demo_inventory_wire_infra_settings_admin_StorageStatusEnum();
    // Build for Enum :com.apihug.demo.inventory.wire.infra.settings.admin.StockStatusEnum
    _build_component_com_apihug_demo_inventory_wire_infra_settings_admin_StockStatusEnum();
    // Build for Component : com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse
    _build_component_com_apihug_demo_inventory_wire_api_storage_response_StorageLocationAddedResponse();
    // Build for Component : com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse
    _build_component_com_apihug_demo_inventory_wire_api_storage_response_StorageLocationDeletedResponse();
    // Build for Component : com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest
    _build_component_com_apihug_demo_inventory_wire_api_storage_request_AddStorageLocationRequest();
    // Build for Component : com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest
    _build_component_com_apihug_demo_inventory_wire_api_storage_request_DeleteStorageLocationRequest();
    // Build for Component : com.apihug.demo.inventory.wire.api.admin.StockInResponse
    _build_component_com_apihug_demo_inventory_wire_api_admin_StockInResponse();
    // Build for Component : com.apihug.demo.inventory.wire.api.admin.StockOutResponse
    _build_component_com_apihug_demo_inventory_wire_api_admin_StockOutResponse();
    // Build for Component : com.apihug.demo.inventory.wire.api.admin.StockInRequest
    _build_component_com_apihug_demo_inventory_wire_api_admin_StockInRequest();
    // Build for Component : com.apihug.demo.inventory.wire.api.admin.StockOutRequest
    _build_component_com_apihug_demo_inventory_wire_api_admin_StockOutRequest();
    // Build For Service com.apihug.demo.inventory.wire.api.admin.InventoryAdminService
    _build_service_com_apihug_demo_inventory_wire_api_admin_InventoryAdminService();
    // Build For Service com.apihug.demo.inventory.wire.api.storage.InventoryStorageService
    _build_service_com_apihug_demo_inventory_wire_api_storage_InventoryStorageService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
