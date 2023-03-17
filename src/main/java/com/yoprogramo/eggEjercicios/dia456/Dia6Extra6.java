//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
//debajo de 1.60 mts. y el promedio de estaturas en general. 
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia6Extra6 {

    public static void main(String[] args) {

        double alturaMenor = 0;
        double alturaNormal = 0;
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas a medir");
        int personas = leer.nextInt();
        int cantidad = personas;

        do {

            System.out.println("ingrese altura de personas");
            double altura = leer.nextDouble();

            alturaNormal += altura;

            if (altura < 1.60) {

                alturaMenor += altura;
                cont += 1;
            }

            cantidad--;
        } while (cantidad > 0);

        System.out.println(alturaNormal);
        System.out.println(personas);

        double promedioGeneral = alturaNormal / personas;
        double promedioMenor = alturaMenor / cont;

        System.out.println("el promedio general de altura de las " + personas + " personas es: " + promedioGeneral);
        System.out.println("el promedio general de altura de las " + cont + " personas menor a 1.60 es: " + promedioMenor);
    }

}
