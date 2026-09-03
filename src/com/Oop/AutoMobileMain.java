package com.Oop;

public class AutoMobileMain {

	public static void main(String[] args) {
		
		ToyotaCar tc=new ToyotaCar();
		tc.start();
		tc.horn();
		tc.performance();
		tc.brake();
		tc.seating();
		tc.fuelType();
		tc.price();
		tc.stop();
		
		System.out.println();
		
		Honda h=new Honda();
		h.start();
		h.horn();
		h.performance();
		h.brake();
		h.seating();
		h.fuelType();
		h.price();
		h.stop();

		
		System.out.println();
		
		AutomobileFactory af=new AutomobileFactory();
		af.fact();
		
		System.out.println();
		
		CarFactory cf=new CarFactory();
		cf.fact();
	}

}
