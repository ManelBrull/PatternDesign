package com.mabrupi.factory;

public class Cycling implements Actions {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("I'm preparing the bike");
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("I'm cycling!!");
	}

}
