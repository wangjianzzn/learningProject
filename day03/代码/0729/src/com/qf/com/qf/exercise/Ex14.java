package com.qf.com.qf.exercise;

import java.sql.SQLOutput;

public class Ex14 {
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=100;i++){
            if ((i%7==0 || i%3==0)&& !(i%7==0 && i%3==0)){
                //System.out.println(i);
                count ++;
            }
        }
        System.out.println("count="+count);
    }
}
