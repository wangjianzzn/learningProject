package com.qf.testpm;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1:
            case 2:
            case 3:
                System.out.println("xxx");
                break;
            case 4:
            case 5:
                System.out.println("yyyyy");
                break;
            default:
                System.out.println("xxxoiuok");
                break;
        }
    }
}
