package com.qf.com.qf.exercise;

public class PrintFig1 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            // 打印空格
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            // 打印*
            for (int k=1;k<=4;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
