package org.gradle.n3Exe1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.gradle.n3Exe1.entity.CurrencyConverter;
import org.gradle.n3Exe1.entity.EuroDolarConversor;
import org.gradle.n3Exe1.entity.EuroYuanConversor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CurrencyConverterDependency_Test {
	
	private CurrencyConverter currencyConverterEURUSD;
	private float expectedResultEURUSD;
	private CurrencyConverter currencyConverterEURCNY;
	private float expectedResultEURCNY;
	private float amount;
	private final float EXCHANGE_RATE_EURUSD = 1.07F;
	private final float EXCHANGE_RATE_EURCNY = 7.80F;
	
	@BeforeEach
	public void setTestUp () {
		amount = 100;
		currencyConverterEURUSD = new EuroDolarConversor();
		expectedResultEURUSD = amount * EXCHANGE_RATE_EURUSD;
		currencyConverterEURCNY = new EuroYuanConversor();
		expectedResultEURCNY = amount * EXCHANGE_RATE_EURCNY;
	}
	
	@DisplayName("Dado que el CurrencyConverter: EuroDolarConversor implementation recibe x amount, validar que la conversion es correcta")
	@Test
	public void currencyConverterEURToUSDCheckResult () {

		float response = currencyConverterEURUSD.convers(amount);
		assertEquals(expectedResultEURUSD, response);
	}
	
	@DisplayName("Dado que el CurrencyConverter: EuroYuanConversor implementation recibe x amount, validar que la conversion es correcta")
	@Test
	public void currencyConverterEURToCNYCheckResult () {

		float response = currencyConverterEURCNY.convers(amount);
		assertEquals(expectedResultEURCNY, response);
	}
	
}
