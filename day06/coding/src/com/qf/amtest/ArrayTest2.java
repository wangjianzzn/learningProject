package com.qf.amtest;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 定义一个数组用于存储用户输入的值
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // 录入
        for (int i = 0; i < arr.length; i++) {
            System.out.println("录入第"+(i+1)+"个数");
            arr[i]= sc.nextInt();
        }
        // 输出
//        for (int j = 0; j <arr.length ; j++) {
//            求数组内所有数的和
//            sum +=arr[i];
//            输出数组内所有数
//            System.out.print(arr[j]+"\t");

//        }

    }
}
