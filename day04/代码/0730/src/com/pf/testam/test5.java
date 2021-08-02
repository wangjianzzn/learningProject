package com.pf.testam;

import java.util.Scanner;


public class test5 {
    public static boolean checkPrime(int num){
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static String primeFactor(int num){
        String str = "";
        int temp = num;
        for (;;){
            for (int i = 2; i <temp ; i++) {
                if (temp%i==0){
                    str = str + i+"*";
                    temp /= i;
                    break;
                }
            }
            if(checkPrime(temp)){
                str = num+"="+str + temp;
                break;
            }
        }
        return  str;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int num = sc.nextInt();

            System.out.println(primeFactor(num));
        }
    }

}
