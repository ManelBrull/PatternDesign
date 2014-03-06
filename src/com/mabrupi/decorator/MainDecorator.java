package com.mabrupi.decorator;

public class MainDecorator {

	public static void main(String[] args) {
		BasicConcrete bc = new BasicConcrete();
		System.out.println("Basic stuff: " + bc.doStuff());
		System.out.println("Basic description: " + bc.getDescription());
		
		DecoratorConcrete dc = new DecoratorConcrete(bc);
		System.out.println("Decorated stuff: " + dc.doStuff());
		System.out.println("Decorated description: " + dc.getDescription());
	}

}
