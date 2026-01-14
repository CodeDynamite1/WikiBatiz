import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumnos {

    public static void proceso() {
        // Cuando se selecciona Alumnos, va directamente al menú de info de profesores
        opcionesInfoProfes();
    }

    // Menú principal de opciones dentro de Alumnos
    public static void opcionesInfoProfes() {
        String[] menuProfes = {
            "1. Informacion de profesores",
            "2. Horarios de profesores",
            "3. Directorio de Servicios escolares",
            "4. Regresar"
        };

        int opcion = menu(menuProfes, "Selecciona una opcion de informacion de profesores");

        switch (opcion) {
            case 1:
                System.out.println("Informacion de profesores");
                break;
            case 2:
                mostrarGrupos(); // Mostrar menú de grupos y luego la info
                break;
            case 3:
                System.out.println("Directorio de Servicios escolares");
                break;
            case 4:
                WikiBatiz.VienedeUnMenu = true;
                return;
            default:
                System.out.println("Error inesperado");
                break;
        }
    }

    // Menú de grupos y mostrar la info del grupo seleccionado
    public static void mostrarGrupos() {
        String[] grupos = {
            "1. Grupo 3IM1",
            "2. Grupo 3IM2",
            "3. Grupo 3IM3",
            "4. Grupo 3IM4",
            "5. Grupo 3IM5",
            "6. Grupo 3IM6",
            "7. Grupo 3IM7",
            "8. Grupo 3IM8",
            "9. Grupo 3IM9",
            "10. Grupo 3IM10"
        };

        int grupoSeleccionado = menu(grupos, "Selecciona un grupo para ver la informacion");

        // Imprimir directamente letras según grupo
        switch (grupoSeleccionado) {
            case 1:
                imprimirTabla3IM1();
            break;

            case 2:
                imprimirTabla3IM2();
            break;

            case 3:
                imprimirTabla3IM3();
            break;

            case 4:
                imprimirTabla3IM4();
            break;

            case 5:
                imprimirTabla3IM5();
            break;

            case 6:
                imprimirTabla3IM6();
            break;

            case 7:
                imprimirTabla3IM7();
            break;

            case 8:
                imprimirTabla3IM8();
            break;

            case 9:
                imprimirTabla3IM9();
            break;

            case 10:
                imprimirTabla3IM10();
            break;

            default:
                System.out.println("Grupo no válido");
                break;
        }
    }

    // Métodos de menú y lectura de número
    public static int menu(String[] opciones, String mensaje) {
        MostrarOpciones(mensaje, opciones);
        return SeleccionMenu(opciones, 1, opciones.length);
    }

    public static void MostrarOpciones(String mensaje, String[] opciones) {
        Separacion();
        System.out.println(mensaje);
        Separacion();
        for (String opcion : opciones) {
            System.out.println(opcion);
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
            for (String opcion : opciones) {
                System.out.println(opcion);
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
        Scanner leer = new Scanner(System.in);
        try {
            return leer.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
            return 0;
        }
    }

    public static void Separacion() {
        for (int i = 0; i < 150; i++) System.out.print("═");
        System.out.println();
    }

    public static void imprimirTabla3IM1() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              GRUPO: 3IM1                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                        CARRERA: SISTEMAS DIGITALES                                   |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor:Barrera Hernandez Hermenegildo                                                  |");
    System.out.println("|  Materias que imparte:Geometria Analitica                                                            |");
    System.out.println("|  Ubicacion de cubiculo:Matematicas                                                                   |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Bernardo Gonzalez Garcia                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio: 50                                                          |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Landa Zamora Blanca Rosa                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Aviles Garcia Nidia                                                            |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                 |");
    System.out.println("|  Nombre del profesor: Zuñiga Martinez Virginia                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Gallegos Vasquez Rosa Maria                                                    |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Circuitos Logicos Combinatorios:                                  |");
    System.out.println("|  Nombre del profesor: Chavez Martinez Margarita                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                       Circuitos Electronicos:                                        |");
    System.out.println("|  Nombre del profesor: Mtehuala Mayen Ma. Del Carmen                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                     Instrumentacion Electronica:                                     |");
    System.out.println("|  Nombre del profesor: Chaves Martinez Margarita                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM2() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                             GRUPO: 3IM2                                              |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                      CARRERA: SISTEMAS DIGITALES                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor:Mata Aviles Alicia                                                              |");
    System.out.println("|  Materias que imparte:Geometria Analitica                                                            |");
    System.out.println("|  Ubicacion de cubiculo:Matematicas                                                                   |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Gaspar Sanchez Angela Gabriela                                                 |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Zamora Brito Eduardo                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Aviles Garcia Nidia                                                            |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                 |");
    System.out.println("|  Nombre del profesor: Rueda Coconi Claudia                                                           |");
    System.out.println("|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Avelardo Quiroz Jocelyn Mitzi                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                   Circuitos Logicos Combinatorios:                                   |");
    System.out.println("|  Nombre del profesor: Flores Orozco Anabel Aida                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                       Circuitos Electronicos:                                        |");
    System.out.println("|  Nombre del profesor: Rosales Snachez Luis Ernesto                                                   |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                     Instrumentacion Electronica:                                     |");
    System.out.println("|  Nombre del profesor: Chavez Martinez Margarita                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM3() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              GRUPO: 3IM3                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                       CARRERA: SISTEMAS DIGITALES                                    |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor:Ubaldo Bonilla Jimenez                                                          |");
    System.out.println("|  Materias que imparte:Geometria Analitica                                                            |");
    System.out.println("|  Ubicacion de cubiculo:Matematicas                                                                   |");
    System.out.println("|  Correo Institucional o Medio de contacto:bubaldo68@gmail.com                                        |");
    System.out.println("|  Formacion academica:Licenciado. Fisica y Matematicas                                                |");
    System.out.println("|  Experiencia docente o años de servicio: 30 años                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Gonzales Olivares Nydia Leydi                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                                |");
    System.out.println("|  Materias que imparte: Quimmica I,II,III,IV                                                          |");
    System.out.println("|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto:zmandozam@ipn.mx                                           |");
    System.out.println("|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion               |");
    System.out.println("|  Experiencia docente o años de servicio: 12 años                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                 |");
    System.out.println("|  Nombre del profesor: Cortes Sanchez Teresa                                                          |");
    System.out.println("|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                             |");
    System.out.println("|  Formacion academica: Licenciada. Ciencias de la informatica                                         |");
    System.out.println("|  Experiencia docente o años de servicio: 16 años                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Davila Gutierrez Mirza                                                         |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                   Circuitos Logicos Combinatorios:                                   |");
    System.out.println("|  Nombre del profesor: Gil Ladron de Guevara Israel Emanuel                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                        Circuitos Electronicos:                                       |");
    System.out.println("|  Nombre del profesor: Hernandez Cruz Xochil                                                          |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                        Instrumentacion Electronica:                                  |");
    System.out.println("|  Nombre del profesor: Chavez Martinez Margarita                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM4() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              GRUPO: 3IM4                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                          CARRERA: MECATRONICA                                        |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Barrera Hernandez Hermenegildo                                                 |");
    System.out.println("|  Materias que imparte:Geometria Analitica                                                            |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Bernardo Gonzalez Garcia                                                       |");
    System.out.println("|  Materias que imparte: Fisica I,II,III,IV,V                                                          |");
    System.out.println("|  Ubicacion de cubiculo: Tercer Piso                                                                  |");
    System.out.println("|  Correo Institucional o Medio de contacto: N/A                                                       |");
    System.out.println("|  Formacion academica: Fisico                                                                         |");
    System.out.println("|  Experiencia docente o años de servicio: 35                                                          |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Landa Zamora Blanca Rosa                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Zamora Brito Eduardo                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Aviles Garcia Nidia                                                            |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                 |");
    System.out.println("|  Nombre del profesor: Rueda Coconi Claudia                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Hernandez Flores Maria Felisa                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                  Metrologia y Tecnologia de Materiales:                              |");
    System.out.println("|  Nombre del profesor: Fernandez Go nzales Oscar                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |");
    System.out.println("|  Nombre del profesor: Lima Herrera Sara Lilia                                                        |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |");
    System.out.println("|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                     |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM5() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              GRUPO: 3IM5                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                          CARRERA: MECATRONICA                                        |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Diaz Monroy Gilberto Gamaliel                                                  |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:Matematicas                                                                   |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Ramierez Espinosa Sergio                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Gaspar Sanchez Angela Gabriela                                                 |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Zamora Brito Eduardo                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Aviles Garcia Nidia                                                            |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Ingles:                                                |");
    System.out.println("|  Nombre del profesor: Silvia Lizzete Gomez Sanchez                                                   |");
    System.out.println("|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                             |");
    System.out.println("|  Formacion academica: Licenciada. Ciencias de la informatica                                         |");
    System.out.println("|  Experiencia docente o años de servicio: 16 años                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Llerena Nuñez Angel                                                            |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                 Metrologia y Tecnologia de Materiales:                               |");
    System.out.println("|  Nombre del profesor: Marinez Perez Rosa Elena                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |");
    System.out.println("|  Nombre del profesor: Lima Herrera Sara Lilia                                                        |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |");
    System.out.println("|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                     |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM6() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                             Grupo 3IM6                                               |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                          CARRERA: MECATRONICA                                        |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Diaz Monroy Gilbero Gamaliel                                                   |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:Matematicas                                                                   |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica: Licenciado. Fisica y Matematicas                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Gamiño Cruz Enesto                                                             |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                                |");
    System.out.println("|  Materias que imparte: Quimmica I,II,III,IV                                                          |");
    System.out.println("|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto: zmandozam@ipn.mx                                          |");
    System.out.println("|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion               |");
    System.out.println("|  Experiencia docente o años de servicio: 12 años                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: artinez Montaño Luis Alonso                                                   |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Aviles Garcia Nidia                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles III:                                             |");
    System.out.println("|  Nombre del profesor: Cmarena Garay Dafne                                                           |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                        |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                            |");
    System.out.println("|  Nombre del profesor: Llerena Nuñez Sanchez                                                         |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                  Metrologia y Tecnologia de Materiales:                              |");
    System.out.println("|  Nombre del profesor: Marines Perez Rosa Elena                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |");
    System.out.println("|  Nombre del profesor: Lima Herrera Sara Lilia                                                       |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |");
    System.out.println("|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                    |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                           |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                             |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM7() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Grupo 3IM7                                              |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                          CARRERA: PROGRAMACIÓN                                       |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Ubaldo Bonilla Jimenez                                                         |");
    System.out.println("|  Materias que imparte: Geometria Analitica                                                          |");
    System.out.println("|  Ubicacion de cubiculo: Matematicas                                                                 |");
    System.out.println("|  Correo Institucional o Medio de contacto: bubaldo68@gmail.com                                      |");
    System.out.println("|  Formacion academica: Licenciado. Fisica y Matematicas                                              |");
    System.out.println("|  Experiencia docente o años de servicio: 30 años                                                    |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Bernardo Gonzalez Garcia                                                     |");
    System.out.println("|  Materias que imparte: Fisica I,II,III,IV,V                                                        |");
    System.out.println("|  Ubicacion de cubiculo: Tercer Piso                                                                |");
    System.out.println("|  Correo Institucional o Medio de contacto: N/A                                                     |");
    System.out.println("|  Formacion academica: Fisico                                                                       |");
    System.out.println("|  Experiencia docente o años de servicio: 35                                                       |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                              |");
    System.out.println("|  Materias que imparte: Quimmica I,II,III,IV                                                       |");
    System.out.println("|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                      |");
    System.out.println("|  Correo Institucional o Medio de contacto: zmandozam@ipn.mx                                        |");
    System.out.println("|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion             |");
    System.out.println("|  Experiencia docente o años de servicio: 12 años                                                  |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                               |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                              |");
    System.out.println("|  Experiencia docente o años de servicio:                                                          |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                               |");
    System.out.println("|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                             |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                              |");
    System.out.println("|  Experiencia docente o años de servicio:                                                          |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                |");
    System.out.println("|  Nombre del profesor: Silvia Lizzete Gomez Sanchez                                               |");
    System.out.println("|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                   |");
    System.out.println("|  Ubicacion de cubiculo: Al lado de prefectura                                                    |");
    System.out.println("|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                         |");
    System.out.println("|  Formacion academica: Licenciada. Ciencias de la informatica                                     |");
    System.out.println("|  Experiencia docente o años de servicio: 16 años                                               |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                          |");
    System.out.println("|  Nombre del profesor: Kenia Evangelista Rivera                                                 |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                              |");
    System.out.println("|  Experiencia docente o años de servicio:                                                          |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                 Laboratorio de desarrollo de software:                             |");
    System.out.println("|  Nombre del profesor: Rosa Iliana Fuentes Cruz                                                   |");
    System.out.println("|  Materias que imparte: Programacion                                                              |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                               |");
    System.out.println("|  Correo Institucional o Medio de contacto: rfuentescoa@gmail.com                                 |");
    System.out.println("|  Formacion academica: Informatica                                                                |");
    System.out.println("|  Experiencia docente o años de servicio: N/A                                                    |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Programacion Basica:                                       |");
    System.out.println("|  Nombre del profesor: German Gutierrez Galan                                                     |");
    System.out.println("|  Materias que imparte: Programacion                                                              |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion, cubiculo 2                                     |");
    System.out.println("|  Correo Institucional o Medio de contacto: ggerdoc@gmail.com                                     |");
    System.out.println("|  Formacion academica: Licenciado en Informatica                                                 |");
    System.out.println("|  Experiencia docente o años de servicio: 8 años                                                |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Algoritmia:                                          |");
    System.out.println("|  Nombre del profesor: German Gutierrez Galan                                                     |");
    System.out.println("|  Materias que imparte: Programacion                                                              |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion, cubiculo 2                                     |");
    System.out.println("|  Correo Institucional o Medio de contacto: ggerdoc@gmail.com                                     |");
    System.out.println("|  Formacion academica: Licenciado en Informatica                                                 |");
    System.out.println("|  Experiencia docente o años de servicio: 8 años                                                |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM8() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                             Grupo 3IM8                                               |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         CARRERA: PROGRAMACIÓN                                        |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Hermenegildo Barrera Hernandez                                                |");
    System.out.println("|  Materias que imparte: Geometria Analitica                                                         |");
    System.out.println("|  Ubicacion de cubiculo: Matematicas                                                                |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                               |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Blanca Rosa Landa Zamora                                                    |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio: 12 años                                                  |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                              |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                               |");
    System.out.println("|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                             |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                |");
    System.out.println("|  Nombre del profesor: Dafne Camarena Garay                                                       |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                          |");
    System.out.println("|  Nombre del profesor: Kenia Evangelista Rivera                                                  |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                 Laboratorio de desarrollo de software:                             |");
    System.out.println("|  Nombre del profesor: Octavio Ernesto Dominguez Sosa                                             |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                 |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Programacion Basica:                                       |");
    System.out.println("|  Nombre del profesor: Juan Angel Calvillo Perez                                                |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Algoritmia:                                           |");
    System.out.println("|  Nombre del profesor: Juan Angel Calvillo Perez                                                |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM9() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                             Grupo 3IM9                                               |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                        CARRERA: PROGRAMACIÓN                                         |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Hermenegildo Barrera Hernandez                                                |");
    System.out.println("|  Materias que imparte: Geometria Analitica                                                         |");
    System.out.println("|  Ubicacion de cubiculo: Matematicas                                                                |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                               |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Aviles Mariño Laura Elsa                                                   |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Zamora Brito Eduardo                                                        |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                               |");
    System.out.println("|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                           |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                |");
    System.out.println("|  Nombre del profesor: Cortes Sanchez Teresa                                                      |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                          |");
    System.out.println("|  Nombre del profesor: Gallegos Vasquez Rosa Maria                                               |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                 Laboratorio de desarrollo de software:                             |");
    System.out.println("|  Nombre del profesor: Ramirez Solis Enrique                                                      |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                 |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Programacion Basica:                                       |");
    System.out.println("|  Nombre del profesor: Rosa Iliana Fuentes Cruz                                                   |");
    System.out.println("|  Materias que imparte: Programacion                                                               |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                 |");
    System.out.println("|  Correo Institucional o Medio de contacto: rfuentescoa@gmail.com                                  |");
    System.out.println("|  Formacion academica: Informatica                                                                  |");
    System.out.println("|  Experiencia docente o años de servicio: N/A                                                     |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Algoritmia:                                           |");
    System.out.println("|  Nombre del profesor: Cruz Mendoza Juan Manuel                                                  |");
    System.out.println("|  Materias que imparte:                                                                             |");
    System.out.println("|  Ubicacion de cubiculo:                                                                            |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                         |");
    System.out.println("|  Formacion academica:                                                                               |");
    System.out.println("|  Experiencia docente o años de servicio:                                                           |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}

public static void imprimirTabla3IM10() {
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                             Grupo 3IM10                                              |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         CARRERA: PROGRAMACIÓN                                        |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Analitica:                                              |");
    System.out.println("|  Nombre del profesor: Diaz Monry Gilberto Gamaliel                                                  |");
    System.out.println("|  Materias que imparte: Geometria Analitica                                                          |");
    System.out.println("|  Ubicacion de cubiculo: Matematicas                                                                 |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Fisica:                                                 |");
    System.out.println("|  Nombre del profesor: Ramires Espinosa Sergio                                                      |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                               Quimica:                                               |");
    System.out.println("|  Nombre del profesor: Garcia Silvia Felipe.A                                                        |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Comunicacion Cientifica:                                     |");
    System.out.println("|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                               |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                    Entorno Socioeconomico de México:                                 |");
    System.out.println("|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                             |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Ingles:                                                 |");
    System.out.println("|  Nombre del profesor: Zuñiga Martines Virginia                                                     |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                           Dibujo Tecnico:                                           |");
    System.out.println("|  Nombre del profesor: Llerena Nuñeez Angel                                                         |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                 Laboratorio de desarrollo de software:                               |");
    System.out.println("|  Nombre del profesor: Torrojillos Jaimes Roberto Carlos                                             |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                    |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                         Programacion Basica:                                        |");
    System.out.println("|  Nombre del profesor: Dominguez Sosa Octavio Ernesto                                               |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo: Academia de programacion                                                    |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
    System.out.println("|                                              Algoritmia:                                             |");
    System.out.println("|  Nombre del profesor: Juan Angel Calvillo Perez                                                    |");
    System.out.println("|  Materias que imparte:                                                                               |");
    System.out.println("|  Ubicacion de cubiculo:                                                                              |");
    System.out.println("|  Correo Institucional o Medio de contacto:                                                          |");
    System.out.println("|  Formacion academica:                                                                                |");
    System.out.println("|  Experiencia docente o años de servicio:                                                            |");
    System.out.println("|------------------------------------------------------------------------------------------------------|");
}










}
