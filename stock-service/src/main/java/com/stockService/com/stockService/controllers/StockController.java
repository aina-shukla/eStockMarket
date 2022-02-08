package com.stockService.com.stockService.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/market/stock/")
public class StockController {
	
	@GetMapping() 
	public String sayHello() {
		return "Stock Service";
	}

}
