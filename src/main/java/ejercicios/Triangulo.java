package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        // TODO: Coloca aquí el código del ejercicio 7: Triángulos
       String triangulo="";
        if (a + b <= c || b + c <= a || c + a <= b){
        triangulo="no es un triangulo valido";
        }
        else if (a==b && b==c){
        triangulo="Triangulo equilatero";
        }
         else if (a == b || b == c || c == a) {
            triangulo = "Triángulo isósceles";
         }
         else {
            triangulo = "Triángulo escaleno";
         }
        return triangulo;
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
