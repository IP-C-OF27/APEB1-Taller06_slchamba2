
import java.util.Scanner;

/**
 * Ejercicio 07: "
Factura de compras: Una empresa de comercialización de computadoras realiza el 
proceso de venta haciendo un descuento por tipo de cliente:
Si es cliente tipo 1 hay un descuento del 10%
Si es cliente tipo 2 hay un descuento del 20%
En caso que sea otro tipo de cliente, no hay descuento.
Generar un proceso que permita ingresar 7 ventas: 
por cada venta preguntar los siguiente datos:
Nombre del cliente
Costo de la computadora (solo se vende una computadora por transacción)
Tipo de cliente
Presentar el siguiente reporte:
Cliente tipo 1, compra computadora con precio $100"

 * @author Steven Chamba
 * @version 1.0
 */

public class Ejercicio07_FacturasCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        String reporte = "";
        int tipoCliente;
        double costo, descuento, total;
        for (int i = 1; i <= 7; i++) {
            System.out.println("\nVENTA " + i);
            System.out.print("Ingrese el nombre del cliente: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese el costo de la computadora: $");
            costo = tcl.nextDouble();
            System.out.print("Ingrese el tipo de cliente (1 o 2): ");
            tipoCliente = tcl.nextInt();
            tcl.nextLine();
            if (tipoCliente == 1){
                descuento = costo * 0.10;
            }else if (tipoCliente == 2) {
                descuento = costo * 0.20;
            } else {
                descuento = 0;
            }
            total = costo - descuento;
            reporte = reporte + nombre + "\t"
                    + costo + "\t"
                    + descuento + "\t"
                    + total + "\n";
        }
        System.out.println("\n========== FACTURA DE COMPRAS ==========");
        System.out.println("CLIENTE\tCOSTO\tDESCUENTO\tTOTAL");
        System.out.println(reporte);
        tcl.close();
    }
}

/***
 * EVIDENCIA DEL RUN:
 * VENTA 1
Ingrese el nombre del cliente: Steven
Ingrese el costo de la computadora: $100
Ingrese el tipo de cliente (1 o 2): 1

VENTA 2
Ingrese el nombre del cliente: Jhony
Ingrese el costo de la computadora: $1000
Ingrese el tipo de cliente (1 o 2): 1

VENTA 3
Ingrese el nombre del cliente: Xabier 
Ingrese el costo de la computadora: $1200
Ingrese el tipo de cliente (1 o 2): 2

VENTA 4
Ingrese el nombre del cliente: Autor
Ingrese el costo de la computadora: $250
Ingrese el tipo de cliente (1 o 2): 2

VENTA 5
Ingrese el nombre del cliente: Soraya
Ingrese el costo de la computadora: $780
Ingrese el tipo de cliente (1 o 2): 1

VENTA 6
Ingrese el nombre del cliente: Olger
Ingrese el costo de la computadora: $1230
Ingrese el tipo de cliente (1 o 2): 2

VENTA 7
Ingrese el nombre del cliente: Junior
Ingrese el costo de la computadora: $950
Ingrese el tipo de cliente (1 o 2): 1

========== FACTURA DE COMPRAS ==========
CLIENTE	COSTO     DESCUENTO	TOTAL
Steven	100.0       10.0	90.0
Jhony	1000.0      100.0	900.0
Xabier 	1200.0      240.0	960.0
Autor	250.0       50.0	200.0
Soraya	780.0       78.0	702.0
Olger	1230.0      246.0	984.0
Junior	950.0       95.0	855.0
 */