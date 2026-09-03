package com.ExceptionHandling;

import java.util.Scanner;

public class NumberConversion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        try {

            System.out.print("Enter number: ");
            String number = s.nextLine();

            int n = Integer.parseInt(number);

            int square = n * n;

            System.out.println("Integer value : " + n);
            System.out.println("Square : " + square);

        } catch (NumberFormatException e) {

            System.out.println("Invalid number format.");
        }

        s.close();
    }
}
