package com.company;

class MultiplesPotencia{

    void calcularMultiples(){

        double multipleinicial=Math.pow(2,0);
        double multiplefinal=Math.pow(2,30);

        for(double i=multipleinicial;i<=multiplefinal;i=i+2){

            System.out.print("\n"+i);
            System.out.print("\n");
        }
    }
}

public class E9C {

    public static void main(String[]args){

        MultiplesPotencia mp = new MultiplesPotencia();

        mp.calcularMultiples();
    }
}