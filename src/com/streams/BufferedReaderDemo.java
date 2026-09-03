package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) {

        try (BufferedReader b = new BufferedReader(new FileReader("output.txt"))) {

            System.out.println("Reading the file line by line");

            String line;

            while ((line = b.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}