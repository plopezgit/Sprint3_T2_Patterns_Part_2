package org.gradle.n1Exe1.entity;

public class Stock {
	
	private String stockName;
	private float stockLastPrice;
	private float stockChange;
	private char stockTrend;
	
	public Stock(String stockName, float stockLastPrice, float stockChange, char stockTrend) {
		this.stockName = stockName;
		this.stockLastPrice = stockLastPrice;
		this.stockChange = stockChange;
		this.stockTrend = stockTrend;
	}

	public String getStockName() {
		return stockName;
	}

	public float getStockLastPrice() {
		return stockLastPrice;
	}

	public void setStockPrice(float stockPrice) {
		this.stockLastPrice = stockPrice;
	}

	public float getStockChange() {
		return stockChange;
	}

	public void setStockChange(float stockChange) {
		this.stockChange = stockChange;
	}

	public char getStockTrend() {
		return stockTrend;
	}

	public void setStockTrend(char stockTrend) {
		this.stockTrend = stockTrend;
	}
	
}
