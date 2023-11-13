package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.callback.PaymentMethodCallback;

public abstract class PaymentGateway {
	
	public String executePaymentWith (PaymentMethodCallback callback, int method, float amount) {
		
		Payment payment = new Payment();
		payment.execute(amount);
		
		return callback.call(method);
		
	}
	
	public abstract void execute(float amount);
}

