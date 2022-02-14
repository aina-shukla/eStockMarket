package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyEntity {

	@Id
	private String companyCode;
	private String companyName;
	private String companyCEO;
	private long companyTurnover;
	private String companyWebsite;
	private boolean stockExchange;

	public boolean isStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(boolean stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public long getCompanyTurnover() {
		return companyTurnover;
	}

	public void setCompanyTurnover(long companyTurnover) {
		this.companyTurnover = companyTurnover;
	}

	public String getCompanyWebsite() {
		return companyWebsite;
	}

	public void setCompanyWebsite(String companyWebsite) {
		this.companyWebsite = companyWebsite;
	}

	@Override
	public String toString() {
		return "CompanyEntity [companyCode=" + companyCode + ", companyName=" + companyName + ", companyCEO="
				+ companyCEO + ", companyTurnover=" + companyTurnover + ", companyWebsite=" + companyWebsite
				+ ", stockExchange=" + stockExchange + "]";
	}

	public CompanyEntity(String companyCode, String companyName, String companyCEO, long companyTurnover,
			String companyWebsite, boolean stockExchange) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.companyCEO = companyCEO;
		this.companyTurnover = companyTurnover;
		this.companyWebsite = companyWebsite;
		this.stockExchange = stockExchange;
	}

	public CompanyEntity() {
		super();
	}

}
