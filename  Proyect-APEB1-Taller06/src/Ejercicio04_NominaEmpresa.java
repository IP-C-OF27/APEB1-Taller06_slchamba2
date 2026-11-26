
import java.util.Scanner;

/**
 * Ejercicio 03: "Problema04: Nómina empresa: Realizar un programa Java que
permita pedir por teclado el nombre de 5 empleados. Por cada empleado se debe 
solicitar el nombre, numero de días trabajados y costo del día trabajo. 
Calcular el valor a cancelar por la empresa para cada empleado. Presentar un 
reporte como el siguiente:
NOMBRE	    NUMERO DE       COSTO DEL DÍA	CANTIDAD A CANCELAR
          DÍAS TRABAJADOS
Nombre 1	10              $2.5                       $25
Nombre 2	11              $2                         $22
Nombre 3	9               $3                         $27
Nombre 4	5               $4                         $20
Nombre 5	12              $2                         $24"
 * @author Steven Chamba
 * @version 1.0
 */
public class Ejercicio04_NominaEmpresa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        int dias;
        double costoDia, cantidad;
        System.out.println("NOMINA DE EMPLEADOS");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEmpleado " + i);
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese los dias trabajados: ");
            dias = tcl.nextInt();
            System.out.print("Ingrese el costo del dia: ");
            costoDia = tcl.nextDouble();
            cantidad = dias * costoDia;
            System.out.println("Cantidad a cancelar: $" + cantidad);
            tcl.nextLine();
        }
        System.out.println("\nNomina registrada correctamente.");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * NOMINA DE EMPLEADOS

Empleado 1
Ingrese el nombre: empleado1
Ingrese los dias trabajados: 10
Ingrese el costo del dia: 2,5
Cantidad a cancelar: $25.0

Empleado 2
Ingrese el nombre: empleado2
Ingrese los dias trabajados: 11
Ingrese el costo del dia: 2
Cantidad a cancelar: $22.0

Empleado 3
Ingrese el nombre: empleado3
Ingrese los dias trabajados: 9
Ingrese el costo del dia: 3
Cantidad a cancelar: $27.0

Empleado 4
Ingrese el nombre: empleado4
Ingrese los dias trabajados: 5
Ingrese el costo del dia: 4
Cantidad a cancelar: $20.0

Empleado 5
Ingrese el nombre: empleado5
Ingrese los dias trabajados: 12
Ingrese el costo del dia: 2
Cantidad a cancelar: $24.0

Nomina registrada correctamente.
BUILD SUCCESSFUL (total time: 1 minute 28 seconds)
 */