package com.qf.testam;

import java.util.Scanner;

public class liucheng {
    public static void main(String[] args) {
       /*
       * 流程控制语句
       *
       * 1顺序流程
       *
       *
       * 2选择流程
       *
       *
       * 3循环流程*/
        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期8位"); // 20210729
        int date = sc.nextInt();
        if(date/100%100==7)
            System.out.println("是七月");
        else
            System.out.println("不是七月"+date/100%100);

    }
}
