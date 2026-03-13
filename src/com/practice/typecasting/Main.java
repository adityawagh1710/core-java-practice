package com.practice.typecasting;

public class Main  {
    public static void main(String[] args)  {
        int x = 7;
        long y = x;
        float z = y;
        System.out.println("Before conversion, int value " + x);
        System.out.println("After conversion, long value " + y);
        System.out.println("After conversion, float value " + z);

        double num = 10.75;
        int result = (int) num;
        System.out.println("Original value: " + num);
        System.out.println("After narrowing: " + result);

        int value = 130;
        byte res = (byte) value;
        System.out.println("Value: " + res);

        String numberString = "2026";
        int number = Integer.parseInt(numberString);
        System.out.println("Parsed integer: " + number);

        String s = "200";
        Integer i = Integer.valueOf(s);
        System.out.println(i);
    }
}