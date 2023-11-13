package org.gradle.n2Exe1.entity;

public class ShoesShop {
	
	private int shopId;
	private Payment payment;
	
	public ShoesShop(int shopId) {
		this.shopId = shopId;
	}
	
	public void executePayment () {
		payment = new Payment();
		payment.execute();
		
	}
	
	
	
}