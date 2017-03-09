package com.company;

import java.util.Scanner;

class Persones{

    String demanarNom(){

        Scanner s = new Scanner(System.in);

        String nom = s.nextLine();

        System.out.println(nom);

        return nom;
    }

    void demanarEdat(){

        Scanner s = new Scanner(System.in);

        String edat = s.nextLine();

        System.out.println(edat);
    }
}

public class E5I {

    public static void main(String[] args){

        Persones p = new Persones();

        System.out.print("\n Introdueix Nom: ");
        p.demanarNom();
        System.out.print("\n Introdueix Edat: ");
        p.demanarEdat();
        System.out.print("\n ¡¡¡ Felicitats !!!");
        System.out.println(p.demanarNom());

    }
}
