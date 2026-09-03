package com.threads;

public class CounterDemo {
public static void main(String[] args) throws InterruptedException {
	Counter c=new Counter();
	Thread t=new Thread(new Runnable(){
		@Override
		public void run() {
			for(int i=0;i<10000;i++) {
				c.incerement();
			}
		}
	});
	Thread t1=new Thread(new Runnable() {
	public void run() {
		for(int i=0;i<10000;i++) {
			c.incerement();
		}
	}
	});
	t.start();
	t1.start();
	
	t.join();
	t1.join();
	
	System.out.println("Final count : "+c.getCount());
}
}
