
package juegodelvaso;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Juegodelvaso {


    public static void main(String[] args) {
        
        Random RD = new Random();
        int pelotita = RD.nextInt(3);
        ImageIcon Bien = new ImageIcon("src/Imagenes/bien.png");
        ImageIcon Mal = new ImageIcon("src/Imagenes/Mal.png");
        ImageIcon Icon = new ImageIcon("src/Imagenes/juego.png");
        
        int seleccion = JOptionPane.showOptionDialog(null,"Encuentre la pelotita escondida","Juego del Vaso",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,Icon,
                        new Object []{"Vaso 1", "Vaso 2","Vaso 3"},"Vaso 1" );
        
        if (pelotita==seleccion){
           JOptionPane.showMessageDialog(null,"MUY BIEN", "Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Bien);
                 
        } else {
           JOptionPane.showMessageDialog(null,"MUY MAL", "Juego del Vaso",JOptionPane.INFORMATION_MESSAGE,Mal);
        }
            
        
        
        
        
        
        
        
        
        
    }
    
}
