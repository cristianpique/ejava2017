package com.company;

import java.util.Scanner;

import static com.company.Triangle.altura;
import static com.company.Triangle.base;

class Triangles{

    float introduirBase(){

        Scanner s = new Scanner(System.in);

        float base=s.nextFloat();

        return base;
    }

    float introduirAltura(){

        Scanner s = new Scanner(System.in);

        float altura=s.nextFloat();

        return altura;
    }

    float calcularArea(){

        float factor =2;

        float area=base*altura/factor;

        return area;
    }
}

public class E5F {

    public static void main(String [] args){

        Triangles tr = new Triangles();

        System.out.println("Introdueix base triangle: ");
        tr.introduirBase();
        System.out.println("Introdueix altura triangle: ");
        tr.introduirAltura();
        System.out.println("L'area del triangle es de: "+tr.calcularArea());
        System.out.println("metres cuadrats");

    }
}
