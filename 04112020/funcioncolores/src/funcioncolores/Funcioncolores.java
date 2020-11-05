
package funcioncolores;

import javax.swing.JOptionPane;

public class Funcioncolores {

    public static void main(String[] args) {
       
    // Se olicita un prgrama que contenga dos funciones una de llenado y otra de mostrar
    // en donde se llene desde un joptionPane y se muestra desde un joption.combobox
    // Se soliictan 5 colores
    
    //vector de 5 lugares
    String [] colores  = new String [5];
    //llame a mis funciones
    llenarVector(colores);
    mostrarVector(colores);
            
    }
    
    public static void llenarVector(String[]colores){
    for(int i=0;i<colores.length;i++){
    //Solicitar al usuario 5 colores
    String color = JOptionPane.showInputDialog("Ingrese 5 Colores distintos " + (i+1) + " de 5 ");
    colores [i] = color;
    }
    }
    public static void mostrarVector(String[]colores){
      //for (String colore : colores){
        //  System.out.print("  " + colore);
         // }
      Object opcion = JOptionPane.showInputDialog(null,"Su Listado de colores es","Mi Listado de colores",JOptionPane.QUESTION_MESSAGE,null,colores,colores[0]);
      System.out.println("    Selecciono del listado el color  : " + opcion);
          }
    
    }
    
    

