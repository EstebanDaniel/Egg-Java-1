// RealizarunprogramaquecompleteunvectorconlosNprimeros númerosdelasucesióndeFibonacci.Recordarquelasucesiónde 
// Fibonaccieslasucesióndelossiguientesnúmeros: 1,1,2,3,5,8,13,21,34,... Dondecadaunodelosnúmerossecalculasumandolosdosanterioresa él.
// Porejemplo: Lasucesióndelnúmero2secalculasumando11 Análogamente,lasucesióndelnúmero3es12, Yladel5es23, Yasísucesivamente… 
// LasucesióndeFibonaccisepuedeformalizardeacuerdoalasiguiente fórmula: Fibonaccin=Fibonaccin-1+Fibonaccin-2paratodon>1 Fibonaccin=1paratodon<=1
// Porlotanto,siqueremoscalculareltérmino“n”debemosescribiruna
// funciónquerecibacomoparámetroelvalorde“n”yquecalculelaserie hastallegaraesevalor.
package Dia910y11;

import java.util.Scanner;

public class extra7Dia11 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la serie de numeros de fibonnaci que quiere conocer");
        int n = leer.nextInt();
        fibo(n);
       
    }
    
    public static void fibo(int n){
        
        int [] fibonacci = new int[n];
        fibonacci[0]=1;
        fibonacci[1]=1;
    
        for (int i = 2; i < n; i++) {
            
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            
        }
        
        for (int i = 0; i < fibonacci.length; i++) {
            
            System.out.print(fibonacci[i]+" ");
            
        }
        
    
    }
    
}
