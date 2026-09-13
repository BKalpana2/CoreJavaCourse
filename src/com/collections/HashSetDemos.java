package com.collections;

import java.util.HashSet;

public class HashSetDemos {
	public static void main(String[] args) {
		HashSet<Integer>hs=new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		System.out.println(hs);
		System.out.println(hs.contains(30));
		System.out.println(hs.size());
	}
}
