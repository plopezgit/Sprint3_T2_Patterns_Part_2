package org.gradle.n3Exe1;

import org.gradle.n3Exe1.entity.*;

public class App {

	public static void main(String[] args) {
		
		CurrencyConverter currencyConverter = new EuroDolarConversor();
		//CurrencyConverter currencyConverter = new EuroYuanConversor();
		
		Vending vending = new Vending(currencyConverter);	
		vending.printPriceAndConversionByArticle();
		


	}

}
