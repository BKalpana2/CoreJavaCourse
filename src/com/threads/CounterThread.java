package com.threads;

public class CounterThread implements Runnable{

	Counter c=new Counter();
	@Override
	public void run() {
	System.out.println("started");
	}

}
