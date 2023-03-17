// Creaunaaplicaciónquelepidadosnúmerosalusuarioyestepueda elegirentresumar,restar,multiplicarydividir.
// Laaplicacióndebetener unafunciónparacadaoperaciónmatemáticaydebendevolversus resultadosparaimprimirlosenelmain. 
package dia7y8;

import java.util.Scanner;


public class Dia8Ej1Guia {

    
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          System.out.println("ingrese numero 1 para operacion");
          int num1 = leer.nextInt();
          System.out.println("ingrese numero 2 para operacion");
          int num2 = leer.nextInt();
          System.out.println("ingrese que operacion desea realizar a: suma, b:resta, c:multiplicacion, d: division");
          String opcion = leer.next();
          
          switch (opcion) {
            case "a":
                System.out.println(suma(num1,num2));
                
                break;
            case "b":
                System.out.println(resta(num1,num2));    
                break;
            case "c":
                System.out.println(mul(num1,num2));
                break;
            case "d":
                System.out.println(div(num1,num2));
                break;
        }
    }
    
    public static int suma(int num1,int num2){
    int suma;
      suma = num1 + num2;
      return suma;
    
    }
    
     public static int resta(int num1,int num2){
    int resta;
      resta = num1 + num2;
      return resta;
    
    }
     
       public static int mul(int num1,int num2){
    int mul;
      mul = num1 + num2;
      return mul;
    
    }
          public static double div(double num1,double num2){
    double div;
      div = (num1 / num2);
      return div;
    
    }
    
}
