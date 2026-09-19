package com.java8features.streams;

import java.util.List;

public class TerminalOperations {
	public static void main(String[] args) {
		//Termianl operation 
		List<Integer> numbers=List.of(10,20,30,40,50);
		//forEach : performs an action on every element of the stream
		numbers.stream().forEach(n->System.out.println(n));
		System.out.println();
		//count () -returns the number of elements in the stream
		long count=numbers.stream().count();
		System.out.println("Count of numbers  : "+count);
		System.out.println();
		//filter method 
		long c=numbers.stream().filter(n->n>20).count();
		System.out.println("Greater than 20 : "+c);
		System.out.println();
		//toList() collects the stream elements into a list.
		List<Integer>result=numbers.stream().filter(n->n>=30).toList();
		System.out.println("List of elements : "+result);
		System.out.println();
		//reduce () - is a terminal operation which combines all the elements of a stream and produces one final element.
		long l=numbers.stream().reduce(0,(a,b)->a+b);
		System.out.println("Reduce : "+l);
		
		long l1=numbers.stream().reduce(1,(a,b)->a*b);
		System.out.println("Reduce : "+l1);
	}
}
