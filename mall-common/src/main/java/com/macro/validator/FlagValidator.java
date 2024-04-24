package com.macro.validator;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface FlagValidator {

  String[] values() default {};

  String message() default "flag is not found";

  Class<?>[] groups() default {};

}
