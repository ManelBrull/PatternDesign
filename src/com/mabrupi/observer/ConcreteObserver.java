package com.mabrupi.observer;

public class ConcreteObserver implements Observer {
	
	public ConcreteObserver(){}
	
	@Override
	public void update() {
		System.out.println("I'm am updated");
	}
	
}
