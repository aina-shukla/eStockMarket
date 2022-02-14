package com.stockService.com.stockService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockService.com.stockService.entity.StockEntity;
import com.stockService.com.stockService.services.StockService;

@RestController
public class StockController {
	
	@Autowired
	StockService stockService;
	
	@GetMapping("/hello") 
	public String sayHello() {
		return "Stock Service";
	}

	// Add new stock price
	@PostMapping("add/{companyCode}") 
	public StockEntity addStockPrice(@RequestBody StockEntity stockEntity) {
		return stockService.addStockPriceService(stockEntity);
	}
}
