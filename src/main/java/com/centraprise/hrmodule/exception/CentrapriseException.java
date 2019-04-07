package com.centraprise.hrmodule.exception;

public class CentrapriseException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CentrapriseException() {
		super();
	}

	public CentrapriseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CentrapriseException(String message, Throwable cause) {
		super(message, cause);
	}

	public CentrapriseException(String message) {
		super(message);
	}

	public CentrapriseException(Throwable cause) {
		super(cause);
	}

}
