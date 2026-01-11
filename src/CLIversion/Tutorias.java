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
                    break;

                case 2: // Física
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("|                                     Lunes      Martes      Miércoles      Jueves        Viernes      |");
                    System.out.println("|------------------------------------------------------------------------------------------------------|");
                    System.out.println("| Ayala Falcon Raúl Moíses      | 11:00-12:00 | 13:00-14:00 | 13:00-14:00 | 12:00-13:00 |              |");
                    System.out.println("| Cruz Morales Pedro            | 9:00-11:00  |             |             | 10:00-12:00 |              |");
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
                    break;

                default: // Opciones 4 a 9
                    System.out.println("No hay horarios disponibles aún.");
                    break;
            }

            System.out.println("════════════════════════════════════════════════════════════════════════");
            System.out.println("Presiona Enter para regresar al menú de tutorías...");
            sc.nextLine();
        }
    }

    private static void imprimirEncabezado() {
        System.out.println("════════════════════════════════════════════════════════════════════════");
        System.out.println("                         TUTORÍAS Y HORARIOS                     ");
        System.out.println("════════════════════════════════════════════════════════════════════════");
    }
}
