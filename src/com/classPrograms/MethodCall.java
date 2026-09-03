package com.classPrograms;
public class MethodCall {
	public static void m() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		MethodDemo md=new MethodDemo();
		md.mymethod();
		MethodCall.m();
	}
}
