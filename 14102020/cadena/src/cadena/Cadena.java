
package cadena;

import java.util.Scanner;

public class Cadena {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre,nuevacadena;
        int  cantidad;
        int desde;
        int hasta;
        char letra;
        
        
        System.out.print("Introducir un Nombre:");
        nombre = leer.next();
        cantidad = nombre.length();
        System.out.println("La Cantidad de caracteres que tiene son:  " + cantidad);
        System.out.println("Introducir el desde de su cadena : ");
        desde = leer.nextInt();
        System.out.println ("Introducir el hasta de su cadena : ");
        hasta = leer.nextInt();
        
        nuevacadena = nombre.substring(desde,hasta);
        System.out.println(" La nueva cadena es : " + nuevacadena);
        
        letra = nombre.charAt(1);
        System.out.println(" Segun su ubicación el caracter es " + letra);
        
        
    }
    
}
