package com.company;

class Cuadrat{

    public static final int cc = 3;

    void MostrarPerimetre(){

        System.out.print("\n Perimetre: "+cc*4);
        System.out.print(" metres\n\n");
    }

    void MostrarArea(){

        System.out.print(" Area: "+cc*cc);
        System.out.print(" metres cuadrats");
    }


}

public class E5A {

    public static void main(String[] args) {

        Cuadrat c = new Cuadrat();

        c.MostrarPerimetre();
        c.MostrarArea();

    }
}
