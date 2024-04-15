package com.apihug.demo.user.wire.api.good;

import com.apihug.demo.user.wire.api.sample.RequiredDemoRequest;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface GoodService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /good/hello-world}
   * 	<p>{@code Say hello to the world}
   */
  default void sayHello(SimpleResultBuilder<String> builder) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /good/do-something}
   * 	<p>{@code just do something funny}
   */
  default void doSomething(SimpleResultBuilder<String> builder,
      RequiredDemoRequest requiredDemoRequest) {
    builder.notImplemented();
  }
}
