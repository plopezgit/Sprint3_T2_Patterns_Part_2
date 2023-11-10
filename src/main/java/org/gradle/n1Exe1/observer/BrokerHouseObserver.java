package org.gradle.n1Exe1.observer;

public class BrokerHouseObserver implements Observer {
	
	private String houseName;
	
	
	
	public BrokerHouseObserver(String houseName) {
		this.houseName = houseName;
	}



	@Override
	public void update(String trend) {
		System.out.println(houseName + " | " + "stock is running " + trend);

	}

}
