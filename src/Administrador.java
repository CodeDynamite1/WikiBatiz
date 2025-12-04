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
        }
    }

    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opcion", opciones);
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
        for (int i = 0; i < 150; i++) {
            System.out.print("═");
        }
        System.out.println('\n');
    }
}
