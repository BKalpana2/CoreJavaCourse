package com.java8features.streams;

import java.util.List;
import java.util.stream.Stream;
public class StreamAPIDemo {
	public static void main(String[] args) {
		//step 1:create a collection
		List<String> names=List.of("kalyan","thanuja","demon","rithu");
		//step 2: create a stream from the collection
		Stream<String>stream=names.stream();
		//step 3: Apply intermediate operation
		//predicate fucntional interface
		stream=stream.filter(n->n.startsWith("r"));
		//step 4:Apply a terminal operation
		//consumer functional interface
		stream.forEach(name->System.out.println(name));
		
		//The above three steps can be return in a single statement.
		names.stream().filter(n->n.startsWith("k"))
					  .forEach(name->System.out.println(name));
	}
}
