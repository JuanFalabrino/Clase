
package javaapplication135;

import java.util.Scanner;

public class JavaApplication135 {


    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
     /*
    int segundos=-10;
    
    while (segundos < 0){
    System.out.println("Minuto:" + segundos);
    segundos++;
    */
    /*
    String txtIngrsado = "e";
     while (!txtIngrsado.equals("S") )
            {
            System.out.println("¿Desea salir del bucle?");
            txtIngrsado = leer.next();
            }    
            System.out.println("Salio del bucle");
      }
     */
       /* int contador=10;
                do {
        System.out.println("do" + contador);
        contador ++;
        }while (contador <10);
        */
       String Usuario="sapo";
       String password="pepe";
       
       do {
       System.out.println("=====Ingreso al Sistema =====");
       System.out.print("===== Usuario:  ");
       Usuario = leer.next();
       System.out.print("===== Password:  ");
       password = leer.next(); 
       System.out.println("=============================");
       }while(!(Usuario.equals("sapo")) || !(password.equals("pepe")));
       System.out.println("Ingreso Correcto");
                 
    }
    
}
