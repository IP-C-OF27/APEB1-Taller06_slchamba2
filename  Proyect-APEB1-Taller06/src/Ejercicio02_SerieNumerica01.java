
import java.util.Scanner;

/**
 * Ejercicio 02: "Serie numérica 1: Realizar un programa Java que permita 
 * presentar en pantalla la siguiente secuencia:
	1/10
	2/11
	3/12
	4/13
	5/14
	6/15"
 * @author Steven Chamba 
 * @version 1.0
 */
public class Ejercicio02_SerieNumerica01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numerador = 1;
        int denominador = 10;
        do {
            System.out.println(numerador + "/" + denominador);
            numerador++;
            denominador++;

        } while (numerador <= 6);

    }
 
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */