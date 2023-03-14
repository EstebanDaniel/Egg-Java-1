
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia4ej1 {

    
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese numero para saber si es par o no");
          int num = leer.nextInt();
          
          if (num % 2 == 0){    
              System.out.println("el numero es par");
          
          } else { 
              System.out.println("el numero es impar");
          }
          
    }
    
}
