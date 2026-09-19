package com.java8features.streams;

import java.util.List;

public class MapDemo {
	public static void main(String[] args) {
		//List containing strings
		List<String>names=List.of("kalyan","kalyan padala","thanuja","thanuja puttaswamy");
		//map will internally use the function functional interface.apply() method
		//Intermediate operation
		names.stream().map(name->name.toUpperCase()).forEach(System.out::println);

	}
}
