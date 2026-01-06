package CLIversion;

public class ActividadesDeportivasYCulturales extends Menu {
    private static GestorDeDatos opcActividades = new GestorDeDatos("actividades_deportivas_culturales_opciones");
    private static GestorDeDatos msjActividades = new GestorDeDatos("actividades_deportivas_culturales_mensajes");

    public static String[] opcionesActividades = opcActividades.leerDatos();
    public static String[] mensajeActividades = msjActividades.leerDatos();

    public static void proceso() {
        ImprimirNombre();
        int mostrar = menu(opcionesActividades);
        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            default:
                String msj = mensajeActividades[mostrar-1];
                if(msj.contains("¡")){
                    String[] print = msj.split("¡");
                    for (int i = 0; i < print.length; i++) {
                        System.out.println(print[i]);
                    }
                }else{
                    System.out.println(msj);
                }
                break;
        }
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
