package com.apihug.demo.inventory;

import com.apihug.demo.inventory.wire.api.InventoryApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class InventorySecurityContext extends SecurityContext {
  @Override
  protected InventoryApiModule module() {
    return new InventoryApiModule();
  }
}
