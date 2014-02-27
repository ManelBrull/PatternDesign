package com.mabrupi.observer.example;

import java.util.ArrayList;
import java.util.List;

public class PuntDalimentsTorrent implements BancoDeAlimentos {
	
	private List <Titular> titulares;

	public PuntDalimentsTorrent(){
		titulares = new ArrayList <Titular> ();
	}
	
	@Override
	public void registerTitular(Titular o) {
		titulares.add(o);
	}

	@Override
	public void removeTitular(Titular o) {
		titulares.remove(o);
	}

	@Override
	public void notifyTitulares() {
		// TODO Auto-generated method stub
		System.out.println("El Punt d'aliments de torrent ja te aliments");
		for(Titular o: titulares){
			o.update();
		}
	}

	
}
