package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemos {
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("Ravi");
		list.add("priya");
		list.addFirst("Anil");
		list.addLast("kiran");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
