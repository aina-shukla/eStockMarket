package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockExchange {

	@Id
	private int id;
	private String stockExchange;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockExchange=" + stockExchange + "]";
	}

	public StockExchange(int id, String stockExchange) {
		super();
		this.id = id;
		this.stockExchange = stockExchange;
	}

	public StockExchange() {
		super();
	}

}
