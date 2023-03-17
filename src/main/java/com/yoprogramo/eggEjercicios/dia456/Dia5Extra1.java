/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class Dia5Extra1 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los minutos a trasformar");
        double num = leer.nextDouble();
        
        double dia = num / 1440;
        double hora = num / 60;
//        int horas = (minutos%1440)/60;
        
        System.out.println("los minutos ingresados son: " +(int)dia + " dias" +
        " y las horas ingresadas son: " + (int)hora
        );
    }
    
}
