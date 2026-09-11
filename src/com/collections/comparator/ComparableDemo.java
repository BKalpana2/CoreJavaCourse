package com.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo implements Comparable<ComparableDemo>{
	int id;
	String name;
	ComparableDemo(int id,String name){
		this.id=id;
		this.name=name;
	}
//	@Override
//	public int compareTo(ComparableDemo o) {
//		return this.id-o.id;
//	}
	@Override
	public int compareTo(ComparableDemo cd) {
		return this.name.compareTo(name);
	}

	@Override
	public String toString() {
		return "id=" + id + " name=" + name;
	}
	public static void main(String[] args) {
		ArrayList<ComparableDemo>list=new ArrayList<>();
		list.add(new ComparableDemo(1,"kalyan"));
		list.add(new ComparableDemo(4,"rithu"));
		list.add(new ComparableDemo(2,"thanuja"));
		list.add(new ComparableDemo(3,"demon"));
		Collections.sort(list);
		for(ComparableDemo c:list) {
		System.out.println(c.name+" "+c.id);
		}
	}



}
