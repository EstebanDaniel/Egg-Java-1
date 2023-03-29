// Realizarunalgoritmoquelleneunvectorconlos100primerosnúmeros enterosylosmuestreporpantallaenordendescendente

package Dia910y11;


public class Ej1Dia9 {

    
    public static void main(String[] args) {
        
        int [] vector = new int[101];
        
       for (int i = 0; i < vector.length; i++) {
            vector[i] = i;            
       }
        
        for (int i = vector.length-1; i >= 0; i--) {
                 
            System.out.println(vector[i]);
             
        }
                
       
    }
    
}
