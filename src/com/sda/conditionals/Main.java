package com.sda.conditionals;

public class Main {
    public static void main(String[] args) {
        //if
        /*
        if (conditie) {
            //instructiuni daca este adevarata conditia
        }
        else {
            //instructiuni daca conditia este falsa
        }
        */
        //1.


        double temperature = 20;
        if (temperature >= 22) {
            System.out.println("Afara este cald");
        } 
        else if (temperature >= 14) {
            System.out.println("Afara este potrivit");
        }
        else if (temperature>=0) {
            System.out.println("Afara este frig");
        }
        else {
        System.out.println("Afara este foarte frig, cu temperaturi negative");
        }

        System.out.println("Iesim afara");

        //switch
        /*
        int temperature1 = 20;
        switch (temperature1) {
            case 22:
                System.out.println("Afara este cald");
            case 0:
                System.out.println("Afara este frig");
        }
         */

        int zi = 4;
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Zi invalida");
        }
///////////////////////Zar prim sau compus////////////////////////////////////////////////
        int zar = 5;

        if (zar<3){
            System.out.println("You are the winner!");
        }
        else if(zar%2==0) {
            System.out.println("Valoare Invalida");
            }
        else {
            System.out.println("You are the winner!");
        }

        String estePrim = (zar%2==0 && zar>3) ? "Valoare Invalida" : "You are the winner!";
        System.out.println(estePrim);

//////////////////////Nr par sau impar//////////////////////////////
        int nr=10233;
        switch (nr%2){
            case 0:
                System.out.println("Numarul este par");
                break;
            case 1:
                System.out.println("Numarul este impar");
        }
    }
}