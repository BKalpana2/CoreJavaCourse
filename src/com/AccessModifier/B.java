package com.AccessModifier;

public class B {
public static void main(String[] args) {
	System.out.println("Another class in same package");
	A a=new A();
	a.method1();
	a.method3();
	a.method4();
}
}
