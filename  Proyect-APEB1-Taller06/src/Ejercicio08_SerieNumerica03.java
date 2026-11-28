
import java.util.Scanner;

/**
 * Ejercicio 08: "Serie numérica 3: Generar e imprimir la siguiente serie y su sumatoria:

sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)"
 * @author Steven Chamba 
 * @version 1.0
 */
public class Ejercicio08_SerieNumerica03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double sumatoria = 0;
        double termino;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                termino = 1.0 / i;
            } else {
                termino = -1.0 / i;
            }
            sumatoria = sumatoria + termino;
            System.out.print("(" + (i % 2 == 0 ? "+" : "-")
                    + "1/" + i + ")");
        }
        System.out.println("\n\nSumatoria = " + sumatoria);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * (-1/1)(+1/2)(-1/3)(+1/4)(-1/5)(+1/6)(-1/7)(+1/8)(-1/9)(+1/10)
Sumatorbia = -0.6456349206349207
 */