package com.mabrupi.singleton;

/**
 * 
 * @author mabrupi
 *
 * Implementation of the typical Singleton
 *
 */
public class Singleton {
	//Core
	private static Singleton singleton;
	
	private Singleton(){}
	
	public static Singleton getSingleton(){
		if(singleton == null)
			singleton = new Singleton();
		return singleton;
	}
	
	// Other useful stuff here

}
