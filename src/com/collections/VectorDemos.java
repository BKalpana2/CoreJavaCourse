package com.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemos {
	public static void main(String[] args) {
		List<String> emp=new Vector<>();
		emp.add("Ravi");
		emp.add("priya");
		emp.add("kiran");
		System.out.println(emp);
		((Vector<String>) emp).addElement("Anil");
		System.out.println(emp);
		System.out.println(((Vector<String>) emp).elementAt(2));
		
	}
}
