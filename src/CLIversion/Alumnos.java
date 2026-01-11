package CLIversion;

public class Alumnos extends Menu {

    private static GestorDeDatos opc = new GestorDeDatos("alumnos_opciones");
    private static GestorDeDatos msg = new GestorDeDatos("alumnos_mensajes");

    public static String[] opciones = opc.leerDatos();
    public static String[] mensajes = msg.leerDatos();

    public static void proceso() {
        ImprimirNombre();
        int op = menu(opciones);

        if (op == opciones.length) return;

        System.out.println(mensajes[op - 1]);
    }
}
