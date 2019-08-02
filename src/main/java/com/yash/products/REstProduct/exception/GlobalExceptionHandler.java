package com.yash.products.REstProduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity handleBusinessException(ProductNotFoundException e){
		ErrorDetails et=new  ErrorDetails();
		et.setErrorMsg(e.getMessage());
		et.setStatus(HttpStatus.BAD_GATEWAY.value() );
		ResponseEntity<ErrorDetails> response=new ResponseEntity<ErrorDetails>(et, HttpStatus.BAD_REQUEST);
		
		return response;
	}
}
