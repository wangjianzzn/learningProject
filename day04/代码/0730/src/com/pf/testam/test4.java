package com.pf.testam;

import java.util.Scanner;

public class test4 {
    public static int index(int n,int m){
        int sum = 1;
        for (int i = 0; i <m; i++) {
            sum *= n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入底数：");
        int num = sc.nextInt();
        System.out.println("输入指数：");
        int n = sc.nextInt();
        int sum = index(num,n);
        System.out.println(num+"的"+n+"次方="+sum);


    }
}
