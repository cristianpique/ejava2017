package com.company;

import java.util.Scanner;

class arrays{

    int[] declararArray(){

        int [] arrayqualsevol = new int[10];

        return arrayqualsevol;
    }

    void introduirArray() {

        for (int i = 0; i < declararArray().length; i++) {

            Scanner s = new Scanner(System.in);

            System.out.print("\n Introdueix valor posicio " + i);
            System.out.print(" : ");

            int valorarray = s.nextInt();

            declararArray()[i] = valorarray;

            if (declararArray()[i] < 0) {

                declararArray()[i] = 0;
            }

            System.out.print("\n " + declararArray()[i]);
            System.out.println("\n");
        }

    }
}

public class E11C {

    public static void main(String[] args){

        arrays a = new arrays();

        a.declararArray();
        a.introduirArray();


    }

}