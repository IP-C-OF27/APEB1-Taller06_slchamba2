
import java.util.Scanner;

/**
 * Ejercicio 03: "Serie numérica 2: Realizar un programa Java que permita 
    presentar en pantalla la siguiente secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20"
 * @author Steven Chamba
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
5/10
10/12
15/14
20/16
25/18
30/20
BUILD SUCCESSFUL (total time: 0 seconds)

 */