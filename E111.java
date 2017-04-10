package com.company;

import java.util.Scanner;

public class E111 {

    /* Programa 1 */

    public static void main(String[]args){


        int numero = 7; // 4 13 25 2

        boolean crecQueEsPrimer = true;

        for(int divisor=2; divisor<numero; divisor++){
            if(numero%divisor == 0){
                crecQueEsPrimer = false;
            }
        }

        if(crecQueEsPrimer) {
            System.out.println("El número " + numero + " és primer");
        } else {
            System.out.println("El número " + numero + " no és primer");
        }
/* Aquest programa, comproba per als diferents valors introduits manualment a la variable numero, si es un numero primer o no */


/* Programa 2 */

    crecQueEsPrimer = true;

    Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueix numero: ");

        numero=s.nextInt();

    for(int divisor=2; divisor<numero; divisor++){

        if(numero%divisor == 0){

         crecQueEsPrimer = false;
        }
    }

    if(crecQueEsPrimer) {

        System.out.print("\n El número " + numero + " és primer\n");
    }

    else {

        System.out.print("\n El número " + numero + " no és primer\n");

    }

    }
  }


