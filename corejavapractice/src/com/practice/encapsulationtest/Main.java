package com.practice.encapsulationtest;

public class Main {
    public static void main(String[] args) {
        Account acc=new Account();
        acc.setAccNo(7560504);
        acc.setName("XYZ");
        acc.setEmail("xyz@xyz.com");
        acc.setAmount(500000);
        System.out.println(acc.getAccNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
