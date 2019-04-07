package com.centraprise.hrmodule.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PancardValidator implements ConstraintValidator<PanValidator, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Pattern pattern = Pattern.compile("[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

}
