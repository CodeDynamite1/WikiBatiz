package CLIversion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WikiBatiz {

    private static boolean modoAdmin = false;
    private static String usuarioActivo = "Invitado";

    public static void main(String[] args) {
        proceso();
    }

    public static void proceso() {
            procesoUsuario();
    }

    static String[] opcionesMenuUsuario = {
            "1. Actividades Deportivas y Cuturales",
            "2. Tramites",
            "3. Alumnos",
            "4. Eventos",
            "5. Tutorias",
            "6. Cambiar Usuario",
            "7. Salir",
    };

    public static void procesoUsuario() {
        imprimirNombre();
        MostrarOpciones("Selecciona tu consulta", opcionesMenuUsuario);
        int GotoMenu = SeleccionMenu(opcionesMenuUsuario, 1, opcionesMenuUsuario.length);
        switch (GotoMenu) {
            case 1:
                ActividadesDeportivasYCulturales.proceso();
                break;
            case 2:
                Tramites.proceso();
                break;
            case 3:
                Alumnos.proceso();
                break;
            case 4:
                Eventos.proceso();
                break;
            case 5:
                Tutorias.proceso();
                break;
            case 6:
                panelAdministrador();
                break;
            case 7:
                imprimirSalida();
                return;
            default:
                System.out.println("Ha ocurrido un error inesperado");
                break;
        }
        separacion();
        System.out.println("Deseas realizar otra consulta?");
        System.out.println("1.Si 2.No");
        String[] a = {"1. Si", "2. No"};
        separacion();
        int RepetirConsulta = SeleccionMenu(a, 1, 2);
        if (RepetirConsulta == 1) {
            proceso();
        } else {
            imprimirSalida();
        }
    }

    public static void MostrarOpciones(String mensaje, String[] opciones) {
        separacion();
        mostrarUsuarioActivo();
        separacion();
        System.out.println(mensaje);
        separacion();
        for (int q = 0; q < opciones.length; q++) {
            System.out.println(opciones[q]);
        }
        separacion();
    }

    public static int SeleccionMenu(String[] opciones, int minimo, int maximo) {
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

    public static void mostrarUsuarioActivo() {
        System.out.printf("Usuario: %s \n", usuarioActivo);
    }

    public static void panelAdministrador() {
        String password = "2025090358";
        String passwordLeida = "";
        boolean acceso = false;
        System.out.println("Ingresa la contraseña");
        for (int i = 0; i < 3; i++) {
            passwordLeida = leerCadena();
            acceso = passwordLeida.equals(password);
            if (acceso) {
                break;
            } else {
                separacion();
                System.out.println("Contraseña Incorrecta");
                separacion();
            }
        }
        if (acceso) {
            System.out.println("Concediendo permisos");
            cambiarUsuario(true);
        } else {
            System.out.println("Permiso no concedido");
            System.out.println("Regresando al menu principal");
            proceso();
        }

    }

    public static void cambiarUsuario(boolean admin) {
        modoAdmin = true;
        usuarioActivo = "Administrador";
    }

    public static void imprimirNombre() {
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

    private static void imprimirSalida() {
        System.out.println(" ██████╗ ██████╗  █████╗  ██████╗██╗ █████╗ ███████╗    ██████╗  ██████╗ ██████╗     ██╗   ██╗███████╗ █████╗ ██████╗ ");
        System.out.println("██╔════╝ ██╔══██╗██╔══██╗██╔════╝██║██╔══██╗██╔════╝    ██╔══██╗██╔═══██╗██╔══██╗    ██║   ██║██╔════╝██╔══██╗██╔══██╗");
        System.out.println("██║  ███╗██████╔╝███████║██║     ██║███████║███████╗    ██████╔╝██║   ██║██████╔╝    ██║   ██║███████╗███████║██████╔╝");
        System.out.println("██║   ██║██╔══██╗██╔══██║██║     ██║██╔══██║╚════██║    ██╔═══╝ ██║   ██║██╔══██╗    ██║   ██║╚════██║██╔══██║██╔══██╗");
        System.out.println("╚██████╔╝██║  ██║██║  ██║╚██████╗██║██║  ██║███████║    ██║     ╚██████╔╝██║  ██║    ╚██████╔╝███████║██║  ██║██║  ██║");
        System.out.println(" ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝╚═╝  ╚═╝╚══════╝    ╚═╝      ╚═════╝ ╚═╝  ╚═╝     ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝");
        System.out.println("            ██╗    ██╗ ██╗ ██╗  ██╗ ██╗ ██████╗   █████╗  ████████╗ ██╗ ███████╗    ");
        System.out.println("            ██║    ██║ ██║ ██║ ██╔╝ ██║ ██╔══██╗ ██╔══██╗ ╚══██╔══╝ ██║ ╚══███╔╝    ");
        System.out.println("            ██║ █╗ ██║ ██║ █████╔╝  ██║ ██████╔╝ ███████║    ██║    ██║   ███╔╝     ");
        System.out.println("            ██║███╗██║ ██║ ██╔═██╗  ██║ ██╔══██╗ ██╔══██║    ██║    ██║  ███╔╝      ");
        System.out.println("            ╚███╔███╔╝ ██║ ██║  ██╗ ██║ ██████╔╝ ██║  ██║    ██║    ██║ ███████╗    ");
        System.out.println("             ╚══╝╚══╝  ╚═╝ ╚═╝  ╚═╝ ╚═╝ ╚═════╝  ╚═╝  ╚═╝    ╚═╝    ╚═╝ ╚══════╝    ");
    }
}
