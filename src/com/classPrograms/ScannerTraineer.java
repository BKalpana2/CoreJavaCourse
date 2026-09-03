package com.classPrograms;

import java.util.Scanner;

public class ScannerTraineer {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
        System.out.print("Enter number of trainers: ");
        int n = s.nextInt();
        Trainers[] trainers = new Trainers[n];
        // Input
        for (int i = 0; i < trainers.length; i++) {
            System.out.println("Enter Details of Trainer " + (i + 1));
            System.out.print("Name: ");
            String name = s.next();
            System.out.print("Id: ");
            int id = s.nextInt();
            System.out.print("Salary: ");
            double salary = s.nextDouble();
            trainers[i] = new Trainers(name, id, salary);
        }
        System.out.println("Trainer Details:");
        // Enhanced For Loop
        for (Trainers t : trainers) {
            System.out.println("-------------------------");
            System.out.println(t);
        }

        s.close();
    }
}

