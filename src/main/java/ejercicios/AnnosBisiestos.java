
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class AnnosBisiestos {
    public static String evaluar(int anno){
        // TODO: Coloca aquí el código del ejercicio 2: Años bisiestos
        String anio_bisiesto="";
        if (anno%4==0 && (anno%100!=0 || anno%400==0)){
        anio_bisiesto=" es bisiesto";
    }
    else{
        anio_bisiesto=" no es bisiesto";
    }
        return anio_bisiesto;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(anno);
        System.out.println(anno+respuesta);
    }
            
}
