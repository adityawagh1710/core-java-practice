package com.practice.exceptions.example;

public class CustomExceptionMainExample {
    static void checkAge(int age) throws CustomExceptionExample {
        if (age < 18) {
            throw new CustomExceptionExample("Age must be 18+");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (CustomExceptionExample e) {
            System.out.println(e.getMessage());
        }
    }
}
