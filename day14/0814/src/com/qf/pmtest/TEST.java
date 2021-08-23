package com.qf.pmtest;

import java.util.HashMap;
import java.util.Set;

public class TEST {
    public static void main(String[] args) {
        HashMap<Character, Integer> strMap = new HashMap<>();
        String str = "ksfokwopewkrwprwe";
        for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
           if(!strMap.containsKey(c)){
               strMap.put(c, 1);
           }else {
               int d=strMap.get(c);
               d++;
               strMap.put(c,d);
           }
        }
        System.out.println(strMap);









//        strMap.put("第一个键","abcd");
//        strMap.put("第二个键","abcd");
//        strMap.put("第三个键","abcdeee");
//        strMap.put("aaa","abcdeee");
//        strMap.put("ad","abcdeee");
//        strMap.put("accc","abcdeee");
//       String  str =  strMap.putIfAbsent("第三个键", "ooo");
//        Set<String> kkset = strMap.keySet();
//        System.out.println(kkset);
//        System.out.println(strMap.get("第一个键"));
//        for (String strs: kkset) {
//            System.out.println("键："+strs+"----值："+strMap.get(strs));
//        }
//        System.out.println(strMap);

    }
}
