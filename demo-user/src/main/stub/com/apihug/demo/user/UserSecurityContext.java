package com.apihug.demo.user;

import com.apihug.demo.user.wire.api.UserApiModule;
import hope.common.spring.security.SecurityContext;
import java.lang.Override;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Component
@Generated("H.O.P.E. Infra Team")
public class UserSecurityContext extends SecurityContext {
  @Override
  protected UserApiModule module() {
    return new UserApiModule();
  }
}
