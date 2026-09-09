package com.collections;

import java.util.*;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer>v=new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
//		for(int a:v) {
//			System.out.println(a);
//		}
		//Enumeration
		Enumeration<Integer>e= v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
	}
}
