package com.sda.oop;

public class Dog {
    // variabilele de instanta  -  starea

    private String nume;
    private String rasa;
    private double marime;
    private String culoare;
    private int varsta;

    public static  boolean isCute = true;

    public static final boolean JUCAUS_TARE = true; // constante
    public static final int MAX_SATISF = 10;  //Constanta
    public Dog(String nume, String rasa, double marime, String culoare, int varsta) {
        this.nume = nume;
        this.rasa = rasa;
        this.marime = marime;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    public Dog(){
        this.nume = "Cutzu";
        this.rasa = "Maidanez";
        this.marime = 3.1;
        this.culoare = "standard";
        this.varsta = 1;
    }
    public Dog(String nume, int varsta) {
        this(nume, "Maidanez", 7.0,"Standard",varsta);
    }




    public void latra() {
        System.out.println(this.nume + " Ham, Ham!"); ///sau simplu:  nume
    }

    public void alearga(){
        System.out.println(nume + " alearga repede");
    }

    public void doarme(){
        System.out.println(nume + " doarme bustean zzz");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public double getMarime() {
        return marime;
    }

    public void setMarime(double marime) {
        this.marime = marime;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        if (varsta < 0 || varsta >25){
            System.out.println("Varsta invalida !");
        }
        else {
            this.varsta = varsta;
        }
    }


    public static void isCute(){
        if (isCute){
            System.out.println("Este foarte dragut");
            isCute=false;
        }
        else {
            System.out.println("Nu e dragut");
            isCute = true;
        }


    }
    @Override
    public String toString() {
        return "Dog{" +
                "nume='" + nume + '\'' +
                ", rasa='" + rasa + '\'' +
                ", marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
