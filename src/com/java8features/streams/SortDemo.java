package com.java8features.streams;

import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		//List containing the strings
		List<String>names=List.of("kalyan","emmu","suman","sanjana");
		System.out.println("*****Applying sorted()******");
		//sorted()
		names.stream().sorted().forEach(System.out::println);
	}
}
