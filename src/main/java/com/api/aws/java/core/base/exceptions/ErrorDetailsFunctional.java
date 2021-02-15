package com.api.aws.java.core.base.exceptions;

public class ErrorDetailsFunctional {

	private String message;
	private boolean success;

	public ErrorDetailsFunctional(String message, Boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public boolean isSuccess() {
		return success;
	}
}
