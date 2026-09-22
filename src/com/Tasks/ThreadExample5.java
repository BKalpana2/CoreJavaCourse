package com.Tasks;

class FirstThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("First Thread: " + i);
        }
    }
}

class SecondThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Second Thread: " + i);
        }
    }
}

public class ThreadExample5 {

    public static void main(String[] args) throws InterruptedException {

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();

        t1.join();

        t2.start();
    }
}
