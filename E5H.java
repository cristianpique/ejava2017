package com.company;

import java.util.Scanner;

class Persona{

    void gestionarNom(){

        Scanner s = new Scanner(System.in);

        String nom = s.nextLine();

        System.out.println(nom);
    }
}

public class E5H {

    public static void main(String[]args){

        Persona p = new Persona();

        System.out.print("\n Introdueix el teu nom: ");

        p.gestionarNom();

    }
}