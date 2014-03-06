package com.mabrupi.strategy;

public class ArmyOfLight {
	private Strategy commander;
	private int numberOfTroops;
	
	public ArmyOfLight(){
		System.out.println("We need someone to design the strategy and command us");
	}
	
	public void executeStrategy(){
		commander.perfomStrategy();
	}

	public Strategy getCommander() {
		return commander;
	}

	public void setCommander(Strategy commander) {
		this.commander = commander;
	}

	public int getNumberOfTroops() {
		return numberOfTroops;
	}

	public void setNumberOfTroops(int numberOfTroops) {
		this.numberOfTroops = numberOfTroops;
	}
	
	
	
}
