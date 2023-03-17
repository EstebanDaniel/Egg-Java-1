//Ejercicio11
//Escribir unprograma que procese una secuencia de caracteresingresada por tecladoyterminadaenpunto,yluego
//codifiquelapalabraofraseingresadade lasiguientemanera:cadavocalsereemplazaporelcarácterqueseindicaen 
//latablayelrestodeloscaracteres(incluyendoalasvocalesacentuadas)se mantienensincambios.
//a e i o u
//@ # $ % *
//Realiceunsubprogramaquerecibaunasecuenciadecaracteresyretornela codificacióncorrespondiente.
//Utilicelaestructura“según”parala transformación. Porejemplo,sielusuarioingresa: Ayer,lunes,salimosalasoncey10. 
//Lasalidadelprogramadeberíaser: @y#r,l*n#s,s@l$m%s@l@s%nc#y10.
package dia7y8;

import java.util.Scanner;

public class Dia7Ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese frase para codificar");
        String frase = leer.nextLine();
        codificar(frase);

    }

    public static void codificar(String frase) {

        int i = 0;
        String caracterActual;
        String vocalModificada = "";

        do {

            switch (frase.substring(i,i+1)) {

                case "a":
                    vocalModificada = vocalModificada.concat("@");
                    break;
                case "e":
                    vocalModificada = vocalModificada.concat("#");
                    break;
                case "i":
                    vocalModificada = vocalModificada.concat("$");
                    break;
                case "o":
                    vocalModificada = vocalModificada.concat("%");
                    break;
                case "u":
                    vocalModificada = vocalModificada.concat("*");
                
                default:
                    
                    caracterActual = (frase.substring(i,i+1));
                    vocalModificada = vocalModificada.concat(caracterActual);
                    
            }
            i++;

        } while (!frase.substring(i,i+1).equals("."));
        
        System.out.println("La frase codificada es: ");
        System.out.println(vocalModificada);

    }

}


