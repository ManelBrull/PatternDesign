package com.mabrupi.singleton.example;

import com.mabrupi.singleton.Singleton;

/**
 * 
 * @author mabrupi
 * @DesignPattern Singleton
 * 
 *	This is a log which will show the activity and issues of the application
 *	
 *	The application will not have multiple threads
 */
public class Log {
	
	// Start Singleton
	private static Log log;
	
	private Log(){}
	
	public static Log getLog(){
		if(log == null)
			log = new Log();
		return log;
	}
	//End Singleton
	
	/**
	 * This should be implemented as Static variables
	 * 0 = None
	 * 1 = Console
	 * 2 = DB
	 * 3 = Console & DB
	 */
	private int verbosity = 0;
	
	public void add(String user, String action){
		if(verbosity == 0){}
		if(verbosity == 1){
			showConsole(user, action);
		}
		if(verbosity == 2){
			addDatabase(user, action);
		}
		if(verbosity == 3){
			showConsole(user, action);
			addDatabase(user, action);
		}
	}
	
	private void showConsole(String user, String action){
		System.out.println(user+": "+action);
	}
	
	private void addDatabase(String user, String action){
		System.out.println("Insert into db " + user+": "+action);
	}

	
	public int getVerbosity() {
		return verbosity;
	}

	public void setVerbosity(int verbosity) {
		this.verbosity = verbosity;
	}
	
}
