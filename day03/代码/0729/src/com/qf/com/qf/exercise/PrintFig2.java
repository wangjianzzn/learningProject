package com.qf.com.qf.exercise;

public class PrintFig2 {
    public static void main(String[] args) {
        for (int i=5;i>=0;i--){
            // 空格
            for (int j=0;j<5-i;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
