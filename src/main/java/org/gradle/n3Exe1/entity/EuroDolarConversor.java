package org.gradle.n3Exe1.entity;

public class EuroDolarConversor implements CurrencyConverter {
	
	@Override
	public float conversionFrom(float exchangeRate, float amount) {
		return amount * exchangeRate;
	}
}