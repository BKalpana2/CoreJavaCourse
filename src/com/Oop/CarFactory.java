package com.Oop;

public class CarFactory extends AutomobileFactory{
	//Covarient types means sub classes are used as a return type.
	@Override
	public Honda fact() {
		System.out.println("Child");
		return new Honda();
	}
}
