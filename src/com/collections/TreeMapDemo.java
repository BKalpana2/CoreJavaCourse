package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer,String>employees=new TreeMap<>();
		//Integers - keys
		employees.put(9,"kalyan");
		employees.put(8, "nikhil");
		employees.put(7, "prashanth");
		employees.put(6, "revanth");
		employees.put(5, "sunny");
		employees.put(4, "abhijith");
		employees.put(3, "Rahul");
		employees.put(2, "koushal");
		employees.put(1, "shiva");
		System.out.println(employees);
		//String -keys
		Map<String,Integer> l=new TreeMap<>();
		l.put("kalyan",1);
		l.put("thanuja",2);
		l.put("abhi", 3);
		l.put("balu", 4);
		System.out.println(l);
		
		//create class courseMap,TreeMap<Course,String>,
		//try to get the sorted order of this map 
		
	}
}
