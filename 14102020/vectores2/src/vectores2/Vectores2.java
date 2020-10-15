
package vectores2;

import java.util.Scanner;


public class Vectores2 {

 
    public static void main(String[] args) {
       
        //crear vector
        int numeros [] = new int[5];
        
        //cargar vector
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=50;
        numeros[3]=90;
        numeros[4]=200;
        
        //imprimir contenido del vector
        System.out.println("El valor cuando el indice vale 0 es : " + numeros[0]);
        System.out.println("El valor cuando el indice vale 1 es : " + numeros[1]);
        System.out.println("El valor cuando el indice vale 2 es : " + numeros[2]);
        System.out.println("El valor cuando el indice vale 3 es : " + numeros[3]);
        System.out.println("El valor cuando el indice vale 4 es : " + numeros[4]);
        
        //imprimir o recorrer vector de manera dinamica 
        
        
        for (int i=0;i<numeros.length;i++){
            System.out.println("Posicion del vector es " + i + " valor " + numeros[i] );
        }
        
        
        //Crear un Vector a medida del usuario
        
        Scanner leer = new Scanner(System.in);
        int longitud =0;
         
        
        //Crear Vector
        System.out.print("¿Cuantos numeros deseas ingresar? ");
        longitud = leer.nextInt();
        int numero[] = new int[longitud];
             
        //Cargando de datos mi vector
        for(int i=0;i<longitud;i++){
            System.out.print("Por favor ingrese un valor:   " + (i+1));
            numero[i] = leer.nextInt();
                  
        }
         //mostrar vector
        for(int i=0;i<numero.length;i++){
            System.out.println ("Los numeros son" + "  indice  " + i + "  numero   " + numero[i]);
                     
                  
        }
        
        
        
        
        
        
        
        
    }
    
}
