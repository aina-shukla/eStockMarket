package com.stockService.com.stockService.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stockService.com.stockService.entity.StockEntity;
import com.stockService.com.stockService.services.StockService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class StockController {

	@Autowired
	StockService stockService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Stock Service";
	}

	// Add new stock price
	@PostMapping("add/{companyCode}")
	public StockEntity addStockPrice(@RequestBody StockEntity stockEntity, @PathVariable String companyCode) {
		stockEntity.setCompanyCode(companyCode);
		return stockService.addStockPriceService(stockEntity, companyCode);
	}

	// Fetches Stock Price List
	@GetMapping("get/{companyCode}/{startDate}/{endDate}")
	public List<StockEntity> fetchStockPriceList(@PathVariable String companyCode, @PathVariable String startDate,
			@PathVariable String endDate) {
		return stockService.findAllStockPriceList(companyCode, startDate, endDate);
	}

}
