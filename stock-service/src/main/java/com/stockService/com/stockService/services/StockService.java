package com.stockService.com.stockService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stockService.com.stockService.entity.StockEntity;
import com.stockService.com.stockService.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	StockRepository stockRepository;

	public StockEntity addStockPriceService(StockEntity stockEntity) {
		return stockRepository.save(stockEntity);
	}

}
