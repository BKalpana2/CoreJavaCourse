package com.AccessModifier;

public class C extends A{
	@Override
	public void method1() {
		System.out.println("class C-public method -  Not Overridden");
	}
	@Override
	protected void method3() {
		System.out.println("class C-default method-overridden -protectd");
	}
	@Override
	public void method4() {
		System.out.println("Class C-protected method-overridden-public");
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.method1();
		c.method3();
		c.method4();
	}
	
}
