package com.sda.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //var.1
        int[] numere1;
        numere1 = new int[4];

        //var2.
        int[] numere = new int[4];

        //var3
        int[] numere2 = {10,20,30,40,50};

        //var4
        int[] numere3 =  new int[]{1,2,3};
        System.out.println(numere2[1]);
        numere[0] = 100;
        numere3[2] = 4;
        //        numere3[2] = 0;  //exception in thread java....error

        //afisare
        System.out.println("Elementele array-ului: ");
        for (int i = 0; i<numere.length; i++) {
            System.out.print(numere1[i] + " ");
        }

        //afosare cu foreach
        System.out.println("Parcurgere cu foreach: ");
        for (int element : numere2) {
            System.out.print(element + " ");
        }

        System.out.println();
        int i=0;
        while (i< numere3.length) {
            System.out.print(numere3[i] + " ");
            i++;
        }

        String[] numePersoane = new String[3];
        numePersoane[0] = "Ion";
        numePersoane[1] = "Ana";
        numePersoane[2] = "Gigel";
        System.out.println("\nString Array: ");
        for (String nume : numePersoane) {
            System.out.print(nume + "; ");
        }

        int lungime;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti lungimea array-ului: ");
        lungime = scanner.nextInt();

        int[] num =  new int[lungime];

        for (int k = 0; k < num.length; k++) {
            System.out.print("\nIntroduceti elememntul de pe pozitia " + k + ":");
            num[k] = scanner.nextInt();
        }
        scanner.close();

        System.out.print("\nArray-ul citit: ");
        for (int element : num) {
            System.out.print(element + " ");
        }

        System.out.println();
        //tablouri bidimensionale
        double[][] matrice = {{10.2, 5.5},{2.2, 15.7, 9.9}};
        //  System.out.println(matrice[0][2]);

        //parcurgerea elementelor:
        for (int a  =0; a< matrice.length; a++) {  //parcurgere linii
            for (int b = 0; b < matrice[a].length; b++) {   //parcurgere coloane
                System.out.print(matrice[a][b] + " ");

            }
            System.out.println();
        }

    }
}
