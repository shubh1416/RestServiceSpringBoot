package com.yash.products.REstProduct.exception;

public class ProductNotFoundException extends RuntimeException{

	String message;
	
	public ProductNotFoundException(String message) {
		super(message);
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	
	public String getMessage() {
		return message;
	}
}
