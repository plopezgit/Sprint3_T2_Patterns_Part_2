package org.gradle.n3Exe1.entity;

public class EuroDolarConversor implements CurrencyConverter {
	
	private final float EXCHANGE_RATE = 1.07F;
	private final String CURRENCY = "USD";
	
	public float getEXCHANGE_RATE() {
		return EXCHANGE_RATE;
	}

	public String getCURRENCY() {
		return CURRENCY;
	}
	
	@Override
	public float conversionFrom(float amount) {
		return amount * EXCHANGE_RATE;
	}
}