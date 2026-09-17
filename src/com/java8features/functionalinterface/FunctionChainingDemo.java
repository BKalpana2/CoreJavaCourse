package com.java8features.functionalinterface;

import java.util.function.Function;

public class FunctionChainingDemo {
public static void main(String[] args) {
	Function<Integer,Integer>add10=n->n+10;
	Function<Integer,Integer>multiply2=n-> n*2;
	Function<Integer,Integer>result=add10.andThen(multiply2);
	System.out.println(result.apply(5));
	
	Function<Integer,Integer>result2=add10.compose(multiply2);
	System.out.println(result2.apply(5));
	
}
}
