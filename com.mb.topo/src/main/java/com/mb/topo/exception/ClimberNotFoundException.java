package com.mb.topo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClimberNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -272243009510794520L;

	public ClimberNotFoundException(String exception) {
		super(exception);
	}
}
