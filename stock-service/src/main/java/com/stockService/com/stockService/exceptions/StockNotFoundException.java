package com.stockService.com.stockService.exceptions;

public class StockNotFoundException extends RuntimeException {

	public StockNotFoundException() {
	}

	public StockNotFoundException(String m) {
		super(m);
	}

	public StockNotFoundException(Exception e) {
		super(e);
	}

	public StockNotFoundException(String m, Exception e) {
		super(m, e);
	}
}
