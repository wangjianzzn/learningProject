package com.qf.amtest;

public class CleanDirtyWord {
    public static void main(String[] args) {
        String str = "我丢雷老母，真尼玛菜， 找个班上吧,沙比，草!";
        String[] strings = new String[2];
        strings[0] = "草";
        strings[1] = "丢雷老母";
        String newStr=str;
        for (int i = 0; i < strings.length; i++) {
            String repStr = "";
                for (int j = 0; j < strings[i].length(); j++) {
                    repStr += "*";
                }
                newStr = newStr.replace(strings[i], repStr);
        }
        System.out.println(str);
        System.out.println(newStr);
    }
}
