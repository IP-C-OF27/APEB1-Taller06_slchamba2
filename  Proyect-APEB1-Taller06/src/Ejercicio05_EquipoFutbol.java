
import java.util.Scanner;

/**
 * Ejercicio 05: "Equipo de futbol: Generar una solución que permita ingresar 
jugadores de fútbol; por cada jugador se debe solicitar:
Nombre el jugador
Posición en el campo de juego
Edad
Estatura
El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Promedio de edades:  26.8
Promedio de estaturas: 1.87"
 * @author NombreAutor
 * @version 1.0
 */

public class Ejercicio05_EquipoFutbol {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, posicion;
        String listado = "";
        int edad, contador = 0;
        double estatura;
        int sumaEdades = 0;
        double sumaEstaturas = 0;
        String continuar;
        do {
            contador++;
            System.out.println("\nJugador " + contador);
            System.out.print("Ingrese el nombre: ");
            nombre = tcl.nextLine();
            System.out.print("Ingrese la posicion: ");
            posicion = tcl.nextLine();
            System.out.print("Ingrese la edad: ");
            edad = tcl.nextInt();
            System.out.print("Ingrese la estatura: ");
            estatura = tcl.nextDouble();
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            listado = listado + contador + ". " + nombre + " -" 
                    + posicion + "-, edad " + edad 
                    + ", estatura " + estatura;
            tcl.nextLine();
            System.out.print("Desea ingresar otro jugador (si/no): ");
            continuar = tcl.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
        double promedioEdades = (double) sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;
        System.out.println("\nLISTADO DE JUGADORES");
        System.out.println(listado);
        System.out.println("Promedio de edades: " + promedioEdades);
        System.out.println("Promedio de estaturas: " + promedioEstaturas);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * 
Jugador 1
Ingrese el nombre: Alexander Domingez
Ingrese la posicion: Arquero
Ingrese la edad: 32
Ingrese la estatura: 1,95
Desea ingresar otro jugador (si/no): si

Jugador 2
Ingrese el nombre: Xavier Arreaga
Ingrese la posicion: Defensa
Ingrese la edad: 24
Ingrese la estatura: 1,85
Desea ingresar otro jugador (si/no): si

Jugador 3
Ingrese el nombre: Moises Caicedo
Ingrese la posicion: Mediocentro
Ingrese la edad: 19
Ingrese la estatura: 1,88
Desea ingresar otro jugador (si/no): si

Jugador 4
Ingrese el nombre: Angel Mena
Ingrese la posicion: Delantero
Ingrese la edad: 27
Ingrese la estatura: 1,93
Desea ingresar otro jugador (si/no): si

Jugador 5
Ingrese el nombre: Michael Estrada 
Ingrese la posicion: Delantero 
Ingrese la edad: 27
Ingrese la estatura: 1,93
Desea ingresar otro jugador (si/no): no

LISTADO DE JUGADORES
1. Alexander Domingez -Arquero-, edad 32, estatura 1.952.
2. Xavier Arreaga-Defensa-, edad 24, estatura 1.853. 
3. Moises Caicedo -Mediocentro-, edad 19, estatura 1.884.
4. Angel Mena -Delantero-, edad 27, estatura 1.935.
5. Michael Estrada  -Delantero 27-, edad 27, estatura 1.93
Promedio de edades: 25.8
Promedio de estaturas: 1.908
 */