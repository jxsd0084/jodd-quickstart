package com.quickstart.exception;

import jodd.exception.UncheckedException;

public class AppException extends UncheckedException {

	public AppException(Throwable t) {
		super(t);
	}

	public AppException() {
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(String message, Throwable t) {
		super(message, t);
	}
}
