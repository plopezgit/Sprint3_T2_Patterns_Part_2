package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.callback.PaymentMethodCallback;

public abstract class PaymentGateway {
	
	public String executePaymentWith (PaymentMethodCallback callback) {
		
		Payment payment = new Payment();
		payment.execute();
		
		return callback.call(1);
		
	}
	
	public abstract void execute();
}

