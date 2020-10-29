
package javaapplication148;

public class JavaApplication148 {

    
    public static void main(String[] args) {
        
        //crear matriz de 3x3 con los numrtos, entre 1 al 9
        //mostrar en pantalla la matriz
        
        
        //crear matriz
        int numero [] []=new int [3][3];
        
        for (int i=0;i<numero.length;i++)
            for (int j=0 ; j< numero[0].length ; j++){
                 numero [i][j] = (i * numero.length) + (j+1);
                 System.out.print(numero[i][j] + " ");
            }
        System.out.println(" ");
        
            
             }
        
        
        
        
        
        
    
    
}
