package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		//Create ArrayDeque
		Deque<String>deque=new ArrayDeque<>();
		//add elements  -add,addFirst,addLast.
		deque.add("Java");
		deque.add("Python");
		System.out.println(deque);
		deque.addFirst("C");
		deque.addLast("C++");
		System.out.println(deque);
		//accessing the elements -getFirst,getLast.
		System.out.println("First element : "+deque.getFirst());
		System.out.println("Last element : "+deque.getLast());
		//clear used to remove all the elements in the deque
		deque.clear();
		System.out.println("Deque afer clearing : "+deque);
		//using arrayDeque as a stack -lifo
		//push- to add the elements
		deque.push("Java");
		deque.push("Python");
		deque.push("C++");
		System.out.println(deque);
		//pop- to removes the last inserted element
		System.out.println(deque.pop());
		System.out.println("ArrayDeque after pop operation : "+deque);
		
		
		
	}
}
