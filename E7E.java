package com.company;

import java.util.Scanner;

public class E7E {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Primer nombre:");
        int n1 = s.nextInt(); s.nextLine();

        System.out.println("Segon nombre:");
        int n2 = s.nextInt(); s.nextLine();

        int maxim=0;
        if(n1 > n2){
            maxim = n1;
        }
        if(n2 > n1){
            maxim = n2;
        }

        System.out.println("El màxim és: " + maxim);
    }
}

/* L'error de compilacio es que la variable maxim no s'ha inicialitzat */

/* Si els dos nombres son iguals, dona 0 perque al ser iguals, no es pot fer el maxim */