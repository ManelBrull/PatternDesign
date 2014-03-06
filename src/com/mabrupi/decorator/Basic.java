package com.mabrupi.decorator;

/**
 * 
 * @author mabrupi
 *
 * Basic class we want to extend
 *
 */
public abstract class Basic {
	String description = "I'm a basic class, I don't know anything";
	
	public String getDescription(){
		return description;
	}
	
	public abstract String doStuff();
}
