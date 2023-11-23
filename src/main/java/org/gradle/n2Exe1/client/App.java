package org.gradle.n2Exe1.client;

import org.gradle.n2Exe1.entity.ShoesShop;

public class App {
	
	public static void main(String[] args) {
		
		
		ShoesShop shop = new ShoesShop();
		System.out.println(shop.executePayment(200, 1));
		System.out.println(shop.executePayment(200, 2));
		System.out.println(shop.executePayment(200, 3));
		
		// The exercise was validate by unit test
		
		/*
			Simula una **pasarela de pago** que reciba un objeto encapsulador del método de pago a efectuar: 
			tarjeta de crédito, 
			Paypal o 
			debito en cuenta bancaria.
			
			**La pasarela invocará el pago sin conocer la forma**
			
			y devolviendo el control a la clase de origen.
			
			La clase que invoca la pasarela de pago será una tienda de zapatos.	
		*/
		
	}
	
}