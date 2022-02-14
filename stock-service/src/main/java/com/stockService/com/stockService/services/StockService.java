package com.stockService.com.stockService.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.stockService.com.stockService.entity.StockEntity;
import com.stockService.com.stockService.exceptions.StockNotFoundException;
import com.stockService.com.stockService.repository.StockRepository;

@Service
public class StockService {

	@Autowired
	StockRepository stockRepository;

	public StockEntity addStockPriceService(StockEntity stockEntity, String companyCode) {
		return stockRepository.save(stockEntity);
	}

	public List<StockEntity> findAllStockPriceList(String companyCode, String startDate, String endDate) {
		List<StockEntity> listObj = stockRepository.findAllByCompanyCodeAndStartDateAndEndDate(companyCode, startDate,
				endDate);
		if (listObj.isEmpty())
			throw new StockNotFoundException("Stock doesn't exist");
		else
			return listObj;
	}

}
