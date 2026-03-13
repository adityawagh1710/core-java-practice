package com.practice.lambdas;

@FunctionalInterface
public interface BankOperation {
    double perform(double balance, double amount);
}
