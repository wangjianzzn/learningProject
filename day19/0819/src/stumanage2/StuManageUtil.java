package stumanage2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import stu$mange$util.Stu;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
* 这是用于定义学生管理系统的相关的功能函数
* 1.添加学生
* 2.删除学生
* 3.修改学生
* 4.查询学生
* 5.显示所有学生
* 6.退出*/
public class StuManageUtil {
//    定义一个扫描器对象。使每一个方法都能直接使用
    Scanner sc = new Scanner(System.in);
//    定义一个存储学生对象的集合容器
    ArrayList<Student> stus = new ArrayList<>();

//    定义一个文件存储地址
    final String DZ = "/Users/charlie/Desktop/test/stu.txt";

//    添加学生
    public void add(){
//       1. 扫描用户需要输入的数据
        System.out.println("请输入学生name");
        String name = sc.next();
        System.out.println("请输入age");
        int age = sc.nextInt();
        System.out.println("请输入score");
        int score = sc.nextInt();
//        2.把用户输入的数据封装到一个学生对象中
        Student stu = new Student(name,age,score);
//        3. 把封装好的学生对象存入到之前定义的arraylist中。
        stus.add(stu);
        System.out.println("添加成功！");
    }

//    删除学生
    public void del(){
//        1.提示用户输入需要删除对象的姓名
        System.out.println("请输入需要删除的name");
        String name = sc.next();
//        2.循环集合容器，判断容器中是否存在该name的对象
        for (int i = 0; i < stus.size(); i++) {
//            取出集合中每一额学生对象的name
            String stusName = stus.get(i).getName();
//            判断是否与用户输入的一致
            if(stusName.equals(name)){
//                说明当前对象就是用户需要删除的学生对象
                stus.remove(i);
//                提示删除成功，并return
                System.out.println("删除成功！");
                return;
            }
        }
//        如果循环结束仍然无匹配对象，提示无此人！
        System.out.println("查无此人！");
    }

//    修改学生信息
    public void update(){
//        1.扫描用户需要修改的学生姓名
        System.out.println("请输入需要需改的name");
        String name =sc.next();
//        2.循环集合判断是否存在需要修改的name
        for (int i = 0; i < stus.size(); i++) {
//            获取到集合中的每一个学生对象，和学生姓名
            Student stu = stus.get(i);
            String stuName = stus.get(i).getName();
//           判断是否存在用户需要修改的对象
            if(stuName.equals(name)){
//                提示匹配到的学生信息
                System.out.println("需要修改的学生信息");
                System.out.println(stu);
                System.out.println("修改1.name 2.age 3.score");
//                根据用户的输入，修改不同的信息
                switch (sc.nextInt()){
                    case 1:
                        System.out.println("输入新name");
//                        将用户输入的姓名存入到匹配到的对象中
                        stu.setName(sc.next());
                        System.out.println("修改name成功");
                        break;
                    case 2:
                        System.out.println("输入新age");
                        stu.setAge(sc.nextInt());
                        System.out.println("修改age成功");
                        break;
                    case 3:
                        System.out.println("输入新score");
                        stu.setScore(sc.nextInt());
                        System.out.println("修改score成功");
                        break;
                    default:
                        System.out.println("输入有误！");
                        break;
                }
            }
        }
        return;
    }

//    查询学生信息
    public void getByName(){
//        1.扫描用户需要查询的学生姓名
        System.out.println("请输入查询的name");
        String name = sc.next();
//        循环遍历集合容器
        for (int i = 0; i < stus.size(); i++) {
//            判断是否有该name的对象
            if(stus.get(i).getName().equals(name)){
//                有的话，打印输出
                System.out.println("显示如下：");
                System.out.println(stus.get(i));
                return;
            }
        }
//       如果循环结束，无匹配独享，则输出无此人
        System.out.println("查无此人");
    }

//    显示所有学生信息
    public void showAll(){
//        循环所有对象，注意输出，判断集合是否为空
        if(stus.size()!=0){
            for (int i = 0; i < stus.size(); i++) {
                System.out.println(stus.get(i));
            }
        }else {
            System.out.println("数据为空");
        }

    }

//    菜单
    public void menu(){
        File file = new File(DZ);
//        首先判断指定路径文件是否存在
//        if(file.exists()){
            //        再循环开启菜单之前首先读取指定路径下的文件 DZ保存的上一次写入的集合数据
            FileInputStream fis = null;
            ObjectInputStream ois = null;

            try {
//                创建文件字节读取流
                fis=new FileInputStream(DZ);
//                转换成对象流，以对象为单位进行读取
                ois=new ObjectInputStream(fis);
//                将读取到的对象集合，强转成集合对象，存入到stus集合中
                stus = (ArrayList<Student>) ois.readObject();
            } catch (FileNotFoundException e) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
//                释放资源
                if(fis!=null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(ois!=null){
                    try {
                        ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
       /* }else {
//            如果指定路径中没有该文件，则新建文件
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


        while(true){
            System.out.println("1.添加 2.删除 3.修改 4.查询 5.显示所有 6.退出");
            switch (sc.nextInt()){
                case 1:
                    add();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    getByName();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
//                    在退出之前，需要把本次执行后的集合容器，持久化到本地文件中
                    FileOutputStream fos = null;
                    ObjectOutputStream oos = null;

                    try {
//                        1.创建一个文件写入流
                        fos=new FileOutputStream(DZ);
//                        2.转换成对象流
                        oos=new ObjectOutputStream(fos);
//                        3.写入集合对象
                        oos.writeObject(stus);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
//                        释放资源
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
                    break;
                default:
                    System.out.println("输入有误");
            }
        }
    }

    public static void main(String[] args) {
        new StuManageUtil().menu();
    }
}
