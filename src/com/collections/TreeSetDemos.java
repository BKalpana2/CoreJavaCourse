package com.collections;

import java.util.TreeSet;

public class TreeSetDemos {
	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<>();
		t.add(40);
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(10);
		System.out.println(t);
		System.out.println(t.contains(30));
		System.out.println(t.size());
		System.out.println(t.first());
		System.out.println(t.last());
		
	}
}
