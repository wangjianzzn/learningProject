package com.qf.exer;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,23,13,24,89,78};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
