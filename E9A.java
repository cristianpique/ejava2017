package com.company;

class Numeros{

    void generarMultiples(){

        for(int i=6;i<=150;i=i+6){

            System.out.print("\n"+i);
            System.out.print("\n");

        }
    }

}

public class E9A {

    public static void main(String [] args){

        Numeros n = new Numeros();

        n.generarMultiples();

    }
}