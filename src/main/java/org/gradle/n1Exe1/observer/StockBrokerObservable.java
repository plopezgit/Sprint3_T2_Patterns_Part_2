package org.gradle.n1Exe1.observer;

import java.util.HashSet;
import java.util.Set;

public class StockBrokerObservable implements Observable {
	
	private Set<Observer> brokerageHouses = new HashSet<>();
	
	@Override
	public void addObserver(Observer o) {
		brokerageHouses.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		brokerageHouses.remove(o);

	}

	@Override
	public void notifyObserver(String trend) {
		for (Observer o : brokerageHouses) {
			o.update(trend);
		}

	}

}
