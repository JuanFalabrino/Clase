
package clase2509scanner;
  
import java.util.Scanner;

public class Clase2509scanner {
           
    public static void main(String[] args) {
     int num = 0 ;
     int num2;
     int num3;
     
     Scanner Lector  = new Scanner(System.in);
     
     
     
     System.out.print("Ingrese el primer numero :  ");
     num = Lector.nextInt();
     System.out.print("Ingrese el segundo numero :  ");
     num2 = Lector.nextInt();
     System.out.print("Ingrese el tercero numero :  ");
     num3 = Lector.nextInt();
     
     System.out.println("Ingreso los numeros :" + num  + num2 + num3 );
        
    }

    
}
