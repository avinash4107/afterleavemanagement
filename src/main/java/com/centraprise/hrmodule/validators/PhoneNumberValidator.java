package com.centraprise.hrmodule.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhoneNumberValidator implements ConstraintValidator<PhoneValidator, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		Pattern pattern = Pattern.compile("\\d{10}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
}
