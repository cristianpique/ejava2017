package com.company;

import java.util.Scanner;

class Prestec{

    float introduirEuros(){

        Scanner s = new Scanner(System.in);

        float quantitat=s.nextFloat();

        return quantitat;
    }

    float introduirInteres(){

        Scanner s = new Scanner(System.in);

        float interes = s.nextFloat();

        return interes;
    }

    int introduirAnys(){

        Scanner s = new Scanner(System.in);

        int temps = s.nextInt();

        return temps;
    }

    float calcularCapital(){

        float capital = introduirEuros()*(1+introduirInteres()/100);
        System.out.println(capital);
        return capital;
    }
}

public class E5G {

    public static void main(String[]args){

        Prestec p = new Prestec();

        System.out.print("\n Introduir €uros: ");
        p.introduirEuros();

        System.out.print("\n Introduir Tasa Interes: ");
        p.introduirInteres();

        System.out.print("\n Introduir Anys Prestec: ");
        p.introduirAnys();

        p.calcularCapital();
    }
}