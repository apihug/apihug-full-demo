package com.apihug.demo.inventory.infra.security;

import hope.common.service.runtime.Resource;
import hope.common.spring.security.SecurityContext;
import hope.common.spring.security.SecurityCustomizer;
import hope.common.spring.security.checker.Checker;
import java.lang.Override;
import java.util.function.Supplier;
import org.springframework.stereotype.Component;

@Component
public class InventorySecurityCustomizer implements SecurityCustomizer {
  @Override
  public void all(SecurityContext securityContext) {
    // TODO add your global security customized overwrite here:

        /** Any resources have no {@link Authorization} will be passed with no authorization checker */
        // securityContext.passAsDefault();

        /** All resources have no {@link Authorization} will be denied */
        // securityContext.denyAsDefault();

        /** {@code /login } should pass with no authorization check */
        // securityContext.exactly("/login").permit();

        /**
         * {@code /api/v1 } start path with specific check logic, you can also use {@code ant} style
         * match
         */
        // securityContext.start("/api/v1").security(new Checker() {
        //  @Override
        //  public boolean isGranted(Resource path, Customer customer, Map ctx) {
        //    //Specific logic:
        //    return false;
        //  }
        // });

        ;
  }

  @Override
  public Supplier path(SecurityContext securityContext, Resource resource,
      Supplier<Checker> predefined, boolean isDefault) {
    // TODO add your path security customized overwrite here;
    return predefined;
  }
}
