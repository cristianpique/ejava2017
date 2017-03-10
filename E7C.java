package com.company;

import java.util.Scanner;

class Person{

    void lectorEdades(){

        Scanner s = new Scanner(System.in);
        System.out.print("\n Introdueix edat 1: ");
        int edat1 = s.nextInt();
        System.out.print("\n Introdueix edat 2: ");
        int edat2 = s.nextInt();

        if(edat1>edat2){

            System.out.print("\n La persona mes jove te: "+edat2);
            System.out.print(" anys\n");
        }

        if(edat1<edat2){

            System.out.print("\n La persona mes jove te: "+edat1);
            System.out.print(" anys\n");
        }

        if(edat1==edat2){

            System.out.print("\n ¡¡¡ Error. Les dues persones tenen la mateixa edat, no n'hi ha cap persona mes jove que l'altra !!!\n");
        }
    }
}

public class E7C {

    public static void main(String[]args){

        Person p = new Person();
        p.lectorEdades();
    }
}
