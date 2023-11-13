package org.gradle.n2Exe1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.gradle.n2Exe1.entity.ShoesShop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoesShop_Test {
	
	private int id;
	private ShoesShop shop;
	private float amount;
	private int method;
	private String expectedCallbackResponse;
	
	@BeforeEach
	public void setTestUp () {
		id = 453334;
		shop = new ShoesShop(id);
		amount = 30.23F;
		method = 1;
		expectedCallbackResponse = "tdc payment done"; 
	}
	
	@DisplayName("Dado un llamado a PaymentGateway, validar el body del callback sea correcto")
	@Test
	public void checkPaymentMethodCallbackResponse () {
		String response = shop.executePayment(amount, method);
		assertEquals(expectedCallbackResponse, response);
	}
	
}