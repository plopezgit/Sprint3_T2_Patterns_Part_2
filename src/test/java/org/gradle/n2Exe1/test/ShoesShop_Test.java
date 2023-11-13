package org.gradle.n2Exe1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.gradle.n2Exe1.entity.ShoesShop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
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
		method = 1; // TDC = 1 Paypal = 2 Bank = 3
		expectedCallbackResponse = "tdc payment done"; // TDC = "tdc payment done" Paypal = "paypal payment done" Bank = "bank payment donde"
	}
	
	@DisplayName("Dado un llamado a PaymentGateway, validar que el body del callback no esta vacio")
	@Order(1)
	@Test
	public void checkPaymentMethodCallbackIsNotEmpty () {
		String response = shop.executePayment(amount, method);
		assertFalse(response.isEmpty());
	}
	
	@DisplayName("Dado un llamado a PaymentGateway, validar que el body del callback sea correcto")
	@Order(2)
	@Test
	public void checkPaymentMethodCallbackResponse () {
		String response = shop.executePayment(amount, method);
		assertEquals(expectedCallbackResponse, response);
	}
	
}