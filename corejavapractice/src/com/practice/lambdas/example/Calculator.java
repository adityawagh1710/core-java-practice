package com.practice.lambdas.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        Operation add = Double::sum;
        Operation subtract = (x, y) -> x - y;
        Operation multiply = (x, y) -> x * y;
        Operation divide = (x, y) -> y != 0 ? x / y : 0;

        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + subtract.calculate(a, b));
        System.out.println("Multiplication: " + multiply.calculate(a, b));
        System.out.println("Division: " + divide.calculate(a, b));

        add.showInfo();
        Operation.version();
    }
}
