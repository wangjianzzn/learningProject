package com.qf.testam;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        /*
        * 需求：
        *   用户输入一个八位的整数代表日期。
        *   判断该整数中代表月份的是不是7月份。是则输入yes 否则输出no
        * */
        //1.为了能够使整数由用户输入扫描，所以我们需要使用Java提供的一个扫描器工具对象
        Scanner sc = new Scanner(System.in);//创建扫描器对象
        //2.通过创建的扫描器对象调用专门用来扫整数的工具
        /* 当代码执行到该行时，
        会等待用户输入一个数据，
        只有在用户输入完数据以后按下回车，该数据会自动赋值给变量
        *
        * */
        System.out.println("请您输入一个日期");
        int sum = sc.nextInt();
        //3.对用户输入的值进行处理，取出中间代表月份的值  20210729
        int month=sum/100%100;
        //4.判断month==7
        if (month==7){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println("sum:"+sum);


    }
}
