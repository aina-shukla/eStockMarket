package com.stockService.com.stockService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "StockEntity")
public class StockEntity {

	@Id
	private String companyCode;

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		return "StockEntity [companyCode=" + companyCode + "]";
	}

	public StockEntity(String companyCode) {
		super();
		this.companyCode = companyCode;
	}

	public StockEntity() {
		super();
	}

}
