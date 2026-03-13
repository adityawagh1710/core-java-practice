package com.practice.loops;

public class Main {
    public static void main(String[] args) {
        // For
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        aa:
        for(int i=1; i <= 3; i++) {
            for(int j=1; j<=3; j++){
                if(i==2 && j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }

        // Foreach
        int[] arr = {12,23,44,56,78};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
