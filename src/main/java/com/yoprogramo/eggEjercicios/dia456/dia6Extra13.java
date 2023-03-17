//13.Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea.
//Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3 1 12 123

package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class dia6Extra13 {

    
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese altura de la escalera");
         int altura = leer.nextInt();
         
         for (int i = 0; i <= altura; i++) {
            
             for (int j = 1; j <= i; j++) {
                 
                 System.out.print(j);
                 
             }
             
             System.out.println(" ");
            
        }
    }
    
}
