package com.practice.access.specifier2;

import com.practice.access.specifier1.A;

public class C {
    public static void main (String args[]) {
        A obj = new A();
        obj.msg();

        D obj2 = new D();
        obj2.display();
    }
}