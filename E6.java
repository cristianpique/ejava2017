
package com.company;

import java.util.Scanner;

/* Programa 1 */

public class E6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Resolució de l'equació ax + b = 0");

        System.out.println("Valor de a:");
        float a = scanner.nextFloat();

        System.out.println("Valor de b:");
        float b = scanner.nextFloat();

        if (a != 0) {
            float x = -b / a;
            System.out.println("Solució: " + x);
        }

        if (a == 0) {
            System.out.println("L'equació no té solució.");
        }

 /* La linea 23 no es correcta, ja que la linia escrita vol dir que a la variable a se li asigna el valor de 0. Es detecta un error, perque el que s'ha de fer, es comparar amb dos iguals, si el valor de la variable a es igual a 0 y no, asignar a la variable a, que es de tipus float, el valor 0, que aqui es de tipus boolea. Al ser de tipus diferents, no es pot realitzar */

  /* Programa 2 */

 System.out.println("Resolució de l'equació ax + b = 0");

 System.out.println("Valor de a:");

 System.out.println("Valor de b:");

 if(a !=0) {

     float x = -b / a;

     System.out.println("Solució: " + x);
 }

 System.out.println("L'equació no té solució.");

     /* Els missatges que es mostren per pantalla, no son correctes, ja que si es compleix el if, el programa dona la solucio de la equacio y a continuacio, diu que no te solucio. La qual cosa no te sentit */


    /* Programa 3 */

            System.out.println("Resolució de l'equació ax + b = 0");

            System.out.println("Valor de a:");

            System.out.println("Valor de b:");

            if(a != 0){
                float x = -b/a;
                System.out.println("Solució: " + x);
                return;
            }

            System.out.println("L'equació no té solució.");

             /* Aquesta solucio es correcta */
        }
    }