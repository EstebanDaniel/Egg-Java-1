// DiseñeunafunciónquepidaelnombreylaedaddeNpersonase imprimalosdatosdelaspersonasingresadasportecladoeindiquesi sonmayoresomenoresdeedad.
// Despuésdecadapersona,elprograma
// debepreguntarlealusuariosiquiereseguirmostrandopersonasyfrenar cuandoelusuarioingreselapalabra“No”. 
package dia7y8;

import java.util.Scanner;

public class Dia8Ej2Guia {

    public static void main(String[] args) {

        String opcion = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de personas");
        int cont = leer.nextInt();

        while (!(opcion.equals("no"))) {
            System.out.println("ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("ingrese la edad de la persona");
            int edad = leer.nextInt();

            mayorEdad(nombre, edad);

            cont--;
            if (cont == 0){
            break;
            }
            System.out.println("desea seguir ingresando personas? si/no");
            opcion = leer.next();
        }
    }

    public static String mayorEdad(String nombre, int edad) {

        String retorno;

        System.out.println("------------------------------------");
        System.out.println("el nombre de la persona es: " + nombre);
        if (edad >= 18) {
            System.out.println("la persona es mayor de edad");
        } else {
            System.out.println("la persona es menor de edad");
        }

        return retorno = nombre + edad;
    }

}
