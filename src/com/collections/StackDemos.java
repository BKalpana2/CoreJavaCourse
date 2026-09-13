package com.collections;

import java.util.Stack;


public class StackDemos {
	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		 s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println("Removed : "+s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		
	}
}
