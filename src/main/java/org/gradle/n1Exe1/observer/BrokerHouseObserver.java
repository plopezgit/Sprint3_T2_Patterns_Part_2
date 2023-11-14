package org.gradle.n1Exe1.observer;

import java.util.HashMap;
import java.util.Map;

import org.gradle.n1Exe1.entity.Stock;

public class BrokerHouseObserver implements Observer {
	
	private String houseName;
	private Map<String, Stock> stocks;
	
	public BrokerHouseObserver(String houseName) {
		this.houseName = houseName;
		stocks = new HashMap<>();
		fullfilInitialStockDataBaseExample();
	}

	public void fullfilInitialStockDataBaseExample() {
		stocks.put("MVC.A", new Stock("ModelViewControler Inc.", 16.19F, 5.13F, '+'));
		stocks.put("HEXA.GO", new Stock("HexagonalArchitects Corp.", 200.34F, 2.76F, '+'));
		stocks.put("POJO.B", new Stock("PlainOldJavaObjectCorp S.A.", 1100.3F, 0.76F, '-'));
	}
	
	@Override
	public void update(String stockTickerSymbol) {
		System.out.println(houseName + " | " + stocks.get(stockTickerSymbol).getStockName() + " " 
							+  stocks.get(stockTickerSymbol).getStockTrend());
	}

}
