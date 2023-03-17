// Creaunaaplicaciónqueatravésdeunafunciónnosconviertauna cantidaddeeurosintroducidaportecladoaotramoneda,estaspueden seradólares,yenesolibras.
// Lafuncióntendrácomoparámetros,la cantidaddeeurosylamonedaaconvertirqueseráunacadena,
// esteno devolveráningúnvalorymostraráunmensajeindicandoelcambio (void). 
// Elcambiodedivisases: i. *0.86librasesun1€ ii. *1.28611$esun1€ iii. *129.852yenesesun1€

package dia7y8;

import java.util.Scanner;


public class Dia8Ej3Guia {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese euros a convertir");
        int euro = leer.nextInt();
        System.out.println("ingrese que moneda desea");
        String moneda = leer.next();
        
        convertirEuros(euro,moneda);
        
    }
    
    public static void convertirEuros(float euro,String moneda){
    
          switch (moneda) {
            case "yen":
                System.out.println("en yen son: "+ (euro *=129.8)+" yenes");  
                break;
              case "dolar":
                  System.out.println("en dolar son: "+ (euro *=1.28)+ " dolares");
                break;
                 case "libra":
                     System.out.println("en libra son: " +(euro *= 0.86)+ " libras");
                break;
            
        }
          
    
    
    }
    
}
