package com.pf.testam;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            boolean flag = sushu(n);
            if (flag){
                System.out.println(n+"是素数");
            }else{
                System.out.println(n+"不是素数");
            }
        }
    }
    public static boolean sushu(int n){
        boolean flag = true;
        for (int i = 2; i <n; i++) {
            if (n%i==0){
                flag= false;
                return flag;
            }
        }
            return flag;
    }
}
