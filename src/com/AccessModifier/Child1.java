package com.AccessModifier;

public class Child1 extends Parent{
	public void doSomething() {
		System.out.println("Child1 -Do something");
	}

	@Override
	public void method1() {
		System.out.println("Child1 method");
	}

}
