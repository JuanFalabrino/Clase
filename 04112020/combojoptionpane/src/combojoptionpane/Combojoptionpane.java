
package combojoptionpane;

import javax.swing.JOptionPane;

public class Combojoptionpane {

    public static void main(String[] args) {
       //crear vector
        String [] colores = {"Rojo","Negro", "Azul","Naranja"};
       
       //Mostrar Vector
        
        Object kim = JOptionPane.showInputDialog(null,"Seleccionar un color","Colores",JOptionPane.QUESTION_MESSAGE,null,colores,colores[0]);
        
        System.out.println(kim);
        
        
    }
    
}
