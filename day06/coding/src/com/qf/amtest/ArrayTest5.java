package com.qf.amtest;

public class ArrayTest5 {
    public static void main(String[] args) {
//        选择排序
        int[] arr = {3,9,43,36,23};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+"\t");
        }
       /* for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }*/

    }
}
