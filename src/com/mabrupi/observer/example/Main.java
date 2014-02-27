package com.mabrupi.observer.example;

public class Main {
	public static void main(String args[]){
		PuntDalimentsTorrent pa = new PuntDalimentsTorrent();
		
		PersonaTitular juan = new PersonaTitular("Juan");
		PersonaTitular elsa = new PersonaTitular("Elsa");
		PersonaTitular zara = new PersonaTitular("Zara");
		
		pa.registerTitular(juan);
		pa.registerTitular(elsa);
		pa.registerTitular(zara);
		pa.notifyTitulares();
	}
}
