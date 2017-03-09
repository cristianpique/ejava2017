package com.company;

import java.util.Scanner;

public class E5D {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print(" \n Introdueixi costat del quadrat: ");
        float cq=s.nextFloat();

        System.out.print("\n Perimetre: "+4*cq);
        System.out.print(" metres\n");
        System.out.print("\n Area: "+cq*cq);
        System.out.println(" metres cuadrats");
    }
}