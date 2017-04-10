package com.company;

import java.util.Scanner;

public class E9E{

    public static void main(String[]args){

        /* Programa 1 */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix un nombre positiu: ");

        double x = scanner.nextDouble();

        while(x < 0) {

            x = scanner.nextDouble();
        }

        System.out.println("L'arrel quadrada de " + x + " és " + Math.sqrt(x));


    /* L'error es que despres de sortir el missatge d'introduir un nombre positiu, no es recull amb un escanner aquest nombre positiu. Per la qual cosa, la variable x que hi ha definida al while d'abaix, a l'escanner de dins del while y al println final, no te cap valor perque no esta inicialitzada */


/* Programa 2 */


    x = -1;

    while(x < 0) {

        System.out.println("Introdueix un nombre positiu: ");

        x = scanner.nextDouble();
    }

    System.out.println("L'arrel quadrada de " + x + " és " + Math.sqrt(x));

    }

}

/* La opcio que hem sembla millor es la 2 perque es la mes curta, aixo vol dir que es la mes eficient perque no repeteix parts innecesaries */