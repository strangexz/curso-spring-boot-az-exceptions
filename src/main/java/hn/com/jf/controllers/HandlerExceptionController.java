package hn.com.jf.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<?> divisionByZero(Exception ex) {
		return ResponseEntity.internalServerError().body("Error 500");
	}
}
