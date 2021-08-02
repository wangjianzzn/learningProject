package com.qf.testam;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {


        /*判断用户输入的i值是不是一个质数？
        * 只能被1和本身整除的数
        *  i=8
        *  7%2!=0// 当一个值能够被2到这个值的前一位任意一个值整数，则不是一个质数（合数）
        *  7%3!=0
        *  7%4!=0
        *  7%5!=0
        *  7%6!=0
        *
        *  如何分析一个值是不是质数？
        *          要想得出一个数是不是质数，必须要先求出他不是一个合数
        *
        * */
       /*
       * 再求一个质数的时候
       *    --------->
       *  判断一个值合数
       *  13
       * */
        Scanner sc=new Scanner(System.in);
        int str = sc.nextInt();
        boolean b=true;

        for (int i = 2; i <str ; i++) {// 2 3 4 5 6 7
            if(str%i==0){
                //System.out.println("是一个合数");
                b=false;
                break;
            }
        }

        if(b){
            System.out.println("是一个质数");
        }else{
            System.out.println("是一个合数");
        }

    }
}
