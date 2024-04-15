package com.apihug.demo.inventory.wire.api.storage;

import com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse;
import hope.common.spring.SimpleResultBuilder;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface InventoryStorageService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Authorities: [ADD_STORAGE_LOCATION]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /inventory/storage/admin/add-location}
   * 	<p>{@code add a new location in the storage}
   */
  default void addStorageLocation(SimpleResultBuilder<StorageLocationAddedResponse> builder,
      AddStorageLocationRequest addStorageLocationRequest) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Authorities: [DELETE_STORAGE_LOCATION]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /inventory/storage/admin/delete-location}
   * 	<p>{@code delete a old location}
   */
  default void deleteStorageLocation(SimpleResultBuilder<StorageLocationDeletedResponse> builder,
      DeleteStorageLocationRequest deleteStorageLocationRequest) {
    builder.notImplemented();
  }
}
