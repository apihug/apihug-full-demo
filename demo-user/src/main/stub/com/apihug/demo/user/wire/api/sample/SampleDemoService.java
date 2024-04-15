package com.apihug.demo.user.wire.api.sample;

import hope.common.api.PageRequest;
import hope.common.spring.PageableResultBuilder;
import hope.common.spring.SimpleResultBuilder;
import java.util.List;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface SampleDemoService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /example-demo/page-a-sample}
   * 	<p>{@code Demo how to query a page result}
   */
  default void pageQuery(PageableResultBuilder<QueryResultDemoResponse> builder,
      PageRequest pageParameter) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * </ul>
   * @apiNote
   * 	<p>{@code /example-demo/list-a-sample}
   * 	<p>{@code query return a list}
   */
  default void listQuery(SimpleResultBuilder<List<QueryResultDemoResponse>> builder) {
    builder.notImplemented();
  }
}
