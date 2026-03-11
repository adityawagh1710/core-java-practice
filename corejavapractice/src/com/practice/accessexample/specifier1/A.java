package com.practice.accessexample.specifier1;

public class A {
    private final int data = 40;

    private void msg2(){
        System.out.println("Hello private");
    }
    public void msg() {
        System.out.println("Hello public");
    }

    public static void main (String args[]) {
        A obj = new A();
        obj.msg();
        System.out.println(obj.data);
        obj.msg2();
    }
}
