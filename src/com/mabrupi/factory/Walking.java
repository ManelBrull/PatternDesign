package com.mabrupi.factory;

public class Walking implements Actions {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("I'm perparing my walking shoes");
	}

	@Override
	public void doStuff() {
		// TODO Auto-generated method stub
		System.out.println("I'm walking!!");
	}

}
