package com.threads;

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello Java");
        }
    }
}

public class ThreadExample2 {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();

        Thread t = new Thread(r);

        t.start();
    }
}
