package CLIversion;

import original.WikiBatiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static int menu(String[] opciones) {
        mostrarOpciones("Selecciona una opcion", opciones);
        int eleccion = seleccionMenu(opciones, 1, opciones.length);
        if (eleccion <= opciones.length) return eleccion;
        return 0;
    }

    public static void mostrarOpciones(String mensaje, String[] opciones) {
        separacion();
        separacion();
        System.out.println(mensaje);
        separacion();
        for (int q = 0; q < opciones.length; q++) {
            System.out.println(opciones[q]);
        }
        separacion();
    }

    public static int seleccionMenu(String[] opciones, int minimo, int maximo) {
        int numIngresado = leerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            separacion();
            System.out.println("Ingresa un valor valido segun el menu");
            separacion();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }
            separacion();
            numIngresado = leerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        separacion();
        return numIngresado;
    }

    public static int leerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        try {
            num = leer.nextInt();
            return num;
        } catch (InputMismatchException e) {
            separacion();
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
        }
        return num;
    }

    public static String leerCadena() {
        String cadena = "";
        Scanner leer = new Scanner(System.in);
        try {
            cadena = leer.nextLine();
        } catch (InputMismatchException e) {
            separacion();
            System.out.println("Ha ocurrido un error");
            leer.next();
        }
        return cadena;
    }

    public static void separacion() {
        for (int i = 0; i < 150; i++) {
            System.out.print("═");
        }
        System.out.println("");
    }

    public static void ImprimirNombre() {
        System.out.println("╔════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                            ║");
        System.out.println("║    ██╗    ██╗ ██╗ ██╗  ██╗ ██╗ ██████╗   █████╗  ████████╗ ██╗ ███████╗    ║");
        System.out.println("║    ██║    ██║ ██║ ██║ ██╔╝ ██║ ██╔══██╗ ██╔══██╗ ╚══██╔══╝ ██║ ╚══███╔╝    ║");
        System.out.println("║    ██║ █╗ ██║ ██║ █████╔╝  ██║ ██████╔╝ ███████║    ██║    ██║   ███╔╝     ║");
        System.out.println("║    ██║███╗██║ ██║ ██╔═██╗  ██║ ██╔══██╗ ██╔══██║    ██║    ██║  ███╔╝      ║");
        System.out.println("║    ╚███╔███╔╝ ██║ ██║  ██╗ ██║ ██████╔╝ ██║  ██║    ██║    ██║ ███████╗    ║");
        System.out.println("║     ╚══╝╚══╝  ╚═╝ ╚═╝  ╚═╝ ╚═╝ ╚═════╝  ╚═╝  ╚═╝    ╚═╝    ╚═╝ ╚══════╝    ║");
        System.out.println("║                                                                            ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════════════╝");
        System.out.println('\n');
    }

    public static int NumEnRango(int minimo, int maximo) {
        int numIngresado = leerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            separacion();
            numIngresado = leerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        separacion();
        return numIngresado;
    }

    public static int NumEnRango(int minimo, int maximo, String mensaje) {
        int numIngresado = leerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            separacion();
            System.out.println(mensaje);
            separacion();
            numIngresado = leerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        separacion();
        return numIngresado;
    }
}
