
package matrizsolicitar;

import java.util.Scanner;
import java.util.Random;

public class MatrizSolicitar {

   
    public static void main(String[] args) {
      
      //Crear una matriz 5 filas n columnas(se pide al usuario que nos brinde la catidad de columnas
      
        Scanner leer = new Scanner(System.in);
        Random rd = new Random();
        
        
        System.out.println("Por favor indique las columnas:  ");
        int columnas = leer.nextInt();
        
        int matriz [][] = new int [5][columnas];
        
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j < matriz[0].length;j++){
                matriz [i][j] = rd.nextInt(10);
                System.out.print(matriz [i][j] + "  ");
                          
            }
            System.out.println("  ");
        
        
        }
        
        
        
    }
    
}
