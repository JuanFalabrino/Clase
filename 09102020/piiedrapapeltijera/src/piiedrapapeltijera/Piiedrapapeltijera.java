
package piiedrapapeltijera;

import java.util.Random;
import java.util.Scanner;


public class Piiedrapapeltijera {

    public static void main(String[] args) {
        //constructres de los metodos Scanner/Random
        Scanner leer = new Scanner(System.in);
        Random  RD = new Random();
        //Declaración de las variables del sistema
        String resp1="";
        String resp2="";
        int numerorandom;
        String Jugador1="";
        String Jugador2="R2D2";
        // dar numero rndom
        numerorandom = RD.nextInt(3)+1;
        
        
        System.out.println("Piedra, Papel o TIJERA\n");
        //Pedir a los juegadores su nombre
        System.out.print("Ingrese el nombre del jugador 1 : ");
        Jugador1 = leer.next();
        System.out.print("Inicio del Juego");
        System.out.print("La P es Piedra");
        System.out.print("La L es Papel");
        System.out.print("La T es Tijera");
        //pedri a el juagador que indique un elemento
        System.out.println("\nINTRODUCE OPCION P/L/T\n" + Jugador1 + ":");
        resp1 = leer.next();
        
        //transformo el numero aleatorio en elemeno seleccionado por la maquina
        switch (numerorandom){
            case 1: resp2 = "P";
                break;
            case 2: resp2 = "T";
                break;
             case 3: resp2 = "L";
                break;
               }
        
        System.out.println("\nLa Opcion de R2D2 fue : " + Jugador2 + ":" + resp2);
        
        //Logica del juego
        if(resp1.equals("P") && resp2.equals("P")){
            System.out.println("\nEMPATE\n");
        }
       if(resp1.equals("P") && resp2.equals("T")){
            System.out.println("\nGANADOR"+ Jugador1 + "\n");
        }
         if(resp1.equals("P") && resp2.equals("L")){
           System.out.println("\nGANADOR"+ Jugador2 + "\n");
         }
                        
             
        
                          
    }
    
}
