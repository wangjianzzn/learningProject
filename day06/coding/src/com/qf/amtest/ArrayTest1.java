package com.qf.amtest;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,55,33,22,33};
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]+".");
            }else {
                System.out.print(arr[i]+",");
            }
        }

    }
}
