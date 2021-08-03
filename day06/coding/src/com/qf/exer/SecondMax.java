package com.qf.exer;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {22,33,56,43,99,99,99};
        int max = arr[0]; int second  = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                second = max;
                max = arr[i];
            }else if(arr[i]<max && arr[i]>second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }

}
