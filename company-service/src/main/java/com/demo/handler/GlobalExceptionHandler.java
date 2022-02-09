package com.demo.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.demo.exceptions.CompanyNotFoundException;
import com.demo.models.ExceptionMessage;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<ExceptionMessage> companyExceptionHandler(CompanyNotFoundException e){
		return new ResponseEntity<ExceptionMessage>(
				new ExceptionMessage(500, e.getMessage())
				, HttpStatus.OK);
	}
}
