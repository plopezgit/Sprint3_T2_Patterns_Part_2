package org.gradle.n3Exe1.entity;

public class Article {
	
	private String articleName;
	private float articlePrice;
	
	public Article (String articleName, float articlePrice) {
		this.articleName = articleName;
		this.articlePrice = articlePrice;
	}

	public String getArticleName () {
		return articleName;
	}
	
	public float getArticlePrice () {
		return articlePrice;
	}

}