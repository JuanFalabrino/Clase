
package turnoservicio;
import java.util.Scanner;

public class TurnoServicio {

    public static void main(String[] args) {
      /*
       Se solicita hacer un sistema para sacar turnos en un centro de servicios para el automotor.
        Se debe solicitar al cliente :
            -Nombre
            -DNI
            -Dominio
            -Marca (seleccionar)
        tambien se debe seleccionar los servicios disponibles :
        Cambio de neumáticos
        Cambio de Aceite
        Pastilla de frenos
        Alineación
        Balanceo
        Imprimit el turno del cliente con el detalle del servicio seleccionado.
        */
     String cliente="";
     String dominio="";
     String marca="";
     String nservicio="";
     int servicio=0;
     int nmarca=0;
     int dni=0;
     Scanner leer = new Scanner(System.in);
          
     //Informacion de Cliente
     System.out.println("=====================");
     System.out.println("=====Bienvenidos=====");
     System.out.println("==Centro Servicios===");
     System.out.print("=Ingrese el nombre:");
     cliente = leer.next();
     System.out.print("=Ingrese su DNI:");
     dni = leer.nextInt();
     System.out.print("=Ingrese el Dominio del Vehiculo:");
     dominio = leer.next();
     System.out.println("===Ingrese la marca====");
     System.out.println("==1- Ford===");
     System.out.println("==2- Chevroleet===");
     System.out.println("==3-Fiat===");
     System.out.print("Marca :" );
     nmarca = leer.nextInt();
     
     // Seleccionar los servicios que viene  a realizar 
     do{
     System.out.println("===Seleccione el Servicio a realizar ====");
     System.out.println("==1- Cambio de neumáticos===");
     System.out.println("==2- Cambio de aceite===");
     System.out.println("==3- Pastillas de frenos===");
     System.out.println("==4- Alineación===");
     System.out.println("==5- Balanceo===");
     System.out.println("==========================================");
     System.out.print("Servicio :" );
     servicio = leer.nextInt();
     } while (servicio<1 || servicio >5);
     
     // en base al servicio selecciado recorro el listado de servicios y lo agrego a el string del nombre del servicio seleccionado
     
     switch (servicio){
         case 1:
             nservicio = "Cambio de Neumáticos";
             break;
             
         case 2:
             nservicio = "Cambio de Aceite";
             break;
         case 3:
             nservicio = "Pastillas de Frenos";
             break;
         case 4:
             nservicio = "Alineación";
             break;
         case 5:
             nservicio = "Balanceo";
             break;
         
       }
       switch (nmarca){
         case 1:
             marca = "Ford";
             break;
             
         case 2:
             marca = "Chevrolet";
             break;
         case 3:
             marca = "Fiat";
             break;
            
       }
     
     
     
     //Imprimir Ticket
          System.out.println("============================");
          System.out.println("=========Bienvenidos========");
          System.out.println("=====Centro Servicios=======");
          System.out.println("=====zavaleta 204, C1437EYF,CABA=");
          System.out.println("=============================");
          System.out.println("==Nombre del cliente :" + cliente + "==");
          System.out.println("==DNI del cliente :" + dni + "==");
          System.out.println("==Dominio del Vehiculo :" + dominio + "==");
          System.out.println("==Marca del Vehiculo :" + marca + "==");
          System.out.println("======================================");
          System.out.println("El servicio es : "  + nservicio);
          System.out.println("=======================================");
        
        
        
    }
    
}
