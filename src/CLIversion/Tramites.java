package CLIversion;

/**
 * Clase de Tramites con el proceso y la informacion
 */
public class Tramites extends Menu {
    /**
     * Crea un gestor de Datos para opciones
     */
    private static GestorDeDatos opcTramites =
            new GestorDeDatos("tramites_opciones");
    /**
     * Crea un gestor de Datos para mensajes
     */
    private static GestorDeDatos msjTramites =
            new GestorDeDatos("tramites_mensajes");

    /**
     * Array con las opciones leidas desde el documento
     */
    public static String[] opcionesTramites = opcTramites.leerDatos();
    /**
     * Array con las mensajes leidas desde el documento
     */
    public static String[] mensajeTramites = msjTramites.leerDatos();

    /** Proceso en tramites */
    public static void proceso() {

        ImprimirArte();
        int mostrar = menu(opcionesTramites);

        // opcion regresar al menu
        if (mostrar == opcionesTramites.length) {
            return;
        }

        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            default:
                // Toma la cadena de msj, la imprime con saltos en linea para evitar que
                // quede encimado
                System.out.println(mensajeTramites[mostrar - 1].replace("\\n", "\n"));
                break;
        }

        return;
    }

    /** Imprimir Arte ASCII*/
    public static void ImprimirArte(){
        System.out.println("╔══════════════════════════════════════════════════════════════════════════╗")
        System.out.println("║                                                                          ║");
        System.out.println("║     ████████╗██████╗  █████╗ ███╗   ███╗██╗████████╗███████╗███████╗     ║");
        System.out.println("║     ╚══██╔══╝██╔══██╗██╔══██╗████╗ ████║██║╚══██╔══╝██╔════╝██╔════╝     ║");
        System.out.println("║        ██║   ██████╔╝███████║██╔████╔██║██║   ██║   █████╗  ███████╗     ║");
        System.out.println("║        ██║   ██╔══██╗██╔══██║██║╚██╔╝██║██║   ██║   ██╔══╝  ╚════██║     ║");
        System.out.println("║        ██║   ██║  ██║██║  ██║██║ ╚═╝ ██║██║   ██║   ███████╗███████║     ║");
        System.out.println("║        ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝   ╚═╝   ╚══════╝╚══════╝     ║");
        System.out.println("║                                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════╝");
    }
}
