package com.mabrupi.decorator.example;

public class DecoratorMainExample {

	public static void main(String[] args) {
		LastArrayList <String> lal = new LastArrayList<String>();
		lal.add("Hello");
		lal.add("World");
		lal.add("Hello World");
		System.out.println(lal.getLast());
		System.out.println(lal.get(lal.size()-1));
		lal.removeLast();
		System.out.println(lal.getLast());
		lal.removeLast();
		System.out.println(lal.getLast());
	}

}
