package com.wrapperclass;

public class Demo02 {
public static void main(String[] args) {
//	IntegerPrinter ip=new IntegerPrinter(20);
//	ip.print();
//	StringPrinter sp=new StringPrinter("India");
//	sp.print();
//	DoublePrinter dp=new DoublePrinter(78.9);
//	dp.print();
	
	GenericPrinter<Integer>ip=new GenericPrinter<>(20);
	ip.print();
	
	GenericPrinter<String>sp=new GenericPrinter<>("HYD");
	sp.print();
	
	GenericPrinter<Character>cp=new GenericPrinter<>('k');
	cp.print();
	
	GenericPrinter<Character>bp=new GenericPrinter<>('p');
	bp.print();
	
	
}
}
