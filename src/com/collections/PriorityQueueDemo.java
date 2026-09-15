package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		pq.offer(90);
		pq.offer(40);
		pq.offer(10);
		pq.offer(30);
		pq.offer(20);
		pq.offer(60);
		System.out.println(pq);
		System.out.println("Highest priority Element : "+pq.peek());
		System.out.println(pq.poll());
		System.out.println("Priority Queue after poll operation : "+pq);
		Map<Integer,Integer>m=new HashMap<>();
		System.out.println(m.get(2));
	}
}
