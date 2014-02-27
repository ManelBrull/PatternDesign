package com.mabrupi.singleton.example;

public final class SingletonMain {

	public static void main(String[] args) {
		Log.getLog().setVerbosity(1);
		Log.getLog().add("Mabrupi", "Hello world");
		
		Log.getLog().setVerbosity(2);
		Log.getLog().add("Mabrupi", "Hello world again");
		
		Log.getLog().setVerbosity(3);
		Log.getLog().add("Mabrupi", "Hello world strikes back");
		Log.getLog().add("Mabrupi", "Sayonara baby");
	}

}
