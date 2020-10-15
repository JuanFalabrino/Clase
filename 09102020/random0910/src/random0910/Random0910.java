
package random0910;
import java.util.Random;

public class Random0910 {

    
    public static void main(String[] args) {
     
        Random RD = new Random();
        int a,b,c,d,f,z;
        //Imprimir un numero aleatorio de 0 a 10
        a=(RD.nextInt(10)+1);
        System.out.println(a);
        //Imprimir un numero aleatorio de 5 a 10
        c=(RD.nextInt(5) +5 );
        System.out.println(c);
        //Imprimir un numero aleatorio de 1 a 3
        b=(RD.nextInt(3) +1 );
        System.out.println(b);
              
   }
    
}
