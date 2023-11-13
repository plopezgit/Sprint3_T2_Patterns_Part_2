package org.gradle.n3Exe1.entity;

public class EuroDolarConversor implements CurrencyConverter {
	
	private final float EXCHANGE_RATE = 1.07F;
	
	@Override
	public float conversionFrom(float amount) {
		return amount * EXCHANGE_RATE;
	}
}