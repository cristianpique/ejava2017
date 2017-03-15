package com.company;

import java.util.Scanner;

class Taules{

    void introduirMultiple(){

        Scanner s = new Scanner(System.in);

        System.out.print("\n Introdueix numero: ");

        int multiple = s.nextInt();

        System.out.print("\n Taula del: "+multiple);
        System.out.println("");

        for (int i=1;i<=10;i++){

            System.out.print("\n "+multiple);
            System.out.print(" * ");
            System.out.print(""+i);
            System.out.print(" = ");
            System.out.println(+multiple*+i);
        }
    }
}

public class E10A {

    public static void main(String[]args){

        Taules t = new Taules();

        t.introduirMultiple();
    }
}
