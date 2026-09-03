package com.Oop;

public class AutomobileFactory {

	public Automobile fact() {
		System.out.println("parent");
		return new Automobile();
	}

}
