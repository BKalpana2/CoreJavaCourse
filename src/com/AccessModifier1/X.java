package com.AccessModifier1;

import com.AccessModifier.A;
public class X extends A {
	public static void main(String[] args) {
		System.out.println("Another class Another Package");
		A a =new A();
		a.method1();
		X x=new X();
		x.method4();
		x.method1();
		
	}
}
