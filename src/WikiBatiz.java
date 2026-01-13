
import java.util.InputMismatchException;
import java.util.Scanner;
/**Clase principal con metodo main*/
public class WikiBatiz {

    static boolean reinicio = false;

    public static void main(String[] args) {
        proceso();
        ImprimirSalida();
    }

    public static void proceso() {
            ImprimirNombre();
            SeleccionTipoUsuario();
            Separacion();
            if(!reinicio){
                System.out.println("Deseas volver al menu inicial?");
                System.out.println("1.Si 2.No");
                String[] a = {"1. Si", "2. No"};
                Separacion();
                int RepetirConsulta = SeleccionMenu(a, 1, 2);
                if (RepetirConsulta == 2) {
                    return;
                }
            }
            proceso();
    }

    public static void SeleccionTipoUsuario() {
        String[] usuarios = {"1. Administrador", "2. Usuario", "3.Terminar programa"};
        int usuarioSeleccionado = menu(usuarios, "Escoge tu tipo de usuario o terminar el programa");
        Separacion();
        System.out.println("Has seleccionado " + usuarios[usuarioSeleccionado - 1]);
        Separacion();
        switch (usuarioSeleccionado) {
            case 1:
                Administrador.PanelAdministrador();
                break;
            case 2:
                ProcesoUsuario();
                break;
            case 3:ImprimirSalida();
                System.exit(0);
            default:
                System.out.println("Ha ocurrido un error, volviendo al menu inicial");
                reinicio = true;
                break;
        }
    }
    static boolean VienedeUnMenu = false;
    static String[] opcionesMenuUsuario = {
            "1. Actividades Deportivas y Cuturales",
            "2. Tramites",
            "3. Alumnos",
            "4. Eventos",
            "5. Tutorias",
            "6. Salir"
    };

    public static void ProcesoUsuario() {
            int GotoMenu = menu(opcionesMenuUsuario);
            switch (GotoMenu) {
                case 1:
                    ActividadesDeportivasYCulturales.Menu();
                    break;
                case 2:
                    Tramites.proceso();
                    break;
                case 3:
                    Alumnos.proceso();
                    break;
                case 4:
                    Eventos.Menu();
                    break;
                case 5:
                    Tutorias.Menu();
                    break;
                case 6: return;
                default:
                    System.out.println("Ha ocurrido un error inesperado");
                    ProcesoUsuario();
                    break;
            }
            Separacion();
            if (VienedeUnMenu) {
                System.out.println("Regresando al menu de consulta...");
                VienedeUnMenu = false;
            } else {
                String[] a = {"1. Si", "2. No"};
                int RepetirConsulta = menu(a, "¿Deseas realizar otra consulta?");
                if (RepetirConsulta == 2) return;
            }
            ProcesoUsuario();
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

    static void ImprimirSalida() {
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
