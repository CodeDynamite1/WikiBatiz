package CLIversion;

public class ActividadesDeportivasYCulturales extends Menu {

    /** Crea un gestor de Datos para opciones */
    private static GestorDeDatos opcActividades =
            new GestorDeDatos("actividades_deportivas_culturales_opciones");
    /** Crea un gestor de Datos para mensajes */
    private static GestorDeDatos msjActividades =
            new GestorDeDatos("actividades_deportivas_culturales_mensajes");

    /** Array con opciones */
    public static String[] opcionesActividades = opcActividades.leerDatos();
    /** Array con mensajes */
    public static String[] mensajeActividades = msjActividades.leerDatos();

    /** Proceso de Actividades Deportivas y Culturales*/
    public static void proceso() {

        ImprimirArte();
        int mostrar = menu(opcionesActividades);

        if (mostrar == 4) {
            System.out.println("Regresando al menu de consulta...");
            return;
        }

        String msj = mensajeActividades[mostrar - 1];

        if (msj.contains("¡")) {
            String[] print = msj.split("¡");
            for (String linea : print) {
                System.out.println(linea);
            }
        } else {
            System.out.println(msj);
        }

        return;
    }
    /**Imprime Arte Ascii */
    public static void ImprimirArte() {
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                                                                                                                       ║");
        System.out.println("║    █████╗  ██████╗████████╗██╗██╗   ██╗██╗██████╗  █████╗ ██████╗ ███████╗███████╗    ██████╗ ███████╗██████╗  ██████╗ ██████╗ ████████╗██╗██╗   ██╗ █████╗ ███████╗  ║");
        System.out.println("║   ██╔══██╗██╔════╝╚══██╔══╝██║██║   ██║██║██╔══██╗██╔══██╗██╔══██╗██╔════╝██╔════╝    ██╔══██╗██╔════╝██╔══██╗██╔═══██╗██╔══██╗╚══██╔══╝██║██║   ██║██╔══██╗██╔════╝  ║");
        System.out.println("║   ███████║██║        ██║   ██║██║   ██║██║██║  ██║███████║██║  ██║█████╗  ███████╗    ██║  ██║█████╗  ██████╔╝██║   ██║██████╔╝   ██║   ██║██║   ██║███████║███████╗  ║");
        System.out.println("║   ██╔══██║██║        ██║   ██║╚██╗ ██╔╝██║██║  ██║██╔══██║██║  ██║██╔══╝  ╚════██║    ██║  ██║██╔══╝  ██╔═══╝ ██║   ██║██╔══██╗   ██║   ██║╚██╗ ██╔╝██╔══██║╚════██║  ║");
        System.out.println("║   ██║  ██║╚██████╗   ██║   ██║ ╚████╔╝ ██║██████╔╝██║  ██║██████╔╝███████╗███████║    ██████╔╝███████╗██║     ╚██████╔╝██║  ██║   ██║   ██║ ╚████╔╝ ██║  ██║███████║  ║");
        System.out.println("║   ╚═╝  ╚═╝ ╚═════╝   ╚═╝   ╚═╝  ╚═══╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝╚══════╝    ╚═════╝ ╚══════╝╚═╝      ╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═══╝  ╚═╝  ╚═╝╚══════╝  ║");
        System.out.println("║                                                                                                                                                                       ║");
        System.out.println("║           ██╗   ██╗     ██████╗██╗   ██╗██╗  ████████╗██╗   ██╗██████╗  █████╗ ██╗     ███████╗███████╗                                                               ║");
        System.out.println("║           ╚██╗ ██╔╝    ██╔════╝██║   ██║██║  ╚══██╔══╝██║   ██║██╔══██╗██╔══██╗██║     ██╔════╝██╔════╝                                                               ║");
        System.out.println("║            ╚████╔╝     ██║     ██║   ██║██║     ██║   ██║   ██║██████╔╝███████║██║     █████╗  ███████╗                                                               ║");
        System.out.println("║             ╚██╔╝      ██║     ██║   ██║██║     ██║   ██║   ██║██╔══██╗██╔══██║██║     ██╔══╝  ╚════██║                                                               ║");
        System.out.println("║              ██║       ╚██████╗╚██████╔╝███████╗██║   ╚██████╔╝██║  ██║██║  ██║███████╗███████╗███████║                                                               ║");
        System.out.println("║              ╚═╝        ╚═════╝ ╚═════╝ ╚══════╝╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚══════╝╚══════╝                                                               ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println('\n');
    }
}

