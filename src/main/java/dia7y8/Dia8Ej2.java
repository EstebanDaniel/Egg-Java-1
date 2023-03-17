//Creaunprocedimiento
//E s M ultiplo
//querecibalosdosnúmerospasadosporel usuario,validandoqueelprimernúmeromúltiplodelsegundoeimprimasiel 
//primernúmeroesmúltiplodelsegundo,sinoinformequenoloson.

package dia7y8;

import java.util.Scanner;


public class Dia8Ej2 {

   
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese primer numero para saber si es multiplo");
          int num1 = leer.nextInt();
          System.out.println("ingrese segundo numero");
          int num2 = leer.nextInt();
          
          esMultiplo(num1,num2);
        
        
    }
    
    public static void esMultiplo(int num1, int num2){
    
    if (num1 % num2 == 0){
    
        System.out.println("el primer numero es multiplo");
    
    } else{
    
        System.out.println("el primer numero no es multipo");
    }
        
    
    }
    
}
