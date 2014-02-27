package com.mabrupi.observer.example;

/**
 * 
 * @author mabrupi
 *
 *Entidad que reparte alimentos a los necesitados registrados en su sistema
 *
 *
 */
public interface BancoDeAlimentos {
	public void registerTitular(Titular o);
	public void removeTitular(Titular o);
	public void notifyTitulares();
}
