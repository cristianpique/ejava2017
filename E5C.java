package com.company;

class Rectangle{

    final int ca = 4;
    final int cb = 6;
    final int factor=2;

    int calculPerimetre(){

        return factor*ca + factor*cb;
    }

    int calculArea(){

        return ca*cb;
    }


}

public class E5C {

    public static void main(String[]args){

        Rectangle r = new Rectangle();

        System.out.println("Perimetre : " + r.calculPerimetre() + " metres");
        System.out.println("Area: "+r.calculArea());

    }
}
