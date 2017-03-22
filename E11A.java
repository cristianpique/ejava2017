package com.company;

class arrayNumeros{

    int[] declararArray(){

        int [] numeros = {1,2,3,4};

        return numeros;
    }

    void recorrerArray(){

        for (int i=0;i<declararArray().length;i++){

            System.out.print("\n"+declararArray()[i]);
            System.out.print("\n");
        }
    }
}

public class E11A {

    public static void main(String[] args){

        arrayNumeros an = new arrayNumeros();

        an.declararArray();
        an.recorrerArray();

    }
}
