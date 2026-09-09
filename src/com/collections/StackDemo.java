package com.collections;

import java.util.Stack;

public class StackDemo{
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		stack.push("Java");
		stack.push("Python");
		stack.push("C++");
		
		System.out.println(stack);
		String peekElement=stack.peek();
		System.out.println(peekElement);
		System.out.println("Before Pop : "+stack);
		System.out.println(stack.pop());
		System.out.println("After Pop : "+stack);
	}
}