package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemos {
	public static void main(String[] args) {
		LinkedHashSet<Integer>l=new LinkedHashSet<>();
		l.add(30);
		l.add(10);
		l.add(20);
		l.add(40);
		System.out.println(l);
		System.out.println(l.contains(20));
		System.out.println(l.size());
	}
}
