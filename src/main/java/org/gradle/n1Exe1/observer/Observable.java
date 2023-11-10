package org.gradle.n1Exe1.observer;

public interface Observable {
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver(String trend);
}
