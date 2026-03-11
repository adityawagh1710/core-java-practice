package com.practice.lambdas.example;

@FunctionalInterface
public interface BankOperation {
    double perform(double balance, double amount);
}
