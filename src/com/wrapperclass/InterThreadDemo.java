package com.wrapperclass;

public class InterThreadDemo {
	public static volatile boolean running=true;
public static void main (String[]args) throws InterruptedException {
	Thread worker=new Thread(new Runnable() {
	public void run() {
		//run () is our thread
		System.out.println("Worker thread started");
		while(running) {
//		System.out.println("In while loop");
		}
		System.out.println("Worker thread stopped");
		}//run() closing
	}//runnable closing
	
	);//Thread constructor closing
		worker.start();
		Thread.sleep(1000);
		System.out.println("Main thread changing running variable to false");
		//Main thread changing the value of running to false
		running=false;
}
}
