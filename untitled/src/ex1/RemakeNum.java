package ex1;

import java.util.Scanner;

public class RemakeNum {
    int exNum;
    int nowNUM;
  int a,b ,c;
    public void remakeNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数");
        exNum  = sc.nextInt();
        a = exNum%10;
        b = exNum/10%10;
        c = exNum/100;
        if(a>b){
            int temp = a;
            a = b;
            b= temp;
        }
        if(b>c){
          int  temp = b;
          b= c;
          c= temp;
        }
        if(a>b){
            int temp= a;
            a=b;
            b= temp;
        }
        System.out.println("原数字"+exNum+"通过重组变成"+(a+10*b+100*c));

    }
}
