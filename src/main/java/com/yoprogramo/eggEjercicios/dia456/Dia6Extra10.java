//Realice un programa para que el usuario adivine el resultado de una multiplicación
//entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario 
//ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.


package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia6Extra10 {

    
    public static void main(String[] args) {
           int numeroUser;
           Scanner leer = new Scanner(System.in);
           int num1 =  (int) (Math.random()*10+1);
           int num2 = (int) (Math.random()*10+1);
           
         System.out.println(num1 +" * "+num2);
           
           int numMagic = num1 * num2;
           
          System.out.println(numMagic);
           
           do {
           
               System.out.println("ingrese numero para intentar adivinar la multiplicación");
               numeroUser = leer.nextInt();
           
           }while (numeroUser != numMagic);
           
           System.out.println("Adivinaste! el numero era : " + numMagic);
    }
    
}
