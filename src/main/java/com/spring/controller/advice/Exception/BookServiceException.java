package com.spring.controller.advice.Exception;

public class BookServiceException extends Exception {
	
	public BookServiceException() {
		super();
	}
	
	public BookServiceException(final String message) {
		super(message);
	}

}
