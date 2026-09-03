package com.threads;

public class Demo {
	public static void main(String[] args) {
//		Download thread will execute downloading task
		Download d=new Download();
		
		//wrong
		//d.run()
		
		d.start();
		for(int i=1;i<=5;i++) {
			System.out.println("user is working "+i);
		}
	}
}
