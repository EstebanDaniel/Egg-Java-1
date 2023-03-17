// Creaunaaplicaciónquenospidaunnúmeroportecladoyconuna funciónselopasamosporparámetroparaquenosindiquesiesonoun
// númeroprimo,debedevolvertruesiesprimo,sinofalse. Unnúmeroprimoesaquelquesolopuededividirseentre1ysímismo.
// Porejemplo:25noesprimo,yaque25esdivisibleentre5,sinembargo, 17siesprimo.
package dia7y8;

import java.util.Scanner;

public class Dia8Ej4Guia {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero para saber si es un n primo");
        int num = leer.nextInt();
        System.out.println(numPrimo(num));

    }

    public static boolean numPrimo(int num) {

        boolean bandera;
        int cont = 0;
       
        for (int i = 1; i <= num; i++) {
            
           if (num % i == 0){
               cont++;
           }
            
        }
        
        if(cont == 2){
        
            System.out.println("el numero es primo");
            bandera = true;
        }else{
            System.out.println("el numero no es primo");
            bandera = false;
        }
       

        return bandera;
    }

}

