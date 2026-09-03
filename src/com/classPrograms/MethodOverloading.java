package com.classPrograms;

public class MethodOverloading {
	
	public  void add(int a,String b) {
		System.out.println(a+b);;
	}
	public void add(String y,int x) {
		System.out.println(y+x);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public void add(int i,int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		 MethodOverloading m=new  MethodOverloading();
		System.out.println();
	}

}
