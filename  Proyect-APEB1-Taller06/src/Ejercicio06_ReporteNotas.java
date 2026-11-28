
import java.util.Scanner;

/**
 * Ejercicio 06: "Problema06 Reporte de notas: Generar un programa Java que 
permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del 
estudiante, el promedio de ciclo.
Presentar el siguiente reporte:

NOMBRE DEL       PROMEDIO       ESTADO
ESTUDIANTE	
Estudiante 1        10         Aprobado
Estudiante 2        6.9        Reprobado
Estudiante 3        7          Aprobado
Estudiante 4        5          Reprobado
Atención: con base al valor del promedio, usted debe asignar en cada registro 
el ESTADO de: Aprobado o Reprobado. 
(Nota: se reprueba cuando la nota es menor a 7 pts.)"
 * @author Steven Chamba
 * @version 1.0
 */

public class Ejercicio06_ReporteNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        String estado;
        double promedio;
        String reporte = "";
        for (int i = 1; i <= 4; i++) {
            System.out.println("ESTUDIANTE " + i);
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();

            System.out.print("Ingrese el promedio: ");
            promedio = tcl.nextDouble();
            tcl.nextLine();
            if (promedio >= 7) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }
            reporte = reporte + nombre + "\t"
                    + promedio + "\t"
                    + estado + "\n";
        }
        System.out.println("\n========== REPORTE DE NOTAS ==========");
        System.out.println("NOMBRE DEL ESTUDIANTE\tPROMEDIO\tESTADO");
        System.out.println(reporte);
        tcl.close();
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
ESTUDIANTE 1
Ingrese el nombre: Estudiante 1
Ingrese el promedio: 10
ESTUDIANTE 2
Ingrese el nombre: Estudiante 2
Ingrese el promedio: 6,9
ESTUDIANTE 3
Ingrese el nombre: Estudiante 3
Ingrese el promedio: 7
ESTUDIANTE 4
Ingrese el nombre: Estudiante 4
Ingrese el promedio: 5

========== REPORTE DE NOTAS ==========
NOMBRE DEL ESTUDIANTE	PROMEDIO	 ESTADO
Estudiante 1              10.0          Aprobado
Estudiante 2              6.9           Reprobado
Estudiante 3              7.0           Aprobado
Estudiante 4              5.0           Reprobado
 */