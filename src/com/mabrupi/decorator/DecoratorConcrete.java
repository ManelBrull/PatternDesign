package com.mabrupi.decorator;

public class DecoratorConcrete extends Decorator {
	Basic concrete;
	
	public DecoratorConcrete(Basic concrete){
		this.concrete = concrete;
		description = " I'm a concrete Decorator. I'm awesome!!";
	}
	
	@Override
	public String getDescription() {
		return description + " " + concrete.description;
	}

	@Override
	public String doStuff() {
		return "Doing decorator stuff" + " " + concrete.doStuff();

	}

}
