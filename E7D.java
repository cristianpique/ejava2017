package com.company;

import java.util.Scanner;

class Nombres{

    void llegirCaracters(){

        String p1="(";
        String p2=")";

        System.out.print("\n Introdueix un caracter: ");

        Scanner s = new Scanner(System.in);

        String caracter = s.nextLine();

        if (caracter.equals(p1)){

            System.out.print("\n Es parentesi\n");
        }

        if (caracter.equals(p2)){

            System.out.print("\n Es parentesi\n");
        }

    }
}

public class E7D {

    public static void main(String[]args) {

        Nombres n = new Nombres();

        n.llegirCaracters();

    }
}