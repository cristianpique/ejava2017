package com.company;

public class E11H {

    public static void main(String[]args){

        /* Programa 1 */


        int valor = 5;

        int[] llista = {1,4,5,1,3,8};

        boolean pertany = false;

        for(int i=0; i<llista.length; i++){

            if(valor == llista[i]){
                pertany = true;
                break;
            }
        }

        if(pertany){

            System.out.println("Pertany");
        }

        else{

            System.out.println("No pertany");
        }

/* Programa 2 */


    valor = 5;

    pertany = false;

    for(int i=0; i<llista.length; i++){

        if(valor == llista[i]){

            pertany = true;
        }

        else {

            pertany = false;
        }

    }

        if(pertany){

         System.out.println("Pertany");

        }

        else{

         System.out.println("No pertany");

        }

    }
}

/* La segona versio del programa es erronia, perque falta un break a la variable bandera,

pertany igual a true, per tal de que al comprobar el valor de la bandera, no salti a la resta del programa y l'else

d' abaix es innecesari, perque quan inicialitzem la variable pertany, la inicialitzem com a false.

Per la qual cosa, s'esta comprovant dues vegades si es falsa y l'else, fa que tots els valors que comproba,

surtin com a false. Es a dir, com a que no pertanyen a l'array */
