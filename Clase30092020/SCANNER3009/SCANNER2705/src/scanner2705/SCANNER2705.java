
package scanner2705;

import java.util.Scanner; //importar la libreria 

public class SCANNER2705 {

    
    public static void main(String[] args) {
      
        //Crear el objeto scanner
        Scanner leer = new Scanner(System.in);
        //Declaración de variables
        int numero;
        String nombre;
        int afecha;
        int edad; 
        String tel;
        String dni;
        
        //Soliictar al usuario que ingrese un numero entero
        //System.out.println("Por favor ingrese un valor de tipo entero");
        //numero = leer.nextInt();
        //System.out.println("El numero ingresado es :" + numero);
        //Solicitar al usuario del sistema su nombre
        System.out.println("Por favor ingrese su nombre:");
        nombre = leer.next();
        //Edad del usuario
        System.out.println("Por favor indique la el año de su nacieminto");
        afecha = leer.nextInt();
        edad = 2020 - afecha;
        System.out.println("Ingrese su numero de Telefono:");
        tel = leer.next();
        System.out.println("Ingrese su numero de DNI:");
        dni = leer.next();
                        
        
        //Imprimir datos del cliente 
        
        System.out.println("----        DATOS DEL CLIENTE     ----");
        System.out.println("- Su nombre es :" + nombre + "-");
        System.out.println("- Su edad es :" + edad + " años -");
        System.out.println("- Su Numero de Telefono es:" + tel + "-");
        System.out.println("- Su Numero de DNI es:" + dni + "-");
        System.out.println("---------------------------------------");
             
                
        
    }
    
}
