
package clase2509scanextline;

import java.util.Scanner;

public class Clase2509ScaNextline {


    public static void main(String[] args) {
      //Login de usuario
      String nombre;
      int clave;
      Scanner entrada = new Scanner(System.in);
      
      //Solicitar Usuario y contraseña
      System.out.print("Ingrese nombre de usuario:  ");
      nombre = entrada.nextLine();
      System.out.print("Ingrese la contraseña :  ");
      clave = entrada.nextInt();
      
      //Verificar credenciales
      if (nombre.equals("juan") && clave == 1234){
          System.out.println("Bienvenido al Sistema");
       }else {
          System.out.println("El nombre de usuario o contraseña son incorrectos");
      }
      
      
      
      
      
       
        
        
        
    }
    
}
