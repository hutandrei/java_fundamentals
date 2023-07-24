package com.sda.operators;

public class Main {
    public static void main(String[] args) {
        //1. Operatori unari  (1 operand)   operatorul + numele/valoarea variabilei
        System.out.println(+7);
        System.out.println(7);
        System.out.println(-7);

        int negativeNumber = -2;
        System.out.println(+negativeNumber);  // +(-2)= -2
        System.out.println(-negativeNumber);  // -(-2)= +2
        int positiveNumber = 2;
        System.out.println(-positiveNumber);

        boolean javaIsFun = false;     //!false = true;  true! = false
        System.out.println(!javaIsFun);

        int number = 6;
        //pre-incrementare
        System.out.println("Pre-incrementare " + ++number); //7
        //pre-decrementare
        System.out.println("Pre-decrementare " + --number); //6

        //post-incrementare
        System.out.println("Post-incrementare " + number++);  //6
        System.out.println("Dupa post-incrementare " + number);    //7

        //post-decrementare - nuamrul nostru este 7
        System.out.println("Post-decrementare " + number--);  //7
        System.out.println("Post-decrementare " + number);  //6

        //2. Operatori binari (2 operanzi)
        //aritmetici
        System.out.println(1 + 2);
        System.out.println(1 + 2 - 3);
        System.out.println(1 + 2 * 2 / 4 + 10);  //12
        System.out.println(12 % 2);  // % - restul impartirii
        System.out.println(12 % 5);
        // verificare numar par :  numar%2 = 0
        System.out.println(3.14F % 2);
        System.out.println((1 + 2 * 2 / 4 + 10) % 2);
        System.out.println(1 + 2 * 2 / 4 + 10 % 2);  // 2 + 10%2

        //operatori de atribuire
        int num = 10;
        //++num;
        //num = num + 1;
        num += 1; //folosind operatorul de atribuire  +=
        System.out.println(num);
        num -= 1; //folosind operatorul de atribuire  +=
        System.out.println(num);
        num *= 2; //folosind operatorul de atribuire  +=
        System.out.println(num);
        num /= 5; //folosind operatorul de atribuire  +=
        System.out.println(num);
        num %= 2;
        System.out.println(num);

        //operatori de comparatie  <=, >=   ==  !=
        float temperature = 25.7F;
        int stdTemperature = 22;
        boolean isHotOutside = temperature > stdTemperature;
        System.out.println(isHotOutside);

        char chA = 'A';  //65
        boolean isSmallerThan60 = chA < 60;
        System.out.println(isSmallerThan60);

        int number100 = 100;
        boolean isEqualTo100 = number100 == 100;
        System.out.println(isEqualTo100);

        // temperature = 0;
        boolean isNotEqualto0 = temperature != 0;
        System.out.println(isNotEqualto0);

        //Operatori logici
        //&& - si;   || - sau;  - negatie;
        int number1 = 12;
        boolean isBetween100And500 = number1 >= 100 && number1 <= 500;
        System.out.println("Is " + number1 + " bigger than 100 and smaller than 500? " + isBetween100And500);


        boolean isBiggerThan100AndSmallerThan500 = number1 >= 100 || number1 <= 500;
        System.out.println("Is " + number1 + " bigger than 100 or smaller than 500? " + isBiggerThan100AndSmallerThan500);

        //operatori pe biti
        // & | ^

        System.out.println(10 & 12);

        //binar - in baza 2 - secvente de 0 si 1
        //10 / 2 = 5 rest 0
        //5 / 2 = 2 rest 1
        //2 / 2 = 1 rest 0
        //1 / 2 = 0 rest 1
        //10 in binar = 1010

        //2^3 2^2 2^1 2^0    (daca nr e >15 adaugam si 2^4)
        // 8   4   2   1
        // 1   0   1   0  -> 10
        //1*2^3 + 0*2^2 + 1*2^1 + 0*2^0 = 1*8 + 0*4 + 1*2 + 0*1 = 8 + 2 = 10

        // 12
        //2^3 2^2 2^1 2^0
        // 8   4   2   1
        // 1   1   0   0    -> 12 in binar = 1100

        //1010
        //1100
        //---- (&)
        //1000  = 8 in baza 10

        System.out.println(10 | 12);
        //1010
        //1100
        //---- (&)
        //1110  = 8 in baza 10

       //complementul  ~
        System.out.println(~10);  // -11
        // ~n = -(n+1)

        //operatorul de shift <<
        int number2 = 2;
        // 2 = 0010 (binar)
        System.out.println(number2 <<2);
        // 0010 -> 001000 = 1000 = 8

        System.out.println(number2 >>2);
        // 0010 -> 000010 = 0000 = 0

        //Operatorul ternar
        //intrerupatorul de la bec
        boolean intrerupator = true;
        char esteAprins = intrerupator ? 'T' : 'F';
        System.out.println(esteAprins);

        double temperature2 = 20.5;
        String weather = (temperature2 >= 22) ? "Afara este cald" : "Afara este frig";
        System.out.println(weather);

    }
}