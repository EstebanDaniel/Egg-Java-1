//12.Necesitamos mostrar un contador con 3 dígitos XXX, que muestre los números del 000 al 999, con la particularidad que
//cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//000 001 002 00E 004 012 01E Nota:investigar función equals() y como convertirnúmeros a String. 
package com.yoprogramo.eggEjercicios.dia456;

public class Dia6Extra12 {

    public static void main(String[] args) {
       
           
        for (int i = 0; i < 1000; i++) {
            int centenas = i / 100;
            int decenas = (i / 10) % 10;
            int unidades = i % 10;
        String contador = "" + centenas + "-" + decenas + "-" + unidades;
        contador = contador.replace("3", "E");
            System.out.println(contador);
                   
        }
               
    
    }

}
