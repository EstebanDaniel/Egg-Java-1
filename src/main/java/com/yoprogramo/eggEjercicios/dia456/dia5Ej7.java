/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class dia5Ej7 {

  
    public static void main(String[] args) {
         
      
          int contA = 0;
          int contB = 0;
          String FDE;
         
          do{
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese frase de 5 digitos");
          String frase = leer.nextLine();
          FDE = frase;
          
              System.out.println("primero: " + FDE.substring(0, 1));
              System.out.println("Quinto: " + FDE.substring(4, 5));
           
          if (FDE.length() <=5 && FDE.substring(0, 1).equals("X") && FDE.substring(4, 5).equals("O")){
          
              System.out.println("frase correcta");
          contA +=1;
          
          }else { 
              System.out.println("frase incorrecta, vuelva a intentar");
          contB+=1;      
          }
          
          } while(!FDE.equalsIgnoreCase("&&&&&"));
          
          System.out.println("la cantidad de aciertos es: " + contA);
          System.out.println("la cantidad de desaciertos es: " + contB);
    }
    
}
