package com.apihug.demo.external;

import com.apihug.demo.external.wire.infra.settings.ExternalAuthorityEnum;
import hope.common.service.api.Authorization;
import java.lang.String;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Generated;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Generated("H.O.P.E. Infra Team")
public @interface ExternalAuthorization {
  /**
   * Whether this method is anonymous.
   */
  boolean anonymous() default false;

  /**
   * Low risk mode level
   */
  Authorization.LowLimitRiskyMode lowLimitRiskyMode() default Authorization.LowLimitRiskyMode.NONE;

  /**
   * Predefined role check type
   */
  Authorization.PredefinedRoleCheckerType predefinedRoleCheckerType(
      ) default Authorization.PredefinedRoleCheckerType.NONE;

  /**
   * How the roles and authorities are combined: {@code AND|OR}
   */
  Authorization.Combinator combinator() default Authorization.Combinator.AND;

  /**
   * Has any roles supports
   */
  String[] roles() default {};

  /**
   * {@code SpEL} expression
   */
  String expression() default "";

  /**
   * Has any authorities support
   */
  ExternalAuthorityEnum[] authorities() default {};
}
