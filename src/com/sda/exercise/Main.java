package com.sda.exercise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean prim = false;
        int low = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceti un numar: ");
        int numar = scanner.nextInt();

        for (int i = 2; i <= numar / 2; i++) {
            if (numar % i == 0) {
                prim = true;
                break;
            }
        }

        if (!prim) {
            System.out.println("Numarul " + numar + " este prim.");
            System.out.println("\nDoriti afisarea tututor numerelor prime mai mici ca " + numar + " ?");
            String answer = scanner.next();

            if (answer.equals("da")) {  //|| answer == "Da" || answer =="DA"
                System.out.println("Numerele prime mai mici ca "+ numar+ " sunt: ");
                System.out.print("1 2 ");

                while (low <= numar) {

                    boolean flag = false;
                    for (int i = 2; i <= low / 2; ++i) {
                        if (low % i == 0) { // conditia de nr pri
                            flag = true;
                            break;
                        }
                    }
                    if (!flag && low != 0 && low != 1)
                        System.out.print(low + " ");
                    low++;
                }
            }

        } else {
                System.out.println("Numarul " + numar + " nu este prim");
        }
    }
}
