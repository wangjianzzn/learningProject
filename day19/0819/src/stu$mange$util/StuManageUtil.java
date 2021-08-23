package stu$mange$util;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StuManageUtil{
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> stus = new ArrayList<>();
    final  String DZ="/Users/charlie/Desktop/test/stu.txt";


    public void add(){
        System.out.println("请输入name:");
        String name = sc.next();
        System.out.println("请输入age:");
        int age = sc.nextInt();
        System.out.println("请输入score:");
        int score = sc.nextInt();
        Student stu = new Student(name, age, score);
        stus.add(stu);
        System.out.println("添加成功！");
    }

    public void delete(){
        System.out.println("请输入要删除的name：");
        String name = sc.next();
        for (int i = 0; i < stus.size(); i++) {
            String stusName = stus.get(i).getName();
            if(name.equals(stusName)){
                stus.remove(i);
                System.out.println("删除成功！");
                return;
            }
            System.out.println("查无此人");
        }
    }

    public void update(){
        System.out.println("输入需要修改的name：");
        String name = sc.next();
        for (int i = 0; i < stus.size(); i++) {
            String stusName = stus.get(i).getName();
            Student stu = stus.get(i);
            if(stusName.equals(name)){
                System.out.println("您要修改的学生信息如下：");
                System.out.println(stu);
                System.out.println("请选择需要修改的信息:1.name 2.age 3.score");
                int key = sc.nextInt();
                switch (key){
                    case 1:
                        System.out.println("请输入新name");
                        stu.setName(sc.next());
                        System.out.println("修改name成功！");
                        break;
                    case 2:
                        System.out.println("请输入新age");
                        stu.setAge(sc.nextInt());
                        System.out.println("修改age成功！");
                        break;
                    case 3:
                        System.out.println("请输入新score");
                        stu.setScore(sc.nextInt());
                        System.out.println("修改score成功！");
                        break;
                    default:
                        System.out.println("输入有误！");
                        break;
                }
                return;
            }
        }
        System.out.println("没有这个人！");
    }

    public void selectByName(){
        System.out.println("请输入你要查询的name:");
        String name = sc.next();
        for (int i = 0; i < stus.size(); i++) {
            if(name.equals(stus.get(i).getName())){
                System.out.println("查询入下：");
                System.out.println(stus.get(i));
                return;
            }
        }
        System.out.println("查无此人！");
    }
    public void showAll(){
        if(stus.size()==0){
            System.out.println("当前没有任何数据");
        }else {
            System.out.println("显示如下：");
            for (int i = 0; i < stus.size(); i++) {
                System.out.println(stus.get(i));
            }
        }
    }

    public void menu(){

        File file = new File(DZ);
        if (file.exists()){
            FileInputStream fis = null;
            ObjectInputStream ois = null;
            try {
                fis = new FileInputStream(DZ);
                ois = new ObjectInputStream(fis);
                stus = (ArrayList<Student>)ois.readObject();
            } catch (ClassNotFoundException | IOException e) {
                e.printStackTrace();
            }finally {
                if (ois!=null){
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        } else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        while (true){
            System.out.println("1.添加 2.删除 3.修改 4.查询 5.显示所有 6.退出");
            switch (sc.nextInt()){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    selectByName();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;
                    try {
                        fos = new FileOutputStream(DZ);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(stus);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        if(oos!=null){
                            try {
                                oos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (fos!=null){
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        StuManageUtil smg = new StuManageUtil();
        smg.menu();
    }


}
