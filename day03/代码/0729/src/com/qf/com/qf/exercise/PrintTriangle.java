package com.qf.com.qf.exercise;

public class PrintTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            // 打印空格
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            // 打印三角
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
