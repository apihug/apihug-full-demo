package com.apihug.demo.user.service.good;

import com.apihug.demo.user.wire.api.good.GoodService;
import com.apihug.demo.user.wire.api.sample.RequiredDemoRequest;
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

/** Service for good */
@Service
@Version(version = "0.1.1-SNAPSHOT", type = Type.ADD, timestamp = "2024-03-14 16:20:42")
@ProtoFrom(
    value = "com/apihug/demo/user/proto/api/good/good.proto",
    entity = "GoodService",
    kind = Kind.RPC)
public class GoodServiceImpl implements GoodService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public GoodServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /** {@inheritDoc} */
  @Override
  public void sayHello(final SimpleResultBuilder<String> builder) {

    builder.notImplemented();
  }

  /** {@inheritDoc} */
  @Override
  public void doSomething(
      SimpleResultBuilder<String> builder, RequiredDemoRequest requiredDemoRequest) {
    GoodService.super.doSomething(builder, requiredDemoRequest);
  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
