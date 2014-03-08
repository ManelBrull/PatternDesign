package com.mabrupi.command;
/**
 * 
 * @author mabrupi
 *
 *
 *	All the commands will implement this interface.
 *
 */
public interface Command {
	
	/**
	 * defines the actions to do when the command is activated
	 */
	public void execute();
	
	/**
	 * Undo the operation
	 */
	public void undo();
}
