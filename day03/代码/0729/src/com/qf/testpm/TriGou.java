package com.qf.testpm;


import java.util.Scanner;

public class TriGou {
    public static void main(String[] args) {
        int count=1;
        Scanner sc = new Scanner(System.in);
        while (count<=3){
            System.out.println("输入第1条边的长度：");
            double a = sc.nextDouble();
            System.out.println("输入第2条边的长度：");
            double b = sc.nextDouble();
            System.out.println("输入第3条边的长度：");
            double c = sc.nextDouble();
            if(a+b>c && a+c>b && b+c>a){
                double peri = a+b+c;
                double s = peri/2;
                double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.println("周长为："+peri+"，面积为："+area);
                break;
            }else {
                System.out.println("此三边无法构成三角形，请重新输入");
            }
            count++;
        }
        if (count==4){
            System.out.println("输入次数过多，程序结束");
        }
        System.out.println("886");



    }
}
