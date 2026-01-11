package CLIversion;

public class Tramites extends Menu {

    private static GestorDeDatos opcTramites =
            new GestorDeDatos("tramites_opciones");
    private static GestorDeDatos msjTramites =
            new GestorDeDatos("tramites_mensajes");

    public static String[] opcionesTramites = opcTramites.leerDatos();
    public static String[] mensajeTramites = msjTramites.leerDatos();

    // 🔴 DEVUELVE true SI QUIERE REGRESAR AL MENÚ
    public static boolean proceso() {

        ImprimirNombre();
        int mostrar = menu(opcionesTramites);

        // OPCIÓN "REGRESAR AL MENÚ"
        if (mostrar == opcionesTramites.length) {
            return true;
        }

        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            default:
                // Reemplazamos los \n literales por saltos de línea reales
                System.out.println(mensajeTramites[mostrar - 1].replace("\\n", "\n"));
                break;
        }

        return false;
    }
}
