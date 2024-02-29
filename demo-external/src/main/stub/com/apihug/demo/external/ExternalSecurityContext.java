package com.apihug.demo.external;

import com.apihug.demo.external.wire.api.ExternalApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class ExternalSecurityContext extends SecurityContext {
  @Override
  protected ExternalApiModule module() {
    return new ExternalApiModule();
  }
}
