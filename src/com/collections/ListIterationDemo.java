package com.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterationDemo {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("Kalpana");
		al.add("Ganesh");
		al.add("santhosh");
		ListIterator<String>l=al.listIterator();
		System.out.println("Forward direction : ");
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println();
		System.out.println("Backward direction : ");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
