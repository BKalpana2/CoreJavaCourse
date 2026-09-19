package com.java8features.streams;

import java.util.List;

public class DistinctDemo {
	public static void main(String[] args) {
		List<Integer>numbers=List.of(10,20,10,40,30,30,20);
		numbers.stream().distinct().forEach(System.out::println);
		
	}
}
