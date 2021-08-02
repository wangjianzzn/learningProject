package com.qf.ex;

public class Ex2 {
    public static void main(String[] args) {
        for (int i=0; i <10 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2*(10-i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
