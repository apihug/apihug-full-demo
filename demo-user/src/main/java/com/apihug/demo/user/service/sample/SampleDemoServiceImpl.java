package com.apihug.demo.user.service.sample;

import com.apihug.demo.user.wire.api.sample.QueryResultDemoResponse;
import com.apihug.demo.user.wire.api.sample.SampleDemoService;
import hope.common.api.PageRequest;
import hope.common.guardian.annotation.Version;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import hope.common.meta.version.Type;
import hope.common.spring.PageableResultBuilder;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import java.lang.Long;
import java.lang.Override;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * api hug online demo project
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-03-18 09:14:34"
)
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/sample/api.proto",
    entity = "SampleDemoService",
    kind = Kind.RPC
)
public class SampleDemoServiceImpl implements SampleDemoService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public SampleDemoServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void pageQuery(final PageableResultBuilder<QueryResultDemoResponse> builder,
      final PageRequest pageParameter) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void listQuery(final SimpleResultBuilder<List<QueryResultDemoResponse>> builder) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
