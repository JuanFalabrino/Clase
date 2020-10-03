
package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int operacion,num_uno,num_dos;
        String nomoperacion;
        double resultado;
        
        
        // Solicitar numero de entrada
        System.out.println("-- CalcuJava --");
        System.out.print("Ingrese el primer numero:");
        num_uno = leer.nextInt();
        System.out.print("Ingrese el primer segundo:");
        num_dos = leer.nextInt();
        //Seleccionar operaciones
        System.out.println("---         Seleccione Operacion         --");
        System.out.println("-- Operacion Suma           Seleccione 1 --");
        System.out.println("-- Operacion Resta          Seleccione 2 --");
        System.out.println("-- Operacion Multiplicación Seleccione 3 --");
        System.out.println("-- Operacion División       Seleccione 4 --");
        System.out.println("-------------------------------------------");
                   
        
        //Operar 
       switch(operacion){
              case 1: resultado = num_uno + num_dos; 
              nomoperacion = "SUMA";
           break;
               case 2: resultado = num_uno - num_dos;
               nomoperacion = "RESTA";
          break;
                case 3: resultado = num_uno * num_dos;
                nomoperacion = "MULTIPLICACION";
          break;
                case 4: resultado = num_uno / num_dos;
                nomoperacion = "DIVISION";
          break;
            default: System.out.println("Error, la opción no existe");
          break;
       }
       
      //mostrar resultados             
        System.out.println("numero uno fue " + resultado);
        System.out.println("numero uno fue " + resultado);
        System.out.println("numero uno fue " + resultado);
        System.out.println("numero uno fue " + resultado);
    }      
       
}
