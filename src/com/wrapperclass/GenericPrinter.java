package com.wrapperclass;

public class GenericPrinter<T> {
T t;
GenericPrinter(T t){
	this.t=t;
}
public void print() {
	System.out.println(t);
}
}
