package com.qf.amtest;

public class Student {
    String name;
    int age;

    @Override
    public boolean equals(Object obj) {
       Student stu = (Student)obj;
       return name.equals(stu.name)&&age==stu.age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
