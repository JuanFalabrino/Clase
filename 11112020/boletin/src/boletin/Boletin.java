
package boletin;

import java.util.Scanner;

/**
Realizar un programa con el boletín de un alumno. El mismo debe contener el nombre del alumno, fecha de nacimiento y dni. Debe contener tres notas  de una materia(dos vectores estáticos con tel nombre de la materia y la nota). Al final se debe recorrer el vector eh imprimir por consola  la ficha del alumno con el promedio de cada materia.
Realiza una función para hacer el calculo del promedio
============================
====== Boletín del Alumno ======
== Alumno : Juan C Falabrino ====
== Fecha Nac: 23/06/1981      ====
== Dni: 999999999                    ====
== Materia =======  Nota   ======
= Literatura    =1=      4          ======
=                      =2=      6          ======
=                      =3=      9          ======
============================
Promedio de :         6,333      =====
===========================

@author JuFalabrino
 */
public class Boletin {

    public static void main(String[] args) {
       
        Scanner ingreso = new Scanner(System.in);
        String alumno,fechanac;
        int dni;
        
        //pido nombre del alumno
        System.out.print("Ingrese el nombre completo del alumno: ");
        alumno = ingreso.nextLine();
        //pido la fecha de nacimiento 
        System.out.print("Ingrese la fecha de nacimiento : ");
        fechanac = ingreso.nextLine();
        //pido DNI del alumno
        System.out.print("Ingrese el numero de DNI  del alumno : ");
        dni = ingreso.nextInt();
        
        System.out.print("Por favor ingrese el numero de Materias que desea cargar al boletín :");
        int nmaterias = ingreso.nextInt();
        
        String materias[] = new String [nmaterias];//materias[1][nMaterias]
        int notas [][] = new int [nmaterias][3];
        int mnotas = notas[0].length; //sacar el numero de columnas de una matriz
        float promedios[] = new float[nmaterias];
          
        
        //solicitar nombre de las materias 
        for (int i=0;i<nmaterias;i++){
            System.out.print(+ (i+1) + "/" + nmaterias + "  Ingrese el nombre de la Materia : ");
            materias[i]=ingreso.next();
                 
        //solicitar materias 
        for(int j=0;j<mnotas;j++){
            do{
            System.out.print((j+1)+"  Ingrese la nota(sin decimales):  ");
            notas[i][j]= ingreso.nextInt();//se repite por 3 veces por que se debe ingresar 3 por materia
            }while(notas[i][j]<=0 || notas[i][j]>10);
            promedios[i]+= notas [i][j] ;
        }
            promedios[i]/=3;
        }
        
        //funcion hacer una funcion 
        
        System.out.println("");
        System.out.println("================================================");
        System.out.println("============ Boletín del Alumno ================");
        System.out.println("====Alumno : "+alumno+ "===========");
        System.out.println("====Fecha de Nacimiento : "+fechanac+ "===========");
        System.out.println("====DNI : "+dni+ "==============");
        System.out.println("================================================");       
        
        //imprimir notas y promedio
        for(int i=0;i<nmaterias;i++){
            System.out.println("===" +materias[i]+ "==");
            for (int j=0;j<mnotas;j++){
            System.out.println(" ="+(j+1)+"= "+notas[i][j]+" ===" );
            }
        System.out.println("================================================");
        System.out.println("Promedio: " +Math.round(promedios[i]));
        System.out.println("================================================");
        System.out.println("================================================");
        }
        
        
        
        
        
    }
    
}
