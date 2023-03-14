/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.eggEjercicios;

import java.util.Scanner;


public class EggDia2 {

    public static void main(String[] args) {
        //ejercicio1
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero a sumar");
        int num1 = leer.nextInt();
        System.out.println("ingrese el 2do numero a sumar");
        int num2 = leer.nextInt();
        
        int suma = num1 + num2;
        System.out.println("la suma de los numeros ingresados es: " + suma);
        
    }
}
