package com.practice.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class FinallyExceptionExample {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            System.out.println(reader.readLine());
        } catch (Exception e) {
            System.out.println("File error");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed");
                }
            } catch (Exception e) {
                System.out.println("Error closing file");
            }
        }
    }
}