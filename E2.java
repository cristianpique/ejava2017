package com.company;

public class E2 {

    public static void main(String[] args){

        int a=0;

        if(a==0){
            if(a==10){
                int b=10;
                System.out.println("A");
            }
            else{
                String nom = "Josep";
                System.out.println("B");
            }
        } else if(a<3){
            for(int b=0; b<10; b++) {
                if(b==0) {
                    System.out.println("C");
                    String curs = "DAM";
                }
            }
        }

        else{
            System.out.println("D");
            while(a<10){
                System.out.println("E");
                a++;
                if(a==9){
                    a++;
                }
            }
            while(a<20){
                if(a==10){
                    System.out.println("F");
                }
                else{
                    switch(a){
                        case 0:
                            System.out.println("G");
                            break;
                        case 1:
                            System.out.println("H");
                            break;
                        default:
                            System.out.println("I");
                    }
                }
            }
        }
    }
}