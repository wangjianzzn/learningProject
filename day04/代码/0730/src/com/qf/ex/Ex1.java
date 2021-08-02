package com.qf.ex;

public class Ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            for (int j = 1; j <10-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=2*i-1 ; k++) {
                if (k%2==0)
                System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
