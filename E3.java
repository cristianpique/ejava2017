package com.company;


public class E3 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        if(a < b){
            System.out.println("A");
        }

        if(a > b || b < c){
            System.out.println("B");
        }

        if(a < b && b > c){
            System.out.println("C");
        }

        if((a > b && b > c) || (a < c && b > c)){
            System.out.println("D");
            if(a == b){
                System.out.println("E");
            }
        }else{
            System.out.println("F");
            if(a > c){
                System.out.println("G");
            } else {
                System.out.println("H");
            }
        }

        if(a + b > c){
            System.out.println("I");
        }else if (b > c){
            System.out.println("J");
        }else{
            System.out.println("K");
        }
    }
}

// La sortida d'aquest programa es ABFHK