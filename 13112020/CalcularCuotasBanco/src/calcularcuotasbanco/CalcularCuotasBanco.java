
package calcularcuotasbanco;

import javax.swing.JOptionPane;

/**
 Realizar un programa que calcule las cuotas de un préstamo bancario. 
Solicitarle al Cliente por JOPTIONPANE :
Nombre  y apellido
DNI
Sueldo Mensual:
Solicitado:
Cuotas : hasta 12 

Calculo: 
•	El banco presta hasta 100000 pesos siempre y cuando el sueldo del solicitante superé los 200000 anuales.
•	El préstamo  no debe superar a los 10 sueldos del cliente.
•	Calculo = solicitado / cuota

Imprimir la información consola
Logo del banco 
Información del cliente  
Monto solicitado
Cantidad de cuotas
Importe a pagar
Y Si esta aprobado o no 

 */
public class CalcularCuotasBanco {

  
    public static void main(String[] args) {
        String nombreApellido = JOptionPane.showInputDialog("Ingrese su Nombre y Apellido:");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su DNI: "));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo mensual:"));
        int prestamo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto solicitado: "));
        int cuotas = 0;
        double montoCuotas;
        boolean otorgado = false;

        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de cuotas"));

            if (opcion > 0 && opcion <= 12) {
                cuotas = opcion;
            } else {
                JOptionPane.showMessageDialog(null, "Las cuotas deben estar entre 1 y 12 \nVuelva a intertarlo");
            }

        } while (cuotas == 0);

       if (prestamo>200000){
            JOptionPane.showMessageDialog(null, "El banco solo puede dar hasta 200000 pesos disculpe");
            }
       
        if (200000 < (sueldo * 12)) {

            double montoPrestamo = sueldo * 10;
            if (prestamo <= montoPrestamo) {

                montoCuotas = prestamo / cuotas;
                otorgado = true;

                datosUsuario(nombreApellido, dni, sueldo);
                datosPrestamo(prestamo, montoCuotas, cuotas);
                validaOtorgado(otorgado);
            }

        } else {
            otorgado = false;
            validaOtorgado(otorgado);

        }

        //System.out.println(prestamo + " " + montoCuotas + " " + cuotas);
    }
        public static void datosUsuario(String nombreApellido,int dni,double sueldo){
            System.out.println("=================================\n"
                               +"========== BANCO CFP36 =========\n"
                               +"================================");
            System.out.println("Cliente: " + nombreApellido+ "\nDNI: " + dni + "\nSueldo"+sueldo);
            
             }
        public static void datosPrestamo(double prestamo,double montoCuotas,int cuotas){
            System.out.println("Monto solicitado: "+prestamo+ "\nCuotas a Pagar: "+montoCuotas+ "\nCantidad de Cuotas: "+cuotas);
                   
        }
        
        public static void validaOtorgado(boolean otorgado){
        if (otorgado){
            System.out.println("Prestamo APROBADO");
            System.out.println("=================================");
        }else{
            JOptionPane.showMessageDialog(null,"No se puede otorgar el prestamo\nDEDEGADO");
        }
        
        }
    }
    

