package com.apihug.demo.user.wire.domain.bootstrap.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

@Target({
  ElementType.FIELD,
  ElementType.METHOD,
  ElementType.PARAMETER,
  ElementType.TYPE,
  ElementType.ANNOTATION_TYPE
})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Autowired
@Qualifier(value = "_HPP_user_myBatisJdbcTemplate")
public @interface UserMyBatisJdbcTemplate {}