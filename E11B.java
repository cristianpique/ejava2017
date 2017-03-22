package com.company;

class arrayNumerosQuadrat{

    int [] declararArray(){

        int [] arraysvaris = {0,1,1,2,3,5,8};

        return arraysvaris;
    }

    void recorrerArray(){

        for (int i=0;i<declararArray().length;i++){

            System.out.print("\n");
            System.out.println(declararArray()[i]=declararArray()[i]*declararArray()[i]);
        }
    }
}

public class E11B {

    public static void main(String[]args){

        arrayNumerosQuadrat anq = new arrayNumerosQuadrat();

        anq.declararArray();
        anq.recorrerArray();
    }
}
