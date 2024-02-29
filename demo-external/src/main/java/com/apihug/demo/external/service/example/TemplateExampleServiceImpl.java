package com.apihug.demo.external.service.example;

import com.apihug.demo.external.wire.api.example.TemplateExampleService;
import com.apihug.demo.external.wire.api.example.request.TemplateExampleRequest;
import com.apihug.demo.external.wire.api.example.response.TemplateExampleResponse;
import hope.common.guardian.annotation.Version;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import hope.common.meta.version.Type;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * This is a example service remember to remove it
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-02-29 17:40:16"
)
@ProtoFrom(
    value = "com/apihug/demo/external/proto/api/example/api.proto",
    entity = "TemplateExampleService",
    kind = Kind.RPC
)
public class TemplateExampleServiceImpl implements TemplateExampleService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public TemplateExampleServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void examplePost(final SimpleResultBuilder<TemplateExampleResponse> builder,
      final TemplateExampleRequest templateExampleRequest) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void ping(final SimpleResultBuilder<String> builder, final String name) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
