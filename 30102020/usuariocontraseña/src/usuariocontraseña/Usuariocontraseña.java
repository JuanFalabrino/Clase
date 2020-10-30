
package usuariocontraseña;

import javax.swing.JOptionPane;

public class Usuariocontraseña {

   
    public static void main(String[] args) {
        //usuario y contraseña
        
        String usuario,contraseña;
        String User="Juan";
        String Pass="1234";
         
        //Solicitar usuario y contraseña al usuario
        usuario = JOptionPane.showInputDialog("Ingrese el nombre de Usuario:  ");
        contraseña = JOptionPane.showInputDialog("Ingrese la contraseña del " + usuario + " :  ");
        
        //comparar 
        if(usuario.equals(User) && contraseña.equals(Pass)){
            JOptionPane.showMessageDialog(null,"Buen día " + User );
            }else {
            JOptionPane.showMessageDialog(null,"el Usuario y contraseña brindada no es correcta","Error credenciales",JOptionPane.ERROR_MESSAGE);
        
        }
         
        
           
        
    }
    
}
