package com.sda.variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");  //comentariu pe o linie

    /*Comentariu
    pe mai multe linii
     */
        System.out.print("Numele meu este");
        System.out.print(" Andrei");
        System.out.println();

        //concatenare 2 siruri de caractere
        System.out.println("\nNumele meu este" + " Andrei"); //  "\n" inseamna ca sare la linie noua

        //variabile cu tipuri de date primitive
        //byte, short, int, long, float, double, char, boolean

        // de la -128 pana la 127; ca memorie ocupata = 8 biti = 1byte
        byte byteNo1;   //doar initializare
        byteNo1=1;

        //memorie =16 biti = 2 bytes
        short shortVar=510;   //initializare si atribuire pe aceasi linie

        //memorie = 32 biti = 4 bytes
        int temperaturaDeAfara = 29;

        //memorie = 64 biti = 8 bytes
        long longNo = 12345678901L;                  // !!De adaugat la final un "L" !!

        //memorie = 32 biti = 4 bytes
        float inaltime1=1.8F;                        //  !!De adaugat la final un "F"  !!

        //memorie = 64 biti = 8 bytes
        double inaltime2=1.65;                       //  !! "D" la final este doar optional

        System.out.println("Temperatura de afara este " + temperaturaDeAfara +'\u2070'+ " Celsius");
        //memorie = 16 biti = 2 bytes
        char a='A', b='C';
        System.out.println(b);
        b=a;
        System.out.println(b);

        char copyright = '\u00A9';
        System.out.println(copyright);

        char smiley = '\uD6BD';
        System.out.println(smiley);

        //1bit - 0 sau 1 - 0 = false ; 1 = true
        boolean isRed = true;
        System.out.println("Butonul este rosu? " + isRed);

        //tipuri de date referentiale - String
        String nume = "Andrei";
        System.out.println("Numele meu este " + nume);
        nume ="Hutan" + " Andrei";
        System.out.println("Numele meu este " + nume);

        long numarLong = 1_000_000_000L;
        System.out.println(numarLong);
        char newLine = '\n';
        System.out.println(nume.length());

    }
}