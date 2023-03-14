/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios;

import java.util.Scanner;


public class ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese numero para ver valores");
        double num = leer.nextDouble();
        
        int doble = (int)num*2;
        int triple = (int)num*3;
        double raiz = Math.sqrt(num);
        
        System.out.println("el doble del numero es: " + doble);
        System.out.println("el triple del numero es: " + triple);
        System.out.println("la raiz del numero es: " + raiz);
    }
    
}
