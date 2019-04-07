package com.centraprise.hrmodule.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AdharCardValidator implements ConstraintValidator<AdharValidator, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Pattern pattern = Pattern.compile("\\d{12}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}
