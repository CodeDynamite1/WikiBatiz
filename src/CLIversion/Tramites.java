package CLIversion;

public class Tramites extends Menu {
    private static GestorDeDatos opcTramites = new GestorDeDatos("tramites_opciones");
    private static GestorDeDatos msjTramites = new GestorDeDatos("tramites_mensajes");

    public static String[] opcionesTramites = opcTramites.leerDatos();
    public static String[] mensajeTramites = msjTramites.leerDatos();

    public static void proceso() {
        ImprimirNombre();
        int mostrar = menu(opcionesTramites);
        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            default:
                System.out.println(mensajeTramites[mostrar - 1]);
                break;
        }
    }


}
