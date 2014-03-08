package com.mabrupi.command;
/**
 * 
 * @author mabrupi
 * 
 * The command Pattern encapsulates a request as an object.
 */
public class CommandMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker sc = new Invoker();
		sc.setCommand(new FirstCommand());
		sc.buttonPressed();
		sc.setCommand(new SecondCommand());
		sc.buttonPressed();
	}

}
