package com.apihug.demo.external.cloud.order;

import com.apihug.demo.order.wire.api.OrderApiModule;
import hope.common.mock.server.contract.HopeContractConfiguration;
import java.lang.Override;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public class DemoOrderMockConfiguration extends HopeContractConfiguration {
  protected final OrderApiModule module = new OrderApiModule();

  @Override
  public OrderApiModule module() {
    return module;
  }
}
