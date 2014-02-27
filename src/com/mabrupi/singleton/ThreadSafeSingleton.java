package com.mabrupi.singleton;

/**
 * 
 * @author mabrupi
 *
 *	Thread Safe singleton
 */
public class ThreadSafeSingleton {
	//Core
	private volatile static ThreadSafeSingleton singleton;
	private ThreadSafeSingleton(){};
	
	public static ThreadSafeSingleton getInstance(){
		if(singleton == null){
			synchronized(Singleton.class){
				if(singleton == null){
					singleton = new ThreadSafeSingleton();
				}
			}
		}
		return singleton;
	}
	// Other useful staff
	
}
