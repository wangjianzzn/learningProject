package com.qf.com.qf.exercise;

public class Ex11 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=1000;i++){
            if (i%2!=0){
                sum += i;
            }
        }
        System.out.println("sum="+sum);


    }
}
