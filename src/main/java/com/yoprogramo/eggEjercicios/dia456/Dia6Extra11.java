//Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
//Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando
//el operador de división. Nota: recordar que las variables de tipo entero truncan los números o resultados. 

package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia6Extra11 {

   
    public static void main(String[] args) {
        
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero para ver cuantos digitos tiene");
        int num = leer.nextInt();
        
        while (num > 0) {
        
            num /= 10;
            
            cont+=1;
        
        }
        
        System.out.println("el numero tiene " + cont + " digitos");
        
    }
    
}
