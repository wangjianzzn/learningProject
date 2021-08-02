package com.qf.com.qf.exercise;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        while (true){
            Scanner sc=new Scanner(System.in);
            boolean flag=true;
            int n = sc.nextInt();
            for (int i=2;i<n;i++){
                if (n%i==0){
                    flag = false;
                }
            }
            if (flag){
                System.out.println(n+"是质数");
            }else
                System.out.println(n+"不是质数");
        }
    }
}
