package org.gradle.n2Exe1.client;

import org.gradle.n2Exe1.entity.ShoesShop;

public class App {
	
	public static void main(String[] args) {	
		
		ShoesShop shop = new ShoesShop();
		System.out.println(shop.executePayment(200, 1)); // TDC = 1 Paypal = 2 Bank = 3	
	}
	
}