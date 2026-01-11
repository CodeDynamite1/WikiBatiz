package CLIversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    /** Muestra las opciones, recibe un numero como entrada y si el numero corresponde a una
     * opcion del menu, el metodo menu lo retorna y en este caso se almacena en la variable
     * opcion, si se ingresa un numero que no corresponda a alguna opcion entonces
     * inicia un hasta que se ingrese un numero que SI correesponda
     */
    public static int menu(String[] opciones) {
        mostrarOpciones("Selecciona una opcion", opciones);
        return seleccionMenu(opciones, 1, opciones.length);
    }

    /**
     *Imprime un array de opciones en la salida del sistema con un mensaje como "encabezado"
     */
    public static void mostrarOpciones(String mensaje, String[] opciones) {
        separacion();
        System.out.println(mensaje);
        separacion();
        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        separacion();
    }

    /**
     * Combinado con mostrarOpciones(), recibe un numero, si el numero se encuentra en un rango
     * especificado (generalmente si el numero corresponde a una opcion) entonces retorna
     * el numero de lo contrario, pedira un numero valido y "recordara" al usuario las opciones
     * hasta que reciba un numero valido y qu pueda retornar
     * @return Un numero dentro de un rango de opciones
     */
    public static int seleccionMenu(String[] opciones, int minimo, int maximo) {
        int num = leerNum();
        while (num < minimo || num > maximo) {
            separacion();
            System.out.println("Ingresa un valor valido");
            separacion();
            for (String opcion : opciones) {
                System.out.println(opcion);
            }
            separacion();
            num = leerNum();
        }
        separacion();
        return num;
    }

    /**
     * Unicamente lee numero y gestiona una excepcion por haber ingresado un dato distinto de
     * un numero
     * @return Numero leido por el teclado
     */
    public static int leerNum() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: ingresa un numero");
            sc.next();
            return leerNum();
        }
    }


    /**
     * Imprime una linea de separacion solo como un elemento visual
     */
    public static void separacion() {
        for (int i = 0; i < 120; i++) System.out.print("═");
        System.out.println();
    }

    /**
     * Imprime un Arte con el nombre, por defecto "WikiBatiz"
     */
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
    }
}
