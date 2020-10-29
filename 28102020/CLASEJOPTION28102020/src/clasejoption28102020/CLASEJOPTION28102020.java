
package clasejoption28102020;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CLASEJOPTION28102020 {

    public static void main(String[] args) {
        
        //Mensajes JOPTION
        JOptionPane.showMessageDialog(null,"Este mensaje es de ejemplo Información","Titulo información",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este mensaje es de ejemplo Alerta","Titulo Alerta",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este mensaje es de ejemplo pregunta","Titulo Pregunta",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Este mensaje es de ejemplo Error","Titulo Error",JOptionPane.ERROR_MESSAGE);
         
                
        //Imput INT
          int edad = 0;
          edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        //Imput String
          String Apellido;
          Apellido = JOptionPane.showInputDialog("Ingese Su apellido");
          
          //impimir 
          JOptionPane.showMessageDialog(null,"Apellido: "+ Apellido + "    Edad: " + edad,"Datos usuario",JOptionPane.INFORMATION_MESSAGE);
          
          //ShowOption
          int seleccion = JOptionPane.showOptionDialog(null,"Seleccione una Opción","¿Que desea?",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Milanesa con Papas Fritas","Muzarella con cantinpalo","Ñoquis a la 4 quesos","Barra de cerial"},"Barra de cerial");
        
           JOptionPane.showMessageDialog(null,"Selecciono: "+ seleccion,"Usted selecciono",JOptionPane.INFORMATION_MESSAGE);
           
           
          //Icon personalizado
          ImageIcon icon = new  ImageIcon("src/Imagenes/descarga.png");
          JOptionPane.showMessageDialog(null, "Icon","mostrar icono",JOptionPane.INFORMATION_MESSAGE,icon);
    }
    
}
