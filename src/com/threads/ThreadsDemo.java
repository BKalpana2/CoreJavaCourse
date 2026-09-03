package com.threads;

public class ThreadsDemo {
	public static void main(String[] args)  {
		for(int i=1;i<=5;i++) {
			System.out.println("Downloading file "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		for(int i=1;i<=5;i++) {
			System.out.println("USer is working.."+i);
		}
	}
}
