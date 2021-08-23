package com.qf.pmtest;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Animal cat = new Cat();
        feed(cat);
    }
    public static void feed(Animal animal ){
        animal.eat();
        animal.sleep();
        if(animal instanceof Cat){
            ((Cat) animal).zls();
        }else if (animal instanceof Dog){

        }

    }
}
