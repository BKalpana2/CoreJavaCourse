package com.java8features.functionalinterface;

import java.util.function.Consumer;

public class MethodReferencesDemo {
	//static method
	public static void printmessage(String str) {
		System.out.println("Message from the static method : "+str);
	}
	//Instance method
	public void print(String str) {
		System.out.println("Message from the Instance method : "+str);
	}
	// :: double coloumn operator is used for method reference
	public static void main(String[] args) {
		//Creates the consumer 
		//it accepts an arugument but returns nothing
		
		/* way 1
		 * Consumer<String>c=(str)->System.out.println("BB9 Season Winner : "+str);
		 * c.accept("kalyan padala");
		 */
		
		/*way 2
		 * Consumer<String> c=s ->MethodReferencesDemo.printmessage(s); 
		 * c.accept("kalyan padala");
		 */
		
		Consumer<String>c1=MethodReferencesDemo::printmessage;
		c1.accept("Static method");
		
		MethodReferencesDemo d=new MethodReferencesDemo();
		Consumer<String>c2=d::print;
		c2.accept("Instance method");
		
	}
}
