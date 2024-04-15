package com.apihug.demo.user.wire.api.sample;

import com.apihug.demo.user.UserAuthorization;
import hope.common.api.PageRequest;
import hope.common.api.Pageable;
import hope.common.api.Result;
import hope.common.api.annotation.ParameterObject;
import hope.common.service.annotation.Group;
import hope.common.spring.PageableResultBuilder;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.aspect.AspectManager;
import hope.common.spring.helper.PageRequestGuardian;
import io.swagger.v3.oas.annotations.Operation;
import java.lang.Throwable;
import java.util.List;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class SampleDemoController {
  protected final SampleDemoService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public SampleDemoController(SampleDemoService service) {
    this._service = service;
  }

  @GetMapping("/example-demo/page-a-sample")
  @UserAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "Demo how to query a page result"
  )
  public ResponseEntity<Result<Pageable<QueryResultDemoResponse>>> pageQuery(
      @ParameterObject PageRequest pageParameter) {
    final PageableResultBuilder<QueryResultDemoResponse> builder = new PageableResultBuilder<QueryResultDemoResponse>();
    pageParameter = PageRequestGuardian.guard(pageParameter);

    try {
    	aspect().before("/example-demo/page-a-sample","pageParameter",pageParameter );
    	_service.pageQuery(builder,pageParameter);
    	ResponseEntity<Result<Pageable<QueryResultDemoResponse>>> res = builder.done();
    	aspect().after("/example-demo/page-a-sample", res ,"pageParameter",pageParameter );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[pageQuery] PATH:[/example-demo/page-a-sample]",exception);
    	aspect().exception("/example-demo/page-a-sample", exception ,"pageParameter",pageParameter );
    	throw exception;
    }
  }

  @GetMapping("/example-demo/list-a-sample")
  @UserAuthorization
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "query return a list"
  )
  public ResponseEntity<Result<List<QueryResultDemoResponse>>> listQuery() {
    final SimpleResultBuilder<List<QueryResultDemoResponse>> builder = new SimpleResultBuilder<List<QueryResultDemoResponse>>();

    try {
    	aspect().before("/example-demo/list-a-sample" );
    	_service.listQuery(builder);
    	ResponseEntity<Result<List<QueryResultDemoResponse>>> res = builder.done();
    	aspect().after("/example-demo/list-a-sample", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[listQuery] PATH:[/example-demo/list-a-sample]",exception);
    	aspect().exception("/example-demo/list-a-sample", exception  );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
