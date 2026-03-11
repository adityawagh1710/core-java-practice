package com.practice.objects;

import com.practice.encapsulations.AccountExample;

public class Main {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println("Object as String: " + obj.toString());
        System.out.println("Object as String: " + obj.hashCode());
        AccountExample acc = new AccountExample();
        System.out.println("Account as String: " + acc.toString());
        System.out.println("Account as String: " + acc.hashCode());

        AccountExample acc2 = new AccountExample();
        System.out.println("Account2 as String: " + acc2.toString());
        System.out.println("Account2 as String: " + acc2.hashCode());

        String str1 = "Aditya";
        String str2 = "AdityaW";
        System.out.println("Are these equal:" + str1.equals(str2));
    }
}
