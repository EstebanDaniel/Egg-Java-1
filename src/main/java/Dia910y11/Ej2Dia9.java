// RealizarunalgoritmoquelleneunvectordetamañoNconvalores aleatoriosylepidaalusuar
// iounnúmeroabuscarenelvector.El programamostrarádóndeseencuentraelnumeroysiseencuentra repetido 
package Dia910y11;

import java.util.Random;
import java.util.Scanner;

public class Ej2Dia9 {

    
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           int cont = 0; 
          int [] vector = new int[10];
           // Crear un objeto de la clase Random
        Random random = new Random();
          
        for (int i = 0; i < vector.length; i++) {    
            System.out.println(vector[i]=random.nextInt(10));
        }
        
        
        
         System.out.println("ingrese numero para adivinar");
            int num = leer.nextInt();
            
        for (int i = 0; i < vector.length; i++) {
                   
            if(num == vector[i]){
                cont++; 
                System.out.println("adivinaste!! el numero esta en la posicion "+ i);
            }
            
        }
        
        System.out.println("el numero se repite "+cont);
    }
    
}
