package com.threads;

class MThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
        }
    }
}

public class ThreadExample1 {

    public static void main(String[] args) {

        MThread t = new MThread();

        t.start();
    }
}
