
import java.util.InputMismatchException;
import java.util.Scanner;

public class Administrador {
    public static void PanelAdministrador() {
        int contrasenaIngresada = 0;
        int contrasenaEsperada = 2025090538;
        System.out.println("Ingresa la contraseña");
        for (int i = 0; i < 3; i++) {
            Separacion();
            contrasenaIngresada = LeerNum();
            if (contrasenaIngresada == contrasenaEsperada) {
                i = 3;
            } else {
                Separacion();
                if (i != 2){
                    System.out.println("Contrase\u00F1a incorrecta - Intenta ingresarla de nuevo");
                }
            }
        }
        if (contrasenaIngresada != contrasenaEsperada) {
            System.out.println("Demasiados intentos");
            Separacion();
            WikiBatiz.reinicio = true;
        } else {
            System.out.println("Ahora eres admin");
            System.out.println("Edicion de informacion activada");
            String[] opciones = {
                    "1. Actividades Deportivas y Culturales",
                    "2. Tramites",
                    "3. Alumnos",
                    "4. Eventos",
                    "5. Tutorias",
                    "6. Salir"
            };
            int eleccion = menu(opciones);
            switch (eleccion){
                case 1:
                    editarActividades(Datos.mensajeDeportivas);
                    break;
                case 2:
                    editar(Datos.mensajeTramites);break;
                case 3:
                    System.out.println("Datos constantes no se editan");
                    break;
                case 4:
                    editar(Datos.mensajeEventos);
                    break;
                case 5:
                    editar(Datos.mensajeTutorias);
                    break;
                case 6:
                    return;
            }
        }
    }

    public static void editarActividades(String[] accederA){
        System.out.println("Elige que mensaje editar");
        int eleccion = menuEditar(accederA);
        eleccion--;
        if (eleccion == 0) {
            Datos.horariosActividades.editarTabla();
        }else{
            Scanner sc = new Scanner(System.in);
            accederA[eleccion] = sc.nextLine();
            System.out.println(accederA[eleccion]);
        }
    }

    public static void editar(String[] accederA){
        System.out.println("Elige que mensaje editar");
        int eleccion = menuEditar(accederA);
        eleccion--;
        Scanner sc = new Scanner(System.in);
        accederA[eleccion] = sc.nextLine();
        System.out.println(accederA[eleccion]);
    }

    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opcion", opciones);
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        if (eleccion >= opciones.length) {
            WikiBatiz.VienedeUnMenu = true;
        }
        return eleccion;
    }

    public static int menuEditar(String[] opciones) {
        Separacion();
        System.out.println("Escoge la linea por numero a editar");
        Separacion();
        for (int q = 0; q < opciones.length; q++) {
            System.out.printf("%d.",q+1);
            System.out.println(opciones[q]);
        }
        Separacion();
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        if (eleccion >= opciones.length) {
            WikiBatiz.VienedeUnMenu = true;
        } else {
            return eleccion;
        }
        return 0;
    }

    public static void MostrarOpciones(String mensaje, String[] opciones) {
        Separacion();
        System.out.println(mensaje);
        Separacion();
        for (int q = 0; q < opciones.length; q++) {
            System.out.println(opciones[q]);
        }
        Separacion();
    }

    public static int SeleccionMenu(String[] opciones, int minimo, int maximo) {
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
        WikiBatiz.Separacion();
    }
}
