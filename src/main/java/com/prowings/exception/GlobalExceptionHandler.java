package com.prowings.exception;

import java.util.Arrays;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
//	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
//	@ExceptionHandler(RequestMappingException.class)
//	public com.prowings.exception.ErrorResponse handleMappingException(GlobalExceptionHandler e ,WebRequest webRequest)
//	{
//		com.prowings.exception.ErrorResponse er=new com.prowings.exception.ErrorResponse();
//		er.setDetails(e.getLocalizedMessage());
//		er.setMessage(e.getMessage());
//		er.setPath("/request");
//		return er;
//	}

	private String getLocalizedMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	private long[] getStackTrace() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(NoSuchElementException.class)
	public com.prowings.exception.ErrorResponse handleNoSuchElementException(NoSuchElementException e ,WebRequest webRequest)
	{
		com.prowings.exception.ErrorResponse er=new com.prowings.exception.ErrorResponse();
		er.setDetails(e.getLocalizedMessage());
		er.setMessage(e.getMessage());
		er.setPath("/students/{id}");
		return er;
	}
	
	
	
}
