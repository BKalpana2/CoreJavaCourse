package com.classPrograms;

public class PassByValueReference {
	int mark1;
	int mark2;
	String name;
	public PassByValueReference(int mark1,int mark2,String name) {
		this.mark1=mark1;
		this.mark2=mark2;
	}
	public void add(int mark1,int mark2,String name) {
		System.out.println("Total marks : "+(mark1+mark2));
	}
	public void addOperation(PassByValueReference pb) {
		int totalmarks=pb.mark1+pb.mark2;
		System.out.println("Total marks : "+totalmarks);
		
	}
	public static void main(String[] args) {
		
		int mark1=100;
		int mark2=100;
		String name="Kalyan";
		PassByValueReference pb=new PassByValueReference(mark1, mark2, name);
		pb.add(mark1, mark2, name);		
	}
}
