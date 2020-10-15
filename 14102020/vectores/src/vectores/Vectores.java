
package vectores;


public class Vectores {

 
    public static void main(String[] args) {
        
        String utiles [] = {"Lapicera","Cuaderno","Cartuchera","Tijeras"};
        double precios[] = {90.1,500.1,1200.1,0};
        
        System.out.println("Listado de utiles escolares");
        //System.out.println(utiles[1]);       
        
        for (int i=0;i<utiles.length;i++){
        System.out.println(utiles[i] + " $ " + precios[i]);
        //System.out.println("mi vector mide " + utiles.length);
                
        } 
         
         
         
    }
    
}
