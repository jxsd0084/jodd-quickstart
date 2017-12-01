package com.quickstart.exception;

import jodd.joy.JoyException;

/**
 * Simple example of app-related unchecked exception.
 */
public class AppException extends JoyException {

	public AppException(Throwable t) {
		super(t);
	}

	public AppException(String message) {
		super(message);
	}

	public AppException(String message, Throwable t) {
		super(message, t);
	}
}
