
package escaleraclase0710;

public class EscaleraClase0710 {

    public static void main(String[] args) {
       
        // contador de 0 a 9 por for
       System.out.println("Serie con For:  ");
        for(int i=0;i<=9;i++){
            if(i<9){
            System.out.print(i + ",");
           }else {
             System.out.println(i);           
           }
        }
        System.out.println("Serie con while:  ");
        int x= 0;
        while(x<=9){
         if(x<9){
            System.out.print(x + ",");
           }else {
             System.out.println(x);           
         }
           x++;            
         }
        int y=0;  
        System.out.println("Serie con do while:  ");
           do{
           if(y<9){
            System.out.print(y + ",");
           }else {
             System.out.print(y);           
           }
           y++;               
           
           }while(y<=9);
    }
           
           
        
    }
    

