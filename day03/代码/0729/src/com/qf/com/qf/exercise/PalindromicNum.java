package com.qf.com.qf.exercise;

import java.util.Scanner;

public class PalindromicNum {
    public static void main(String[] args) {
        int a,t=0,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数：");
        a = sc.nextInt();
        d = a;
        while (a!=0){
            t = t*10 + a%10;
            a=a/10;
        }
        if(d==t){
            System.out.println(d+"是回文数");
        }else {
            System.out.println(d+"不是回文数");
        }
    }
}
