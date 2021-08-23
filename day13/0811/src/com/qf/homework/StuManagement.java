package com.qf.homework;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StuManagement {

    ArrayList<Student> arr = new ArrayList();

    //    添加录入学生信息
    public void add() {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要录入的学生姓名：");
        student.name = sc.next();
        System.out.println("输入" + student.name + "的年龄：");
        student.age = sc.nextInt();
        System.out.println("输入" + student.name + "的成绩：");
        student.source = sc.nextInt();
        System.out.println("输入" + student.name + "的id：");
        student.id = sc.nextInt();
        arr.add(student);

    }

    //    查询学生信息
    public void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        int id = sc.nextInt();
//         arr.stream().filter(student -> student.id==id).forEach(System.out::println);
        for (int i = 0; i < arr.size(); i++) {
            int id1 = arr.get(i).id;
            if (id1 == id) {
                System.out.println(id1);

                return;
            }
        }
    }

    //    删除学生信息
    public void delete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id：");
        int id = sc.nextInt();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).id == id) {
                arr.remove(arr.get(i));
                System.out.println("删除成功");
                return;
            }
        }
    }

    //
    public List<Student> sortByGrade() {
        if (arr != null) {
            /*return arr.stream()
                    //顺序
                    .sorted(Comparator.comparing(Student::getSource))
                    // daoxu
//                    .sorted(Comparator.comparing(Student::getSource).reversed())
                    .collect(Collectors.toList());*/

            TreeSet<Student> students = new TreeSet<>(arr);
//            TreeSet<Student> studentSet = new TreeSet<>(new Comparator<Student>() {
//                @Override
//                public int compare(Student o1, Student o2) {
//                    //这里就是自定义排序方式
//                    // >0 :就是排序在前
//                    return 0;
//                }
//            });
//            //这就是排序后的结果
//            studentSet.addAll(students);



            //还有一种就是和 lambda 类似
            TreeSet<Student> studentTreeSet = new TreeSet<>(Comparator.comparing(Student::getSource));
            studentTreeSet.addAll(students);
            //如果倒序就是
            TreeSet<Student> studentTreeSet2 = new TreeSet<>(Comparator.comparing(Student::getSource).reversed());
//            Collections.sort();

        }
        return null;
    }

    public void show() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

}
