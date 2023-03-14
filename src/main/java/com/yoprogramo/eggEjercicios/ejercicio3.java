/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios;

import java.util.Scanner;


public class ejercicio3 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase para mostrar");
        String frase = leer.nextLine();
        System.out.println(frase.toLowerCase());
       System.out.println(frase.toUpperCase());
    }
    
}
