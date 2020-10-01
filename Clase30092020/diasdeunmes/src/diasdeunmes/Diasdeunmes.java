
package diasdeunmes;

import java.util.Scanner;

public class Diasdeunmes {

    
    public static void main(String[] args) {
        //Objeto Scanner
        Scanner leer = new Scanner(System.in);
        //variables 
        String nombremes;
        final int Enero=1;
        final int Febrero=2;
        final int Marzo=3;
        final int Abril=4;
        final int Mayo=5;
        final int Junio=6;
        final int Julio=7;
        final int Agosto=8;
        final int Septiembre=9;
        final int Octubre=10;
        final int Noviembre=11;
        final int Diciembre=12;
        int diasmes = 0;
        int mes =0 ;
        
        System.out.println("-- Calculo de los dias del mes --");
        System.out.println("Enero = 1/Febrero = 2/Marzo = 3");
        System.out.println("Abril = 4/Mayo = 5/Junio = 6");
        System.out.println("Julio = 7/Agosto = 8/Septiembre = 9");
        System.out.println("Octubre = 10/Noviembre = 11/Diciembre = 12");
        System.out.println("-------------------------------------");
        System.out.print ("Ingrese el numero del mes:");
        nombremes = leer.next();
        
        switch (nombremes){
             case "Enero":
                 diasmes = 31;
                 mes = Enero;
              break;
             case "Febrero":
                 diasmes = 28;
                 mes = Febrero;
              break;
            case "Marzo":
                 diasmes = 31;
                 mes = Marzo;
              break;
              case "Abril":
                 diasmes = 30;
                 mes = Abril;
              break;
             case "Mayo":
                 diasmes = 31;
                  mes = Mayo;
              break;
              case "Junio":
                 diasmes = 30;
                 mes = Junio;
              break;
              case "Julio":
                 diasmes = 31;
                 mes = Julio;
              break;
               case "Agosto":
                 diasmes = 31;
                 mes = Agosto;
              break;
              case "Septiembre":
                 diasmes = 30;
                 mes = Septiembre;
              break;
              case "Octubre":
                 diasmes = 31;
                 mes = Octubre;
              break;
              case "Noviembre":
                 diasmes = 30;
                 mes = Noviembre;
              break;
              case "Diciembre":
                 diasmes = 31;
                 mes = Diciembre;
              break;
              default:
                  break;
                                
    
        }
       System.out.println ("El mes ingresado es : " + nombremes + "  El numero del mes es: " + mes + "  Cantidad de dias del mes son : " + diasmes );
      
           
        
    }
    
}
