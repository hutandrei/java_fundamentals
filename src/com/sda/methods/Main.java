package com.sda.methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 5.5;

        double sum1 = a+b;

        int c=2;
        //double sum2=sum1+c;

        System.out.println(sumaNumerelor(c, sum1));
        System.out.println(sumaNumerelor(c,sumaNumerelor(a,b)));  //apelam metoda succesiv

        String java = "Java";
        afisareMesaj(java);
        System.out.println(sumaNumerelor(a, 1,c));
        System.out.println(sumaNumerelor(a, c));
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti temperatura: ");
        double temp = scanner.nextDouble();
        System.out.println(eFoarteCaldAfara(temp));
        boolean isHot = eFoarteCaldAfara(temp);
        if (isHot){
            System.out.println("E foarte cald afara.");
        }
        else {
            System.out.println("Afara este bine.");
        }
        scanner.close();
        int s=0;
        for (int i = 0; i < 5; i++){
            s += sumaNumerelor(i, i+1);
        }
        System.out.println(s);
        System.out.println(sumaVarargs(1,2));
        System.out.println(sumaVarargs());
        System.out.println(sumaVarargs(a,5,3.3,7));
        System.out.println(medie("hello",5, 7));
        System.out.println(sumaInterval(1,5));

    }
    static double sumaNumerelor(int x, double y) {
        //double s = x + y;
        //return s;
        return x + y;
    }

    static void afisareMesaj(String s){  // parametru s
        System.out.println("Hello from method, "  +s +"!");
    }

    static double sumaNumerelor(int x, int y, int z) {
        return x + y + z;
    }

    static int sumaNumerelor(int x, int y){
        return x + y;
    }

    static boolean eFoarteCaldAfara(double temperatura) {
        if (temperatura>30) {
            return true;  //se returneaza, se termian metoda
        }
        else return false;
    }

    static double sumaVarargs(double... numere) { //echivalent cu un double[] numere;
        double rezultat = 0;
        for (double nr:
                    numere){
            rezultat += nr;
        }
        return rezultat;
    }

    static double medie(String mesaj, double... numere) {
        return sumaVarargs(numere) / numere.length;
    }

    static double sumaInterval(int nrMin, int nrMax) {
        double rezultat  =0;
        for (int i=nrMin; i<=nrMax; i++) {
            rezultat += i;
        }
        return rezultat;
    }
}
