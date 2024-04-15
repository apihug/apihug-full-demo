package com.apihug.demo.user.wire.api.good;

import com.apihug.demo.user.UserAuthorization;
import com.apihug.demo.user.wire.api.sample.RequiredDemoRequest;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class GoodController {
  protected final GoodService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public GoodController(GoodService service) {
    this._service = service;
  }

  @GetMapping("/good/hello-world")
  @UserAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "Say hello to the world",
      tags = "project"
  )
  public ResponseEntity<Result<String>> sayHello() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/good/hello-world" );
    	_service.sayHello(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/good/hello-world", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[sayHello] PATH:[/good/hello-world]",exception);
    	aspect().exception("/good/hello-world", exception  );
    	throw exception;
    }
  }

  @PostMapping("/good/do-something")
  @UserAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "just do something funny"
  )
  public ResponseEntity<Result<String>> doSomething(
      @RequestBody @Valid RequiredDemoRequest requiredDemoRequest) {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();
    requiredDemoRequest = requiredDemoRequest == null ? new RequiredDemoRequest(): requiredDemoRequest;

    try {
    	aspect().before("/good/do-something","requiredDemoRequest",requiredDemoRequest );
    	_service.doSomething(builder,requiredDemoRequest);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/good/do-something", res ,"requiredDemoRequest",requiredDemoRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[doSomething] PATH:[/good/do-something]",exception);
    	aspect().exception("/good/do-something", exception ,"requiredDemoRequest",requiredDemoRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
