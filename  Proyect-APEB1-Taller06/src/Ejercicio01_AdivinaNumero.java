
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
        int numAdv = 0, intentos = 3;
        System.out.println("Pienso en Num(0-20), adivina: ");
        while(intentos <= 3){
            intentos--;            
            numAdv = tcl.nextInt();
            if (numAdv == numAle){
                System.out.println("Bien, ADIVINASTE");
                break;
            }
            else
                if (numAle > numAdv){
                    System.out.println("Mal, es mayor");
                    
                    System.out.println("Te queda "+ intentos + " intentos");
                }
                else {
                    System.out.println("MAL, es menor");
                    System.out.println("Te queda "+ intentos + " intentos");
                }
        }
        if (numAdv != numAle)
                System.out.println("GAME OVER ");
        }   
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */