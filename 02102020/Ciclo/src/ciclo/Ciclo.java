
package ciclo;

import java.util.Scanner;


public class Ciclo {

    public static void main(String[] args) {
         //incremento de uno en uno 
         /*
           for(int i=0;i<=100;i++){
            System.out.println("El numero es: " +i);
             }
          */
         // recorer un ciclo de 50 nuemeros e indicar si los numeros son pares o impares
         /*
         for(int i=0;i<50;i++){
           System.out.print("El numero es " +i + " es ");
             if(i%2==0){
                 System.out.println(" par");             
             }else {
                 System.out.println(" impar"); 
             }
         
         }
          */
         // Solicitar al usuario que ingrese 10 numeros e indicar cual es el mayor
         Scanner leer = new Scanner(System.in);
         int numero;
          int mayor = 0;        
         for(int i=0;i<10;i++){
             System.out.print("Ingrese un valor: ");
             numero = leer.nextInt();
              if(numero > mayor){
              mayor = numero;
              }
                
         }
         System.out.println("El numero mayor es: " + mayor);
         
         
        
          
    }
    
}
