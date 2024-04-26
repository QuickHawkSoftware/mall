package com.macro.mall.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class FlagValidatorClass implements ConstraintValidator<FlagValidator, Integer> {

  private String[] values;

  @Override
  public void initialize(FlagValidator flagValidator) {
    this.values = flagValidator.value();
  }

  @Override
  public boolean isValid(Integer value, ConstraintValidatorContext constraintValidatorContext) {
    boolean isValid = false;
    for (int i = 0; i < values.length; i++) {
      if (values[i].equals(String.valueOf(value))) {
        isValid = true;
        break;
      }
    }
    return isValid;
  }
}