package com.qf.amtest;

public class ArrayTest3 {
    public static void main(String[] args) {

     int[] arr = {1, 2, 3, 44, 55, 66, 77};
//     输出数组中最大的一个数
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
