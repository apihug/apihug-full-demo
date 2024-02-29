package com.apihug.demo.order;

import com.apihug.demo.order.wire.api.OrderApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class OrderSecurityContext extends SecurityContext {
  @Override
  protected OrderApiModule module() {
    return new OrderApiModule();
  }
}
