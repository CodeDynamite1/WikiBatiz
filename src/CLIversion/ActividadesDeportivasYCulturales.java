package CLIversion;

public class ActividadesDeportivasYCulturales extends Menu {

    private static GestorDeDatos opcActividades =
            new GestorDeDatos("actividades_deportivas_culturales_opciones");
    private static GestorDeDatos msjActividades =
            new GestorDeDatos("actividades_deportivas_culturales_mensajes");

    public static String[] opcionesActividades = opcActividades.leerDatos();
    public static String[] mensajeActividades = msjActividades.leerDatos();

    // 🔴 AHORA REGRESA boolean
    public static boolean proceso() {

        ImprimirNombre();
        int mostrar = menu(opcionesActividades);

        // ✅ OPCIÓN 4 → REGRESAR
        if (mostrar == 4) {
            System.out.println("Regresando al menu de consulta...");
            return false; // 👈 AVISA QUE NO SE PREGUNTE NADA
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

        return true; // 👈 SÍ se puede preguntar
    }

    public static void ImprimirNombre() {
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

