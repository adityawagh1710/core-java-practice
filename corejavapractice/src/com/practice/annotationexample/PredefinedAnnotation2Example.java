package com.practice.annotationexample;

class A{
    void m(){
        System.out.println("hello m");
    }

    @Deprecated
    void n(){
        System.out.println("hello n");
    }
}

class PredefinedAnnotation2Example extends A {
    public static void main(String[] args){
        A a = new A();
        a.m();
        a.n();
    }
}