package com.qf.testpm;

public class Test {

    public void printFig(int x,int y){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public void printMulti(){
        for (int i = 1 ; i <10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();

        }
    }

}
