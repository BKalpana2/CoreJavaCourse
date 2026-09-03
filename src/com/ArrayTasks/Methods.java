package com.ArrayTasks;

public class Methods {
	public int getStudentCount() {
		return 9;
	}
	public String getGreet() {
		return "hello";
	}
	public static void main(String[] args) {
		Methods m=new Methods();
		int count=m.getStudentCount();
		System.out.println("With return type : Int =>"+count);
		String greet=m.getGreet();
		System.out.println("With return type : String =>"+greet);
	}

}
