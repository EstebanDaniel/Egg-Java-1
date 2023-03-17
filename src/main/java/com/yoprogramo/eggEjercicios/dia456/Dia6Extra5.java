//Una obra social tiene tres clases de socios: ○ Los socios tipo ‘A ’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos. ○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos 
//tratamientos que los socios del tipo A. ○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos. 
//○ Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente 
//el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.

package com.yoprogramo.eggEjercicios.dia456;

import java.util.Scanner;

public class Dia6Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo de socio A,B o C");
        String tipo = leer.nextLine();
        System.out.println("ingrese monto de tratamiento");
        double costo = leer.nextDouble();

        if (tipo.equalsIgnoreCase("a")) {

            costo *= 0.5;
            System.out.println("el costo con descuento es de: " + costo);
        } else if (tipo.equalsIgnoreCase("b")) {

            costo *= 0.35;
            System.out.println("el costo con descuento es de: " + costo);
        } else {
            System.out.println("el costo es igual a: " + costo);
        }
    }

}
