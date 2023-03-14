
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia4Ej4 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase ahora");
        String palabra = leer.nextLine();
        String letra = palabra.substring(0,1);
      
        
        if (letra.equals("A")){
        
            System.out.println("Correcto!");
        }
        else{
            System.out.println("Incorrecto!");
        }
    }
    
}
