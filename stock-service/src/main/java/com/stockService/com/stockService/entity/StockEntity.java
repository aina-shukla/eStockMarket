package com.stockService.com.stockService.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "StockEntity")
public class StockEntity {

	@Id
	private int stockId;
	private String companyCode;
	private double stockPrice;
	private String stockExchange;
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date dateTime;

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	@Override
	public String toString() {
		return "StockEntity [stockId=" + stockId + ", companyCode=" + companyCode + ", stockPrice=" + stockPrice
				+ ", stockExchange=" + stockExchange + ", dateTime=" + dateTime + "]";
	}

	public StockEntity(int stockId, String companyCode, double stockPrice, String stockExchange, Date dateTime) {
		super();
		this.stockId = stockId;
		this.companyCode = companyCode;
		this.stockPrice = stockPrice;
		this.stockExchange = stockExchange;
		this.dateTime = dateTime;
	}

	public StockEntity() {
		super();
	}

}
