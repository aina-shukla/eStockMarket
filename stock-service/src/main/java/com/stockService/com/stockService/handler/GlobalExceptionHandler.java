package com.stockService.com.stockService.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.stockService.com.stockService.exceptions.CompanyNotFoundException;
import com.stockService.com.stockService.models.ExceptionMessage;


@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(CompanyNotFoundException.class)
	public ResponseEntity<ExceptionMessage> companyExceptionHandler(CompanyNotFoundException e){
		return new ResponseEntity<ExceptionMessage>(
				new ExceptionMessage(500, e.getMessage())
				, HttpStatus.OK);
	}
}
