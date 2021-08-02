package com.qf.testam;

import java.util.Scanner;

public class Eg2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        if(month==1||month==2||month==12){
            System.out.println("dong");
        }else if(month>=3&&month<=5){
            System.out.println("chun");
        }else if (month>=6&&month<=9){
            System.out.println("xia");
        }else if(month>=10&&month<=11){
            System.out.println("qiu");
        }else
            System.out.println("xxxx");
    }
}
