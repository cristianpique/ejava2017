package com.company;

public class E9D {

    public static void main(String[]args){

        /* Programa 1 */

        int sumatori = 0;
        int i = 1;
        while( i <= 1000 ){
            sumatori += i;
            i += 1;
        }
        System.out.println(sumatori);

        /* Programa 2 */

        sumatori = 0;
        i = 0;
        while( i < 1000 ){
            i += 1;
            sumatori += i;
        }
        System.out.println(sumatori);

    }
}

/* La diferencia entre els dos programes. Es que al primer programa, la i s'inicialitza a 1 y el bucle while va desde que la i val 1 fins a que la i val menys o igual que mil i a l'hora d'incrementar el comptador, la variable sumatori va guardant el valor per cada execucio y la i, va incrementant el numero de vegades que s'executa el bucle

   Mentre que en el segon programa, va a l'inreves, la i s'inicialitza a zero, i va desde 0 fins que i sigui menor que mil y tambe, guarda el valor per cada execucio i sumatori, incrementa el numero de vegades que s'executa el bucle. A pesar de tot aixo, els dos donen el mateix resultat.

 */