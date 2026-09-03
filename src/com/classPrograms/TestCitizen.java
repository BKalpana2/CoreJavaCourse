package com.classPrograms;
public class TestCitizen {
	public static void main(String[] args) {
		Citizen c4=new Citizen();
		c4.aadhar=9876054321l;
		c4.name="Pedhi";
		c4.age=35;
		c4.gender='M';
		c4.getdetails();
		Citizen c1=new Citizen();
		c1.aadhar=98765432198l;
		c1.name="chekri";
		c1.age=30;
		c1.gender='M';
		c1.getdetails();
		Citizen c3=new Citizen();
		c3.aadhar=876543399l;
		c3.name="keshava";
		c3.age=28;
		c3.gender='M';
		c3.getdetails();
		Citizen c2=new Citizen();
		c2.aadhar=12345678987l;
		c2.name="Kanna";
		c2.age=22;
		c2.gender='M';
		c2.getdetails();
		System.out.println("********************");
	}
}
