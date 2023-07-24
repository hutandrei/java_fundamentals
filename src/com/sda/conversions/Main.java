package com.sda.conversions;

public class Main {
    public static void main(String[] args) {
        //conversii implicite

        //byte -short
        byte numarByte1 = 10;  //  -128 -> 127
        short numarShort1 = numarByte1;
        System.out.println(numarByte1);
        System.out.println(numarShort1);


        //short  -  int
        short numarShort2 = 100;
        int numarInt1 = numarShort2;
        System.out.println(numarShort2);
        System.out.println(numarInt1);

        //int  -  long
        long numarLong1 = numarInt1;
        System.out.println(numarLong1);

        //float double
        float numarFloat1 = 3.14F;
        double numarDouble1 = numarFloat1;
        System.out.println(numarFloat1);
        System.out.println(numarDouble1);

        // %f %d %s
        System.out.printf("%.2f", numarDouble1);
        System.out.println();

        int a = 5;
        System.out.printf("%d", a);

        //char - int
        char chA = 'A';
        int codA = chA;
        System.out.println(chA);
        System.out.println(codA);

        //int - float
        int numarInt2 = 123456789;
        float numarFloat2 = numarInt2;
        System.out.println(numarInt2);
        System.out.println(numarFloat2);  // notatie stiintifica
        System.out.printf("%.2f", numarFloat2);
        System.out.println("\n");

        //long  - float
        long numarLong2 = 123456789L;
        float numarFloat3 = numarLong2;
        System.out.println(numarLong2);
        System.out.println(numarFloat3);  // notatie stiintifica
        System.out.printf("%.2f", numarFloat3);
        System.out.println("\n");

        //rezolvarea:  sa avem o variabila de tip double, si nu una de tip float
        float numarDouble2 = numarLong2;
        System.out.println(numarLong2);
        System.out.println(numarDouble2);  // notatie stiintifica
        System.out.printf("%.2f", numarFloat3);
        System.out.println("\n");

        //long  ->  double
        long numarLong3 = 1234567890123456789L;
        double numarDouble3 = numarLong3;
        System.out.println(numarLong3);
        System.out.println(numarDouble3);
        System.out.printf("%.2f", numarDouble3);

        System.out.println("\n\nConversii explicite (cast):");

        //int -> byte   (-128 -> 127)
        int numarInt3 = 200;
        byte numarByte2 = (byte) numarInt3;
        System.out.println(numarByte2);

        //200 - 128 = 72
        //72 - 128= -56

        // long ->int
        long numarLong4 = 123456789L;
        int numarInt4 = (int) numarLong4;
        System.out.println(numarInt4);

        //float -> long
        float numarFloat4 = 3.14F;
        long numarLong5 = (long) numarFloat4;
        System.out.println(numarLong5);

        //double -> float
        double numarDouble4 = 3.1445678945D;
        float numarFloat5 = (float) numarDouble4;
        System.out.println(numarFloat5);

        //char -> byte
        char ch1 = 200;
        System.out.println(ch1);
        byte numarByte3 = (byte) ch1;
        System.out.println(numarByte3);
    }
}
