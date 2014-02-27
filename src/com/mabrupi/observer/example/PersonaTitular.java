package com.mabrupi.observer.example;

public class PersonaTitular implements Titular {
	
	private String nombre;
	
	public PersonaTitular(String nombre){
		this.nombre = nombre;
	}
	
	@Override
	public void update() {
		System.out.println(nombre + ": Ya me han avisado de recoger alimentos");
	}
	
}
