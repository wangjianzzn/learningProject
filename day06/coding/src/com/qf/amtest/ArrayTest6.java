package com.qf.amtest;

import java.time.temporal.Temporal;

public class ArrayTest6 {
    public static void main(String[] args) {
//        冒泡排序
        int[] arr = {23,33,53,12,2,45,99};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
