
package javaapplication151;

import java.util.Scanner;


public class JavaApplication151 {

  
    public static void main(String[] args) {
      
            Scanner leer = new Scanner(System.in);
            
            System.out.print("Ingrese el primer numero : ");
            int valor1 = leer.nextInt();
            System.out.print("Ingrese el segundo numero : ");
            int valor2 = leer.nextInt();
            System.out.println("Seleccione una operació ");
            System.out.println("0-Suma ");
            System.out.println("1-Resta");
            System.out.println("2-Multiplicación ");
            System.out.println("----------------------- ");
            System.out.print("Seleccion una opcion :");
            int seleccion = leer.nextInt();
            
            switch (seleccion){
                case  0: suma(valor1,valor2);
             break;
                case  1: resta(valor1,valor2);
             break;
                case  2:multi(valor1,valor2);
             break;  
              
            }
             
                       
    }
    public static void suma (int v1, int v2){
        int resultado = v1+v2;
        System.out.println("El resultado de la suma es : "  + resultado);
       }
    
    public static void resta (int v1, int v2){
        int resultado = v1-v2;
        System.out.println("El resultado de la resta es : "  + resultado);
       }
    public static void multi (int v1, int v2){
        int resultado = v1*v2;
        System.out.println("El resultado de la multiplicación es : "  + resultado);
        }
    
       
        
        
        
        
        
    }
    

