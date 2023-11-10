package org.gradle.n1Exe1.client;

import org.gradle.n1Exe1.observer.BrokerHouseObserver;
import org.gradle.n1Exe1.observer.StockBrokerObservable;

public class App {
	
	public static void main(String[] args) {
		
		StockBrokerObservable stockBroker = new StockBrokerObservable();
		stockBroker.addObserver(new BrokerHouseObserver("Vanguard"));
		stockBroker.notifyObserver("$stoke is running low");
		stockBroker.notifyObserver("$stoke is running high");
		
		
		/*
			Diseña un sistema en el que un Agente de Bolsa (Observable) 
			notifica a varias agencias de Bolsa (Observers) cambios cuando la Bolsa sube o baja.
			Es necesario que el objeto Observable mantenga referencias a los Observadores.
		*/	
		
	}
	
}