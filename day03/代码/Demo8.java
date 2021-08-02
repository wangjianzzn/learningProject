package com.qf.testam;

import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        /*
        *  switch选择结构
        *           switch(变量){
        *               case 值：
        *                   执行代码;
        *                   break;
        *                case 值2：
        *                    执行代码；
        *                    break;
        *                ......
        *                ......
        *                ......
        *                default:
        *                       执行代码;
        *                       break;
        *           }
        *switch:代表进入选择结构
        * case：代表定义需要比较的值
        * break：代表跳出选择结构
        * default：当所有case的答案都不满足时执行该代码
        *   switch中判断变量的容器只支持以下几种类型的变量：byte short int char String
        *   如果判断的数组过多的话，建议不要使用switch
        * */
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("1.普通话2，广东话3，英语");
        int key = sc.nextInt();
        //需要使用switch对key进行判断
        switch (key){
            case 1:
                System.out.println("putonghua");
                break;
            case 2:
                System.out.println("guangdonghua");
                break;
            case 3:
                System.out.println("yingyu");
                break;
            default:
                System.out.println("您输入的不对！！！");
                break;
        }
*/
       /* Scanner sc=new Scanner(System.in);
        System.out.println("请您输入月份：");
        int month = sc.nextInt();
        switch (month){
            case 1:
            case 2:
            case 12:
                System.out.println("dongji");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("chunji");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("xiaji");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("qiuji");
                break;
            default:
                System.out.println("输入不对");
                break;
        }
*/
       int a=2;
       switch (a){
           case 1:
               System.out.println("1111");
           case 2:
               System.out.println("2222");

           case 3:
               System.out.println("3333");

           default:
               System.out.println("nonono");
               break;

       }
       /*
       1.default和case之间没有顺序之分，但是default对应代码一定会在最后执行！
        2.switch结构是通过break关键字结束的，当正确答案以及选择出来后还未通过break跳出时。
        则会默认执行后面的代码不做判断直接执行

       switch和if如何选择？
       当判断的答案不多，且满足执行的类型String byte short int char 时，建议使用switch。
       效率会高一点点。其他情况都用if

       */
    }
}
