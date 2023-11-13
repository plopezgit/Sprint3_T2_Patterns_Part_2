package org.gradle.n3Exe1.entity;

public class EuroYuanConversor implements CurrencyConverter {
	
	private final float EXCHANGE_RATE = 7.80F;
	private final String CURRENCY = "CNY";
	
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