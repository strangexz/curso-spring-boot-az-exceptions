package hn.com.jf.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import hn.com.jf.models.Error;

@RestControllerAdvice
public class HandlerExceptionController {
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<hn.com.jf.models.Error> divisionByZero(Exception ex) {
		hn.com.jf.models.Error error = new hn.com.jf.models.Error();
		error.setDate(new Date());
		error.setError("Error division entre cero!");
		error.setMessage(ex.getMessage());
		error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

//		return ResponseEntity.internalServerError().body(error);
		return ResponseEntity.status(error.getStatus()).body(error);
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<Error> notFoundEx(NoHandlerFoundException ex) {
		Error error = new Error();
		error.setDate(new Date());
		error.setError("Ruta no encontrada!");
		error.setMessage(ex.getMessage());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		
		return ResponseEntity.status(error.getStatus()).body(error);
	}
}
