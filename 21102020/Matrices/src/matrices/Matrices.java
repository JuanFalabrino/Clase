
package matrices;


public class Matrices {

    public static void main(String[] args) {
      
        // Crear matriz
        String estaciones[][] = new String [2][2];
        
        //llenado de matriz 
        estaciones [0][0]="Otoño";
        estaciones [0][1]="Verano";
        estaciones [1][0]="Invierno";
        estaciones [1][1]="Primavera";
       
        //Imprimir matriz
        System.out.println("La estacion en la posición (0,0): " + estaciones [0][0]);
        System.out.println("La estacion en la posición (0,1): " + estaciones [0][1]);
        System.out.println("La estacion en la posición (1,0): " + estaciones [1][0]);
        System.out.println("La estacion en la posición (1,1): " + estaciones [1][1]);
        
        
        
        
    }
    
}
