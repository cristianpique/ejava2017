package com.company;

import java.util.Scanner;

class NombresRepetits2{

    void introduirNombres(){

        Scanner s = new Scanner(System.in);

        while(true) {

            System.out.print(" \n Introduir numero: ");

            int numero = s.nextInt();

            if (numero > 0) {

                System.out.print(" \n " + numero);
                System.out.print(" \n");
            }

            if (numero < 0) {

                System.out.print("\n ¡¡¡ Numero Negatiu Introduit. El programa s'ha acabat !!! \n");

                return;
            }

        }
    }

}

public class E9G {

    public static void main(String[] args) {

        NombresRepetits2 nr2 = new NombresRepetits2();

        nr2.introduirNombres();

    }

}