import java.util.InputMismatchException;
import java.util.Scanner;

public class Miparte {

    static boolean activo = true;
    static boolean reinicio = false;

    static boolean VienedeUnMenu = false;
    static boolean usuarioActivo = false;

    static String[] opcionesMenuUsuario = {
            "1. Actividades Deportivas y Cuturales",
            "2. Tramites",
            "3. Alumnos",
            "4. Eventos",
            "5. Tutorias"
    };

    public static void main(String[] args){
        ImprimirNombre();
        Separacion();
    }

    public static int NumRango(String[] opciones, int minimo, int maximo) {
        int numIngresado = LeerNum();
        boolean bandera = (numIngresado < minimo) || (numIngresado > maximo);
        while (bandera) {
            Separacion();
            System.out.println("Ingresa un valor valido segun el menu");
            Separacion();
            for (int i = 0; i < opciones.length; i++) {
                System.out.println(opciones[i]);
            }
            Separacion();
            numIngresado = LeerNum();
            if (numIngresado >= minimo && numIngresado <= maximo) {
                bandera = false;
            }
        }
        Separacion();
        return numIngresado;
    }

    public static int LeerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        try {
            num = leer.nextInt();
            return num;
        } catch (InputMismatchException e) {
            Separacion();
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
        }
        return num;
    }

    public static void Separacion() {
        for (int i = 0; i < 150; i++) {
            System.out.print("_");
        }
        System.out.println("\n");
    }

    public static void ImprimirNombre() {
        System.out.println(" _____________________________________________________________________________________________________________");
        System.out.println("|                                                                                                             |");
        System.out.println("|      :::       ::: ::::::::::: :::    ::: ::::::::::: :::::::::      ::: ::::::::::: ::::::::::: ::::: :::: |");
        System.out.println("|     :+:       :+:     :+:     :+:   :+:      :+:     :+:    :+:   :+: :+:   :+:         :+:          :+:    |");
        System.out.println("|    +:+       +:+     +:+     +:+  +:+       +:+     +:+    +:+  +:+   +:+  +:+         +:+         +:+      |");
        System.out.println("|   +#+  +:+  +#+     +#+     +#++:++        +#+     +#++:++#+  +#++:++#++: +#+         +#+        +#+        |");
        System.out.println("|  +#+ +#+#+ +#+     +#+     +#+  +#+       +#+     +#+    +#+ +#+     +#+ +#+         +#+       +#+          |");
        System.out.println("|  #+#+# #+#+#      #+#     #+#   #+#      #+#     #+#    #+# #+#     #+# #+#         #+#      #+#            |");
        System.out.println("|  ###   ###   ########### ###    ### ########### #########  ###     ### ###     ########### #########        |");
        System.out.println("|                                                                                                             |");
        System.out.println("|_____________________________________________________________________________________________________________|");
        System.out.println("\n");
    }
    public static void SeleccionTipoUsuario() {

        String[] usuarios = {"1. Administrador", "2. Usuario"};

        MostrarOpciones("Escoge tu tipo de usuario", usuarios);

        int usuarioSeleccionado = NumRango(usuarios, 1, usuarios.length);

        Separacion();
        System.out.println("Has seleccionado " + usuarios[usuarioSeleccionado - 1]);
        Separacion();

        switch (usuarioSeleccionado) {
            case 1:
                PanelAdministrador();
                break;

            case 2:
                usuarioActivo = true;
                ProcesoUsuario();
                break;

            default:
                System.out.println("Ha ocurrido un error, volviendo al menu inicial");
                reinicio = true;
                break;
        }
    }


    public static void ProcesoUsuario() {

        do {
            MostrarOpciones("Selecciona tu consulta", opcionesMenuUsuario);

            int GotoMenu = NumRango(opcionesMenuUsuario, 1, opcionesMenuUsuario.length);

            switch (GotoMenu) {

                case 1:
                    MenuActividadesDeportivasCulturales();
                    break;

                case 2:
                    MenuTramites();
                    break;

                case 3:
                    MenuAlumnos();
                    break;

                case 4:
                    MenuEventos();
                    break;

                case 5:
                    MenuTutorias();
                    break;

                default:
                    System.out.println("Ha ocurrido un error inesperado");
                    VienedeUnMenu = true;
                    break;
            }

            Separacion();

            if (VienedeUnMenu) {
                System.out.println("Regresando al menu de consulta...");
                VienedeUnMenu = false;

            } else {
                System.out.println("Deseas realizar otra consulta?");
                System.out.println("1.Si  2.No");

                String[] a = {"1. Si", "2. No"};

                Separacion();

                int RepetirConsulta = NumRango(a, 1, 2);

                if (RepetirConsulta == 2) {
                    usuarioActivo = false;
                }
            }

        } while (usuarioActivo);
    }

    public static void MostrarOpciones(String titulo, String[] opciones) {
        System.out.println(titulo);
        for (String op : opciones) System.out.println(op);
    }

    public static void PanelAdministrador() {
        System.out.println("Panel de administrador...");
    }

    public static void MenuActividadesDeportivasCulturales() {
        System.out.println("Menu de actividades...");
    }

    public static void MenuTramites() {
        System.out.println("Menu de tramites...");
    }

    public static void MenuAlumnos() {
        System.out.println("Menu de alumnos...");
    }

    public static void MenuEventos() {
        System.out.println("Menu de eventos...");
    }

    public static void MenuTutorias() {
        System.out.println("Menu de tutorias...");
    }
}
