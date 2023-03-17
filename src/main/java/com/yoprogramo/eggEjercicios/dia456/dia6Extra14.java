//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
//Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para
//averiguar la media de edad de los hijos de todas las familias.

package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;


public class dia6Extra14 {

    
    public static void main(String[] args) {
        
        int cantHijos = 0;
        int edadesTotales = 0;
        float promedioEdades = 0;
           Scanner leer = new Scanner(System.in);
           System.out.println("ingrese cantidad de familias");
           int familia = leer.nextInt();
           
           for (int i = 1; i < familia+1; i++) { 
               System.out.println("ingrese cantidad de hijos para familia "+i);
               int hijos = leer.nextInt();
               cantHijos += hijos;
               for (int j = 1; j < hijos+1; j++) {        
                 System.out.println("ingrese las edad del hijo "+j+" de la familia " + i);
               int edades =leer.nextInt();
               edadesTotales+=edades;
               }
               
        }
           promedioEdades = edadesTotales / cantHijos;
           
           System.out.println("el promedio de edad de los niños de las familias es: " + (int)promedioEdades + " años");
        
    }
    
}
