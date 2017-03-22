package com.company;

import java.util.Scanner;

class Arrayamida {

    int[] gestionarArray() {

        Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueix tamany array: ");
        int tamanyarray = s.nextInt();
        int[] array = new int[tamanyarray];

        for (int i = 1; i < array.length; i++) {

            array[i] = i;
        }

        return array;
    }
}

public class E11E {

    public static void main(String[] args) {

        Arrayamida aam = new Arrayamida();

        aam.gestionarArray();
    }

}
