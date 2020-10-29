
package calculadora;

import java.util.Scanner;


public class Calculadora {


    public static void main(String[] args) {
      // calculadora de tres operaciones con numeros ingresados
      
      Scanner leer = new  Scanner(System.in);
      
      System.out.print("Ingrese el primer numero :  ");
      int Valor1 = leer.nextInt();
     System.out.print("Ingrese el Segundo numero :  ");
      int Valor2 = leer.nextInt();
      
       System.out.println("Seleccione una operación");
       System.out.println("0-Suma");
       System.out.println("1-Resta");
       System.out.println("3-Multiplicación");
       System.out.println("--------------------------");
       System.out.print("Seleccione una Opción ");
       int seleccion = leer.nextInt();
       
       //Que opcion selecciono?
       switch(seleccion) {
                    case 0: suma(Valor1,Valor2);
                break;
                    case 1: resta(Valor1,Valor2);
                break;
                    case 2: multiplicacion(Valor1,Valor2);
                break;
      }       
    }
    
    public static void suma(int v1, int v2){
        int resultado = v1 +  v2;
        impresion(resultado);
     }
     public static void resta(int v1, int v2){
        int resultado = v1 -  v2;
       impresion(resultado);
     }
    public static void multiplicacion(int v1, int v2){
        int resultado = v1 *  v2;
        impresion(resultado);
     }
    
    public static void impresion(int resultado){
    System.out.println("El resultado de la operación  es : " + resultado);
    
    }
    
}
