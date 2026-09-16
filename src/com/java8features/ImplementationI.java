package com.java8features;

public class ImplementationI implements Iface {

	@Override
	public void abstractMethod() {
		System.out.println("Abstract method called....");
	}
	@Override
	public  void defaultMethod() {
		System.out.println("overridden method....");
	}
public static void main(String[] args) {
	ImplementationI i=new ImplementationI();
	i.abstractMethod();
	i.defaultMethod();
	Iface.staticMethod();
}
}
