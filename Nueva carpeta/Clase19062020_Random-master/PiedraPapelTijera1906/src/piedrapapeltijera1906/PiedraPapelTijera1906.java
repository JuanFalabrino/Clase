
package piedrapapeltijera1906;
import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera1906 {

   
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      String resp1="";
      String resp2="";
      int numerorandom;
      String jugador1="";
      String jugador2="R2D2";
      Random RD = new Random();
      numerorandom = RD.nextInt(3) +1 ;
                
      System.out.println("PIEDRA ,  PAPEL o TIJERA\n");
      // Pedir a los jugadores su nombre
      System.out.print("Ingrese el noombre del Jugador 1: ");
      jugador1 = leer.next();
      // Dar inicio al juego
      System.out.println("Inicior del Juego\n");
      System.out.println("La P es Piedra");
      System.out.println("La L es Pepel");
      System.out.println("La T es Tijera");
      
      // pedir a los jugadrores que ingrese una opcion
      System.out.println("\nINTRODUCE OPCION P/L/T\n" + jugador1 + ":");
      resp1 = leer.next();
     
      switch (numerorandom){
          case 1: resp2 = "P";
              break;
          case 2: resp2 = "T";
              break;
          case 3: resp2 = "L";
              break;
           }
     
      System.out.println("\nLa OPCION DE R2D2 FUE:" + resp2);
      //Comparar el dato ingresado
      
      if(resp1.equals("P") && resp2.equals("P")){
       System.out.println("\nEMPATE\n");
      }
      if(resp1.equals("P") && resp2.equals("L")){
       System.out.println("\nGANADOR\n" + jugador2 + "\n");
      } 
      if(resp1.equals("P") && resp2.equals("T")){
       System.out.println("\nGANADOR\n" + jugador1 + "\n");
      } 
       
       if(resp1.equals("L") && resp2.equals("L")){
       System.out.println("\nEMPATE\n");
      }
      if(resp1.equals("L") && resp2.equals("P")){
       System.out.println("\nGANADOR\n" + jugador1 + "\n");
      } 
      if(resp1.equals("L") && resp2.equals("T")){
       System.out.println("\nGANADOR\n" + jugador2 + "\n");
      } 
      
      if(resp1.equals("T") && resp2.equals("T")){
       System.out.println("\nEMPATE\n");
      }
      if(resp1.equals("T") && resp2.equals("P")){
       System.out.println("\nGANADOR\n" + jugador2 + "\n");
      } 
      if(resp1.equals("T") && resp2.equals("L")){
       System.out.println("\nGANADOR\n" + jugador1 + "\n");
      } 
      System.out.println("GRACIAS POR PARTICIAR");
        
      
        
    }
    
}
