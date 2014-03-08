package com.mabrupi.adapter;
/**
 * 
 * @author mabrupi
 *
 *
 * Converts the interface of a class into another interface the clients expect.
 * 
 * The best example is to think of an AC power adapter
 */
public class AdapterAtoB implements BStuff {
	
	private AStuff aStuff;
	
	public AdapterAtoB(AStuff aStuff){
		this.aStuff = aStuff;
	}
	@Override
	public void bStuff() {
		// TODO Auto-generated method stub
		System.out.println("I'm adapted and now I'm doing b stuff");
	}

}
