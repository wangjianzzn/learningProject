package com.qf.pmtest;

import java.util.ArrayList;
import java.util.Objects;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList();
        alist.add("12345");
        alist.add("aabbc");
        alist.add("aab");
        alist.add("cccc");
        alist.add("ccccdddd");

        alist.removeIf(o -> o.length()==3);
        System.out.println(alist);



    }
}
