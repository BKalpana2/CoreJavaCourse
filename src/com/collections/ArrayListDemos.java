package com.collections;

import java.util.ArrayList;

public class ArrayListDemos {
	public static void main(String[] args) {
		ArrayList<String> students=new ArrayList<>();
		
		students.add("Rahula");
		students.add("Priya");
		students.add("Kiran");
		System.out.println(students);
		System.out.println(students.get(1));
		
	}
}
