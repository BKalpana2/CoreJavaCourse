package com.Oop;

public class Demo {

	int count;
	static int staticcount;
	public static void main(String[] args) {
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		d1.count=500;
		d2.count=600;
		
		System.out.println(d1.count);//500
		System.out.println(d2.count);//600
		
		System.out.println();
		
		Demo.staticcount=100;
		Demo.staticcount=200;
		Demo.staticcount=300;
		staticcount=400;
		
		System.out.println(staticcount);//400
		System.out.println(Demo.staticcount);//400
		System.out.println(Demo.staticcount);//400
		System.out.println(Demo.staticcount);//400
		
		
	}
	
}
