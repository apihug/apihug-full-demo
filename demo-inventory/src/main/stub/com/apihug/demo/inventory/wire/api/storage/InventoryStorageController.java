package com.apihug.demo.inventory.wire.api.storage;

import com.apihug.demo.inventory.InventoryAuthorization;
import com.apihug.demo.inventory.wire.api.storage.request.AddStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.request.DeleteStorageLocationRequest;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationAddedResponse;
import com.apihug.demo.inventory.wire.api.storage.response.StorageLocationDeletedResponse;
import com.apihug.demo.inventory.wire.infra.settings.InventoryAuthorityEnum;
import hope.common.api.Result;
import hope.common.service.annotation.Group;
import hope.common.spring.SimpleResultBuilder;
import hope.common.spring.aspect.AspectManager;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import java.lang.Throwable;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Generated("H.O.P.E. Infra Team")
public class InventoryStorageController {
  protected final InventoryStorageService _service;

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  public InventoryStorageController(InventoryStorageService service) {
    this._service = service;
  }

  @PostMapping("/inventory/storage/admin/add-location")
  @InventoryAuthorization(
      authorities = InventoryAuthorityEnum.ADD_STORAGE_LOCATION
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "add a new location in the storage"
  )
  public ResponseEntity<Result<StorageLocationAddedResponse>> addStorageLocation(
      @RequestBody @Valid AddStorageLocationRequest addStorageLocationRequest) {
    final SimpleResultBuilder<StorageLocationAddedResponse> builder = new SimpleResultBuilder<StorageLocationAddedResponse>();
    addStorageLocationRequest = addStorageLocationRequest == null ? new AddStorageLocationRequest(): addStorageLocationRequest;

    try {
    	aspect().before("/inventory/storage/admin/add-location","addStorageLocationRequest",addStorageLocationRequest );
    	_service.addStorageLocation(builder,addStorageLocationRequest);
    	ResponseEntity<Result<StorageLocationAddedResponse>> res = builder.done();
    	aspect().after("/inventory/storage/admin/add-location", res ,"addStorageLocationRequest",addStorageLocationRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[addStorageLocation] PATH:[/inventory/storage/admin/add-location]",exception);
    	aspect().exception("/inventory/storage/admin/add-location", exception ,"addStorageLocationRequest",addStorageLocationRequest );
    	throw exception;
    }
  }

  @PostMapping("/inventory/storage/admin/delete-location")
  @InventoryAuthorization(
      authorities = InventoryAuthorityEnum.DELETE_STORAGE_LOCATION
  )
  @Group(
      group = hope.common.service.api.Group.CUSTOMER
  )
  @Operation(
      description = "delete a old location"
  )
  public ResponseEntity<Result<StorageLocationDeletedResponse>> deleteStorageLocation(
      @RequestBody @Valid DeleteStorageLocationRequest deleteStorageLocationRequest) {
    final SimpleResultBuilder<StorageLocationDeletedResponse> builder = new SimpleResultBuilder<StorageLocationDeletedResponse>();
    deleteStorageLocationRequest = deleteStorageLocationRequest == null ? new DeleteStorageLocationRequest(): deleteStorageLocationRequest;

    try {
    	aspect().before("/inventory/storage/admin/delete-location","deleteStorageLocationRequest",deleteStorageLocationRequest );
    	_service.deleteStorageLocation(builder,deleteStorageLocationRequest);
    	ResponseEntity<Result<StorageLocationDeletedResponse>> res = builder.done();
    	aspect().after("/inventory/storage/admin/delete-location", res ,"deleteStorageLocationRequest",deleteStorageLocationRequest );
    	return res;
    } catch (Throwable exception ) { 
    	logger.error("FAIL_ACTION METHOD:[deleteStorageLocation] PATH:[/inventory/storage/admin/delete-location]",exception);
    	aspect().exception("/inventory/storage/admin/delete-location", exception ,"deleteStorageLocationRequest",deleteStorageLocationRequest );
    	throw exception;
    }
  }

  public AspectManager aspect() {
    return AspectManager.get();
  }
}
