package com.mabrupi.factory;
/**
 * 
 * @author mabrupi
 *
 * This is our factory
 * We need a String to select the type of action we want to do and we
 * return an instance of the class
 * 
 * Factory pattern are used to "instantiate" a Interface
 */
public class FactoryActions {
	Actions action = null;
	
	public Actions createAction(String type){
		if(type.equals("Cycling")) action = new Cycling();
		if(type.equals("Walking")) action = new Walking();
		if(type.equals("Running")) action = new Running();
		return action;
	}
}
