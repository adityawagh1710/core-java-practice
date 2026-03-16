package com.practice.interfaces.lambdas;

@FunctionalInterface
interface Operation {
    double calculate(double a, double b);

    default void showInfo() {
        System.out.println("Calculator functional interface");
    }

    static void version() {
        System.out.println("Calculator version 1.0");
    }
}
