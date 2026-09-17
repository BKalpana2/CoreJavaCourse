package com.java8features.functionalinterface;

import java.util.function.Function;
import java.util.function.BiFunction;
public class FunctionDemo {
	public static void main(String[] args) {
		Student s1=new Student(1,"kalyan",95);
		Function<Student,String>getName=s -> s.name;
		System.out.println(getName.apply(s1));
		Function<Integer,Integer>findSquare=i->(i*i);
		System.out.println(findSquare.apply(20));
		Function<Integer,Integer>findCube=i->i*i*i;
		System.out.println(findCube.apply(3));
		Function<Integer,String>greet=g->"hello kalyan";
		System.out.println(greet.apply(1));
		//student is the return type ,first integer is first method arg,
		//second integer is second method argument.
		BiFunction<Student ,Integer,Integer>finalmarks=(std,bonus)->std.marks+bonus;
		System.out.println(finalmarks.apply(s1, 5));

	}
}
