package com.collections;

import java.util.ArrayList;

public class StudentRegistration_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("kalyan");
		list.add("Thanuja");
		list.add("Demon");
		list.add("Rithu");
		list.add("Immu");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("After doing operations .....");
		list.add("ramu");
		list.remove("Immu");
		list.set(0,"kalyanpadala");
		System.out.println(list.contains("Rithu"));
		System.out.println(list.size());
		for(String s:list) {
			System.out.println(s);
		}
	}
}
