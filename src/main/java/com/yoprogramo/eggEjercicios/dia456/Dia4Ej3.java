
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia4Ej3 {

   
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese una frase a validar");
          String palabra = leer.nextLine();
          
          if (palabra.length() <= 8){
              System.out.println("Correcto!");
          }else{
              System.out.println("Incorrecto!");
          }
            
    }
    
}
