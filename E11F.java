package com.company;

import java.util.Scanner;

class Arraysvaris{

    int [] gestioArrays() {

        Scanner s = new Scanner(System.in);

        int[] array10 = new int[10];

        for (int i = 0; i < array10.length; i++) {

            System.out.print("\n Intro valor posicio array : ");

            int valorposicioarray = s.nextInt();

            if (valorposicioarray > 0) {

                array10[i] = valorposicioarray;

            } else {

                System.out.println("\n ¡¡¡ Error. Numero Negatiu Introduit. Torna a intentar-ho !!! ");
            }
        }

        return array10;
    }
}

public class E11F {

    public static void main(String[]args){

        Arraysvaris av = new Arraysvaris();

        av.gestioArrays();
    }

    }