// RealizarunprogramaquelleneunamatrizdetamañoNxMconvalores aleatoriosymuestrelasumadesuselementos.

package Dia910y11;

import java.util.Random;
import java.util.Scanner;


public class extra5Dia11 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ingrese cardinalidad de matriz");
        int n = leer.nextInt();
        System.out.println("ingrese cardinalidad de matriz");
        int m = leer.nextInt();
        
        int [][] matriz = new int[n][m];
        int suma = 0;
        
        for (int i = 0; i < matriz.length; i++) {          
            for (int j = 0; j < matriz.length; j++) {           
                matriz[i][j] = random.nextInt(10);     
            }       
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                suma+= matriz[i][j];             
            } 
            System.out.println("");
        }
        
        System.out.println("la suma de todos los elementos de la matriz es: " + suma);
        
        
        
    }
    
}
