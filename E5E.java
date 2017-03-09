package com.company;

import java.util.Scanner;

public class E5E {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Introdueix costat 1 rectangle: ");
        float c1 = s.nextFloat();
        System.out.println("\n");
        System.out.print("Introdueix costat 2 rectangle: ");
        float c2 = s.nextFloat();
        System.out.println("\n");
        System.out.print(" Area: "+c1*c2);
        System.out.println("\n");
        float perimetre=2*c1+2*c2;
        System.out.print(" Perimetre: "+perimetre);
        System.out.println("\n");
    }
}