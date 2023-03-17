//Simular la división usando solamente restas. Dados dos números enteros mayores que uno, realizar un algoritmo 
//que calcule el cociente y el residuo usando sólo restas. Método: Restar el dividendo del divisor hasta obtener 
//un resultado menor que el divisor, este resultado es el residuo, y el número de restas realizadas
//es el cociente. Por ejemplo: 50 / 13 50  13  37     una resta realizada 37  13  24   
//dos restas realizadas 24  13  11     tres restas realizadas dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia6Extra9 {

    public static void main(String[] args) {

        int cociente = 0;
        float residuo = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese 1er numero para division de restas");
        float dividendo = leer.nextFloat();
        if (dividendo > 1) {

            System.out.println("ingrese 2do numero para division de restas");
            float divisor = leer.nextFloat();
            if (divisor > 1) {

                while (dividendo > divisor) {

                    dividendo -= divisor;
                    cociente += 1;

                }

                residuo = dividendo;

            }
        }

        System.out.println("el cociente de la division es: " + cociente);
        System.out.println("el residuo de la division es: " + residuo);

    }

}
