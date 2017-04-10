package com.company;

public class E10F {

    public static void main(String[]args){

        /* Programa 1 */

        int sumatori = 0;

        int i=0;

        while(i<1000){

            sumatori += i;

            i++;
        }

        System.out.println(sumatori);

    /* Programa 2 */

    sumatori = 0;

    for( i=0; i<1000; i++){
        sumatori += i;
    }

    System.out.println(sumatori);

    }

  }

  /* La diferencia entre els dos programes, es que el primer no funciona perque la variable sumatori no te declarat el tipus de la variable, per la qual cosa, el programa no funciona. A part, en el primer programa, s'utilitza un bucle while, en el que la variable sumatori, va guardant el valor de la i per cada execucio

     El segon programa, funciona correctament, a diferencia del primer, aquest funciona amb un for de 0 a 1000, en el qual, nomes s'utilitza la variable sumatori per incrementar el bucle y fer el programa, a diferencia del primer programa, que utilitza la variable sumatori y la i. Els dos programes no produeixen el mateix resultat

    */