package com.apihug.demo.external.cloud.order.service;

import com.apihug.demo.order.wire.api.OrderApiModule;
import com.apihug.demo.order.wire.api.admin.request.AddOrderRequest;
import com.apihug.demo.order.wire.api.admin.response.OrderAddedResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import hope.common.api.Result;
import hope.common.mock.contract.WireContextFactory;
import hope.common.mock.contract.WireContextWire;
import hope.common.mock.contract.wire.WireContext;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("mock-test")
@Service
@Primary
@Generated("H.O.P.E. Infra Team")
public class OrderAdminServiceStub implements OrderAdminService, WireContextWire {
  public final WireContext wireContext;

  @Autowired
  protected ObjectMapper objectMapper;

  public OrderAdminServiceStub() {
    wireContext = WireContextFactory.INSTANCE.context(new OrderApiModule());
  }

  @Override
  public WireContext context() {
    return wireContext;
  }

  public void setObjectMapper(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public String sayHello() {
    final TypeReference<Result<String>> _type  = new TypeReference<Result<String>>(){};
    Result<String> res =  objectMapper.convertValue(wireContext.mock("/order/admin/hello-world"), _type);
    return res.getPayload();
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public OrderAddedResponse addOrder(AddOrderRequest addOrderRequest) {
    final TypeReference<Result<OrderAddedResponse>> _type  = new TypeReference<Result<OrderAddedResponse>>(){};
    Result<OrderAddedResponse> res =  objectMapper.convertValue(wireContext.mock("/order/admin/add-order", addOrderRequest), _type);
    return res.getPayload();
  }
}
