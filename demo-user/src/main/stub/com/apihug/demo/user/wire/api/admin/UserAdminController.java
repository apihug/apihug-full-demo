package com.apihug.demo.user.wire.api.admin;

import com.apihug.demo.user.UserAuthorization;
import com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest;
import com.apihug.demo.user.wire.api.admin.request.RegisterRequest;
import com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse;
import com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse;
import com.apihug.demo.user.wire.infra.settings.UserAuthorityEnum;
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
public class UserAdminController {
  protected final UserAdminService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public UserAdminController(UserAdminService service) {
    this._service = service;
  }

  @GetMapping("/user/admin/say-hello")
  @UserAuthorization(
      anonymous = true
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "Hello from the user admin server",
      tags = "project"
  )
  public ResponseEntity<Result<String>> sayHello() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/user/admin/say-hello" );
    	_service.sayHello(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/user/admin/say-hello", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[sayHello] PATH:[/user/admin/say-hello]",exception);
    	aspect().exception("/user/admin/say-hello", exception  );
    	throw exception;
    }
  }

  @PostMapping("/user/admin/register")
  @UserAuthorization(
      authorities = UserAuthorityEnum.USER_ADD
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "admin try to register a new customer"
  )
  public ResponseEntity<Result<CustomerRegisteredResponse>> registerCustomer(
      @RequestBody @Valid RegisterRequest registerRequest) {
    final SimpleResultBuilder<CustomerRegisteredResponse> builder = new SimpleResultBuilder<CustomerRegisteredResponse>();
    registerRequest = registerRequest == null ? new RegisterRequest(): registerRequest;

    try {
    	aspect().before("/user/admin/register","registerRequest",registerRequest );
    	_service.registerCustomer(builder,registerRequest);
    	ResponseEntity<Result<CustomerRegisteredResponse>> res = builder.done();
    	aspect().after("/user/admin/register", res ,"registerRequest",registerRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[registerCustomer] PATH:[/user/admin/register]",exception);
    	aspect().exception("/user/admin/register", exception ,"registerRequest",registerRequest );
    	throw exception;
    }
  }

  @PostMapping("/user/admin/change-password")
  @UserAuthorization(
      authorities = {
          UserAuthorityEnum.USER_ADD,
          UserAuthorityEnum.USER_DELETE
      }
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "use to reset the password after password forgot"
  )
  public ResponseEntity<Result<CustomerPasswordUpdatedResponse>> changePassword(
      @RequestBody @Valid ChangePasswordRequest changePasswordRequest) {
    final SimpleResultBuilder<CustomerPasswordUpdatedResponse> builder = new SimpleResultBuilder<CustomerPasswordUpdatedResponse>();
    changePasswordRequest = changePasswordRequest == null ? new ChangePasswordRequest(): changePasswordRequest;

    try {
    	aspect().before("/user/admin/change-password","changePasswordRequest",changePasswordRequest );
    	_service.changePassword(builder,changePasswordRequest);
    	ResponseEntity<Result<CustomerPasswordUpdatedResponse>> res = builder.done();
    	aspect().after("/user/admin/change-password", res ,"changePasswordRequest",changePasswordRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[changePassword] PATH:[/user/admin/change-password]",exception);
    	aspect().exception("/user/admin/change-password", exception ,"changePasswordRequest",changePasswordRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
