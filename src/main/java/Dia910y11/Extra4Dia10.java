//LosprofesoresdelcursodeprogramacióndeEggnecesitanllevarun registrodelasnotasadquiridasporsus10alumnosparaluegoobtener
//unacantidaddeaprobadosydesaprobados.Duranteelperíodode cursadocadaalumnoobtiene4notas,2portrabajosprácticos evaluativosy2porparciales.
//Lasponderacionesdecadanotason: Primertrabajoprácticoevaluativo10% Segundotrabajoprácticoevaluativo15% PrimerIntegrador25% Segundointegrador50% 
//Unavezcargadaslasnotas,secalculaelpromedioyseguardaenel arreglo.Alfinaldelprogramalosprofesoresnecesitanobtenerpor pantallalacantidaddeaprobadosy
//desaprobados,
//teniendoencuenta quesoloapruebanlosalumnosconpromediomayoroigualal7desus notasdelcurso.
package Dia910y11;

import java.util.Scanner;


public class Extra4Dia10 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int alumnos = 10;
        float notaPractico1 = 0;
        float notaPractico2 = 0;
        float notaIntegrador1 = 0;
        float notaIntegrador2 = 0;
        float promedio;
        int aprobado = 0;
        int desaprobado = 0;
        float[] notaAlumnos = new float[10];
      
        for (int i = 0; i < alumnos; i++) {
             System.out.println("ingrese nota practico 1 de alumno: "+i);
            float practico1 = leer.nextInt();
            System.out.println("ingrese nota practico 2 de alumno: "+i);
            float practico2 = leer.nextInt();
            System.out.println("ingrese nota integrador 1 de alumno: "+i);
            float integrador1 = leer.nextInt();
            System.out.println("ingrese nota integrador 2 de alumno: "+i);
            int integrador2 = leer.nextInt();
            
            notaPractico1 += practico1 * 0.10;
            System.out.println(notaPractico1);
            notaPractico2 += practico2 * 0.15;
            System.out.println(notaPractico2);
            notaIntegrador1 += integrador1 * 0.25;
            System.out.println(notaIntegrador1);
            notaIntegrador2 += integrador2 * 0.5;
            System.out.println(notaIntegrador2);
            promedio = notaPractico1 + notaPractico2 + notaIntegrador1 + notaIntegrador2;
            System.out.println("promedio "+promedio);
            notaAlumnos[i] = promedio;
             
            notaPractico1 = 0;
            notaPractico2 = 0;
            notaIntegrador1 = 0;
            notaIntegrador2 = 0;
            
        }
        
          for (int i = 0; i < notaAlumnos.length; i++) {
            
              if (notaAlumnos[i] >= 7){
              aprobado++;
              } else{
              
              desaprobado++;
              }
            
        }
 
            System.out.println("los aprobados entre los diez alumnos son: "+aprobado);
            System.out.println("los aprobados entre los diez alumnos son: "+desaprobado);
   
    }
    
}

//double[] notas = new double[4];
//       Scanner leer = new Scanner(System.in);
//       int desap = 0, aprob = 0;
//        for (int i = 0; i < 4; i++) {
//            System.out.println("ALUMNO "+(i+1));
//            System.out.print("Ingrese la nota del primer trabajo practico evaluativo: ");
//            notas[i] = leer.nextDouble()*0.1;
//            System.out.print("Ingrese la nota del segundo trabajo practico evaluativo: ");
//            notas[i] += leer.nextDouble()*0.15;
//            System.out.print("Ingrese la nota del primer examen integrador: ");
//            notas[i] += leer.nextDouble()*0.25;
//            System.out.print("Ingrese la nota del segundo examen integrado: ");
//            notas[i] += leer.nextDouble()*0.5;
//            if (notas[i]<7) {
//                desap ++;
//            }else {
//                aprob ++;
//            }
//        }
//        System.out.println("La cantidad de alumnos aprobados es: "+aprob);
//        System.out.println("La cantidad de alumnos desaprobados es: "+desap);
//    }
//}
