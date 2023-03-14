
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia4Ej2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("escriba una frase para verificar");
        String palabra = leer.nextLine();
        String palabraClave = "eureka";
        
        if ( palabra.equals(palabraClave)){
            System.out.println("Correcto!!");  
        } else {
        
            System.out.println("Incorrecto!!");
        }
    }
    
}
