package com.qf.amtest;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TestHashset {
    public static void main(String[] args) {
       /* Person person1 = new Person("王",23);
        Person person2 = new Person("王",23);
        Person person3 = new Person("杨",33);*/

       /* HashSet<Person> people = new HashSet<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
*/
   /*     System.out.println(people);*/
        TreeSet<String> strings = new TreeSet<>(Comparator.comparingInt(String::length));
        strings.add("aaa");
        strings.add("dddddd");
        strings.add("cccc");
        strings.add("bb");
        strings.add("ee");
        System.out.println(strings);




    }
}
