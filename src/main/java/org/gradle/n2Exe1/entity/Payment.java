package org.gradle.n2Exe1.entity;

public class Payment extends PaymentGateway {
	
	@Override
	public void execute(float amount) {
		
		System.out.println("Payment execution");
	}
}