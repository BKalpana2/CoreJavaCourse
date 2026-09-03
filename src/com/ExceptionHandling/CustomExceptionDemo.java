package com.ExceptionHandling;
//Step 1: To create a custom checker exception extend exception class
@SuppressWarnings("serial")
public class CustomExceptionDemo extends Exception{
	//step 2:create a constructor to accept the error message
	CustomExceptionDemo(String message){
		super(message);
	}


}
