package com.practice.lambda;

@FunctionalInterface
public interface BankOperation {
    double perform(double balance, double amount);
}
