package com.sda.loops;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numar =10;
        int i;
        System.out.println("\nFor");
        //for
        for (i=1; i <= numar; i++){
            System.out.print(i+" ");
        }

        //while
        i= 1;
        System.out.println("\nWhile");
        while (i <= numar) {
            System.out.print(i+ " ");
            i++;
        }

        //do while
        System.out.println("\nDO While: ");
        i=1;
        do {
            System.out.print(i+ " ");
            i++;  //12
        } while(i <= numar);  //? 12 <= 10

        // for
        for (int j=numar; j>0; j--) {
            System.out.print(j + " ");
        }

        //while
        System.out.println("\nWhile :");
        int j=numar;
        while (j>0){
            System.out.print(j + " ");
            j--;
        }

        //do while
        System.out.println("\nDO While: ");
        j=numar;
        do {
            System.out.print(j+ " ");
            j--;  //12
        } while(j > 0);  //? 12 <= 10

        //afisati toate nr. divizibile cu 3 dintr-un interval

        int minNumber = 1;
        int maxNumber = 100;

        //for
        System.out.println("\nFOR divizibile cu 3:");
        for (i =minNumber; i<= maxNumber; i++) {
            if (i % 3 == 0) { //nr este divizibil
                System.out.print(i + " ");
            }
        }

        System.out.println("\nWHILE divizibile cu 3:");
        i=minNumber;
        while (i<=maxNumber) {
            if (i % 3 == 0) { //numarul este divizibil cu 3
                System.out.print(i + " ");
            }
            i++;
        }

        //do while
        System.out.println("\nDO While: ");
        i=minNumber;
        do {
            if (i % 3 == 0) { //numarul este divizibil cu 3
                System.out.print(i + " ");
            }
            i++;
        }    while(i <= maxNumber);  //? 12 <= 10

        //break
        // sa extragem primul nr divizibil cu 5 dintr-un interval
        System.out.println("\nBREAK: ");
        int nr=0;
        for (int k = minNumber; k<= maxNumber; k++){
            if (k % 5 ==0) {
                //System.out.println(k+" ");
                nr=k;
                break;
            }
        }
        System.out.println(nr);

        //continue
        //sa afisam toate numerele cu exceptia celor divizibile cu 5 dintr-un interval
        System.out.println("\nCONTINUE:");
        for (int l = minNumber; l <= maxNumber; l++) {
            if (l % 5 ==0) {
                continue;
            }
            System.out.print(l+" ");
        }
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nIntroduceti valoarea: ");
            int numarCitit = scanner.nextInt();
            System.out.print("\nIntroduceti valoarea cu zecimale: ");
            Double numarCitit2 = scanner.nextDouble();

            System.out.print("\nIntrodcueti textul: ");
            String textCitit = scanner.next();

            scanner.close();

            System.out.println("Numarul este: " + numarCitit + "\nNumarcul cu zecimale: " + numarCitit2 + "\nTextul:" + textCitit);


            //exercitiu Indtroducer nr. Este acel nr prim plus afisare toate nr in intervalul 1 si nr. dat
    }
}
