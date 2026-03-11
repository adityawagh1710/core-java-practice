package com.practice.exceptions.example;

public class FinalyExample {

    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
