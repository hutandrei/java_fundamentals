package com.sda.oop;

public class Main {
    public static void main(String[] args) {
        Dog Max = new Dog();
        System.out.println(Max);

        //cum accesam o metoda

        Max.setNume("Max");
        System.out.println(Max.getNume());
        Max.latra();

        Dog rex = new Dog("Rex", "Ciobanesc", 30.4, "maro", 3);
        System.out.println(rex);

        Dog patrocle = new Dog("Patrocle", 10);
        patrocle.setVarsta(50);
        System.out.println(patrocle);

        if (Dog.isCute){
            System.out.println(patrocle + " is cute");
        }

    }
}
