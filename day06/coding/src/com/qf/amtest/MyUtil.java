package com.qf.amtest;

import java.util.Scanner;

public class MyUtil {
    String[] str = new String[10];
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要添加的名字：");
        String name = sc.next();
        for (int i = 0; i < str.length; i++) {
            if(str[i]==null){
                str[i]=name;
                System.out.println("添加成功！");
                return;
            }
        }
        System.out.println("添加失败！");
    }
    public void deleteName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的名字：");
        String name = sc.next();
        for (int i = 0; i < str.length; i++) {
            if(str[i]!=null&&str[i].equals(name)){
                str[i]=null;
                System.out.println("删除成功！");
                return;
            }

        }
        System.out.println("删除失败！");

    }
    public void showALL(){
        for (int i = 0; i <str.length; i++) {
            if (str[i]!=null) {
                System.out.print(str[i] + "\t");
            }
        }
        System.out.println();
    }
}
