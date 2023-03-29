//Construyaunprogramaquelea5palabrasdemínimo3yhasta5 caracteresy,amedidaqueelusuariolasvaingresando,construyauna “sopadeletrasparaniños”
//detamañode20x20caracteres.Las palabrasseubicarántodasenordenhorizontalenunafilaqueserá seleccionadademaneraaleatoria.Unavezconcluidalaubicacióndelas 
//palabras,rellenelosespaciosnoutilizadosconunnúmeroaleatoriodel0 al9.Finalmenteimprimaporpantallalasopadeletrascreada.
//Nota:Pararesolverelejerciciodeberáinvestigarcómoseutilizanlas siguientesfuncionesdeJavasubstring(),Length()yMath.random(). 
package Dia910y11;

import java.util.Scanner;

public class extra6Dia11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];

        //cargo la sopa con numeros aleatorios entre 1 y 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        String[] palabras = new String[5];
        int[] numeroFila = new int[5];

        //Determino la primer posicion
        numeroFila[0] = (int) (Math.random() * 20);

        //Cargo el vector con las palabras para la sopa
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese la palabra número " + i + ". Mínimo 3 y hasta 5 caraceteres.");
            palabras[i] = leer.next().toUpperCase();
            //Verifico la longitud de la palabra que ingresa
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("Error. Mínimo 3 y hasta 5 caraceteres.");
                palabras[i] = leer.next().toUpperCase();
            }
            // relleno el vector con el mismo numero seleccionado al principio para luego cargar otros aleatorios que no se repitan
            numeroFila[i] = numeroFila[0];
        }

        int posicion;
        //Determino las posiciones restantes y cargo las palabras en la sopa
        for (int i = 1; i < 5; i++) {
            do {
                posicion = (int) (Math.random() * 20);
            } while (posicion == numeroFila[0] || posicion == numeroFila[1] || posicion == numeroFila[2] || posicion == numeroFila[3] || posicion == numeroFila[4]);
            numeroFila[i] = posicion;

        }
        int columna;
        //Cargo la sopa con las palabras
        for (int i = 0; i < 5; i++) {
            //selecciono columna aleatoriamente de inicio sabiendo que como maximo puedo arrancar en la columna 14
            columna = (int) (Math.random() * 15);
            for (int j = 0; j < palabras[i].length(); j++) {
                sopa[numeroFila[i]][columna + j] = palabras[i].substring(j, j + 1);
            }
        }
        //Imprimo sopa
        System.out.println("¡SOPA DE LETRAS!");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
            
        }
    }
}
