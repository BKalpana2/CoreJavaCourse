package com.java8features;

public class LambdaWithMultipleAruguments {
public static void main(String[] args) {
	Calculator c=(x,y) -> x+y;
	c.add(10, 20);
}
}
