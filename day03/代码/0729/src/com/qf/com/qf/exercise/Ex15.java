package com.qf.com.qf.exercise;

public class Ex15 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            if (i%7==0){
                if(i%2!=0){
                    count++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(count);
    }
}
