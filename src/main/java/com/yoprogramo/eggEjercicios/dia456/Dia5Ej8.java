/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia5Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el largo de los lados");
        int lado = leer.nextInt();

        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if ((i != 0 && i != lado - 1) && (j != 0 && j != lado - 1)) {
                    System.out.print(" ");
                } else {
                   System.out.print("*");
                }
            }
            System.out.println("");

        }
    }
}
