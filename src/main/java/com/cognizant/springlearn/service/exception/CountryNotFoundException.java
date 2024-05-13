package com.cognizant.springlearn.service.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Country not found")
public class CountryNotFoundException extends RuntimeException {
	//The serialVersionUID is a unique identifier for each class that implements the Serializable interface in Java.
	private static final long serialVersionUID = 1L;

    public CountryNotFoundException(String message) {
        super(message);
    }
}