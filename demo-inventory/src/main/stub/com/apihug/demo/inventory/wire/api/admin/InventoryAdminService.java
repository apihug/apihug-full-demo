package com.apihug.demo.inventory.wire.api.admin;

import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface InventoryAdminService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Anonymous: true</li>
   * 	<li>Combinator: AND</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /inventory/admin/hello-world}
   * 	<p>{@code hello from the inventory admin}
   */
  default void sayHello(SimpleResultBuilder<String> builder) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Combinator: AND</li>
   * 	<li>Authorities: [STOCK_IN]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /inventory/admin/stock-in}
   * 	<p>{@code put good to the stock}
   */
  default void stockIn(SimpleResultBuilder<StockInResponse> builder,
      StockInRequest stockInRequest) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Combinator: AND</li>
   * 	<li>Authorities: [STOCK_OUT]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /inventory/admin/stock-out}
   * 	<p>{@code stock out to delivery the goods to customer}
   */
  default void stockOut(SimpleResultBuilder<StockOutResponse> builder,
      StockOutRequest stockOutRequest) {
    builder.notImplemented();
  }
}
