package com.apihug.demo.inventory.wire.api.admin;

import com.apihug.demo.inventory.InventoryAuthorization;
import com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum;
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
public class InventoryAdminController {
  protected final InventoryAdminService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public InventoryAdminController(InventoryAdminService service) {
    this._service = service;
  }

  @GetMapping("/inventory/admin/hello-world")
  @InventoryAuthorization(
      anonymous = true,
      combinator = Authorization.Combinator.AND
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "hello from the inventory admin",
      tags = "project"
  )
  public ResponseEntity<Result<String>> sayHello() {
    final SimpleResultBuilder<String> builder = new SimpleResultBuilder<String>();

    try {
    	aspect().before("/inventory/admin/hello-world" );
    	_service.sayHello(builder);
    	ResponseEntity<Result<String>> res = builder.done();
    	aspect().after("/inventory/admin/hello-world", res  );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[sayHello] PATH:[/inventory/admin/hello-world]",exception);
    	aspect().exception("/inventory/admin/hello-world", exception  );
    	throw exception;
    }
  }

  @PostMapping("/inventory/admin/stock-in")
  @InventoryAuthorization(
      combinator = Authorization.Combinator.AND,
      authorities = InventoryAuthorityEnum.STOCK_IN
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "put good to the stock"
  )
  public ResponseEntity<Result<StockInResponse>> stockIn(
      @RequestBody @Valid StockInRequest stockInRequest) {
    final SimpleResultBuilder<StockInResponse> builder = new SimpleResultBuilder<StockInResponse>();
    stockInRequest = stockInRequest == null ? new StockInRequest(): stockInRequest;

    try {
    	aspect().before("/inventory/admin/stock-in","stockInRequest",stockInRequest );
    	_service.stockIn(builder,stockInRequest);
    	ResponseEntity<Result<StockInResponse>> res = builder.done();
    	aspect().after("/inventory/admin/stock-in", res ,"stockInRequest",stockInRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[stockIn] PATH:[/inventory/admin/stock-in]",exception);
    	aspect().exception("/inventory/admin/stock-in", exception ,"stockInRequest",stockInRequest );
    	throw exception;
    }
  }

  @PostMapping("/inventory/admin/stock-out")
  @InventoryAuthorization(
      combinator = Authorization.Combinator.AND,
      authorities = InventoryAuthorityEnum.STOCK_OUT
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "stock out to delivery the goods to customer"
  )
  public ResponseEntity<Result<StockOutResponse>> stockOut(
      @RequestBody @Valid StockOutRequest stockOutRequest) {
    final SimpleResultBuilder<StockOutResponse> builder = new SimpleResultBuilder<StockOutResponse>();
    stockOutRequest = stockOutRequest == null ? new StockOutRequest(): stockOutRequest;

    try {
    	aspect().before("/inventory/admin/stock-out","stockOutRequest",stockOutRequest );
    	_service.stockOut(builder,stockOutRequest);
    	ResponseEntity<Result<StockOutResponse>> res = builder.done();
    	aspect().after("/inventory/admin/stock-out", res ,"stockOutRequest",stockOutRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[stockOut] PATH:[/inventory/admin/stock-out]",exception);
    	aspect().exception("/inventory/admin/stock-out", exception ,"stockOutRequest",stockOutRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
