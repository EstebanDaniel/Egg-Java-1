//Realizarunprogramaquerelleneunmatrizde4x4devaloresaleatorios ymuestrelatraspuestadelamatriz.
//Lamatriztraspuestadeunamatriz AsedenotaporByseobtienecambiandosusfilasporcolumnas(o viceversa).

package Dia910y11;

import java.util.Random;


public class Ej4Dia9 {

   
    public static void main(String[] args) {
         int [][] matriz = new int[4][4];
           Random random = new Random();
           
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {  
                   matriz[i][j] = random.nextInt(10); 
               }           
        }
           
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {
                   System.out.print("["+matriz[i][j]+"]");     
               }
               System.out.println("");
        }
           System.out.println("");
           
           for (int i = 0; i < matriz.length; i++) {
               for (int j = 0; j < matriz.length; j++) {
                   System.out.print("["+matriz[j][i]+"]");
                   
               }
               System.out.println("");
        }
           
                   
    }
    
}
