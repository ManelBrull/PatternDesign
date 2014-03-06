package com.mabrupi.decorator.example;

import java.util.ArrayList;

/**
 * 
 * @author mabrupi
 *
 * @param <E>
 * 
 * Now we can operate easily with the last elements of an ArrayList
 * and keep the powerful functionality of the ArrayList
 */
public class LastArrayList <E> extends ArrayList <E> {

	private static final long serialVersionUID = -8387936773265876791L;
	
	public E getLast(){
		if(size() > 0)
			return get(size()-1);
		else
			throw new java.lang.IndexOutOfBoundsException();
	}
	
	public E removeLast() {
		if(size() > 0){
			E element = get(size()-1);
			remove(size()-1);
			return element;
		}
		else{
			throw new java.lang.IndexOutOfBoundsException();
		}
		
	}

}
