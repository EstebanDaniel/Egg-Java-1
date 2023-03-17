package com.yoprogramo.eggEjercicios.dia456;

// Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano. 

import java.util.Scanner;

public class DiaExtra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean salir = false;
         do {
        System.out.println("ingrese numero de 1 a 10 para mostrar en romano, 11 para salir");
        int num = leer.nextInt();

       
         if (num <= 11){
        switch (num) {
            case 1:
                System.out.println("I");
                break;
                 case 2:
                System.out.println("II");
                break;
                 case 3:
                System.out.println("III");
                break;
                 case 4:
                System.out.println("IV");
                break;
                 case 5:
                System.out.println("V");
                break;
                 case 6:
                System.out.println("VI");
                break;
                 case 7:
                System.out.println("VII");
                break;
                 case 8:
                System.out.println("VIII");
                break;
                 case 9:
                System.out.println("IX");
                break;
                 case 10:
                System.out.println("X");
                break;
                 case 11:
                      salir = true;
                System.out.println("Saliendo...");
        }
         }else {
         
             System.out.println("Numero no válido");
         }
    }while(salir != true);
    } 
}
