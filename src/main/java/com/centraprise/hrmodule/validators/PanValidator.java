package com.centraprise.hrmodule.validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PancardValidator.class)
@Target(ElementType.FIELD)
public @interface PanValidator {

}
