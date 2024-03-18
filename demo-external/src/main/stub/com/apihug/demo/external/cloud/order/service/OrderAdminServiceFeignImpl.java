package com.apihug.demo.external.cloud.order.service;

import com.apihug.demo.external.cloud.order.feign.OrderAdminFeign;
import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import feign.FeignException;
import hope.common.api.Result;
import hope.common.api.error.Error;
import hope.common.api.exceptions.HopeErrorDetailException;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Admin to control order
 */
@ProtoFrom(
    value = "com/apihug/demo/order/proto/api/admin/api.proto",
    entity = "OrderAdminService",
    kind = Kind.CLIENT
)
@Service
@Generated("H.O.P.E. Infra Team")
public class OrderAdminServiceFeignImpl implements OrderAdminService {
  protected final OrderAdminFeign svc;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public OrderAdminServiceFeignImpl(@Autowired final OrderAdminFeign svc) {
    this.svc=svc;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String sayHello() {
    Result<String> res;

    try {
    	res = svc.sayHello();
    } catch ( FeignException exception) { 
    	logger.warn("FAIL_FEIGN_CALL_NETWORK DOMAIN:[demo-order]  PATH:[/order/admin/hello-world]", exception);
    	HopeErrorDetailException.HopeErrorDetailExceptionBuilder _eb = HopeErrorDetailException.builder();
    	_eb.error(exception.status(),exception.getMessage(),exception.getCause(),exception.responseBody(), "demo-order");
    	throw _eb.build();
    }

    if (res.fail()){
    	final String _errs = Error.readable(res.getErrors());
    	logger.warn("FAIL_FEIGN_CALL_LOGIC DOMAIN:[demo-order]  PATH:[/order/admin/hello-world] Errors: " + _errs);
    	HopeErrorDetailException.HopeErrorDetailExceptionBuilder _eb = HopeErrorDetailException.builder();
    	_eb.errors(res.getErrors(),"demo-order");
    	throw _eb.build();
    }
    return res.getPayload();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public OrderAddedResponse addOrder(AddOrderRequest addOrderRequest) {
    Result<OrderAddedResponse> res;

    try {
    	res = svc.addOrder(addOrderRequest);
    } catch ( FeignException exception) { 
    	logger.warn("FAIL_FEIGN_CALL_NETWORK DOMAIN:[demo-order]  PATH:[/order/admin/add-order]", exception);
    	HopeErrorDetailException.HopeErrorDetailExceptionBuilder _eb = HopeErrorDetailException.builder();
    	_eb.error(exception.status(),exception.getMessage(),exception.getCause(),exception.responseBody(), "demo-order");
    	throw _eb.build();
    }

    if (res.fail()){
    	final String _errs = Error.readable(res.getErrors());
    	logger.warn("FAIL_FEIGN_CALL_LOGIC DOMAIN:[demo-order]  PATH:[/order/admin/add-order] Errors: " + _errs);
    	HopeErrorDetailException.HopeErrorDetailExceptionBuilder _eb = HopeErrorDetailException.builder();
    	_eb.errors(res.getErrors(),"demo-order");
    	throw _eb.build();
    }
    return res.getPayload();
  }
}
