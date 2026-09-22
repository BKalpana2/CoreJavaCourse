package com.threads;

public class ThreadExample4 extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadExample4 t = new ThreadExample4();

        t.start();
    }
}
