package com.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.entities.CompanyEntity;
import com.demo.entities.StockExchange;
import com.demo.exceptions.CompanyNotFoundException;
import com.demo.repository.CompanyRepository;
import com.demo.repository.StockExchangeRepository;

@Service
public class CompanyService {

	@Autowired
	CompanyRepository companyRepository;

	@Autowired
	StockExchangeRepository exchangeRepository;

	// Register a new company
	public CompanyEntity register(CompanyEntity companyEntity) {
		return companyRepository.save(companyEntity);
	}

	// Fetches the Company Details
	public CompanyEntity findCompanyDetails(String companyCode) {
		Optional<CompanyEntity> optional = companyRepository.findCompanyByCompanyCode(companyCode);
		if (optional.isPresent())
			return optional.get();
		else
			throw new CompanyNotFoundException("Company with Company Code '" + companyCode + "' doesn't exist.");
	}

	// Fetches all the Company Details
	public List<CompanyEntity> findAllCompany() {
		return companyRepository.findAll();
	}

	// Deletes a company
	public String deleteCompany(String companyCode) {
		Optional<CompanyEntity> findByCompanyCode = companyRepository.findCompanyByCompanyCode(companyCode);
		if (findByCompanyCode.isPresent()) {
			companyRepository.deleteById(companyCode);
			return "Deleted..";
		} else
			throw new CompanyNotFoundException("Company with Company Code '" + companyCode + "' doesn't exist.");
	}

	// Add stocks
	public StockExchange addStockService(StockExchange stockExchange) {
		return exchangeRepository.save(stockExchange);
	}

}