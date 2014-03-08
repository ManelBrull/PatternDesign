package com.mabrupi.factory;

public class MainFactory {

	public static void main(String[] args) {
		MainFactory mf = new MainFactory();
		mf.doSport("Walking");
		mf.doSport("Running");
		mf.doSport("Cycling");
	}
	
	public void doSport(String sport){
		Actions action = new FactoryActions().createAction(sport);
		action.prepare();
		action.doStuff();
	}

}
