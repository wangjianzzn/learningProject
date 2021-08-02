package com.qf.testam;

import java.util.Scanner;

public class caiquan {
    public static void main(String[] args) {
       for (int i=0;i>=0;i++){
           int rand = (int)(Math.random()*3);
           String comp = "";
           if (rand==0){
               comp = "剪刀";
           }else if (rand == 1){
               comp = "石头";
           }else {
               comp = "布";
           }
           System.out.println("猜拳游戏：石头、剪刀、布");
           Scanner sc = new Scanner(System.in);
           String player = sc.next();
           if (player.equals("石头")&&comp.equals("布") || player.equals("剪刀")&&comp.equals("石头") || player.equals("布")&&comp.equals("剪刀")){
               System.out.println("你输了，你出"+player+"，电脑出"+comp);
           }else if (player.equals(comp)){
               System.out.println("平局");
           }else {
               System.out.println("你赢了，你出"+player+",电脑出"+comp);
           }

       }


    }
}
