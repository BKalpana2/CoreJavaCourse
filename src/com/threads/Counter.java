package com.threads;

public class Counter {

	int cnt=0;
	public synchronized void incerement() {
		cnt++;
	}
	public int  getCount() {
		return cnt;
	}
}
