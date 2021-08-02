package com.qf.testpm;

public class DengyaoTri {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i*2-1;k++){
                if(k%2==0){
                    System.out.print(" ");
                }else
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
