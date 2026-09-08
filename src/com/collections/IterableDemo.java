package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo {
	public static void main(String[] args) {
		ArrayList<String> countriesList=new ArrayList<>();
		countriesList.add("India");
		countriesList.add("singapore");
		countriesList.add("Srilanka");
		countriesList.add("Australia");
		System.out.println("Before Removal : "+countriesList);
//		for(String country:countriesList) {
//			if(country.equals("singapore")) {
//				countriesList.remove(country);
//			}
//		}
		Iterator<String> iterator=countriesList.iterator();
		while(iterator.hasNext()) {
			String country=iterator.next();
			if(country.equals("singapore")) {
				iterator.remove();
			}
		}
		System.out.println("After removal : "+countriesList);
		
	}
}
