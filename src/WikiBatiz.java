import java.util.InputMismatchException;
import java.util.Scanner;
//* Ya vamos a CHAMBEAR
// Esto esta separado por clases
// No sirve e nada si no podemos usar el POO
// Pero al menos podemos organizar mas el codigo
// Busquen como funcionan las clases y como se acceden a sus métodos y atributos*/
public class WikiBatiz {

    static boolean programaActivo = true;
    static boolean reinicio = false;

    public static void main(String[] args) {
        do {
            ImprimirNombre();
            SeleccionTipoUsuario();
            Separacion();
            if (reinicio) {
                System.out.println("Regresando al menu inicial...");
                reinicio = false;
            }
            if(programaActivo && !reinicio){
                System.out.println("Deseas volver al menu inicial?");
                System.out.println("1.Si 2.No");
                String[] a = {"1. Si", "2. No"};
                Separacion();
                int RepetirConsulta = SeleccionMenu(a, 1, 2);
                if (RepetirConsulta == 2) {
                    programaActivo = false;
                }
            }
        } while (programaActivo);
        ImprimirSalida();
    }

    public static void SeleccionTipoUsuario() {
        String[] usuarios = {"1. Administrador", "2. Usuario", "3.Terminar programa"};
        MostrarOpciones("Escoge tu tipo de usuario o terminar el programa", usuarios);
        int usuarioSeleccionado = SeleccionMenu(usuarios, 1, usuarios.length);
        Separacion();
        System.out.println("Has seleccionado " + usuarios[usuarioSeleccionado - 1]);
        Separacion();
        switch (usuarioSeleccionado) {
            case 1:
                Administrador.PanelAdministrador();
                break;
            case 2:
                usuarioActivo = true;
                ProcesoUsuario();
                break;
            case 3:
                programaActivo = false;
                return;
            default:
                System.out.println("Ha ocurrido un error, volviendo al menu inicial");
                reinicio = true;
                break;
        }
    }
    static boolean VienedeUnMenu = false;
    static boolean usuarioActivo = false;
    static String[] opcionesMenuUsuario = {
            "1. Actividades Deportivas y Cuturales",
            "2. Tramites",
            "3. Alumnos",
            "4. Eventos",
            "5. Tutorias"};

    public static void ProcesoUsuario() {
        do {
            MostrarOpciones("Selecciona tu consulta", opcionesMenuUsuario);
            int GotoMenu = SeleccionMenu(opcionesMenuUsuario, 1, opcionesMenuUsuario.length);
            switch (GotoMenu) {
                case 1:
                    ActividadesDeportivasYCulturales.Menu();
                    break;
                case 2:
                    Tramites.Menu();
                    break;
                case 3:
                    Alumnos.Menu();
                    break;
                case 4:
                    Eventos.Menu();
                    break;
                case 5:
                    Tutorias.Menu();
                    break;
                default:
                    System.out.println("Ha ocurrido un error inesperado");
                    VienedeUnMenu = true;
                    break;
            }
            Separacion();
            if (VienedeUnMenu) {
                System.out.println("Regresando al menu de consulta...");
                VienedeUnMenu = false;
            } else {
                System.out.println("Deseas realizar otra consulta?");
                System.out.println("1.Si 2.No");
                String[] a = {"1. Si", "2. No"};
                Separacion();
                int RepetirConsulta = SeleccionMenu(a, 1, 2);
                if (RepetirConsulta == 2) {
                    usuarioActivo = false;
                }
            }
        } while (usuarioActivo);
    }

    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opcion", opciones);
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        if (eleccion >= opciones.length) {
            VienedeUnMenu = true;
        } else {
            return eleccion;
        }
        return 0;
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
