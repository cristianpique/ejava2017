package com.company;

class Multiples2{

    void introduirMultiples(){

        for (int i=0;i<=200;i=i+2){

            System.out.println("\n "+i);
        }
    }
}

public class E10C {

    public static void main(String [] args){

        Multiples2 m2 = new Multiples2();

        m2.introduirMultiples();
    }
}