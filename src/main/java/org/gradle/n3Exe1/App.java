package org.gradle.n3Exe1;

import org.gradle.n3Exe1.entity.CurrencyConverter;
import org.gradle.n3Exe1.entity.EuroDolarConversor;
import org.gradle.n3Exe1.entity.Vending;

public class App {

	public static void main(String[] args) {
		
		CurrencyConverter currencyConverter = new EuroDolarConversor();
		Vending vending = new Vending(currencyConverter);
		
		System.out.println(vending.showPriceByArticle(1));

	}

}
