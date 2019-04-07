package com.centraprise.hrmodule.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PincoderValidator implements ConstraintValidator<PinValidaor, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		Pattern pattern = Pattern.compile("\\d{6}");
		Matcher matcher = pattern.matcher(value);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

}
