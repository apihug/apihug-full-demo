package com.apihug.demo.inventory.service.storage;

import com.apihug.demo.inventory.wire.api.storage.InventoryStorageService;
import com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse;
import hope.common.guardian.annotation.Version;
import hope.common.meta.annotation.Kind;
import hope.common.meta.annotation.ProtoFrom;
import hope.common.meta.version.Type;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.audit.AuditContext;
import hope.common.spring.audit.AuditContextSupplier;
import java.lang.Long;
import java.lang.Override;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

/**
 * Storage admin service
 */
@Service
@Version(
    version = "0.1.1-SNAPSHOT",
    type = Type.ADD,
    timestamp = "2024-03-18 18:53:14"
)
@ProtoFrom(
    value = "com/apihug/demo/inventory/proto/api/storage/api.proto",
    entity = "InventoryStorageService",
    kind = Kind.RPC
)
public class InventoryStorageServiceImpl implements InventoryStorageService {
  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected final AuditContextSupplier _supplier;

  public InventoryStorageServiceImpl(final ObjectProvider<AuditContextSupplier> _supplier) {
    this._supplier = _supplier.getIfAvailable(() -> AuditContextSupplier.EMPTY);
  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void addStorageLocation(final SimpleResultBuilder<StorageLocationAddedResponse> builder,
      final AddStorageLocationRequest addStorageLocationRequest) {

    builder.notImplemented();

  }

  /**
   * {@inheritDoc}
   *
   */
  @Override
  public void deleteStorageLocation(
      final SimpleResultBuilder<StorageLocationDeletedResponse> builder,
      final DeleteStorageLocationRequest deleteStorageLocationRequest) {

    builder.notImplemented();

  }

  protected AuditContext<Long, Long> auditContext() {
    return _supplier.get();
  }
}
