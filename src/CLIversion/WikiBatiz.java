package CLIversion;

/** Clase Principal con el metodo main */

public class WikiBatiz{

    public static void main(String[] args) {
        menuInicial();
    }

    /**
     * Menu de Seleccion de Usuario, muestra la opcion administrador o alumno y en base a la
     * seleccion ejecuta el procso administrador o usuario
     */
    public static void menuInicial() {
        while (true) {

            imprimirNombre();

            String[] opcionesInicio = {
                    "1. Administrador",
                    "2. Usuario/ALumno",
                    "3. Salir"
            };

            int opcion = Menu.menu(opcionesInicio);

            switch (opcion) {
                case 1:
                    //Llama al panel administrador
                    Administrador.PanelAdministrador();
                    break;

                case 2:
                    procesoUsuario();
                    break;

                case 3:
                    System.out.println("GRACIAS POR USAR WIKIBATIZ");
                    System.exit(0);
            }
        }
    }

    /** Menu Usuario */
    public static void procesoUsuario() {

        while (true) {

            imprimirNombre();

            String[] opcionesUsuario = {
                    "1. Actividades Deportivas y Culturales",
                    "2. Tramites",
                    "3. Alumnos",
                    "4. Eventos",
                    "5. Tutorias",
                    "6. Regresar al menu inicial",
                    "7. Salir"
            };

            Menu.mostrarOpciones("Selecciona tu consulta", opcionesUsuario);
            int opcion = Menu.seleccionMenu(opcionesUsuario, 1, opcionesUsuario.length);

            switch (opcion) {
                case 1:
                    ActividadesDeportivasYCulturales.proceso();
                    break;
                case 2:
                    Tramites.proceso();
                    break;
                case 3:
                    Alumnos.proceso();
                    break;
                case 4:
                    Eventos.proceso();
                    break;
                case 5:
                    Tutorias.proceso();
                    break;
                case 6:
                    return; // Regresar al menú inicial
                case 7:
                    System.out.println("GRACIAS POR USAR WIKIBATIZ");
                    System.exit(0);
            }
        }
    }

    /** Arte ASCII */
    public static void imprimirNombre() {
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
    }
}
