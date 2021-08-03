package com.qf.amtest;

import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {
        MyUtil my = new MyUtil();

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.添加姓名  2.删除指定姓名  3.查询所有名单");
            int a = sc.nextInt();
            if (a == 1) {
                my.add();
            }else if(a==2){
                my.deleteName();
            }else if(a==3){
                my.showALL();
            }else {
                System.out.println("输入有误，重新输入");
            }

        }


    }
}
