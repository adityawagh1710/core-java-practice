package com.practice.interfaces.lambdas;

@FunctionalInterface
public interface BankOperation {
    double perform(double balance, double amount);
}
