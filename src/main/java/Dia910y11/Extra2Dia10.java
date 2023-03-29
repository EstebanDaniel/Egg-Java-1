//2. EscribaunprogramaqueaverigüesidosvectoresdeNenterosson iguales(lacomparacióndeberádetenerseencuantosedetectealguna diferenciaentreloselementos). 
package Dia910y11;

import java.util.Scanner;


public class Extra2Dia10 {

   
    public static void main(String[] args) {
        
      
         Scanner leer = new Scanner(System.in);
        int [] vector1 = new int[3];
        int [] vector2 = new int[3];
          int cont = 0;
        for (int i = 0; i < vector1.length; i++) {     
            System.out.println("ingrese valores para el vector 1"); 
            int num1 = leer.nextInt();
            vector1[i] = num1;
        }
             for (int i = 0; i < vector2.length; i++) {     
            System.out.println("ingrese valores para el vector 2"); 
            int num2 = leer.nextInt();
            vector2[i] = num2;
        }

             for (int i = 0; i < vector1.length; i++) {
            
               if(vector1[i]==vector2[i]){
                   System.out.println("es igual");
                   cont++;
               }else{
                   System.out.println("No es igual, saliendo");
               break;
               }
            
        }
             
             System.out.println(cont+" numeros son iguales");
        
    }
    
}
