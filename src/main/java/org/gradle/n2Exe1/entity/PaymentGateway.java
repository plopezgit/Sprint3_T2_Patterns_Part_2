package org.gradle.n2Exe1.entity;

import org.gradle.n2Exe1.callback.Callback;

public abstract class PaymentGateway {
	
	public void executePaymentWith (Callback callback) {
		
		execute();
		
	}
	
	public abstract void execute();
	
}

