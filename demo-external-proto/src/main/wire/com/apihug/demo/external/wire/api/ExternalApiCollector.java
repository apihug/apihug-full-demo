package com.apihug.demo.external.wire.api;

import com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum;
import com.apihug.demo.external.wire.infra.settings.example.TemplateExampleEnum;
import hope.common.Builder;
import hope.common.service.Collector;
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
public final class ExternalApiCollector implements Collector<OpenAPI, Schema, ApiResponse, Parameter, Example, RequestBody, Header, SecurityScheme, Link, Callback, Tag> {
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

  public ExternalApiCollector() {
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

  private final void _build_component_com_apihug_demo_external_wire_infra_settings_example_TemplateExampleEnum(
      ) {
    //  Build of the component: TemplateExampleEnum proto: com/apihug/demo/external/proto/infra/settings/example/constant.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.external.wire.infra.settings.example.TemplateExampleEnum", res);
    res.setClzName("com.apihug.demo.external.wire.infra.settings.example.TemplateExampleEnum");
    res.setEnumClz(true);
    res.setName("TemplateExampleEnum");
    res.setPayload(new Builder<Schema<TemplateExampleEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Remember to remove this enum this is example from template");
        List<TemplateExampleEnum> values  = new ArrayList();
        values.add(TemplateExampleEnum.REMOVE_ME);
        values.add(TemplateExampleEnum.RIGHT_NOW);
        res.setDefault(TemplateExampleEnum.REMOVE_ME);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_external_wire_infra_settings_ExternalAuthorityEnum(
      ) {
    //  Build of the component: ExternalAuthorityEnum proto: com/apihug/demo/external/proto/infra/settings/authority.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum", res);
    res.setClzName("com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum");
    res.setEnumClz(true);
    res.setName("ExternalAuthorityEnum");
    res.setPayload(new Builder<Schema<ExternalAuthorityEnum>>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("Example Authority Enum for the project, MODIFY IT");
        List<ExternalAuthorityEnum> values  = new ArrayList();
        values.add(ExternalAuthorityEnum.USER_ADD);
        values.add(ExternalAuthorityEnum.USER_DELETE);
        res.setDefault(ExternalAuthorityEnum.USER_ADD);
        res.setEnum(values);
        return res;
      }
    }.build());
  }

  private final void _build_component_com_apihug_demo_external_wire_api_example_request_TemplateExampleRequest(
      ) {
    //  Build of the component: TemplateExampleRequest proto: com/apihug/demo/external/proto/api/example/request/example.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest", res);
    res.setClzName("com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest");
    res.setName("TemplateExampleRequest");
    res.setProtoFrom("com/apihug/demo/external/proto/api/example/request/example.proto");
    res.setProtoEntity("TemplateExampleRequest");
    res.setDescription("This is a template example request,REMOVE IT");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("This is a template example request,REMOVE IT");
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
        res.setDescription("user input name");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("Jake");
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
    // Add field 1 email
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("email");
    _1.setFieldName("email");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("user input email");
        res.setFormat("email");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("jake@bigger.com");
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
    _1.setRule(new Builder<Map>() {
      @Override
      public Map build() {
        Map res = new LinkedHashMap();
        res.put("nature", "EMAIL");
        res.put("name", "nature");
        return res;
      }
    }.build());
    res.addItem(_1);
  }

  private final void _build_component_com_apihug_demo_external_wire_api_example_response_TemplateExampleResponse(
      ) {
    //  Build of the component: TemplateExampleResponse proto: com/apihug/demo/external/proto/api/example/response/example.proto
    Component<Schema, Schema> res = new Component();
    componentMap.put("com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse", res);
    res.setClzName("com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse");
    res.setName("TemplateExampleResponse");
    res.setProtoFrom("com/apihug/demo/external/proto/api/example/response/example.proto");
    res.setProtoEntity("TemplateExampleResponse");
    res.setDescription("This is a template example response");
    res.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("This is a template example response");
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
        res.setDescription("user input name");
        res.setSpecVersion(SpecVersion.V30);
        res.setExample("Jake");
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
    // Add field 1 hello
    ComponentItem<Schema> _1 = new ComponentItem();
    _1.setClz("java.lang.String");
    _1.setName("hello");
    _1.setFieldName("hello");
    _1.setPayload(new Builder<Schema>() {
      @Override
      public Schema build() {
        Schema res  = new Schema();
        res.setDescription("response hello");
        res.setSpecVersion(SpecVersion.V30);
        res.setNullable(false);
        res.setExample("hello Jake");
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

  private final void _build_service_com_apihug_demo_external_wire_api_example_TemplateExampleService(
      ) {
    // ----------------------------------------------------
    // START-[Service Context] com.apihug.demo.external.wire.api.example.TemplateExampleService
    Map sc = servicesContext.computeIfAbsent("com.apihug.demo.external.wire.api.example.TemplateExampleService", s-> new LinkedHashMap());
    sc.put("description", "This is a example service remember to remove it");
    sc.put("protoFrom", "com/apihug/demo/external/proto/api/example/api.proto");
    sc.put("protoEntity", "TemplateExampleService");
    sc.put("basePath", "/demo-all-external");
    List<String> sc_paths = new ArrayList();
    sc.put("paths", sc_paths);
    // --------------------------
    // Register Path of this Service: [1] "/demo-all-external/post-test"
    sc_paths.add("/demo-all-external/post-test");
    Map _sc_paths_item_1 = pathsContext.computeIfAbsent("/demo-all-external/post-test", s-> new LinkedHashMap());
    _sc_paths_item_1.put("action", "POST");
    _sc_paths_item_1.put("method", "ExamplePost");
    _sc_paths_item_1.put("wrapper", true);
    _sc_paths_item_1.put("pageable", false);
    _sc_paths_item_1.put("request", false);
    _sc_paths_item_1.put("response", false);
    _sc_paths_item_1.put("session", false);
    _sc_paths_item_1.put("inputPlural", false);
    _sc_paths_item_1.put("outputPlural", false);
    _sc_paths_item_1.put("priority", "HIGH");
    _sc_paths_item_1.put("requestRef", "com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest");
    _sc_paths_item_1.put("responseRef", "com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse");
    _sc_paths_item_1.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("post test example");
        return operation;
      }
    }.build());
    _sc_paths_item_1.put("group", "CUSTOMER");
    _sc_paths_item_1.put("empty", false);
    // --------------------------
    // Register Path of this Service: [2] "/demo-all-external/ping"
    sc_paths.add("/demo-all-external/ping");
    Map _sc_paths_item_2 = pathsContext.computeIfAbsent("/demo-all-external/ping", s-> new LinkedHashMap());
    _sc_paths_item_2.put("action", "POST");
    _sc_paths_item_2.put("method", "Ping");
    _sc_paths_item_2.put("wrapper", true);
    _sc_paths_item_2.put("pageable", false);
    _sc_paths_item_2.put("request", false);
    _sc_paths_item_2.put("response", false);
    _sc_paths_item_2.put("session", false);
    _sc_paths_item_2.put("inputPlural", false);
    _sc_paths_item_2.put("outputPlural", false);
    _sc_paths_item_2.put("priority", "HIGH");
    _sc_paths_item_2.put("requestRef", "hope.common.adaptor.Empty");
    _sc_paths_item_2.put("responseRef", "hope.common.adaptor.Empty");
    _sc_paths_item_2.put("operation", new Builder<Operation>() {
      @Override
      public Operation build() {
        final Operation operation =  new Operation();
        operation.setDescription("ping you like /ping?name=jake");
        return operation;
      }
    }.build());
    _sc_paths_item_2.put("parameters", new Builder<List<hope.common.service.api.Parameter>>() {
      @Override
      public List<hope.common.service.api.Parameter> build() {
        List<hope.common.service.api.Parameter> res = new ArrayList();
        hope.common.service.api.Parameter<Parameter> _1 = new hope.common.service.api.Parameter();
        _1.setName("name");
        _1.setPlural(false);
        _1.setIn(hope.common.service.api.Parameter.Type.QUERY);
        _1.setDelegator(new Builder<Parameter>() {
          @Override
          public Parameter build() {
            Parameter res  = new Parameter();
            res.setName("name");
            res.setIn("query");
            res.setSchema(new Builder<Schema>() {
              @Override
              public Schema build() {
                Schema res  = new Schema();
                res.setSpecVersion(SpecVersion.V30);
                res.setTypes(Set.of("string"));
                return res;
              }
            }.build());
            return res;
          }
        }.build());
        res.add(_1);
        return res;
      }
    }.build());
    _sc_paths_item_2.put("group", "CUSTOMER");
    _sc_paths_item_2.put("empty", false);
    // END-[Service Context] com.apihug.demo.external.wire.api.example.TemplateExampleService
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
        _info.setTitle("demo-external-proto");
        _info.setDescription("proto lib of  how to wire all the stuff together");
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
    // Build for Enum :com.apihug.demo.external.wire.infra.settings.example.TemplateExampleEnum
    _build_component_com_apihug_demo_external_wire_infra_settings_example_TemplateExampleEnum();
    // Build for Enum :com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum
    _build_component_com_apihug_demo_external_wire_infra_settings_ExternalAuthorityEnum();
    // Build for Component : com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest
    _build_component_com_apihug_demo_external_wire_api_example_request_TemplateExampleRequest();
    // Build for Component : com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse
    _build_component_com_apihug_demo_external_wire_api_example_response_TemplateExampleResponse();
    // Build For Service com.apihug.demo.external.wire.api.example.TemplateExampleService
    _build_service_com_apihug_demo_external_wire_api_example_TemplateExampleService();
    // Build OpenAPI information
    _merger_api();
    api.tags(new ArrayList<>(tags.values()));
  }
}
