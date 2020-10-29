
package vectores;
import java.util.Scanner;
public class Vectores {

   
    public static void main(String[] args) {
        //Pide al usuario por teclado una frase y pasar sus caracteres a un array de caracteres.
        
        Scanner leer = new Scanner(System.in);
        
        //Pido al usuario que escriba una frase
        System.out.print("Escriba una frase:  ");
        //Recomendación utilizar nextline para contemplar los espacios 
        String frase = leer.nextLine();
        
        //Vector de caracteres
        char caracteres [] = new char[frase.length()];
                
        //Recorrer la frase y tomamos cada uno de los caracteres y los ingresamos en el vector
        for (int i=0;i<frase.length();i++){
            caracteres [i]=frase.charAt(i);
            System.out.println("Caracter    "+ caracteres[i] + "Ubicación " + i);
        
        
        }
        
        
        
        
        
        
        
    } 
}
