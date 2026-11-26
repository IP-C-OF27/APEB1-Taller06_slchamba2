
import java.util.Scanner;

/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio03_SerieNumerica02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
         int numerador,denominador = 10;
        for (numerador = 5; numerador <= 30; numerador += 5) {
            System.out.println(numerador + "/" + denominador);
            denominador = denominador + 2;
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */