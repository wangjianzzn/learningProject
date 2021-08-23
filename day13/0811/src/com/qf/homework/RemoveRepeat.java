package com.qf.homework;

import org.omg.CORBA.ARG_IN;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveRepeat {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("aa");
        arr.add("bb");
        arr.add("cc");
        arr.add("aa");
        arr.add("aa");
        arr.add("aa");
        /*arr.add("abd");
        arr.add("abcd");
        arr.add("abcd");*/
       /* removeRepeat(arr);
        System.out.println(arr);*/
        ArrayList new_arr = new ArrayList();
       new_arr= myDistinct(arr);
        System.out.println(new_arr);


        //arr.stream().distinct()



    }
   /* public static void removeRepeat(ArrayList<String> arr){
        for (int i = 1; i <arr.size() ; i++) {
            for (int j = 0; j <arr.size(); j++) {
               if(i!=j&&arr.get(i)==arr.get(j)){
                   arr.remove(arr.get(j));
               }
            }
        }
    }*/

    public static ArrayList<String> myDistinct(ArrayList<String> arr){
//        新建一个空集合，用于存储
        ArrayList<String> new_arr = new ArrayList<>();
//        遍历老集合，挨个取出元素
        for (int i = 0; i < arr.size(); i++) {
//            判断取出的元素是否在新集合中存在
            if(!new_arr.contains(arr.get(i)) ){
//                如果不存在，添加新集合
                new_arr.add(arr.get(i));
            }
        }
//        返回新集合
        return new_arr;
    }



}
