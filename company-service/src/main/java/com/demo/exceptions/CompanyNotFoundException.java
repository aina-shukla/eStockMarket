package com.demo.exceptions;

public class CompanyNotFoundException extends RuntimeException {

	public CompanyNotFoundException() {
	}

	public CompanyNotFoundException(String m) {
		super(m);
	}

	public CompanyNotFoundException(Exception e) {
		super(e);
	}

	public CompanyNotFoundException(String m, Exception e) {
		super(m, e);
	}
}
