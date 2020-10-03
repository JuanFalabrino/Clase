package for05062020;
import java.util.Scanner;
public class FOR05062020 {
  
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int mayor = 0;
     int numero = 0;
     
        /*
        //realizar un programa el cual imprima en consola numeros del 0 al 1000
          for(int i=10000; i>=1000;i-=100){
          System.out.println("El nuemro es: " +i);
       
      }
      */
      //realizar un programa que enliste una coleccion de numeros del 0 al 101 y se informe cual es par o impar
      /*
        for(int i=0;i<101;i++){
            System.out.println("El numero es :" + i + "es:");
               if(i%2==0){
                   System.out.println("Par");
                }else {
                   System.out.println("Impar");
               }
        
        }
      */
      
     // ej. Dados 10 valores informar el mayor
     
      for (int i=0; i<10;i++){
        System.out.println("Ingrese un valor:");
        numero = leer.nextInt();
          
        if(numero > mayor){
          mayor = numero;
          }
            
       
       }
      System.out.println("El numero mayor es: " + mayor );
      
    }
    
}
