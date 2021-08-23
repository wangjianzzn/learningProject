package ex1;

import java.util.Scanner;

public class MyUtil {
    Student[] stus = new Student[5];
    String sNo;
    String sName;
    char sSex;
    int sAge;
    int sJava;
    public void input(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <stus.length ; i++) {
            stus[i] = new Student();
            System.out.println("录入第"+(i+1)+"个学生的学号");
            stus[i].setsNo(sc.next());
            System.out.println("录入第"+(i+1)+"个学生的姓名");
            stus[i].setsName(sc.next());
            System.out.println("录入第"+(i+1)+"个学生的性别");


        }
    }
}
