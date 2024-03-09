
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import  java.util.Scanner;
import  java.time.LocalDate;
/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        // TODO: Coloca aquí el código del ejercicio 6: Edad
         LocalDate currentDate =LocalDate.now();
         int dia_act = currentDate.getDayOfMonth();
         int mes_act = currentDate.getMonthValue();
         int anno_act = currentDate.getYear();
         int edad=anno_act-anno;
         double mesesleidos_a_dias=mes*30.44;
         double mesesactuales_a_dias=mes_act*30.44;
         if (mes_act < mes || (mes_act == mes && dia_act < dia)) {
            edad--;
         }
         String edad_texto = new Integer(edad).toString();
        return edad_texto;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println("Usted tiene "+respuesta+" años");
    }
}
