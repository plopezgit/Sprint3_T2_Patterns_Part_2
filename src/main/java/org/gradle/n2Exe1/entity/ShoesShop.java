package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.callback.PaymentMethodCallback;

public class ShoesShop {
	
	private Payment payment;
	private PaymentMethodCallback methodCallback;
	
	public ShoesShop() {
		methodCallback = new PaymentMethodCallback();
	}

	public String executePayment (float amounth, int method) {
		payment = new Payment();
		return payment.executePaymentWith(methodCallback, method, amounth);
		
	}
	
	
	
}