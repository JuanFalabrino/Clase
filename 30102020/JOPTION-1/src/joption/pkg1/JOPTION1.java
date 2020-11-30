

package joption.pkg1;

import javax.swing.JOptionPane;


public class JOPTION1 {

    public static void main(String[] args) {
      int resp = JOptionPane.showConfirmDialog(null, "¿Quieres salir de la  aplicaión?");
      
        if(JOptionPane.OK_OPTION==resp){
            JOptionPane.showMessageDialog(null,"Genial quetengas un buen dia!!","Mensaje de ok",JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Continue trabajando","informacion",JOptionPane.WARNING_MESSAGE);
               
        }
      
        
    }
    
}
