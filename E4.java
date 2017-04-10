package com.company;

public class E4 {

    public static void main(String[]args){

        int a = 1;
        int b;
        int c;

        if(a + 2 == 3){
            a=4;
        }

        b = a;

        if(a + b > 2){
            c = a + b;
            c = c * 2;
        }

        c = 0;
        b += c + a;
        a *= 2;
        b = a + c;
        c = b + 1;

        if(c > 8){
            c = a + b * c;
        }

        if(c / 10 == a && a - b == 0){
            c = c / b / a;
            b = b / a;
        }

        for(a=0; a<9; a++){
            b = a + b + c;
        }

        System.out.println(a + " " + b + " " + c);

            }
        }

/* linea 4 ---> a vale 1

linea 5 ----> declaramos b

linea 6 ----> declaramos c

linea 7 ----> a vale 1

linea 8 ----> a vale 4 (debido al cumplimiento del if anterior)

linea 10 ----> b toma el valor de a, es decir, 4

linea 11 ----> a i b, valen 4 cada uno

linea 12 -----> c vale 8 (c toma el valor de a+b, es decir de 4+4 que son 8)

linea 13 -----> c vale 16 (se obtiene de multiplicar 8*2, 8 es el valor que en ese momento tiene c,el qual lo multiplicamos por 2)

linea 15 -----> c pasa a valer 0, porque se le asigna ese valor "manualmente"

linea 16 ------> b pasa a valer 8 (debido a que el valor de b hasta ese momento es 4 y con el operador += se suma y se asigna ese valor al resultado de c+a, que es 4, debido a la suma del valor c, que es 0 y del valor a que es 4 )

linea 17 ------> a pasa a valer 8 (debido a que hasta ese momento, a valia 4, pero con el operador *=, multiplicamos y asignamos, y entonces el valor de a, que es 4, se multiplica por 2 y se hace la multiplicacion)

linea 18 ------> b pasa a valer 8 (debido a que el valor de a hasta el momento es 8 y el de c es 0, por lo tanto se queda en 8+0=8)

linea 19 ------> c pasa a valer 9 (debido a que b vale 8, del resultado de la operacion anterior y a este se le suma 1)

linea 20 ------> c sigue valiendo 9 (debido a que su valor no a cambiado todavia)

linea 21 ------> c toma el valor de 80 (debido a que le asignamos el resultado de la operacion a+b*c, es decir, 8+8*9, teniendo en cuenta que primero va la multiplicacion y luego la suma)

linea 23 ------> en la parte izquierda del if c vale 80, que dividido entre 10, es 8, lo que hace que esta parte se cumpla y en la parte derecha, a vale 8, el valor no ha cambiado aun y b, tambien vale 8, por lo que el resultado es 0, asi que se cumplen las dos partes y se realiza lo indicado en el if

linea 24 ------> c pasa a valer 1.25, debido a que 80, que es el valor anterior de c, se divide entre 8 y entre 8, que es el valor de a y b, anteriormente

linea 25 ------> b pasa a valer 1, ya que b y a valen los dos 8, como anteriormente y al dividir 8 entre 8, queda 1

linea 27 ------> la a te un valor de entre 0 y 9, despres de cada execucio del bucle for (per cada vegada que s'executa el for, el valor de la a va aumentant, començant al 0 y acabant al 9)

linea 28 ------> la b pren els seguents valors, en cada execucio del for : 2,4,7,11,16,22,29,37,46

linea 30 ------> a vale 9, b vale 46 y c vale 1 */