package com.sda.strings;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello Andrei";
        String str2 = new String("Hello Andrei");
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);

        // Utilizarea unui array de caractere
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars);
        System.out.println("str3 :" + str3);

        // Utilizarea unui array de octeți și un set de caractere
        byte[] bytes = {72, 101, 108, 108, 111};
        String str4 = new String(bytes);
        System.out.println("str4 :" + str4);

        // Utilizarea unui array de caractere și specificarea unui interval din acesta
        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        String str5 = new String(chars1, 0, chars1.length); // Creează șirul “Hello"
        System.out.println("str5 :" + str5);

        // Utilizarea metodei `format()`
        int num = 42;
        double num2 = 3.14;
        String str6 = String.format("Numerele sunt : %d, %.2f" , num, num2);
        System.out.println(str6);

        // Utilizarea concatenării șirurilor
        String str7 = "Hello" + " " + "World";
        System.out.println("str7 :" + str7);
        str7.toString();

        //IMUTABILITATE
        String abc1 = "abc";
        String abc2 = "abc";
        String abc3 = new String("abc");
        String abc4 = abc1;

        String ab = "ab";
        String c = "c";
        String abc5 = ab + c;

        if (abc1 == abc3) {
            System.out.println("Referinte egale :"+ System.identityHashCode(abc1) + " == " + System.identityHashCode(abc3));
        }
        else if(abc1 == abc2) {
            System.out.println("Referintele abc1 si abc2 sunt egale :"+ System.identityHashCode(abc1) + " == " + System.identityHashCode(abc2));
            System.out.println("Referinte abc1 si abc3 sunt diferite :"+ System.identityHashCode(abc1) + " != " + System.identityHashCode(abc3));
        }
        else {

        }

        if (abc1.equals(abc2)){
            System.out.println("siruri egale");
        }
        else {
            System.out.println("siruri diferite");
        }




        // comaprare - compareTo
        String nume1 = "Alexandra";
        String nume2 = "Gigel";
        System.out.println(nume2.compareTo(nume1));
        char a = 'A', g = 'G';
        System.out.println((byte)a+ " " + (byte)g);

        //metode ale clasei String
        String exemplu = "Exemplu";
        int lungime  = exemplu.length();
        System.out.println("Lungimea lui " + exemplu + " este: " + lungime);

        int index = exemplu.indexOf("e");
        char caracter = exemplu.charAt(index);
        System.out.println(index + " "  + caracter);
        String subsir = exemplu.substring(0, 3);
        String subsir2 = exemplu.substring(index);
        String mare  = exemplu.toUpperCase();
        String mic = exemplu.toLowerCase();
        System.out.println(subsir + " " + subsir2);
        System.out.println(mare+ " " +mic);
        String concatenat = exemplu.concat(" concatenat "+  mare);
        System.out.println(concatenat);
// replace, starts, ends, split
        String replaced = exemplu.replace('e','a');
        System.out.println(replaced);
        boolean incepeCuEx = exemplu.startsWith("Ex");
        System.out.println(exemplu + " incepe cu 'Ex' este "+ incepeCuEx);
        boolean terminaCuLu = exemplu.endsWith("lu");
        System.out.println(exemplu + " se termina cu  'lu' este "+ incepeCuEx);
        String[] cuvinte = concatenat.split(" ");
        for (int i=0; i<cuvinte.length; i++) {
            System.out.println(cuvinte[i]);;
        }
    }
}
