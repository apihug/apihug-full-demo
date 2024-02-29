package com.apihug.demo.order.wire.api.admin;

import com.apihug.demo.order.OrderAuthorization;
import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.request.DeleteOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import com.apihug.demo.order.wire.api.admin.response.OrderDeletedResponse;
import com.apihug.demo.order.wire.infra.settings.OrderAuthorityEnum;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class OrderAdminController {
  protected final OrderAdminService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public OrderAdminController(OrderAdminService service) {
    this._service = service;
  }

  @GetMapping("/order/admin/hello-world")
  @OrderAuthorization(
      anonymous = true,
      combinator = Authorization.Combinator.AND
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "hello from the admin server",
      tags = "project"
  )
  public ResponseEntity<Result<String>> sayHello() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/order/admin/hello-world" );
    	_service.sayHello(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/order/admin/hello-world", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[sayHello] PATH:[/order/admin/hello-world]",exception);
    	aspect().exception("/order/admin/hello-world", exception  );
    	throw exception;
    }
  }

  @PostMapping("/order/admin/add-order")
  @OrderAuthorization(
      combinator = Authorization.Combinator.AND,
      authorities = OrderAuthorityEnum.ORDER_ADD
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "add order"
  )
  public ResponseEntity<Result<OrderAddedResponse>> addOrder(
      @RequestBody @Valid AddOrderRequest addOrderRequest) {
    final SimpleResultBuilder<OrderAddedResponse> builder = new SimpleResultBuilder<OrderAddedResponse>();
    addOrderRequest = addOrderRequest == null ? new AddOrderRequest(): addOrderRequest;

    try {
    	aspect().before("/order/admin/add-order","addOrderRequest",addOrderRequest );
    	_service.addOrder(builder,addOrderRequest);
    	ResponseEntity<Result<OrderAddedResponse>> res = builder.done();
    	aspect().after("/order/admin/add-order", res ,"addOrderRequest",addOrderRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[addOrder] PATH:[/order/admin/add-order]",exception);
    	aspect().exception("/order/admin/add-order", exception ,"addOrderRequest",addOrderRequest );
    	throw exception;
    }
  }

  @PostMapping("/order/admin/delete-order")
  @OrderAuthorization(
      combinator = Authorization.Combinator.AND,
      authorities = {
          OrderAuthorityEnum.ORDER_ADD,
          OrderAuthorityEnum.ORDER_DELETE
      }
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "delete order "
  )
  public ResponseEntity<Result<OrderDeletedResponse>> deleteOrder(
      @RequestBody @Valid DeleteOrderRequest deleteOrderRequest) {
    final SimpleResultBuilder<OrderDeletedResponse> builder = new SimpleResultBuilder<OrderDeletedResponse>();
    deleteOrderRequest = deleteOrderRequest == null ? new DeleteOrderRequest(): deleteOrderRequest;

    try {
    	aspect().before("/order/admin/delete-order","deleteOrderRequest",deleteOrderRequest );
    	_service.deleteOrder(builder,deleteOrderRequest);
    	ResponseEntity<Result<OrderDeletedResponse>> res = builder.done();
    	aspect().after("/order/admin/delete-order", res ,"deleteOrderRequest",deleteOrderRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[deleteOrder] PATH:[/order/admin/delete-order]",exception);
    	aspect().exception("/order/admin/delete-order", exception ,"deleteOrderRequest",deleteOrderRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
