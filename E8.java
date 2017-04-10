package com.company;

import java.util.Scanner;

public class E8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Programa 1 */

        System.out.println("Radi del cercle:");
        double radi = sc.nextFloat();
        sc.nextLine();

        System.out.println("a) Calcular diàmetre");
        System.out.println("b) Calcular perímetre");
        System.out.println("c) Calcular àrea");
        System.out.println("Opció:");

        String opcio = sc.nextLine();
        if (opcio == "a") {
            double diametre = 2 * radi;
            System.out.println("Diàmetre: " + diametre);
        }

        if (opcio == "b") {
            double perimetre = 2 * Math.PI * radi;
            System.out.println("Perímetre: " + perimetre);
        }

        if (opcio == "c") {
            double area = Math.PI * Math.pow(radi, 2);
            System.out.println("Àrea: " + area);
        }

/* L'error que s'esta cometenent en comparar la variable opcio, es que per comparar strings, s'han d'utilitzar cometes y el nostre amic, no les ha utilitzat */

/* S'estan fent comprovacions innecesaries, ja que els tres if, es podrien juntar en un unic if y amb else if o else, realitzar la resta de comprobacions */

        /* Programa 2 */


        System.out.println("Radi del cercle:");
        sc.nextLine();

        System.out.println("a) Calcular diàmetre");
        System.out.println("b) Calcular perímetre");
        System.out.println("c) Calcular àrea");
        System.out.println("Opció:");

        opcio = sc.nextLine();
        if (opcio.equals("a"))

        {
            double diametre = 2 * radi;
            System.out.println("Diàmetre: " + diametre);
        } else

        {
            if (opcio == "b") {
                double perimetre = 2 * Math.PI * radi;
                System.out.println("Perímetre: " + perimetre);
            } else {
                if (opcio == "c") {
                    double area = Math.PI * Math.pow(radi, 2);
                    System.out.println("Àrea: " + area);
                }
            }
        }

/* El programa ara esta una mica mes optimitzat perque enlloc de comparar l'string amb doble igual, el compara utilitzant el metdode.equals y les tres comprobacions anteriors, que es feien en tres if separats, ara es fan amb un sol if y amb else if */

        /* Programa 3 */

        sc = new Scanner(System.in);

        System.out.println("a) Calcular diàmetre");
        System.out.println("b) Calcular perímetre");
        System.out.println("c) Calcular àrea");
        System.out.println("Opció:");

        opcio = sc.nextLine();

        switch (opcio) {

            case "a":
                System.out.println("Radi del cercle:");
                radi = sc.nextFloat();
                double diametre = 2 * radi;
                System.out.println("Diàmetre: " + diametre);
                break;

            case "b":
                System.out.println("Radi del cercle:");
                radi = sc.nextFloat();
                double perimetre = 2 * Math.PI * radi;
                System.out.println("Perímetre: " + perimetre);
                break;

            case "c":
                System.out.println("Radi del cercle:");
                radi = sc.nextFloat();
                double area = Math.PI * Math.pow(radi, 2);
                System.out.println("Àrea: " + area);
                break;
        }

    }

}

  /* El programa continua sent correcte, perque el codi esta be, l'unic problema que hi ha es que hi habia claus innecesaries, com per exemple la clau de l'else */