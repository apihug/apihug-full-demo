package com.apihug.demo.external.wire.api.example;

import com.apihug.demo.external.ExternalAuthorization;
import com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest;
import com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
import hope.common.service.api.Authorization;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.aspect.AspectManager;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.lang.String;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class TemplateExampleController {
  protected final TemplateExampleService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public TemplateExampleController(TemplateExampleService service) {
    this._service = service;
  }

  @PostMapping("/demo-all-external/post-test")
  @ExternalAuthorization(
      combinator = Authorization.Combinator.AND
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "post test example"
  )
  public ResponseEntity<Result<TemplateExampleResponse>> examplePost(
      @RequestBody @Valid TemplateExampleRequest templateExampleRequest) {
    final SimpleResultBuilder<TemplateExampleResponse> builder = new SimpleResultBuilder<TemplateExampleResponse>();
    templateExampleRequest = templateExampleRequest == null ? new TemplateExampleRequest(): templateExampleRequest;

    try {
    	aspect().before("/demo-all-external/post-test","templateExampleRequest",templateExampleRequest );
    	_service.examplePost(builder,templateExampleRequest);
    	ResponseEntity<Result<TemplateExampleResponse>> res = builder.done();
    	aspect().after("/demo-all-external/post-test", res ,"templateExampleRequest",templateExampleRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[examplePost] PATH:[/demo-all-external/post-test]",exception);
    	aspect().exception("/demo-all-external/post-test", exception ,"templateExampleRequest",templateExampleRequest );
    	throw exception;
    }
  }

  @PostMapping("/demo-all-external/ping")
  @ExternalAuthorization(
      combinator = Authorization.Combinator.AND
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "ping you like /ping?name=jake"
  )
  public ResponseEntity<Result<String>> ping(@RequestParam(name = "name") final String name) {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/demo-all-external/ping","name",name );
    	_service.ping(builder,name);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/demo-all-external/ping", res ,"name",name );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[ping] PATH:[/demo-all-external/ping]",exception);
    	aspect().exception("/demo-all-external/ping", exception ,"name",name );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
