package com.apihug.demo.external.wire.api.example;

import com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest;
import com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface TemplateExampleService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /demo-all-external/post-test}
   * 	<p>{@code post test example}
   */
  default void examplePost(SimpleResultBuilder<TemplateExampleResponse> builder,
      TemplateExampleRequest templateExampleRequest) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /demo-all-external/ping}
   * 	<p>{@code ping you like /ping?name=jake}
   */
  default void ping(SimpleResultBuilder<String> builder, String name) {
    builder.notImplemented();
  }
}
