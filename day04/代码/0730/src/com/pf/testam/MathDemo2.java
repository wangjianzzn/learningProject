package com.pf.testam;

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个需要分解的数字：");
        int n =scanner.nextInt();
        String str = fenjie(n);
        System.out.println(str);

    }
    public static String fenjie(int n){
        String result="";
        int temp= n;
        while (temp!=1){
            for (int i = 2; i <=temp; i++) {
                if (temp%i==0){
                    result=result+i+"*";
                    temp /= i;
                    break;
                }
            }
        }
        result = n+"="+result;
        return result;
    }
}
