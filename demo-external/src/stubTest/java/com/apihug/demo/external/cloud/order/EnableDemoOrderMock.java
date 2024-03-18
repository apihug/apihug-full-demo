package com.apihug.demo.external.cloud.order;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Generated;
import org.springframework.context.annotation.Import;

@Import(DemoOrderMockConfiguration.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Generated("H.O.P.E. Infra Team")
public @interface EnableDemoOrderMock {
}
