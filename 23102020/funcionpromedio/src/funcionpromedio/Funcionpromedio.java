
package funcionpromedio;

public class Funcionpromedio {

  
    public static void main(String[] args) {
       int[] numeros = {5,10,7,8,9,2,3};
       System.out.println(promedio(numeros));
             
             
    }
    
    public static float promedio(int[] V2){
        int suma =0;
        for (int i = 0;i<V2.length;i++){
            suma = suma + V2[i];
               
        }
        return suma/V2.length;
        
    
    }
    
}
