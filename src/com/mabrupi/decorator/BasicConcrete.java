package com.mabrupi.decorator;

public class BasicConcrete extends Basic {

	public BasicConcrete(){
		description = "I'm a Basic Concrete :(";
	}
	
	@Override
	public String doStuff() {
		return "I'm doing basic concrete stuff";
	}

}
