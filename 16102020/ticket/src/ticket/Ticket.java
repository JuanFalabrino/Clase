
package ticket;

public class Ticket {

 
    public static void main(String[] args) {
        // Creo objeto Scanner
   Scanner txtingresado = new Scanner(System.in);
// Declaro variables
   String mozo;
   String consum1 = "";
   String consum2 = "";
   String consum3 = "";
   String consum4 = "";
   String consum5 = "";
   int nmesa;
   int TotalConsum;
   int precio1 = 150;
   int precio2 = 400;
   int precio3 = 200;
   int precio4 = 125;
   int precio5 = 350;
   int CodConsum;
   int cant = 0;
   int cant1 = 0;
   int cant2 = 0;
   int cant3 = 0;
   int cant4 = 0;
   int cant5 = 0;
   int subtotal = 0;
   int mpago;
   int total = 0;
   long tarjd = 0;
   long tarjc = 0;
   int cuotas = 0; 
// Solicito al usuario ingresar datos
   System.out.println("Nombre mozo a cargo:");
   mozo = txtingresado.nextLine();
   System.out.println("Número de mesa:");
   nmesa = txtingresado.nextInt();
   System.out.println("Cantidad total de consumisiones:");
   TotalConsum = txtingresado.nextInt();
   System.out.println("====================================");
   System.out.println("CódConsumisión | Nombre");
   System.out.println("      1        | Chop de cerveza XL");
   System.out.println("      2        | Pizza grande especial");
   System.out.println("      3        | Gaseosa 2L");
   System.out.println("      4        | Gaseosa 1L");
   System.out.println("      5        | Hamburguesa completa");
   System.out.println("====================================");
   // WHILE
   while (cant != TotalConsum){
   System.out.println("Ingrese el código de la consumisión: ");
   CodConsum = txtingresado.nextInt();
   // SWITCH
   switch (CodConsum){
       case 1:
         consum1 = "chop de cerveza XL";
         System.out.println("Cantidad "+ consum1 +": ");
         cant1 = txtingresado.nextInt();
         subtotal = subtotal + (precio1 * cant1);
         cant = cant + cant1;
         break;
       case 2:
         consum2 = "pizza grande especial";
         System.out.println("Cantidad "+ consum2 +": ");
         cant2 = txtingresado.nextInt();
         subtotal = subtotal + (precio2 * cant2);
         cant = cant + cant2;
         break;
       case 3:
         consum3 = "gaseosa 2L";
         System.out.println("Cantidad "+ consum3 +": ");
         cant3 = txtingresado.nextInt();
         subtotal = subtotal + (precio3 * cant3);
         cant = cant + cant3;
         break;
       case 4:
         consum4 = "gaseosa 1L";
         System.out.println("Cantidad "+ consum4 +": ");
         cant4 = txtingresado.nextInt();
         subtotal = subtotal + (precio4 * cant4);
         cant = cant + cant4;
         break;
       case 5:
         consum5 = "hamburguesa completa";
         System.out.println("Cantidad "+ consum5 +": ");
         cant5 = txtingresado.nextInt();
         subtotal = subtotal + (precio5 * cant5);
         cant = cant + cant5;
         break;
   }
   //
   }
   // 
   System.out.println("===================================");
   System.out.println(" Medio de pago | Tipo");
   System.out.println("      1        | Efectivo");
   System.out.println("      2        | Tarjeta de débito");
   System.out.println("      3        | Tarjeta de crédito");
   System.out.println("===================================");
   System.out.println("Tipo de medio de pago elegido (1, 2 o 3):");
   mpago = txtingresado.nextInt();
   // SWITCH
   switch (mpago){
       case 1:
         total = (subtotal - (subtotal * 30)/100);
         break;
       case 2:
         System.out.println("Ingresar los digitos numericos:");
         tarjd = txtingresado.nextLong();
         total = (subtotal - (subtotal * 10)/100);
         break;
       case 3:
         System.out.println("Ingresar los digitos numericos:");
         tarjc = txtingresado.nextLong();
         System.out.println("Ingresar cantidad de cuotas:");
         cuotas = txtingresado.nextInt();
         total = (subtotal + (subtotal * 10)/100);
         break;
   }
   //
//
// Ejecuto y muestro en pantalla TICKET
   System.out.println("=============================");
   System.out.println("LA RUMBA");
   System.out.println("Av. Sáenz 963, C1437DOB, CABA");
   System.out.println("=============================");
   System.out.println("CAJA#1 TICKET#1");
   System.out.println("MOZO: " + mozo);
   System.out.println("Mesa: " + nmesa);
   System.out.println("08/06/2020 11:30:47 PM");
   System.out.println("=============================");
   // IF
   if (cant1==0){
   } else {
       System.out.println(cant1 +" "+ consum1 +" $"+ precio1);
   }
   if (cant2==0){
   } else {
       System.out.println(cant2 +" "+ consum2 +" $"+ precio2);
   }
   if (cant3==0){
   } else {
       System.out.println(cant3 +" "+ consum3 +" $"+ precio3);
   }
   if (cant4==0){
   } else {
       System.out.println(cant4 +" "+ consum4 +" $"+ precio4);
   }
   if (cant5==0){
   } else {
       System.out.println(cant5 +" "+ consum5 +" $"+ precio5);
   }
   System.out.println("=============================");
   System.out.println("SUBTOTAL: $"+ subtotal);
   //
   // SWITCH
   switch (mpago){
       case 1:
           System.out.println("MEDIO DE PAGO: Efectivo");
           System.out.println("DESCUENTO: 10%");
           System.out.println("");
           System.out.println("TOTAL: $"+ total);
           System.out.println("");
           break;
       case 2:
           System.out.println("MEDIO DE PAGO: Tarjeta de débito");
           System.out.println("NÚMERO DE TARJETA: "+ tarjd);
           System.out.println("");
           System.out.println("TOTAL: $"+ total);
           System.out.println("");
           break;
       case 3:
           System.out.println("MEDIO DE PAGO: Tarjeta de crédito");
           System.out.println("NÚMERO DE TARJETA: "+ tarjc);
           System.out.println("NÚMERO DE CUOTAS: "+cuotas);
           System.out.println("");
           System.out.println("TOTAL: $"+ total);
           System.out.println("");
           break;
    }
    //
   System.out.println("=============================");
   System.out.println("Gracias por su visita");
   System.out.println("=============================");
    }
        
        
        
        
        
        
        
        
        
    }
    
}
