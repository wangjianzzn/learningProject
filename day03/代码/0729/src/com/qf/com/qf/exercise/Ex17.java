package com.qf.com.qf.exercise;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int a = sc.nextInt();
            int sum=0;
            while (a!=0){
                sum += a%10;
                a /= 10;
            }
            System.out.println(sum);
        }

    }
}
