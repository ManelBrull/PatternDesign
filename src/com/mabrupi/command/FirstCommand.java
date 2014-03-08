package com.mabrupi.command;

public class FirstCommand implements Command {

	@Override
	public void execute() {
		System.out.println("First command applied");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Undo the first command!!");
	}

}
