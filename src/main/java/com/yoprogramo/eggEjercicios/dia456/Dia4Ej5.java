
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia4Ej5 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese limite positivo");
            int limite = leer.nextInt();
            int suma = 0;
        do {
            System.out.println("ingrese numeros para acumular");
            int num = leer.nextInt();
            suma += num;
            System.out.println("numero actual: "+ suma);
           
             } while(limite > suma);
               
        }
    
}

