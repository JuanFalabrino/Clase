
package funcioncalculadora;

import javax.swing.JOptionPane;


public class Funcioncalculadora {

    public static void main(String[] args) {
                 
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero entero:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo numero entero:"));
                    
             int  seleccion = JOptionPane.showOptionDialog(null,"Seleccione una OperaciÃ³n",
             "MINICALCULADORA",JOptionPane.YES_NO_CANCEL_OPTION, 
             JOptionPane.INFORMATION_MESSAGE,null,
             new Object []{"Sumar", "Restar","Multiplicar","Division","Promedio"},"Sumar");
        
            switch (seleccion){
                case  0: suma(valor1,valor2);
             break;
                case  1: resta(valor1,valor2);
             break;
                case  2:multi(valor1,valor2);
             break;  
                case  3:
                    //ssoliictar al usuario 5 nuemros (vector)
                    // recorrer el vector y sumar cada uno de sus componentes
                    // divicion para mostrar el promedio 
                   
            }
             
                       
    }
    public static void suma (int v1, int v2){
        int resultado = v1+v2;
        JOptionPane.showMessageDialog(null,resultado);
       }
    
    public static void resta (int v1, int v2){
        int resultado = v1-v2;
        JOptionPane.showMessageDialog(null,resultado);
       }
    public static void multi (int v1, int v2){
        int resultado = v1*v2;
        JOptionPane.showMessageDialog(null,resultado);
       }
    
    
}
