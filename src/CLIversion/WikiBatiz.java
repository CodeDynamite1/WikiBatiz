package CLIversion;

public class WikiBatiz {

    public static void main(String[] args) {
        menuInicial();
    }

    /* ================= MENÚ INICIAL ================= */
    public static void menuInicial() {
        while (true) {

            imprimirNombre();

            String[] opcionesInicio = {
                    "1. Administrador",
                    "2. Usuario",
                    "3. Salir"
            };

            Menu.mostrarOpciones("Selecciona tu rol", opcionesInicio);
            int opcion = Menu.seleccionMenu(opcionesInicio, 1, opcionesInicio.length);

            switch (opcion) {
                case 1:
                    // Llamar al panel de administrador
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

    /* ================= MENÚ USUARIO ================= */
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

    /* ================= ASCII ================= */
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
