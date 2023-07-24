package com.sda;

import com.sda.oop.Dog;

public class Main2 {
    public static void main(String[] args) {
        Dog Max = new Dog();
        System.out.println(Max);
        for (String arg:
                args) {
            System.out.println("Argument: "+ arg);
            
        }
    }

}
