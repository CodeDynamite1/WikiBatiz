package CLIversion;

public class Tutorias extends Menu{
    private static GestorDeDatos opcTutorias = new GestorDeDatos("tutorias_opciones");
    private static GestorDeDatos msjTutorias = new GestorDeDatos("tutorias_mensajes");

    public static String[] opciones = opcTutorias.leerDatos();
    public static String[] mensaje = msjTutorias.leerDatos();

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
