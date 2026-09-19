package com.java8features.streams;

import java.util.List;

public class LimitDemo {
	public static void main(String[] args) {
		List<Integer>numbers=List.of(10,20,10,40,30,30,20);
		numbers.stream().limit(3).forEach(System.out::println);
	}
}
