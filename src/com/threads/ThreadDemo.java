package com.threads;

public class ThreadDemo extends Thread{
	public void run() {
		Thread.currentThread().setName("Download Thread");
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Finished Download");
		
	}
	public static void main(String[] args) {
		//ThreadDemo will execute this one
		ThreadDemo td=new ThreadDemo();
		td.start();
		Thread.currentThread().setName("Main thread");
		System.out.println(Thread.currentThread().getName()+" is started processing");
		//main thraed will execute this statement


	}
}
