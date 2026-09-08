package com.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		List<Integer>v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		for(int a:v) {
			System.out.println(a);
		}
	}
}
