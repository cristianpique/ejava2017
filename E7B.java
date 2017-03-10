package com.company;

import java.util.Scanner;

class LectorDeNumerosB {

    void leerNumeroFlotant(){

        Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueix un numero flotant: ");

        double numero = s.nextDouble();

        if(numero>=0.0){

            System.out.print("\n ¡¡¡ El numero es positiu !!!\n");
        }
    }
}

public class E7B {

    public static void main(String[]args){

        LectorDeNumerosB lector = new LectorDeNumerosB();

        lector.leerNumeroFlotant();
    }
}