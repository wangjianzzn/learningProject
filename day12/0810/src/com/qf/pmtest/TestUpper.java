package com.qf.pmtest;

public class TestUpper {
    public static void main(String[] args) {
        String a="Ajju,UJo,Ijoi";
        String[] arr=a.split(",");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        String str2 = a.substring(2,8);
        System.out.println(str2);

        String str3 = a.toUpperCase();
        System.out.println(str3);

        String str4 = a.toLowerCase();
        System.out.println(str4);
           }
}
