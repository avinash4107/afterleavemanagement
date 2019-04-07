package com.centraprise.hrmodule.util;

public class ValidationUtil {
	public static boolean isEmpty(String s) {
		if (s == null || s.trim().length() == 0) {
			return true;
		}
		return false;
	}
}
