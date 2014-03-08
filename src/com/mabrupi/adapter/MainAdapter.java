package com.mabrupi.adapter;

public class MainAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAStuff cas = new ConcreteAStuff();
		ConcreteBStuff cbs = new ConcreteBStuff();
		cas.doAstuff();
		cbs.bStuff();
		new AdapterAtoB(cas).bStuff();
	}

}
