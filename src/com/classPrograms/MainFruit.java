//com.classPrograms.Fruit@24d46ca6-->Fully qualified name of the class -->24d46ca6--Hash code
		//means--> class name with package name and address -->com.classPrograms.Fruit@24d46ca6
		//To string is a method is present in object class  
package com.classPrograms;

public class MainFruit {

	public static void main(String[] args) {
		//object creation
		Fruit f1=new Fruit("Apple","red","round");		
		System.out.println(f1);
		//object creation
		Fruit f2=new Fruit("Banana","yellow","stick");		
		//object creation
		Fruit f3=new Fruit();//instantiation
		//Fruit()-->Constructor --used to initilise values --by default provide null values
		System.out.println(f3);
		//create fruit Array
		Fruit[] fruitArray=new Fruit[2];
		fruitArray[0]=f1;
		fruitArray[1]=f2;
		System.out.println(fruitArray.length);
		//enhanced for loop to retrieve
				for(Fruit f:fruitArray) {
					System.out.println("Details of "+f.name);
					System.out.println("-----------------");
					System.out.println(f);
					System.out.println();
				}
	}

}
