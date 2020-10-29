
package promedio;

public class Promedio {

  
    public static void main(String[] args) {
       int[] numeros = {4,3,7,8,7,2,3};
       System.out.println("El promedio de mi vector es " + (promedio(numeros)));
        
    }
    public static float promedio(int[] v2){
        int suma=0;
        for (int i = 0;i<v2.length;i++){
        suma = suma + v2[i];
        }
        return suma/v2.length;
      
    }
    
     
}
