/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios;

import java.util.Scanner;


public class ejercicio4 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de grados a convertir");
        double grados = leer.nextDouble();
        double  fahrenheit = (grados*9/5)+32;
        
        System.out.println("la conversion de grados es igual a: " + fahrenheit);
    }
    
}
