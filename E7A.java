package com.company;

import java.util.Scanner;

class LectorDeNumeros {

    void leerNumeroFlotant(){

        Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueix un numero flotant: ");

        Double numero = s.nextDouble();

        if(numero<0){

            System.out.print("\n ¡¡¡ El numero es negatiu !!!\n");
        }
    }
}

public class E7A {

    public static void main(String[]args){

        LectorDeNumeros lector = new LectorDeNumeros();

        lector.leerNumeroFlotant();
    }
}