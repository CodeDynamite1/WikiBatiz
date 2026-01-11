package CLIversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrador {

    // Método del panel de administrador
    public static void PanelAdministrador() {
        int contrasenaIngresada = 0;
        int contrasenaEsperada = 202509;

        System.out.println("Ingresa la contraseña");

        for (int i = 0; i < 3; i++) {
            Separacion();
            contrasenaIngresada = LeerNum();

            if (contrasenaIngresada == contrasenaEsperada) {
                System.out.println("Ahora eres admin");
                Separacion();
                
                // ✅ Ir directamente al menú principal de consultas
                WikiBatiz.procesoUsuario(); 
                return; // Salir del método PanelAdministrador
            } else {
                Separacion();
                if (i != 2) {
                    System.out.println("Contraseña incorrecta - Intenta ingresarla de nuevo");
                }
            }
        }

        // Si falla 3 intentos
        System.out.println("Demasiados intentos");
        Separacion();
    }

    // Menú de opciones del administrador
    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opción", opciones);
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        return eleccion;
    }

    // Mostrar opciones
    public static void MostrarOpciones(String mensaje, String[] opciones) {
        Separacion();
        System.out.println(mensaje);
        Separacion();
        for (String opcion : opciones) {
            System.out.println(opcion);
        }
        Separacion();
    }

    // Validar selección
    public static int SeleccionMenu(String[] opciones, int minimo, int maximo) {
        int numIngresado = LeerNum();
        while (numIngresado < minimo || numIngresado > maximo) {
            Separacion();
            System.out.println("Ingresa un valor válido según el menú");
            Separacion();
            for (String opcion : opciones) {
                System.out.println(opcion);
            }
            Separacion();
            numIngresado = LeerNum();
        }
        Separacion();
        return numIngresado;
    }

    // Leer número con manejo de error
    public static int LeerNum() {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        try {
            num = leer.nextInt();
        } catch (InputMismatchException e) {
            Separacion();
            System.out.println("Error, no has ingresado un número");
            leer.next(); // limpiar buffer
            return LeerNum(); // pedir de nuevo
        }
        return num;
    }

    // Separador visual
    public static void Separacion() {
        for (int i = 0; i < 150; i++) {
            System.out.print("═");
        }
        System.out.println("\n");
    }
}
