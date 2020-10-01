
package formulariocliente;
import java.util.Scanner; //importar libreria 

public class FormularioCliente {

    
    public static void main(String[] args) {
       /*
        Realiar  un programa en  el cual se solicite datos del cliente y
        se calcle la edad del cliente ingresado. Si es mayor a 18 indicar que es mayor de edad
           
        */
      //Variables del formulario
      String Nombre,Apellido,Telefono;
      int Edad,Dni,Año;
      
      //Crear objeto scanner
      Scanner leer = new Scanner(System.in);
      
      //Solicitar al usuario los datos personales
      System.out.println("---Bienveido al formulario de Cliente---");
      System.out.print("--- Nombre: ");
      Nombre = leer.next();
      System.out.print("--- Apellido: ");
      Apellido = leer.next();
      System.out.print("--- DNI: ");
      Dni = leer.nextInt();
      System.out.print("--- Telefono: ");
      Telefono = leer.next();
      System.out.print("--- Año de nacimiento:  ");
      Año = leer.nextInt();
      System.out.println("---          Gracias por venir            ---");
      System.out.println("-----------------------");
       
        
      Edad =  2020 - Año;
      
      //formulario de salida 
      System.out.println("---Sus datos son ---");
      System.out.println("---Nombre : " + Nombre);
      System.out.println("---Apellido : " + Apellido);
      System.out.println("---DNI : " + Dni);
      System.out.println("---Telefono : " + Telefono);
      System.out.println("---EDAD : " + Edad);
      
      if (Edad > 18){
      System.out.println("---Es mayor de edad : Sí");
      }else {
      System.out.println("---Es mayor de edad : No");
      }
      System.out.println("-----------------------");
       
      
      
      
    }
    
}
