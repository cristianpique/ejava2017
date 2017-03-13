package com.company;

import java.util.Scanner;

class Multiples{

    void calcularMultiples(){

        Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueixi nombre a calcular multiples: ");
        int multiplevalor=s.nextInt();
        System.out.print("\n Introdueixi multiple inicial: ");
        int multipleinicial=s.nextInt();
        System.out.print("\n Introdueixi multiple final: ");
        int multiplefinal=s.nextInt();

        for(int i=multipleinicial;i<=multiplefinal;i=i+multiplevalor){

            System.out.print("\n"+i);
            System.out.print("\n");
        }
    }
}

public class E9B {

    public static void main(String[]args){

        Multiples m = new Multiples();

        m.calcularMultiples();
    }
}