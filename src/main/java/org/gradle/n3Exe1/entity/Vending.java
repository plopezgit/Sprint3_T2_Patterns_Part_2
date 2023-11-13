package org.gradle.n3Exe1.entity;

import java.util.HashMap;
import java.util.Map;

public class Vending {
	
	private Map<Integer, Article> articles;
	private CurrencyConverter currencyConverterRepository;
	
	public Vending (CurrencyConverter currencyConverterRepository) {
		articles = new HashMap<>();
		articles.put(1, new Article("Bones | OG Formula Sidecuts Skateboard Wheels 54mm", 39.00F));
		articles.put(2, new Article("Spitfire | Formula Four 101A Conical Full 54mm", 69.00F));
		this.currencyConverterRepository = currencyConverterRepository;
	}
	
	public String showPriceByArticle (int key, float exchangeRate) {
		return articles.get(key).getArticleName() + ": EUR: " + articles.get(key).getArticlePrice() + " | USD: " +
				currencyConverterRepository.conversionFrom(exchangeRate, articles.get(key).getArticlePrice());
	}
	
	/*
	Diseña una clase que muestre en pantalla el precio de varios artículos. 
	Ya que tendrá que mostrarlos también en varios tipos de moneda.
	Importante:
		Asegúrate de añadirle como Inyección de Dependencia 
		una clase Conversor de Moneda que efectúe la corrección 
		del precio en función del cambio de divisa.
	*/
}