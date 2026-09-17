package com.java8features.functionalinterface;

import java.util.function.Predicate;
import java.util.function.BiPredicate;
public class PredicateDemo {

	public static void main(String[] args) {
		Student s1=new Student(100,"kalyan",99);
		Student s2=new Student(101,"thanuja",28);
		
//		public boolean checkmarks(Student student) {
//			return student.marks>=60;
//		} 
		//instead of writing the method like that we use simple lambda expression.
		Predicate<Student>checkmarks=(s)-> s.marks>=60;
		System.out.println(checkmarks.test(s1));
		
		BiPredicate<Student,Integer> ispassed=(student,passingmark) ->student.marks>=passingmark;
		System.out.println(ispassed.test(s1,35));
		System.out.println(ispassed.test(s2,35));
	}
}
