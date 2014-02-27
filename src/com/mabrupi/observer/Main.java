package com.mabrupi.observer;

public class Main {
	public static void main(String args[]){
		ConcreteSubject sub = new ConcreteSubject();

		ConcreteObserver obs1 = new ConcreteObserver();
		ConcreteObserver obs2 = new ConcreteObserver();
		ConcreteObserver obs3 = new ConcreteObserver();
		
		sub.registerObserver(obs1);
		sub.notifyObservers();
		System.out.println("\n");
		sub.registerObserver(obs2);
		sub.notifyObservers();
		System.out.println("\n");
		sub.registerObserver(obs3);
		sub.notifyObservers();
		System.out.println("\n");
		sub.removeObserver(obs2);
		sub.notifyObservers();
	}
}
