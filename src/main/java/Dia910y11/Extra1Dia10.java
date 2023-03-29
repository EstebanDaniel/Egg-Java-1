// Realizarunalgoritmoquecalculelasumadetodosloselementosdeun 
//         vectordetamañoN,conlosvaloresingresadosporelusuario. 
package Dia910y11;

import java.util.Scanner;


public class Extra1Dia10 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int [] vector = new int[5];
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese valores en el vector");
            int num = leer.nextInt();
            vector[i] = num;
            suma += vector[i];
            
        }
        
        System.out.println("la suma de los elementos del vector es: "+suma);
        
        
    }
    
}
