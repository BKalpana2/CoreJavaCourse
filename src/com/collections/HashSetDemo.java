package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		//Linked HashSet -not allow duplicates and follow the insertion order.
		LinkedHashSet<String> hs=new LinkedHashSet<>();
		System.out.println("Follow the insertion order Linked hashSet : ");
		hs.add("Hyd");
		hs.add("vijywada");
		hs.add("warangal");
		hs.add("vizag");
		hs.add("Hyd");
		System.out.println(hs);		
		System.out.println();
		//hash Set -not allow the dupilcates and not follow the insertion order.
		System.out.println("Not follow Insertion order Hash Set : ");	
		HashSet<String> hs1=new HashSet<>();
		hs1.add("Hyd");
		hs1.add("vijywada");
		hs1.add("warangal");
		hs1.add("vizag");
		hs1.add("Hyd");
		System.out.println(hs1);
	}
}
