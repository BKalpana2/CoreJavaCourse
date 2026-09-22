package com.threads;
class EvenThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class ThreadExample3 {

    public static void main(String[] args) {

        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();

        even.start();
        odd.start();
    }
}
