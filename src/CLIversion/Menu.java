package CLIversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static int menu(String[] opciones) {
        mostrarOpciones("Selecciona una opcion", opciones);
        return seleccionMenu(opciones, 1, opciones.length);
    }

    public static void mostrarOpciones(String mensaje, String[] opciones) {
        separacion();
        System.out.println(mensaje);
        separacion();
        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        separacion();
    }

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

    public static void separacion() {
        for (int i = 0; i < 120; i++) System.out.print("═");
        System.out.println();
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
    }
}
