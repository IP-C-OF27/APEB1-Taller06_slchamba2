
import java.util.Scanner;
import java.util.Random;
/**
 * Ejercicio 01: "Adivina un número: Dada la dinámica de juego computacional,
 * programar una solución que genere un número entero aleatorio entre 1-N, y
 * solicite al usuario lo adivine; dé pistas si es que el usuario falla, 
 * advirtiendo la cantidad de intentos restantes. Si es que no logra adivinar,
 * muestre el mensaje "GAME OVER"."
 * @author Steven Chamba
 * @version 1.0
 */
public class Ejercicio01_AdivinaNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random ale = new Random();
        int numAle = ale.nextInt(21);
        int numAdv = 0;
        int intentos = 0;
        int maxIntentos;
        System.out.print("Ingrese cuantos intentos desea: ");
        maxIntentos = tcl.nextInt();
        System.out.println("Piensa en un numero (0-20), adivina: ");
        while (intentos < maxIntentos) {
            numAdv = tcl.nextInt();
            intentos++;
            if (numAdv == numAle) {
                System.out.println("Bien, ADIVINASTE");
            } else {
                if (numAle > numAdv) {
                    System.out.println("Mal, es mayor");
                } else {
                    System.out.println("Mal, es menor");
                }
            }
            System.out.println("Te quedan "
                    + (maxIntentos - intentos) + " intentos");
            if (numAdv == numAle) {
                break;
            }
        }
        if (numAdv != numAle) {
            System.out.println("GAME OVER");
            System.out.println("El numero era: " + numAle);
        }
        tcl.close();
        }   
}
/***
 * EVIDENCIA DEL RUN:
 * Ingrese cuantos intentos desea: 3
Piensa en un numero (0-20), adivina: 
10
Mal, es menor
Te quedan 2 intentos
5
Mal, es menor
Te quedan 1 intentos
3
Mal, es mayor
Te quedan 0 intentos
GAME OVER
El numero era: 4
 */