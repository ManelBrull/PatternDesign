package com.mabrupi.command;

public class SecondCommand implements Command {

	@Override
	public void execute() {
		System.out.println("I'm the second command");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Undo the second command!!");
	}

}
