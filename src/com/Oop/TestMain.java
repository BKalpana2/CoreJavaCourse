package com.Oop;
class Test{
	int age;
	int pincode;
	String name;
	public Test() {};
	public Test(int age,int pincode,String name) {
		this.age=age;
		this.pincode=pincode;
		this.name=name;
	}
}
class Case extends Test{
	public Case(int age,int pincode,String name) {
		super(age,pincode,name);
	}
	public void detail() {
		System.out.println(age+" | "+pincode+" | "+name);
	}
}
public class TestMain {

	public static void main(String[] args) {
		Case c=new Case(101,200045,"kalpana");
	c.detail();

	}

}
