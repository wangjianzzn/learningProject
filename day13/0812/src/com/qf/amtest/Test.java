package com.qf.amtest;

import com.sun.jmx.snmp.agent.SnmpMibOid;

import java.util.ArrayList;
import java.util.logging.Filter;

public class Test{
    public static void main(String[] args) {
        Student s1 = new Student("zs",13);
        Student s2 = new Student("zs",15);
        Student s3 = new Student("ls",13);
        Student s4 = new Student("zs",13);
        ArrayList<Student> arrs = new ArrayList<>();
        arrs.add(s1);
        arrs.add(s2);
        arrs.add(s3);

        System.out.println(arrs.contains(s4));
        System.out.println(arrs);
    }

}
