package com.practice.interfaces.userdefined;

public class App {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java com.caltest.App <operation> <num1> <num2>");
            System.out.println("Operations: add sub mul div");
            return;
        }

        String operation = args[0];
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        Calculator calculator = new BasicCalculator();
        double result = switch (operation.toLowerCase()) {
            case "add" -> calculator.add(num1, num2);
            case "sub" -> calculator.subtract(num1, num2);
            case "mul" -> calculator.multiply(num1, num2);
            case "div" -> calculator.divide(num1, num2);
            default -> throw new IllegalArgumentException("Invalid operation: " + operation);
        };

        System.out.println("Result: " + result);
    }
}