/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.yoprogramo.eggEjercicios.dia456;



public class Dia5Extra2 {

   
    public static void main(String[] args) {
        
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        
        
        
        System.out.println("sin cambiar valores: " + A +" "+ B +" "+ C +" "+ D);
        
       int X = B;
        B = C;
        C = A;
        A = D;
        D = X;
        
        System.out.println("cambiando los valores: " + A +" "+ B +" "+ C +" "+ D);
    }
    
    
}
