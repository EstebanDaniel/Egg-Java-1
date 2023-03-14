package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia4Ej6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese primer numero");
        int num1 = leer.nextInt();
        System.out.println("ingrese segundo numero");
        int num2 = leer.nextInt();
        int suma, resta;
        float dividir;
        int multiplicar;
        String letra = "";

        do {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("ingrese opcion:");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("La resta es: " + resta);
                    break;
                case 3:
                    multiplicar = num1 * num2;
                    System.out.println("El producto es: " + multiplicar);
                    break;
                case 4:
                    dividir = num1 / num2;
                    System.out.println("La division es: " + dividir);
                    break;

                case 5:
                    System.out.println("Seguro desea salir?");
                    letra = leer.next();
                    System.out.println(letra);
                    break;
            }

        } while (!letra.equalsIgnoreCase("S")); //permite comparar strings debido a que no puede 
        //utilizarse el operador ==, ademas ignora upper o lower

    }

}
