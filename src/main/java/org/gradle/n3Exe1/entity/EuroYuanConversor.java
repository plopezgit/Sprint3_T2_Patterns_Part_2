package org.gradle.n3Exe1.entity;

public class EuroYuanConversor implements CurrencyConverter {
	
	private final float EXCHANGE_RATE = 7.80F;
	
	@Override
	public float conversionFrom(float amount) {
		return amount * EXCHANGE_RATE;
	}
}