package com.collections;


import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Citizens>citizens=new HashMap<>();
		citizens.put("100000",new Citizens("kalyan",24,"VZG"));
		citizens.put("100001", new Citizens("Thanuja",28,"BNLR"));
		citizens.put("100002", new Citizens("Demon",27,"WG"));
		citizens.put("100003",new Citizens("Rithu",27,"Hyd"));
		citizens.put("100004",new Citizens("chekri",30,"TN"));
		Citizens c1=new Citizens("Mahalaksmi",24,"KN");
		citizens.put("100005", c1);
		citizens.put("100005",new Citizens("Kanna",20,"HYD"));
		
		//retrieve only the keys using keyset()
		System.out.println("**********Retrieve keys using the keyset()***********");
		for(String aadhar:citizens.keySet()) {
			System.out.println(aadhar);
		}
		
		//Retrieve the citizens objects associated with each key
		for(String aadharId:citizens.keySet()) {
			Citizens c=citizens.get(aadharId);
			System.out.println(aadharId+" -> "+c);
		}
		
		//retrieve the values from hashset
		//using values()
		System.out.println("**************Retrieve values only using values method *****************");
		for(Citizens citizen:citizens.values()) {
			System.out.println(citizen);
		}
		
		//entrySet() -aadharId+citizen
		//enrtyset is used when we need both key value pairs
				System.out.println("**************Retrieving key value pairs using entrySet()***********************");
				for(Map.Entry<String,Citizens>entry:citizens.entrySet()) {
					System.out.println("Adhar Id : "+entry.getKey());
					System.out.println("Citizen : "+entry.getValue());
				}
		
//		System.out.println(citizens);
//		System.out.println(citizens.entrySet());
//		System.out.println(citizens.keySet());
//		System.out.println(citizens.values());
		
		
	}
}
