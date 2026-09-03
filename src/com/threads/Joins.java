package com.threads;

public class Joins {
public static void main(String[] args) {
ThreadDemo td=new ThreadDemo();
td.start();
try {
	td.join();
}catch(InterruptedException e) {
	e.printStackTrace();
}
Thread.currentThread().setName("main thread");
System.out.println(Thread.currentThread().getName()+" : joins joined");
}

}
