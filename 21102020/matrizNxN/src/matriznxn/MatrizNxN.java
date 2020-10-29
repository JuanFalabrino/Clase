
package matriznxn;

import java.util.Random;
import java.util.Scanner;


public class MatrizNxN {

  
    public static void main(String[] args) {
     Scanner sn=new Scanner(System.in);
         Scanner leer = new Scanner(System.in);
        int filas=0, columnas =0, contador=0;
        // Pedir filas al usuario
        System.out.println("¿Cuantas filas deseas?");
        filas = leer.nextInt();
        //pedir columnas al usuario
        System.out.println("¿Cuantas columnas deseas?");
        columnas = leer.nextInt();
        //crear matriz
        int numeros [][] = new int [filas][columnas];
        
        //carga de a matriz e impresión 
        for (int f =0;f<filas; f ++){
            for(int c = 0; c<columnas;c++){
                numeros[f][c] = contador;
                contador++;
                System.out.print("[" + numeros[f][c] + "]");
                        
            }
            System.out.println("");
            }
             
                 
        }
         
    }
        
        
        
        
    }
    
}
