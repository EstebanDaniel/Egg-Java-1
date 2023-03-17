// Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
// la cantidad de números pares y la cantidad de números impares. 
// Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break. 
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia6Extra8 {

    
    public static void main(String[] args) {
        
        int par = 0;
        int impar = 0;
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numeros");
        int num = leer.nextInt();
       
        while (!(num % 5 == 0)) {
            
            if (num > 0){
            
            System.out.println("ingrese mas valores");
            num = leer.nextInt();
            
            if (num % 2 == 0){
            
            par += 1;
            
            }else {
            
                impar += 1;
            
            }

            }else{
                System.out.println("error");
                break;
            }
          
            cont += 1;
            
        }
        
        System.out.println("la cantidad de numeros ingresados es: " + cont);
        System.out.println("la cantidad de numeros pares es: " + par);
        System.out.println("la cantidad de numeros impares es: " + impar);          
        
    }
    
}
