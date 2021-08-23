package com.qf.pmtest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Collection<String> con = new ArrayList();
        con.add("jiji");
        con.add("di");
        con.add("ooo");
        con.add("ppppp");
        Iterator<String> it = con.iterator();
        while (it.hasNext()){
            String nxt = it.next();
            if(nxt.length()==3){
                con.remove(nxt);
            }
        }
        System.out.println(con);
    }
}
