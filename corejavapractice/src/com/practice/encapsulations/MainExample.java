package com.practice.encapsulations;

public class MainExample {
    public static void main(String[] args) {
        AccountExample acc=new AccountExample();
        acc.setAccNo(7560504);
        acc.setName("XYZ");
        acc.setEmail("xyz@xyz.com");
        acc.setAmount(500000);
        System.out.println(acc.getAccNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
