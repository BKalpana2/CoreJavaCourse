package com.collections;

import java.util.ArrayList;

public class ArrayListBook {

	public static void main(String[] args) {
	ArrayList<Book> book=new ArrayList<>();
	book.add(new Book(101,"Java"));
	book.add(new Book(102,"python"));
	book.add(new Book(103,"C++"));
	book.add(new Book(104,"Js"));
	book.add(new Book(105,"sql"));
	for(Book b:book) {
		System.out.println(b);
	}

	}

}
