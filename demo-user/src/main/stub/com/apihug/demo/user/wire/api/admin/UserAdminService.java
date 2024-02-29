package com.apihug.demo.user.wire.api.admin;

import com.apihug.demo.user.wire.api.admin.request.ChangePasswordRequest;
import com.apihug.demo.user.wire.api.admin.request.RegisterRequest;
import com.apihug.demo.user.wire.api.admin.response.CustomerPasswordUpdatedResponse;
import com.apihug.demo.user.wire.api.admin.response.CustomerRegisteredResponse;
import hope.common.spring.SimpleResultBuilder;
import java.lang.String;
import javax.annotation.Generated;

@Generated("H.O.P.E. Infra Team")
public interface UserAdminService {
  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Anonymous: true</li>
   * 	<li>Combinator: AND</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /user/admin/say-hello}
   * 	<p>{@code Hello from the user admin server}
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
   * 	<li>Authorities: [USER_ADD]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /user/admin/register}
   * 	<p>{@code admin try to register a new customer}
   */
  default void registerCustomer(SimpleResultBuilder<CustomerRegisteredResponse> builder,
      RegisterRequest registerRequest) {
    builder.notImplemented();
  }

  /**
   *
   * Authorization:
   *
   * <ul>
   * 	<li>Combinator: AND</li>
   * 	<li>Authorities: [USER_ADD, USER_DELETE]</li>
   * </ul>
   * @apiNote
   * 	<p>{@code /user/admin/change-password}
   * 	<p>{@code use to reset the password after password forgot}
   */
  default void changePassword(SimpleResultBuilder<CustomerPasswordUpdatedResponse> builder,
      ChangePasswordRequest changePasswordRequest) {
    builder.notImplemented();
  }
}
