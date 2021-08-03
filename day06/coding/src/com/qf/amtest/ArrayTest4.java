package com.qf.amtest;

public class ArrayTest4 {
    public static void main(String[] args) {
        int a = 4;
        int[] arr = new int[1];
        arr[0] = 33;
        update(a);
//        System.out.println(a);
        update(arr);
        System.out.println(arr[0]);

    }
    public static void update(int a){
        a=99;
    }
    public static void update(int[] arr){
        arr[0]= 99;
    }
}
