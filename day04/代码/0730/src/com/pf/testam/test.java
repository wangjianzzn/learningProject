package com.pf.testam;

public class test {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
