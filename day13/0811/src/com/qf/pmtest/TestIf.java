package com.qf.pmtest;

import java.util.function.Predicate;

public class TestIf implements Predicate {

    @Override
    public boolean test(Object obj) {
        String str = (String)obj;
        boolean bo = str.length()==3;
        return bo;
    }
}
