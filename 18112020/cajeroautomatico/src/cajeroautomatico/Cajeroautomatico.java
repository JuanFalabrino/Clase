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
                        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuotas"));
                        
                        System.out.println("=========="  + opcion );
                         break;
                    case 3:
                         break;
                    case 4: 
                         break;
                }    
           
        }while(op !=5);//cuando se digita 5 se finaliza la aplicacion       
            
            
            
            
            
            
            }else {
            JOptionPane.showMessageDialog(null,"La contraseña es incorrecta su usuario se bloqueará ","Error credenciales",JOptionPane.ERROR_MESSAGE);
        
        }
        
                 
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
        
}
