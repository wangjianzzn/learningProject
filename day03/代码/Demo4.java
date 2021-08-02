package com.qf.testam;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        /*需求：
                用户连续输入二个整数。
                对用户输入的整数进行比较，谁大就输出谁，
        * */
        //1.创建扫描器对象
        Scanner sc = new Scanner(System.in);
        //2.扫描用户输入的第一个值
        System.out.println("请您输入第一个值：");
        int a = sc.nextInt();
        //3.扫描用户输入的第二个值
        System.out.println("请您输入第二个值：");
        int b = sc.nextInt();
        //4.判断谁大输出谁
        if(a>b){
            System.out.println("a:"+a);
        }else{
            System.out.println("b"+b);
        }

    }
}
