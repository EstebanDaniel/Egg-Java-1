//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se
//solicitará al principio del programa y los números serán introducidos
//por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”. 
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia6Extra7 {

    public static void main(String[] args) {

        int numero;
        int max = 0;
        int min = 0;
        int suma = 0;
        boolean bandera = true;
        double promedio;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de n");
        int n = leer.nextInt();
        int cont = n;
        while (cont > 0) {

            System.out.println("ingrese valores");
            numero = leer.nextInt();

            suma += numero;

            if (bandera == true) {

                max = numero;
                min = numero;
                bandera = false;
            }

            if (numero > max) {

                max = numero;
            } else if (numero < min) {

                min = numero;

            }

            cont--;
        }

        promedio = suma / n;
        System.out.println("el promedio de los numeros ingresados es: " + promedio);
        System.out.println("el maximo es: " + max);
        System.out.println("el minimo es: " + min);

    }

}
