package com.classPrograms;

public class Fruit {

	
	String name;
	String color;
	String shape;
	Fruit(){
		
	}
	Fruit(String name,String color,String shape){
		this.name=name;
		this.color=color;
		this.shape=shape;
	}
	 public String toString() {
	        return "Name : "+name+" , "+"color : "+color+" ,"+"shape : "+shape;
	    }
	

}
