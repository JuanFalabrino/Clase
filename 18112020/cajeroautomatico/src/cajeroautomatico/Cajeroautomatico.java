/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajeroautomatico;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JuFalabrino
 */
public class Cajeroautomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int saldo=90000; //saldo inicial
       int saldod=500;//saldo inicial en dolares
        String ax;
        String tranfe = "";
        int tranfe = 0;
        
        int op=0;
        ImageIcon logo = new ImageIcon("src/Imagenes/logo.png");
            
        String usuario = "Juan Carlos Falabrino",contraseña;
        String Pass="1234"; 
        
        
        
        JOptionPane.showMessageDialog(null,"","BIENVENIDO AL BANCO CFPN 36",JOptionPane.INFORMATION_MESSAGE,logo);
        
      contraseña = JOptionPane.showInputDialog("Bienvenido  " + usuario + " Ingrese su contraseña ");
       
        
        if(contraseña.equals(Pass)){
           
        do{
         
          ax = JOptionPane.showInputDialog(null, "1. Saldo \n 2. Transferir \n 3. Retirar \n 4. Cambiar Clave \n 5. Salir");
           
                op = Integer.parseInt(ax);
                switch(op){
                    case 1:
                         verSal(saldo,saldod);
                         break; 
                    case 2:
                         saldo = transDinero(saldo);
                         break;
                    case 3:
                        saldo = retirarDinero(saldo);
                         break;
                    case 4:
                      
                         break;
                    case 5: 
                          JOptionPane.showMessageDialog(null,"","GRACIAS POR VENIR AL BANCO CFPN 36",JOptionPane.INFORMATION_MESSAGE,logo);
                         break;
                }    
           
        }while(op !=5);//cuando se digita 5 se finaliza la aplicacion       
                        
            }else {
            JOptionPane.showMessageDialog(null,"La contraseña es incorrecta su usuario se bloqueará ","Error credenciales",JOptionPane.ERROR_MESSAGE);
        
        }
        
                 
    }
    
   
     private static void ticketTransf(int saldo, int montoTransf, String CBU) {
            System.out.println("==============================");
            System.out.println("========BANCO CFP N°36========");
            System.out.println("==============================");
            System.out.println("==Transferencia a CBU:========");
            System.out.println("======="+CBU+"=======");
            System.out.println("==============================");
            System.out.println("==Monto Transferido:==========");
            System.out.println("==$"+montoTransf+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }

    private static void verSal(int saldo,int saldod ) {
         //metodo para ver el saldo de la cuenta
        System.out.println("=======================================");
        System.out.println("=======     BANCO CFP N°36     ========");
        System.out.println("=======================================");
        System.out.println("===  Saldo de Cuentas =================");
        System.out.println("=======================================");
        System.out.println("===  Cuenta corriente en pesos     ====");
        System.out.println("=======================================");
        System.out.println("==== $ " +saldo+ "=====================");
        System.out.println("=======================================");
        System.out.println("===  Cuenta corriente en dolares ======");
        System.out.println("=======================================");
        System.out.println("===== $ " +saldod+ "===================");
        System.out.println("=======================================");
    }
  //Funcion Ticket de Extraccion
        private static void ticketExt(int saldo, int montoExt) {
            System.out.println("\n\n==============================");
            System.out.println("========BANCO CFP N°36========");
            System.out.println("==============================");
            System.out.println("==Extracción realizada por:===");
            System.out.println("==$"+montoExt+"=====================");
            System.out.println("==Saldo Restante:=============");
            System.out.println("==$"+saldo+"======================");
            System.out.println("==============================");
        }
        
        
    private static int transDinero(int saldo) {
         //Declaracion de Variables
        int montoTransf=0; boolean CBUvalido=false; String CBU;
        //Ingresar CBU
        do {
            CBU = JOptionPane.showInputDialog(null, "Ingrese el CBU de la cuenta a transferir:");
            //Verificar que el largo del CBU es de 16 caracteres 
            if (CBU.length()==2) {
                CBUvalido = true;
               }else {
            JOptionPane.showMessageDialog(null,"No cumple con los 16 digitos ","Error CBU",JOptionPane.ERROR_MESSAGE);
             }
        }  while (CBUvalido==false);
        //Ingresar monto a transferir
          
        do {
            montoTransf = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a transferir a CBU:\n"+CBU));
           if (saldo<montoTransf){
            JOptionPane.showMessageDialog(null,"No debe superar el SALDO actual que es de $"+ saldo ,"Supera al Saldo",JOptionPane.ERROR_MESSAGE);
          }
        }  while ((saldo<=montoTransf)&&(montoTransf>0));
        
        
        saldo = saldo - montoTransf;
      //  System.out.println(saldo+" | "+montoTransf);
        ticketTransf(saldo,montoTransf,CBU);
        return saldo;
    }
    private static int retirarDinero(int saldo) {
        int montoTransf=0; boolean CBUvalido=false; String CBU;
        ImageIcon Icon = new ImageIcon("src/Imagenes/dinero.png");
        int montoExt=0;
        do {
            int seleccion = JOptionPane.showOptionDialog(null,"Sel/*eccione el monto a retirar","Retiro de Efectivo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Icon, 
            new Object []{"200", "500","1000","Otro Importe"},"100" );  
            switch (seleccion) {
                case 0:
                    montoExt=200;
                    break;
                case 1:
                    montoExt=500;
                    break;
                case 2:
                    montoExt=1000;
                    break;
                case 3:
                    montoExt=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a Retirar:","Ingrese el monto aquí."));
                    break;
            }
            if (montoExt>saldo) {
                JOptionPane.showMessageDialog(null,"Por favor, ingrese un monto valido menor a su saldo.\nSu saldo actual es de: $"+saldo,"Retirar Dinero",JOptionPane.WARNING_MESSAGE);
            }
        } while ((montoExt>=saldo)||(montoExt<0));
        saldo = saldo - montoExt;
        ticketExt(saldo,montoExt);
          
        return saldo;
    }
    
        
}
