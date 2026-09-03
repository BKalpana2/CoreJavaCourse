package com.AccessModifier;

public class Test {

	public static void main(String[] args) {
	
		//Parent object reference referring  to child class object.	
		Parent p=new Child2();
		p.method1();
		Parent.method2();
	
	}

}
