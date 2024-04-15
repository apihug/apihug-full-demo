package com.apihug.demo.user.wire.domain.bootstrap.annotation;

import java.lang.annotation.*;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional(value = "_HPP_user_transactionManager")
public @interface UserTransactional {

  @AliasFor(annotation = Transactional.class, attribute = "rollbackFor")
  Class<? extends Throwable>[] rollbackFor() default {RuntimeException.class};

  @AliasFor(annotation = Transactional.class, attribute = "propagation")
  Propagation propagation() default Propagation.REQUIRED;

  @AliasFor(annotation = Transactional.class, attribute = "isolation")
  Isolation isolation() default Isolation.DEFAULT;

  @AliasFor(annotation = Transactional.class, attribute = "timeout")
  int timeout() default TransactionDefinition.TIMEOUT_DEFAULT;

  @AliasFor(annotation = Transactional.class, attribute = "timeoutString")
  String timeoutString() default "";

  @AliasFor(annotation = Transactional.class, attribute = "readOnly")
  boolean readOnly() default false;

  @AliasFor(annotation = Transactional.class, attribute = "rollbackForClassName")
  String[] rollbackForClassName() default {};

  @AliasFor(annotation = Transactional.class, attribute = "noRollbackFor")
  Class<? extends Throwable>[] noRollbackFor() default {};

  @AliasFor(annotation = Transactional.class, attribute = "noRollbackForClassName")
  String[] noRollbackForClassName() default {};
}