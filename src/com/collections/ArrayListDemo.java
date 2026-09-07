package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		Employee emp1=new Employee(101,"Trinadh");
		
		ArrayList<Employee> emplist=new ArrayList<>();
		emplist.add(emp1);
		emplist.add(new Employee(102,"kaveri"));
		emplist.add(new Employee(103,"Gayathri"));
		emplist.add(new Employee(104,"Nagulu"));

		//add the element at the first index
		emplist.addFirst(new Employee(100,"manikanta"));
		//add the element at the last index
		emplist.addLast(new Employee(200,"maniamma"));
		//size of the array
		System.out.println("Size of the arraylist : "+emplist.size());
		//to update the element in the arraylist
		System.out.println(emplist.set(2, new Employee(102,"kaveriTrinadh")));
		//To clear the arrayList
//		emplist.clear();
//		ArrayList<String> fruitlist=new ArrayList<>();
//		fruitlist.add("Banana");
//		fruitlist.add("Apricot");
//		fruitlist.add("Banana");
//		fruitlist.add(null);
//		fruitlist.add("Apple");
//		for(int i=0;i<fruitlist.size();i++) {
//			System.out.print(fruitlist.get(i)+" , ");
//		}
//		System.out.println();
//		for(String s:fruitlist) {
//			System.out.print(s+" , ");
//		}
		for(Employee emp:emplist) {
			System.out.println(emp);
		}
		
		
	}	
}

