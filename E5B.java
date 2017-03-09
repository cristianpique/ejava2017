package com.company;

class Triangle{

    static final int base = 3;
    static final int altura = 5;

    void CalcularArea(){

        System.out.print("\n Area Triangle: "+base*altura/2);
        System.out.print(" metres cuadrats\n");
    }
}

public class E5B {

    public static void main(String[]args){

        Triangle t = new Triangle();

        t.CalcularArea();
    }
}
