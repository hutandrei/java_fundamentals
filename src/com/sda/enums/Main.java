package com.sda.enums;

public class Main   {
    public static void main(String[] args) {
        ZiSaptamana zi = ZiSaptamana.JOI;
        String ziString = zi.toString();
        System.out.println(ziString);
        // switch
        switch (zi) {
            case LUNI:
                System.out.println("Astazi este Luni");
                break;
            case MARTI:
                System.out.println("Astazi este Marti");
                break;
            case MIERCURI:
                System.out.println("Astazi este Miercuri");
                break;
            case JOI:
                System.out.println("Astazi este Joi");
                break;
            case VINERI:
                System.out.println("Astazi este Vineri");
                break;
            case SAMBATA:
                System.out.println("Astazi este Sambata");
                break;
            case DUMINICA:
                System.out.println("Astazi este Duminica");
                break;

        }
    }
}
