package com.practice.lambdas.example;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;

        BankOperation deposit = (bal, amt) -> {

            if (amt <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            return bal + amt;
        };

        BankOperation withdraw = (bal, amt) -> {
            if (amt > bal) {
                throw new InsufficientBalanceException("Insufficient balance");
            }

            return bal - amt;
        };

        while (true) {

            System.out.println("\n--- Bank Menu ---");
            System.out.println("1 Deposit");
            System.out.println("2 Withdraw");
            System.out.println("3 Check Balance");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");

            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        balance = deposit.perform(balance, dep);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("Invalid input");
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    try {
                        double wd = 0;
                        balance = withdraw.perform(balance, wd);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Balance: " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for banking.");
                    return;
            }
        }
    }
}