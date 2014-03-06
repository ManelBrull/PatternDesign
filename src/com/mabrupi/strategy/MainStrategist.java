package com.mabrupi.strategy;

/**
 * 
 * @author mabrupi
 *
 * Strategy pattern allow to change the behaviour of a class
 * 
 * You need an interface which will define the method the behaviour will execute.
 * For each behaviour, you only need to create a class and implement the interface.
 * In the class you want the behaviour, you will need a variable to store the behaviour using the interface
 * 
 * A good example is agent behaviours in jade. They can be cyclic, OneShot, OneDemand, etc...
 * 
 * I love Wheel of Time
 */
public class MainStrategist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmyOfLight aol = new ArmyOfLight();
		
		aol.setCommander(new PerrinAybara());
		aol.executeStrategy();
		aol.setCommander(new MatCauthon());
		aol.executeStrategy();
		aol.setCommander(new RandAlThor());
		aol.executeStrategy();
	}

}
