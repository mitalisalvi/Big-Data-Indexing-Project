package com.csye7255.project.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class Forbidden extends RuntimeException {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String message;
	private HttpStatus status = HttpStatus.FORBIDDEN;

	public Forbidden(String message) {
		super(String.format("%s", message));
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}
}
