package com.sda.statics;

import com.sda.oop.Dog;

import static com.sda.oop.Dog.isCute;  //import static
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Main {

    static final int TEMPERATURA_FIERBERE = 100; //constanta si nu se mai poate modifica
    public static void main(String[] args) {
//        Dog.isCute();
//        System.out.println(Dog.isCute);
//        Dog.isCute();
//        System.out.println(Dog.isCute);
//        Dog.isCute();
//        System.out.println(Dog.isCute);
//        Dog.isCute();
//        System.out.println(Dog.isCute);
//        Dog.isCute();
//        System.out.println(Dog.isCute);

        isCute();
        System.out.println(isCute);

        double temp = 35;
        if (temp < TEMPERATURA_FIERBERE) {
            System.out.println("Nu fierbe");
        }
        else {
            System.out.println("Fierbe");
        }

        //aria unui cerc
        //pp * r^2

        double raza = 5.0;
        double aria = PI * pow(raza, 2);
        System.out.printf("Aria cercului cu raza " + raza + " este %.2f ",aria);

        ClasaExterioara exterioara = new ClasaExterioara();
        ClasaExterioara.ClasaImbricata inner = exterioara.new ClasaImbricata();
        inner.afisare();

        //clasa statica
        ClasaExterioara.ClasaStatica clasaStatica= new ClasaExterioara.ClasaStatica();
        clasaStatica.afisare();

        if(Dog.JUCAUS_TARE){
            System.out.println(Dog.MAX_SATISF);
        }


    }

}
