import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumnos {
    public static void proceso() {
        int mostrar = menu(Datos.opcionesAlumnos);
        switch (mostrar) {
            case 0:
                System.out.println("error");
                break;
            case 1:
                seleccionInformacionGrupo();
            default:
                String[] imprimir = Datos.mensajeDeportivas[mostrar - 1].split(" ");
                for (int i = 0; i < imprimir.length; i++) {
                    System.out.print(imprimir[i] + " ");
                    if (i % 15 == 0) System.out.print('\n');
                }
                System.out.print('\n');
                break;
        }
    }

    public static void seleccionInformacionGrupo(){
        String[] grupos = {
                "3IM1", "3IM2", "3IM3", "3IM4", "3IM5", "3IM6", "3IM7", "3IM8", "3IM9", "3IM10",};
        int eleccion = menu(grupos, "Escribe el numero x del grupo 3IM[x]");
        switch (eleccion){
            case 1:
                grupo3IM1();
                break;
            case 2:
                grupo3IM2();
                break;
            case 3:
                grupo3IM3();
                break;
            case 4:
                grupo3IM4();
                break;
            case 5:
                grupo3IM5();
                break;
            case 6:
                grupo3IM6();
                break;
            case 7:
                grupo3IM7();
                break;
            case 8:
                grupo3IM8();
                break;
            case 9:
                grupo3IM9();
                break;
            case 10:
                grupo3IM10();
                break;
        }
    }

    public static void  grupo3IM1(){
        Datos.tablaHermenegildo.imprimirEncabezado("Grupo 3IM1 : Sistemas Digitales");
        Datos.tablaHermenegildo.imprimirTabla();
        Datos.tablaBernardo.imprimirTabla();
        Datos.tablaBlancaQuimica.imprimirTabla();
        Datos.tablaSonia.imprimirTabla();
        Datos.tablaNidiaEntorno.imprimirTabla();
        Datos.tablaVirginia.imprimirTabla();
        Datos.tablaRosaDibujo.imprimirTabla();
        Datos.tablaMargaritaCircuitosL.imprimirTabla();
        Datos.tablaMtehualaCircuitosE.imprimirTabla();
        Datos.tablaMargaritaInstrumentacion.imprimirTabla();
    }
    public static void  grupo3IM2(){
        Datos.tablaMata.imprimirEncabezado("Grupo 3IM2 : Sistemas Digitales");
        Datos.tablaMata.imprimirTabla();
        Datos.tablaNydiaFisica.imprimirTabla();
        Datos.tablaGabrielaQuimica.imprimirTabla();
        Datos.tablaEduardoComunicacion.imprimirTabla();
        Datos.tablaNidiaEntorno.imprimirTabla();
        Datos.tablaCoconiIngles.imprimirTabla();
        Datos.tablaMitziDibujo.imprimirTabla();
        Datos.tablaAidaCircuitos.imprimirTabla();
        Datos.tablaErnestoCircuitosE.imprimirTabla();
        Datos.tablaMargaritaInstrumentacion.imprimirTabla();
    }
    public static void  grupo3IM3(){
        Datos.tablaUbaldoAnalitica.imprimirEncabezado("Grupo 3IM3 : Sistemas Digitales");
        Datos.tablaUbaldoAnalitica.imprimirTabla();
        Datos.tablaNydiaFisica.imprimirTabla();
        Datos.tablaZyanyaQuimica.imprimirTabla();
        Datos.tablaSonia.imprimirTabla();
        Datos.tablaGracielaEntorno.imprimirTabla();
        Datos.tablaTeresaIngles.imprimirTabla();
        Datos.tablaMirzaDibujo.imprimirTabla();
        Datos.tablaEmanuelCircuitosL.imprimirTabla();
        Datos.tablaXochitlCircuitosE.imprimirTabla();
        Datos.tablaMargaritaInstrumentacion.imprimirTabla();
    }
    public static void  grupo3IM4(){
        Datos.tablaHermenegildo.imprimirEncabezado("3IM4 : Mecatronica");
        Datos.tablaHermenegildo.imprimirTabla();
        Datos.tablaBernardo.imprimirTabla();
        Datos.tablaBernardo.imprimirTabla();
        Datos.tablaBlancaQuimica.imprimirTabla();
        Datos.tablaEduardoComunicacion.imprimirTabla();
        Datos.tablaNidiaEntorno.imprimirTabla();
        Datos.tablaCoconiIngles.imprimirTabla();
        Datos.tablaMariaFelisiaDibujo.imprimirTabla();
        Datos.tablaOscarMetrologia.imprimirTabla();
        Datos.tablaLiliaElectrotecnia.imprimirTabla();
        Datos.tablaJoaquinSoldadura.imprimirTabla();
    }
    public static void  grupo3IM5(){
        Datos.tablaGamalielAnalitica.imprimirEncabezado("3IM5 : Mecatronica");
        Datos.tablaGamalielAnalitica.imprimirTabla();
        Datos.tablaSergioFisica.imprimirTabla();
        Datos.tablaGabrielaQuimica.imprimirTabla();
        Datos.tablaEduardoComunicacion.imprimirTabla();
        Datos.tablaNidiaEntorno.imprimirTabla();
        Datos.tablaLizzeteIngles.imprimirTabla();
        Datos.tablaLlerenaDibujo.imprimirTabla();
        Datos.tablaRosaMetrologia.imprimirTabla();
        Datos.tablaLiliaElectrotecnia.imprimirTabla();
        Datos.tablaJoaquinSoldadura.imprimirTabla();
    }
    public static void  grupo3IM6(){
        Datos.tablaGamalielAnalitica.imprimirEncabezado("3IM6 : Mecatronica");
        Datos.tablaGamalielAnalitica.imprimirTabla();
        Datos.tablaErnestoFisica.imprimirTabla();
        Datos.tablaZyanyaQuimica.imprimirTabla();
        Datos.tablaAlonsoComunicacion.imprimirTabla();
        Datos.tablaNidiaEntorno.imprimirTabla();
        Datos.tablaDafneIngles.imprimirTabla();
        Datos.tablaLlerenaDibujo.imprimirTabla();
        Datos.tablaRosaMetrologia.imprimirTabla();
        Datos.tablaLiliaElectrotecnia.imprimirTabla();
        Datos.tablaJoaquinSoldadura.imprimirTabla();
    }
    public static void  grupo3IM7(){
        Datos.tablaUbaldoAnalitica.imprimirEncabezado("3IM7 : Programacion");
        Datos.tablaUbaldoAnalitica.imprimirTabla();
        Datos.tablaBernardo.imprimirTabla();
        Datos.tablaZyanyaQuimica.imprimirTabla();
        Datos.tablaSonia.imprimirTabla();
        Datos.tablaGracielaEntorno.imprimirTabla();
        Datos.tablaLizzeteIngles.imprimirTabla();
        Datos.tablaKeniaDibujo.imprimirTabla();
    }
    public static void  grupo3IM8(){
        Datos.tablaHermenegildo.imprimirEncabezado("3IM8 : Programacion");
        Datos.tablaHermenegildo.imprimirTabla();
        Datos.tablaNydiaFisica.imprimirTabla();
        Datos.tablaBlancaQuimica.imprimirTabla();
        Datos.tablaSonia.imprimirTabla();
        Datos.tablaGracielaEntorno.imprimirTabla();
        Datos.tablaDafneIngles.imprimirTabla();
        Datos.tablaKeniaDibujo.imprimirTabla();
    }
    public static void  grupo3IM9(){
        Datos.tablaHermenegildo.imprimirEncabezado("3IM9 : Programacion");
        Datos.tablaHermenegildo.imprimirTabla();
        Datos.tablaNydiaFisica.imprimirTabla();
        Datos.tablaBlancaQuimica.imprimirTabla();
        Datos.tablaEduardoComunicacion.imprimirTabla();
        Datos.tablaGracielaEntorno.imprimirTabla();
        Datos.tablaTeresaIngles.imprimirTabla();
        Datos.tablaRosaDibujo.imprimirTabla();
    }
    public static void  grupo3IM10(){
        Datos.tablaGamalielAnalitica.imprimirEncabezado("3IM9 : Programacion");
        Datos.tablaGamalielAnalitica.imprimirTabla();
        Datos.tablaNydiaFisica.imprimirTabla();
        Datos.tablaBlancaQuimica.imprimirTabla();
        Datos.tablaEduardoComunicacion.imprimirTabla();
        Datos.tablaGracielaEntorno.imprimirTabla();
        Datos.tablaTeresaIngles.imprimirTabla();
        Datos.tablaRosaDibujo.imprimirTabla();
    }

    public static int menu(String[] opciones) {
        MostrarOpciones("Selecciona una opcion", opciones);
        int eleccion = SeleccionMenu(opciones, 1, opciones.length);
        if (eleccion >= opciones.length) {
            WikiBatiz.VienedeUnMenu = true;
        }
        return eleccion;
    }

    public static int menu(String[] opciones, String mensaje) {
        System.out.println(mensaje);
        int eleccion = menu(opciones);
        return eleccion;
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
       public static void ImprimirAlumnos() {
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                  ║");
        System.out.println("║  █████╗ ██╗     ██╗   ██╗███╗   ███╗███╗   ██╗ ██████╗ ███████╗  ║");
        System.out.println("║ ██╔══██╗██║     ██║   ██║████╗ ████║████╗  ██║██╔═══██╗██╔════╝  ║");
        System.out.println("║ ███████║██║     ██║   ██║██╔████╔██║██╔██╗ ██║██║   ██║███████╗  ║");
        System.out.println("║ ██╔══██║██║     ██║   ██║██║╚██╔╝██║██║╚██╗██║██║   ██║╚════██║  ║");
        System.out.println("║ ██║  ██║███████╗╚██████╔╝██║ ╚═╝ ██║██║ ╚████║╚██████╔╝███████║  ║");
        System.out.println("║ ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚══════╝  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
        System.out.println('\n');
    }
}
