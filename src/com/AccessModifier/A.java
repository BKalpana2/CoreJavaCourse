package com.AccessModifier;

public class A {
	public void method1() {
		System.out.println("Class A- public method");
	}
	private void method2() {
		System.out.println("Class A- private method");
	}
	void method3() {
		System.out.println("Class A- default method");
	}
	protected void method4() {
		System.out.println("class A-protected method");
	}
	public static void main(String[] args) {
		System.out.println("Same class same package");
		A a=new A();
		a.method1();
		a.method2();
		a.method3();
		a.method4();
	}
}
