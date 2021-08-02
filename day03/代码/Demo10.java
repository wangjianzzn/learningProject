package com.qf.testam;

import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        while (true){
            //1.获取人输入的值ren
            Scanner sc=new Scanner(System.in);
            System.out.println("请您输入石头剪刀布");
            String ren = sc.next();
            //2.获取电脑输入的值
            //1.随机 2.3个 3.石头剪刀布
            double d = Math.random();
            int i=(int)(d*3);//0 1 2
            //在分配之前定义一个容器进行存储对应的值代表电脑随机出的值
            String dian="";
            if(i==0){
                //石头
                dian="石头";
            }else if(i==1){
                //剪刀
                dian="剪刀";
            }else{
                //布
                dian="布";
            }

            //3.比较
            if(ren.equals("石头")&&dian.equals("剪刀")||ren.equals("剪刀")&&dian.equals("布")||ren.equals("布")&&dian.equals("石头")){
                System.out.println("you win,电脑出了："+dian);
            }else if(ren.equals(dian)){
                System.out.println("pj,电脑出了："+dian);
            }else{
                System.out.println("you lose,电脑出了："+dian);
            }
            //代表一局结束
            System.out.println("是否继续？n/N结束 其他继续");
            String key = sc.next();
            if(key.equals("n")||key.equals("N")){
                System.out.println("欢迎下次来玩！");
                System.exit(0);//系统结束
            }
        }

    }
}
