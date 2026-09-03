package com.threads;
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class JoinThread {
public static void main(String[] args) {
	MyThread m=new MyThread();
	m.start();
	try {
		m.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Main completed");
}
}
