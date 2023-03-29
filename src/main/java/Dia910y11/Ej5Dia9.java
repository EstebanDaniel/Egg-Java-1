
package Dia910y11;


import java.util.Scanner;


public class Ej5Dia9 {

   
    public static void main(String[] args) {
        
        boolean esAntisimetrica = false;
        int [][] matriz = new int[3][3];
        int [][] matrizTranspuesta = new int [3][3];
             Scanner leer = new Scanner(System.in);
           
          
              for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {  
                   System.out.println("ingrese valores de matriz");
                   matriz[i][j] = leer.nextInt();    
               }                    
        }
               System.out.println("matriz comun");
               
                 for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {  
                 
                   System.out.print("["+matriz[i][j]+"]");   
               }    
                     System.out.println("");
        }
                 
            
              System.out.println("----------------------");
              
              System.out.println("matriz transpuesta");
              for (int i = 0; i < matriz.length; i++) {
                  for (int j = 0; j < matriz.length; j++) {
                     
                      matrizTranspuesta[i][j] = matriz[j][i];  
                      System.out.print("["+matrizTranspuesta[i][j]+"]");
                  }   
                  System.out.println("");
        }
              
              System.out.println("------------------------");
              
              System.out.println("matriz transpuesta negativa");
              for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[0].length; j++) {
        if (matriz[i][j] == (-matrizTranspuesta[i][j])) {
            esAntisimetrica = true;
        } 
        System.out.print("["+(-matrizTranspuesta[i][j])+"]");
    }
                  System.out.println("");
}
              
              if (esAntisimetrica == true){
                  System.out.println("la matriz es antisimetrica");
              } else{
                  System.out.println("la matriz no es antisimetrica");
              }
              
        
    }
    
}
