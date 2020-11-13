
package clase06112020;

import javax.swing.JOptionPane;

public class CLASE06112020 {

    public static void main(String[] args) {
      /*
        Ejercicio N°13
        Crear un programa que nos permita ingresar la marca y el año de un automóvil
        y nos calcule la cuota mensual del seguro.
        - si es una marca de alta gama agregar $1800 cuota final;
        - si no es alta gama agregar $890 cuota final;
        // Crear una función
        - si el año se encuentra entre 1990-1999 = $ 480;
        - si el año se encuentra entre 2000-2010 = $ 780;
        - si el año se encuentra entre 2011-2016 = $ 950;
        - si el año se encuentra entre 2017-2020 = $ 1200;
        - SI NO SE ENCUENTRA EN LOS RANGOS MENCIONADOS = $ 350
        Mostrar en un joptionpane la marca el año y el valor de la cuota final.
 */
            String MARCA;
            int ANIO;
            int CUOTAFINAL = 0;
            String [] ALTAGAMA = {"AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI"};
            String [] FN2187  = {" ","AUDI","VOLVO","MERCEDESBENZ","PORCHE","FERRARI","FORD","FIAT","VW","RENAULT"};
            
            
            
            //Le pido la marca al cliente del vehiculo que tiene o desea cotizar
            // MARCA = JOptionPane.showInputDialog(null,"Por favor ingrese la marca de su Vehiculo","Seguros CFP36",JOptionPane.WARNING_MESSAGE);
            Object MARCA66 = JOptionPane.showInputDialog(null,"Por favor seleccione la marca de su vehiculo","Seguros CFP36",JOptionPane.QUESTION_MESSAGE,null,FN2187,FN2187[0]);
                       
            //Le pido el año del vehiculo que desea cotizar
            ANIO = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese el año de fabricación","Seguros CFP36",JOptionPane.WARNING_MESSAGE));
                        
            // busco la gama si la encuntra la funcion devuelve un true y queda cargado en gama
            boolean GAMA = BUSCARGAMA(ALTAGAMA, MARCA66);
         
            //Con el valor cargado anteriormente establezco la cuotafinal dependiendo si es de alta gama o no
            if (GAMA){
                CUOTAFINAL = 1800;
            }else {
                CUOTAFINAL = 900;           
            }
            
            // busco cuando paga por año en la funcion buscaranio
            int CUOTAANIO = BUSCARANIO(ANIO);
            
            //realizo la operacion con todos los datos ingresados
            CUOTAFINAL = CUOTAFINAL + CUOTAANIO; 
                      
            //Mostrar valor de la cuota
            JOptionPane.showMessageDialog(null,"El valor de la cuota es :  $  " + CUOTAFINAL ,"Seguros CFP36",JOptionPane.INFORMATION_MESSAGE);
                  }
    
    public static boolean BUSCARGAMA(String [] ALTAGAMA, Object MARCA66){
        for (String MARCA2 : ALTAGAMA){
            if (MARCA2.equals(MARCA66)){
                return true;
            }        
        }
        return false;
    }
    public static int BUSCARANIO(int ANIO){
        int cuota = 0;
        if(ANIO>=1990 && ANIO<=1999){
            cuota = 480;
        }else
        if (ANIO>=2000 && ANIO<=2010){
            cuota = 780;                  
        }else 
        if (ANIO>=2011 && ANIO<=2016){
            cuota = 950;
        }else
        if  (ANIO>=2017 && ANIO<=2020){
            cuota = 1200;
        }
        return cuota;    
    }
    
}


