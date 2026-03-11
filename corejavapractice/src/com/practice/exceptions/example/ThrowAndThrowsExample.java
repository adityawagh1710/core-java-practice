package com.practice.exceptions.example;

import java.io.FileReader;

public class ThrowAndThrowsExample {

    public static void readFile() throws Exception {
        FileReader file = new FileReader("test.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}