package com.pf.testam;

public class MathodOverloading {
    public static void show(){
        System.out.println("无参数，无返回值方法");
    }
    public static void show(int num){
        System.out.println("int参数类型，无返回值");
    }

    public static void main(String[] args) {
        show();
        show(9);

    }
}
