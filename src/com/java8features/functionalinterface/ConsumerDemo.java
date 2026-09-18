package com.java8features.functionalinterface;

import java.util.function.Consumer;

public class ConsumerDemo {
	/*
	 *consumer takes a value
	 *uses that value for processing
	 *but does not return anything
	 *
	 * It has an abstract method accept()
	 * void accept(T t)
	 * */
	public static void main(String[] args) {
		Consumer<String>consumer=name-> System.out.println("Welcome "+name);
		consumer.accept("kalyan");
	}	
}
