import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumnos {
    public static void proceso() {
        ImprimirAlumnos();
        int mostrar = menu(Datos.opcionesAlumnos);
        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            case 1:
                String[] grupos = {
                        "1. 3IM1",
                        "2. 3IM2",
                        "3. 3IM3",
                        "4. 3IM4",
                        "5. 3IM5",
                        "6. 3IM6",
                        "7. 3IM7",
                        "8. 3IM8",
                        "9. 3IM9"
                };
                int eleccionGrupo = menu(grupos,"Escribe el numero que corresponda a tu grupo");
                System.out.println(Datos.tablasGrupos[--eleccionGrupo]);
                break;
            default:
                System.out.println(Datos.mensajeAlumnos[mostrar - 1]);
                break;
        }
    }
    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opcion", opciones);
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        if (eleccion >= opciones.length) {
            WikiBatiz.VienedeUnMenu = true;
        }
        return eleccion;
    }

    public static int menu(String[] opciones, String mensaje) {
        System.out.println(mensaje);
        int eleccion = menu(opciones);
        return eleccion;
    }

    public static void MostrarOpciones(String mensaje, String[] opciones) {
        Separacion();
        System.out.println(mensaje);
        Separacion();
        for (int q = 0; q < opciones.length; q++) {
            System.out.println(opciones[q]);
        }
        Separacion();
    }

    public static int SeleccionMenu(String[] opciones, int minimo, int maximo) {
        int numIngresado = LeerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            Separacion();
            System.out.println("Ingresa un valor valido segun el menu");
            Separacion();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }
            Separacion();
            numIngresado = LeerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        Separacion();
        return numIngresado;
    }

    public static int LeerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        try {
            num = leer.nextInt();
            return num;
        } catch (InputMismatchException e) {
            Separacion();
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
        }
        return num;
    }

    public static void Separacion() {
        for (int i = 0; i < 150; i++) {
            System.out.print("═");
        }
        System.out.print('\n');
    }

    public static void printlnColor(String linea){
        String colorTexto = "\u001B[38;2;245;81;27m";
        String coloresPolitecnicos = colorTexto;
        String quitarColores = "\u001b[0m";
        System.out.println(coloresPolitecnicos + linea + quitarColores);
    }

    public static void ImprimirAlumnos() {
        printlnColor("╔══════════════════════════════════════════════════════════════════╗");
        printlnColor("║                                                                  ║");
        printlnColor("║  █████╗ ██╗     ██╗   ██╗███╗   ███╗███╗   ██╗ ██████╗ ███████╗  ║");
        printlnColor("║ ██╔══██╗██║     ██║   ██║████╗ ████║████╗  ██║██╔═══██╗██╔════╝  ║");
        printlnColor("║ ███████║██║     ██║   ██║██╔████╔██║██╔██╗ ██║██║   ██║███████╗  ║");
        printlnColor("║ ██╔══██║██║     ██║   ██║██║╚██╔╝██║██║╚██╗██║██║   ██║╚════██║  ║");
        printlnColor("║ ██║  ██║███████╗╚██████╔╝██║ ╚═╝ ██║██║ ╚████║╚██████╔╝███████║  ║");
        printlnColor("║ ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝  ║");
        printlnColor("╚══════════════════════════════════════════════════════════════════╝");
        System.out.println('\n');
    }
}
