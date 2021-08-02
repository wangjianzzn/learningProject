package com.pf.testam;

public class test2 {
    public static void main(String[] args) {
        multi(2);
    }
    public static void multi(int n){
        int sum = 1;
        for (int i = 1; i <=n; i++) {
            sum *=i;
        }
        System.out.println("sum="+sum);
    }
}
