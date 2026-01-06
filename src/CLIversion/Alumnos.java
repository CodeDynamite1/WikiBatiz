package CLIversion;

public class Alumnos extends Menu{
    private static GestorDeDatos opcAlumnos = new GestorDeDatos("alumnos_opciones");
    private static GestorDeDatos msjAlumnos = new GestorDeDatos("alumnos_mensajes");

    public static String[] opciones = opcAlumnos.leerDatos();
    public static String[] mensaje = msjAlumnos.leerDatos();

    public static void proceso() {
        ImprimirNombre();
        int mostrar = menu(opciones);
        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            default:
                System.out.println(mensaje[mostrar - 1]);
                break;
        }
    }
}
