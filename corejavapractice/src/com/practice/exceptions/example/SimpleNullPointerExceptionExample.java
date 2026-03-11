package com.practice.exceptions.example;

public class SimpleNullPointerExceptionExample {
    public static void main(String[] args) {
        String name = null;
        try {
            name = "10";
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name);
    }
}
