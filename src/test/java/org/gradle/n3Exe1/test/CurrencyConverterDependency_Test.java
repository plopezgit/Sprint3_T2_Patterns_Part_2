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
	private CurrencyConverter currencyConverterEURCNY;
	private float expectedResult;
	private float amount;
	private final float EXCHANGE_RATE = 1.07F;
	
	
	@BeforeEach
	public void setTestUp () {
		currencyConverterEURUSD = new EuroDolarConversor();
		currencyConverterEURCNY = new EuroYuanConversor();
		expectedResult = amount * EXCHANGE_RATE;
		amount = 100;
	}
	
	@DisplayName("Dado que el CurrencyConverter: EuroDolarConversor implementation recibe x amount, validar que la conversion es correcta")
	@Test
	public void currencyConverterEURToUSDCheckResult () {

		float response = currencyConverterEURUSD.convers(amount);
		assertEquals(expectedResult, response);
	}
	
	@DisplayName("Dado que el CurrencyConverter: EuroYuanConversor implementation recibe x amount, validar que la conversion es correcta")
	@Test
	public void currencyConverterEURToCNYCheckResult () {

		float response = currencyConverterEURCNY.convers(amount);
		assertEquals(expectedResult, response);
	}
	
}
