package CLIversion;

import java.util.Scanner;

public class Tutorias {

    private static String[] opciones = {
        "0. Regresar al menú",
        "1. Matemáticas",
        "2. Física",
        "3. Química",
        "4. Área Humanística",
        "5. Inglés",
        "6. Sistemas Digitales",
        "7. Programación",
        "8. Orientación Juvenil y Profesional",
        "9. Dibujo Técnico"
    };

    public static void proceso() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            imprimirEncabezado();

            // Mostrar opciones
            for (String opcion : opciones) {
                System.out.println(opcion);
            }

            System.out.println("════════════════════════════════════════════════════════════════════════");
            System.out.print("Selecciona una opción: ");
            String input = sc.nextLine().trim();

            int seleccion = -1;
            try {
                seleccion = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }

            if (seleccion < 0 || seleccion > 9) {
                System.out.println("Opción inválida. Intenta de nuevo.");
                continue;
            }

            // Opción 0 → regresar inmediatamente al menú principal
            if (seleccion == 0) {
                return; // sale de proceso() y vuelve al menú principal
            }

            // Mostrar tabla correspondiente
            System.out.println("════════════════════════════════════════════════════════════════════════");
            switch (seleccion) {
                case 1: // Matemáticas
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                      Lunes      Martes      Miércoles      Jueves        Viernes     |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                   Álgebra / Geometría y Trigonometría                                |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| María Eugenia Flores Olvera   |             |             |             | 10:00-11:00 |  9:00-11:00  |");
                    System.out.println("| Arturo Neumann Martínez       | 13:00-15:00 |             | 13:00-15:00 |             | 13:00-15:00  |");
                    System.out.println("| Alicia Mata Avilés            | 10:00-12:00 |             |             |             |              |");
                    System.out.println("| Guillermo Carrasco García     | 15:00-16:00 | 15:00-16:00 | 15:00-16:00 | 15:00-16:00 | 15:00-16:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                             Geometría Analítica / Cálculo Diferencial                                |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Ubaldo Bonilla Jiménez        |             |             | 9:00-10:00  | 9:00-10:00  |              |");
                    System.out.println("| Hermenegildo Barrera Hdz.     | 14:00-15:00 | 14:00-15:00 | 14:00-15:00 |             | 14:00-15:00  |");
                    System.out.println("| Citlali Sofía Rincón Ruíz     |             | 11:00-12:00 |             | 10:00-12:00 | 9:00-10:00   |");
                    System.out.println("| Xóchitl Ramírez Marquina      |             |             |             | 17:00-18:00 |              |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                       Cálculo Integral / Probabilidad y Estadística                                  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| José Antonio Cortés Pérez     |             | 13:00-15:00 |             |             | 13:00-15:00  |");
                    System.out.println("| Elisa Magdalena Chirinos A.   |             | 10:00-12:00 | 11:00-12:00 |             |              |");
                    System.out.println("| Jesús Alejandro Arreola Hdz.  | 18:00-20:00 |             | 15:00-16:00 | 13:00-14:00 | 18:00-19:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| TODOS SE ENCUENTRAN EN CUBÍCULOS DE MATEMÁTICAS EXCEPTO ARTURO NEUMANN (SALÓN 16).                   |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");  


                    break;

                case 2: // Física
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                     Lunes      Martes      Miércoles      Jueves        Viernes      |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Ayala Falcon Raúl Moíses      | 11:00-12:00 | 13:00-14:00 | 13:00-14:00 | 12:00-13:00 |              |");
                    System.out.println("| Cruz Morales Pedro            | 9:00-11:00  |             |             | 10:00-12:00 |              |");
                    System.out.println("| González García Bernardo      | 13:00-15:00 | 14:00-15:00 | 14:00-15:00 |             | 10:00-11:00  |");
                    System.out.println("| Olguín García Ubaldo          | 13:00-15:00 | 13:00-15:00 | 13:00-15:00 | 13:00-15:00 | 13:00-15:00  |");
                    System.out.println("| Ramírez Espinosa Sergio       |             |             | 14:00-15:00 | 11:00-13:00 | 8:00-9:00    |");
                    System.out.println("| Trujillo Torres José          |             |             | 13:00-14:00 | 15:00-16:00 | 15:00-16:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                          TODOS SE ENCUENTRAN EN CUBÍCULOS DE FISICA EN TERCER PISO                   |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    break;

                case 3: // Química
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                      Lunes      Martes      Miércoles      Jueves        Viernes     |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                 QUÍMICA 1                                            |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Blanca Rosa Landa Zamora      | 13:00-15:00 | 12:00-14:00 | 13:00-15:00 | 12:00-14:00 |              |");
                    System.out.println("| Hortencia Medina Fernández    | 14:00-15:00 | 16:00-17:00 | 17:00-18:00 |             | 17:00-18:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                 QUÍMICA 2                                            |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Manuel López Montecillos      | 11:00-13:00 | 9:00-10:00  | 10:00-13:00 |             |              |");
                    System.out.println("|                               | 15:00-17:00 |             |             |             |              |");
                    System.out.println("| Hortencia Medina Fernández    |             | 13:00-15:00 | 13:00-15:00 |             |              |");
                    System.out.println("| María Luisa Morlan S.         | 13:00-14:00 | 12:00-15:00 |             | 12:00-13:00 | 13:00-16:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                 QUIÍMICA 3                                           |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Felipe A. García S.           | 10:00-11:00 |  8:00-9:00  |             |             | 11:00-13:00  |");
                    System.out.println("|                               | 12:00-14:00 | 12:00-14:00 |             |             |              |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                 QUIÍMICA 4                                           |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Jorge Cortés Pérez            | 16:00-17:00 | 14:00-15:00 | 14:00-16:00 | 15:00-18:00 | 14:00-15:00  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                          TODOS SE ENCUENTRAN EN CUBÍCULOS DE QUÍMICA EN TERCER PISO                  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    break;

                case 4: //Area Humanistica
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                    Ubicación             Lunes      Martes        Miércoles      Jueves        Viernes     |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                      COMUNICACIÓN CIENTÍFICA                                               |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| M. P. Sonia Barrios Sánchez  | Lab. de Biología      | 12:00-13:00 | 11:00-12:00 |             | 7:00-8:00   |             |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                               DESARROLLO DE HABILIDADES DEL PENSAMIENTO                                    |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| G. Adriana Cano Cortez       | Optativas             | 13:00-14:00 | 14:00-15:00 | 14:00-15:00 |             | 14:00-15:00 |");
                    System.out.println("| Ariadna Fernández López      | Optativas             |             | 17:00-18:00 |             | 19:00-20:00 | 15:00-16:00 |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                       DESARROLLO PERSONAL                                                  |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Gabriela Arroyo Castilla     | Historia              |             |             | 13:00-15:00 |             |             |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                  ENTORNO SOCIOECONÓMICO DE MÉXICO                                          |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Jorge G. Cruz Mendoza        | Entorno SE. México    | 16:00-17:00 | 14:00-15:00 | 16:00-18:00 | 15:00-16:00  | 14:00-15:00|");
                    System.out.println("| M. Graciela Gutiérrez Vallejo| Sistemas Digitales    | 12:00-13:00 | 9:00-11:00  |             | 10:00-12:00  | 9:00-10:00 |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                    EXPRESIÓN ORAL Y ESCRITA                                                |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Norma A. Tello Villarreal    | Lengua y Comunicación | 14:00-15:00 | 14:00-15:00 | 14:00-15:00 | 14:00-15:00  | 14:00-15:00|");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                             HISTORIA DE MÉXICO CONTEMPORÁNEO                                               |");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Gabriela Arroyo Castilla     | Historia              |             |             |             | 12:00-13:00  | 14:00-15:00|");
                    System.out.println("|----------------------------------------------------------------------------------------------------------------------------|");

                case 5: //Ingles
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                Lunes           Martes      Miércoles    Jueves        Viernes      |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                  INGLES 1                                          |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| Teresa Cortés Sánchez      |             |             | 12:00-13:00 |             |               |");
                    System.out.println("| S. Lizzete Gómez Sánchez   | 9:00-10:00  |             | 14:00-15:00 |             |               |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                                  INGLES 3                                          |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| Claudia L. Rueda Coconi    | 18:00-19:00 | 19:00-20:00 |             |             |               |");
                    System.out.println("| Carolina Torres Ugalde     | 17:00-19:00 |             |             | 18:00-20:00 |               |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                  TODOS SE ENCUENTRAN EN CUBÍCULOS DE INGLÉS                        |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");

                case 6: //Sistemas Digitales
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                      Lunes      Martes      Miércoles      Jueves        Viernes     |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                    ELECTRÓNICA ANALÓGICA Y DIGITAL                                   |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Anabel Aida Flores Orozco      | 14:00-15:00 |             |             | 7:00-9:00   | 7:00-9:00   |");
                    System.out.println("| Francisco González Luna        | 8:00-10:00  |             | 7:00-9:00   |             |             |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                     CIRCUITOS LÓGICOS COMBINATORIOS                                  |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Cynthia Gómez Ortiz            | 13:00-14:00 |             | 11:00-13:00 | 7:00-8:00   |             |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                         DISPOSITIVOS ELECTRÓNICOS                                    |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Diego Hermilo Godoy Ricalde    |             | 10:00-11:00 | 10:00-11:00 |             |             |");
                    System.out.println("| Anastasio A. Sánchez Castorena | 15:00-17:00 | 17:00-18:00 |             | 15:00-16:00 |             |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                         CIRCUITOS ELECTRÓNICOS                                       |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Luis Ernesto Rosales Sánchez   |             | 11:00-13:00 | 9:00-11:00  |             |             |");
                    System.out.println("| Ma. del Carmen Matehuala Mayen |             | 9:00-11:00  |             |             | 10:00-13:00 |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                       INSTRUMENTACIÓN ELECTRÓNICA Y ACONDICIONAMIENTO DE SISTEMAS                    |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Edmundo Jimeno Díaz            |             | 14:00-16:00 |             | 15:00-16:00 |             |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                   ARQUITECTURA DE MICROCONTROLADORES                                 |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Erick Asian de la Luz          | 17:00-20:00 |             |             |             |             |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                          TODOS SE ENCUENTRAN EN ACADEMIA DE SISTEMAS DIGITALES                       |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");

                case 7: //Programacion
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                  Lunes        Martes        Miércoles     Jueves        Viernes    |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| Armando Alvarez Galvan      | 19:00-20:00 | 17:00-18:00 |             | 19:00-21:00 |              |");
                    System.out.println("| aalvarez@ipn.mx             | 20:00-21:00 | 20:00-21:00 |             |             |              |");
                    System.out.println("| Domingo Alapsico Gámez      | 16:00-17:00 | 16:00-17:00 | 17:00-18:00 | 18:00-19:00 | 16:00-17:00  |");
                    System.out.println("| dalapiscog@ipn.mx           | 18:00-19:00 |             |             |             |              |");
                    System.out.println("| Enrique Ramírez Solis       | 13:00-14:00 | 12:00-13:00 | 12:00-13:00 |             |              |");
                    System.out.println("| eramirez@ipn.mx             |             |             |             |             |              |");
                    System.out.println("| Jaimer Minor Gómez          |             | 19:00-20:00 |             |             |              |");
                    System.out.println("| jminorg@ipn.mx              |             |             |             |             |              |");
                    System.out.println("| Jesús Gutiérrez Castillo    |             | 12:00-13:00 |             |             |              |");
                    System.out.println("| jegutierrezc@ipn.mx         |             |             |             |             |              |");
                    System.out.println("| Juan Manuel Cruz Mendoza    | 14:00-15:00 | 13:00-14:00 | 9:00-11:00  | 11:00-12:00 | 10:00-11:00  |");
                    System.out.println("| jmcruz@ipn.mx               |             |             |             |             |              |");
                    System.out.println("| Pablo Ramírez Jímenez       | 10:00-11:00 | 9:00-10:00  | 12:00-13:00 |             | 9:00-10:00   |");
                    System.out.println("| pramirezj@ipn.mx            |             |             |             |             |              |");
                    System.out.println("| Roberto C. Torrijos Jaimes  |             | 8:00-9:00   |             |             |              |");
                    System.out.println("| rtorrijosj@ipn.mx           |             |             |             |             |              |");
                    System.out.println("| Rosa Iliana Fuentes Cruz    | 12:00-13:00 | 10:00-11:00 |             | 12:00-13:00 | 10:00-11:00  |");
                    System.out.println("| rfuentesc@ipn.mx            | 14:00-15:00 | 13:00-15:00 |             |             |              |");
                    System.out.println("| Sergio Ernesto Moreno Soto  | 15:00-17:00 | 17:00-19:00 |             |             | 20:00-21:00  |");
                    System.out.println("| smorenos@ipn.mx             |             |             |             |             |              |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                     TODOS SE ENCUENTRAN EN PROGRAMACIÓN                            |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");

                case 8: //Orientacion
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                  Lunes      Martes      Miércoles      Jueves       Viernes        |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("| Angelica Elorza Vega        |             | 8:00-9:00   |             | 8:00-9:00   |              |");
                    System.out.println("| Francisco Javier Cruz García|             | 16:00-17:00 |             |             |              |");
                    System.out.println("| Hilda Tejeda Moreno         | 11:00-12:00 |             |             |             |              |");
                    System.out.println("| M. del Rocío Coronado García| 17:00-19:00 |             | 16:00-17:00 | 14:00-15:00 | 18:00-19:00  |");
                    System.out.println("| Silvia Joffre Mastachi      |             |             |             |             | 9:00-11:00   |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");
                    System.out.println("|                          EN CUBICULOS DE ORIENTACIÓN                                               |");
                    System.out.println("|----------------------------------------------------------------------------------------------------|");

                case 9: //Dibujo Técnico
                    System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                    Ubicación             Lunes            Martes       Miércoles      Jueves      Viernes    |");
                    System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Jocelyn Mitzi Arévalos Quiroz  | Dibujo Técnico 1      | 8:00-10:00  |             | 8:00-9:00   |             |             |");
                    System.out.println("|                                |                       |             |             | 10:00-11:00 |             |             |");
                    System.out.println("| María Felisa Hernández Flores  | Dibujo Técnico 1      | 13:00-15:00 | 7:00-8:00   |             | 13:00-15:00 |             |");
                    System.out.println("| Ángel Llerena Nuñez            | Dibujo Técnico 1      |             | 9:00-10:00  | 10:00-11:00 | 13:00-15:00 |             |");
                    System.out.println("| Rosa María Gallegos Vásquez    | Dibujo Técnico 2      | 10:00-12:00 |             | 12:00-14:00 |             |             |");
                    System.out.println("| Ana María Madariaga Olivares   | Dibujo Técnico 2      |             | 14:00-16:00 |             |             | 12:00-14:00 |");
                    System.out.println("|------------------------------------------------------------------------------------------------------------------------------|");



                default: // Opciones 4 a 9
                    System.out.println("No hay horarios disponibles aún.");
                    break;
            }

            System.out.println("════════════════════════════════════════════════════════════════════════");
            System.out.println("Presiona 0 para regresar al menú de tutorías...");
            sc.nextLine();
        }
    }

    private static void imprimirEncabezado() {
        System.out.println("════════════════════════════════════════════════════════════════════════");
        System.out.println("                         TUTORÍAS Y HORARIOS                     ");
        System.out.println("════════════════════════════════════════════════════════════════════════");
    }
}
