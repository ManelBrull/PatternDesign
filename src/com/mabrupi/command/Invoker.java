package com.mabrupi.command;
/**
 * 
 * @author mabrupi
 *
 *
 * Control the command 
 */
public class Invoker {
	Command slot;
	
	public Invoker(){}
	
	public void setCommand(Command command){
		slot = command;
	}
	
	public void buttonPressed(){
		slot.execute();
	}
	
}
