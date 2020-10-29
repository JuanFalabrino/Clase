
package ejercicio8;

public class Ejercicio8 {


    public static void main(String[] args) {
        //Vectores
        String Nombre[] = new String [5];
        int Edad[] = new int[5];
        String Sexo [] = new String[5];
        
        //Carga de vectores 
        Nombre[0] = "Juan Perez";
        Nombre[1] = "Luis Gomez";
        Nombre[2] = "Jose Garcia";
        Nombre[3] = "Maria Gonzalez";
        Nombre[4] = "Julia Fernandez";
        
        Edad[0] = 25;
        Edad[1] = 55;
        Edad[2] = 45;
        Edad[3] = 31;
        Edad[4] = 29;
        
        Sexo[0] ="Masculino";
        Sexo[1] ="Masculino";
        Sexo[2] ="Masculino";
        Sexo[3] ="Femenino";
        Sexo[4] ="Femenino";
        
        for (int i = 0;i < Edad.length;i++){
            System.out.println("Nombre: " + Nombre[i]+ "  Edad : " + Edad[i]  + "   Sexo : " + Sexo[i] );
        
        }
        
        
    }
    
}
