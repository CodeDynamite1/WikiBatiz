package CLIversion;

public class Alumnos extends Menu {

    /** Crea gestor de datos para opciones*/
    private static GestorDeDatos opc = new GestorDeDatos("alumnos_opciones");
    /** Crea gestor de datos para mensajes*/
    private static GestorDeDatos msg = new GestorDeDatos("alumnos_mensajes");

    /** Array con opciones*/
    public static String[] opciones = opc.leerDatos();
    /** Array con mensajes*/
    public static String[] mensajes = msg.leerDatos();

    /** Metodo con el proceso de Alumnos */
    public static void proceso() {
        ImprimirArte();
        int op = menu(opciones);

        if (op == opciones.length) return;
        System.out.println(mensajes[op - 1]);
    }

    /** Imprime arte ASCII */
    public static void ImprimirArte(){
        System.out.println("╔══════════════════════════════════════════════════════════════════════════╗")
        System.out.println("║                                                                          ║");
        System.out.println("║      █████╗ ██╗     ██╗   ██╗███╗   ███╗███╗   ██╗ ██████╗ ███████╗      ║");
        System.out.println("║     ██╔══██╗██║     ██║   ██║████╗ ████║████╗  ██║██╔═══██╗██╔════╝      ║");
        System.out.println("║     ███████║██║     ██║   ██║██╔████╔██║██╔██╗ ██║██║   ██║███████╗      ║");
        System.out.println("║     ██╔══██║██║     ██║   ██║██║╚██╔╝██║██║╚██╗██║██║   ██║╚════██║      ║");
        System.out.println("║     ██║  ██║███████╗╚██████╔╝██║ ╚═╝ ██║██║ ╚████║╚██████╔╝███████║      ║");
        System.out.println("║     ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝      ║");
        System.out.println("║                                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════╝");
    }
}
