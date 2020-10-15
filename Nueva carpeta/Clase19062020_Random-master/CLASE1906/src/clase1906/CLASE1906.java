
package clase1906;
import java.util.Random;

public class CLASE1906 {

 
public static void main(String[] args) {
       
    //Crear un Porgrma que genere tre numeros aleatorio comprendido entre 65 y 90
    Random RD = new Random();
    int a,b,c,d,f,z;
    
    a=(RD.nextInt(100)+ 1);
    b=(RD.nextInt(100)+ 1);
    c=(RD.nextInt(100) + 1);
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    
    // Imprimir un nuemro aleatorio 0 a 10
    d=(RD.nextInt(10));
    System.out.println(d);
    
    //Imprimir un numero aleatorio de 1 a 47
    f=(RD.nextInt(47) *  (0-1));
    System.out.println(f);
    
    //Imprimir un numero aleatorio de 1 a 3
    z=(RD.nextInt(3)+1);
    System.out.println("ste"+z);
    








    
    }
    
}
