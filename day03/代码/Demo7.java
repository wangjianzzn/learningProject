package com.qf.testam;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        /*
        * 猜拳小游戏
        *       1.用户需要输入一个值：石头 剪刀 布
        *
        *       2.电脑随机产生一个值：石头 剪刀 布
        *               a.电脑随机产生一个值   随机性
        *                   double d=Math.random();// 0-1（不包含1）
        *               b.把随机产生的无限可能性的小数d控制在随机三个值数以内 0 1 2
        *                   int i=(int)(d*3); 0 1 2
        *               c.分配 0石头 1剪刀 2布
        *       3.对用户输入的值和电脑输入的值进行比较得出结论
        * */
        //1.扫描器对象进行扫描用户输入的值。
        Scanner sc=new Scanner(System.in);
        System.out.println("请您输入石头剪刀布：");
        String ren = sc.next();//人数据的数据就保存在变量ren

        //2.电脑随机值
        double d = Math.random();
        int i=(int)(d*3);
        //提升变量的使用范围
        String dian="";
        if(i==0){
            //电脑出了石头
           dian="石头";
        }else if(i==1){
            //电脑出了剪刀
            dian="剪刀";
        }else{
            //电脑出了布
            dian="布";
        }

        //3.比较    dian ren
        //System.out.println("人出了："+ren+",电脑出了："+dian);
        if(ren.equals("石头")&&dian.equals("剪刀")||ren.equals("剪刀")&&dian.equals("布")||ren.equals("布")&&dian.equals("石头")){
            System.out.println("you win，因为电脑出了："+dian);
        }else if(ren.equals(dian)){
            System.out.println("pj，因为电脑出了："+dian);
        }else{
            System.out.println("you lose，因为电脑出了："+dian);
        }
    }
}
