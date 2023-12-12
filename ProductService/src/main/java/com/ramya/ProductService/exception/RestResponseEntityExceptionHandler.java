package com.ramya.ProductService.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

/*	
	@ExceptionHandler(ProductServiceCustomException.class)
	public ResponseEntity<ErrorResponse> handleProductServiceException(ProductServiceCustomException exception){
	return new ResponseEntity<>(new ErrorResponse().builder()
			.errorMessage(exception.getMessage())
			.errorCode(exception.getErrorCode())
			build(),HttpStatus.NOT_FOUND);_
}*/
}
