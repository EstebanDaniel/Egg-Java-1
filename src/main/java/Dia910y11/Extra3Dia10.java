// Crearunafunciónrelleneunvectorconnúmerosaleatorios,pasándole unarregloporparámetro.Despuésharemosotrafuncióno procedimientoqueimprimaelvector
package Dia910y11;

import java.util.Random;


public class Extra3Dia10 {

  
    public static void main(String[] args) {
        
        int [] vector = new int[3];
        rellenarVector(vector);
        mostrarVector(vector);
        
        
    }
    
    public static void rellenarVector(int vector[]){
    
          Random random = new Random();
          
         for (int i = 0; i < vector.length; i++) {
             
            vector[i]= random.nextInt(10);
        }
        
    }
    
    public static void mostrarVector(int vector[]){
    
         for (int i = 0; i < vector.length; i++) {             
             System.out.print("["+vector[i]+"]");
        }
        
    }
    
}
