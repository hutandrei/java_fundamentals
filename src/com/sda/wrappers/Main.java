package com.sda.wrappers;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int maxInteger = Integer.MAX_VALUE;
        int minInteger = Integer.MIN_VALUE;
        System.out.println(maxInteger + " " + minInteger);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println(maxLong + " " + minLong);

        Float numarFloat1 = 6.14f;
        Float numarFloat2 = 3.14f;
        Float numarFloat3 = new Float(3.14f);
        System.out.println(numarFloat1 + " " + numarFloat2 + " " + numarFloat3);
        if (numarFloat1.equals(numarFloat2)) {
            System.out.println("Obiectele au aceasi valoare");
        } else {
            System.out.println("Obiectele nu au aceasi valoare ");
        }

        if (numarFloat1 == numarFloat3) {
            System.out.println("Obiectele au aceasi referinta");
        } else {
            System.out.println("Obiectele nu au aceasi referinta ");
        }

        System.out.println(numarFloat1.compareTo(numarFloat2)); // 1- primul mai mare; -1 primul mai mic; = -sunt egale

        //autoboxing - convcersie primitive - > obiecte
        Double numarDouble = 30.58;
        char z = 'z';
        Character character1 = z;
        Character character2 = character1;
        System.out.println(z + " " + character1 + " " + character2);
        Integer numarInteger = 5;

        //unboxing - conversie de la obiect la primitiva
        int numarInt = numarInteger;
        int numarInt2 = numarDouble.intValue();
        System.out.println(numarInt + " " + numarInt2);

        //conversie de la primitiva la obiect
        int numarInt1 = 9999;
        Long numarLong1 = Long.valueOf(numarInt1);
        Long numarLong2 = (long) numarInt1;
        System.out.println(numarLong1 + " " + numarLong2);

        Float numarFloat4 = (float) numarInt1;
        Float numarFloat5 = Float.valueOf(numarInt1);


        //conversie de la sir de caractere la clasa Double
        Double numarDouble2 = Double.valueOf("3.14");
        System.out.println(numarDouble2);

        //acelasi lucuru pentru Short
        String numarString = "123";
        Short numarShort = Short.valueOf(numarString);
        System.out.println(numarShort);

        //conversie de la wrapper la sir de caractere
        String numarDoubleString = numarDouble2.toString();
        System.out.println("convertit din wrapper in sir de caractere: " + numarDoubleString);
        System.out.printf("Cconverit din primitiv int in clasa Float %.2f %.2f %d %s \n", numarFloat4, numarFloat5, numarInt, numarDoubleString);

        //conversie explicita
        Integer numarIntreg = numarDouble.intValue();
        System.out.println(numarIntreg);


        Integer[] numere = {10, 20, 30};
        for (Integer numar :
                numere) {
            System.out.println(numar);
        }
        String[] numereS = new String[numere.length];
        for (int i = 0; i < numere.length; i++) {
            numereS[i] = numere[i].toString();
        }
        System.out.println();
        for (String numar :
                numereS) {
            System.out.print(numar + " ");
            System.out.println(Arrays.toString(numereS));

            // toString()   -- folosind clasa Arrays
            double[] vector = {10.2, 5.5, 2.2, 15.7, 9.9};
            double[] vector1 = {10.2, 5.5, 2.2, 15.7, 9.9};
            System.out.println(Arrays.toString(vector));
            System.out.println(Arrays.toString(vector1));
            if (Arrays.toString(vector).equals(Arrays.toString(vector1)))
                System.out.println("Vectorii sunt identici");
            else {
                System.out.println("Vectorii sunt diferiti");
            }
        }
    }
}
