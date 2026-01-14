
public class Datos {

    static String usuarioActual = "Invitado";
    static String[] opcionesDeportivas = {
            "1. Consultar horarios",
            "2. Inscripciones",
            "3. Profesores titulares",
            "4. Regresar al menu inicial"};

    static String[][] horariosDeportivas = {
            {"Actividades", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"},
            {"Atletismo", "10:00-13:00", "09:00-13:00", "09:00-13:00", "09:00-13:00", "09:00-13:00"},
            {"Basquetbol", "12:00-16:00", "12:00-16:00", "12:00-16:00", "12:00-16:00", "12:00-16:00"},
            {"Volibol", "12:00-16:00", "12:00-16:00", "12:00-16:00", "12:00-16:00", "12:00-15:00"},
            {"Futbol", "12:00-15:00", "12:00-15:00", "12:00-15:00", "12:00-15:00", "12:00-15:00"},
            {"TaeKwonDo", "", "11:00-13:00", "", "11:00-13:00", ""},
            {"TaeKwonDo", "", "15:00-17:00", "", "15:00-17:00", ""},
            {"F. Americano", "10:00-12:00", "10:00-12:00", "10:00-12:00", "10:00-12:00", "10:00-12:00"},
            {"F. Americano", "15:00-17:00", "15:00-17:00", "15:00-17:00", "15:00-17:00", "15:00-17:00"},
            {"TochoBandera", "11:00-13:00", "11:00-13:00", "11:00-13:00", "11:00-13:00", "10:00-13:00"},
            {"TochoBandera", "15:00-17:00", "15:00-17:00", "15:00-17:00", "15:00-17:00", "15:00-17:00"},
            {"Arte Visual", "12:00-17:00", "12:00-17:00", "12:00-17:00", "12:00-17:00", "12:00-17:00"},
            {"Musica Folk", "09:00-17:00","13:00-16:00", "14:00-17:00", "11:00-16:00",""},
            {"Danza Folk", "","12:00-15:00", "", "","12:00-15:00"},
            {"Piano", "","", "12:00-18:00", "",""},
            {"Creacion lit", "","", "19:00-21:00", "",""},
            {"Teatro", "","", "", "11:00-17:00",""},

    };
    static Tabla horariosActividades = new Tabla(horariosDeportivas, "Horarios de Actividades Deportivas y culturales");


    static String[] mensajeDeportivas = {
            //horarios
                " ╔═════════════════════════════════════════════════════════════════════════════╗ \n" +
                    " ║   Horarios      de    Actividades     Deportivas      y      Culturales     ║ \n" +
                    " ╠═════════════╦═══════════╦════════════╦════════════╦════════════╦════════════╣ \n" +
                    " ║ Actividades ║ Lunes     ║ Martes     ║ Miércoles  ║ Jueves     ║ Viernes    ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Atletismo   ║10:00-13:00║09:00-13:00 ║9:00-13:00  ║9:00-13:00  ║9:00-13:00  ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Basquetbol  ║12:00-16:00║12:00-16:00 ║12:00-16:00 ║12:00-16:00 ║12:00-16:00 ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Volibol     ║12:00-16:00║12:00-16:00 ║12:00-16:00 ║12:00-16:00 ║12:00-15:00 ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Futbol      ║12:00-15:00║12:00-15:00 ║12:00-15:00 ║12:00-15:00 ║12:00-15:00 ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Tae Kwon Do ║           ║11:00-13:00 ║            ║11:00-13:00 ║            ║ \n" +
                    " ║             ╠═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║             ║           ║15:00-17:00 ║            ║15:00-17:00 ║            ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Futbol      ║10:00-12:00║10:00-12:00 ║10:00-12:00 ║10:00-12:00 ║10:00-12:00 ║ \n" +
                    " ║ Americano   ╠═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║             ║15:00-17:00║15:00-17:00 ║15:00-17:00 ║15:00-17:00 ║15:00-17:00 ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Tocho       ║11:00-13:00║11:00-13:00 ║11:00-13:00 ║11:00-13:00 ║10:00-13:00 ║ \n" +
                    " ║ Bandera     ╠═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║             ║15:00-17:00║15:00-17:00 ║ 15:00-17:00║15:00-17:00 ║15:00-17:00 ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Artes       ║12:00-17:00║12:00-17:00 ║12:00-17:00 ║12:00-17:00 ║12:00-16:00 ║ \n" +
                    " ║ Visuales    ║ 1er piso  ║ 1er piso   ║ 1er piso   ║ 1er piso   ║ 1er piso   ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Musica      ║09:00-17:00║13:00-16:00 ║14:00-17:00 ║11:00-16:00 ║            ║ \n" +
                    " ║ Foklorica   ║ Auditorio ║ Auditorio  ║ Auditorio  ║ Auditorio  ║            ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Danza       ║           ║12:00-15:00 ║            ║            ║12:00-15:00 ║ \n" +
                    " ║ Folklorica  ║           ║ Auditorio  ║            ║            ║ Auditorio  ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Piano       ║           ║            ║ 12:00-18:00║            ║            ║ \n" +
                    " ║             ║           ║            ║Camerino del║            ║            ║ \n" +
                    " ║             ║           ║            ║ auditorio  ║            ║            ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Creacion    ║           ║            ║ 19:00-21:00║            ║            ║ \n" +
                    " ║ Literaria   ║           ║            ║ Virtual    ║            ║            ║ \n" +
                    " ╠═════════════╬═══════════╬════════════╬════════════╬════════════╬════════════╣ \n" +
                    " ║ Teatro      ║           ║            ║            ║ 11:00-17:00║            ║ \n" +
                    " ║             ║           ║            ║            ║ Auditorio  ║            ║ \n" +
                    " ╚═════════════╩═══════════╩════════════╩════════════╩════════════╩════════════╝ \n"
            ,
            //inscripciones a actividades
            " Para realizar tus inscripciones en https://forms.gle./xbSYFKxs5oMV5eCG9",
            //Profesores titulares
            "[Actividades Deportivas] \n" +
                    " Atletismo: Profa. Alma Yadira Quintanar Camacho \n " +
                    " Basquetbol : Prof.Miguel Angel Ramirez Calnacasco & prof. Carlos del Valle Garcia \n" +
                    " Volibol: Prof. Miguel Angel Ramirez Calnasco \n" +
                    " Futbol: Prof.Alfonso Morales Martinez \n" +
                    " Tae Kwon Do: Arturo Wong \n " +
                    " GFutbol Americano Varonil : HEAD COACH Rodrigo Galindo Nava \n" +
                    " Tocho Bandera: HEAD COACH Juan Antonio Rivas Garcia \n" +
                    "[Actividades Culturales] \n" +
                    " Artes Visuales : Prof. Guadalupe de la Rosa Castelan \n " +
                    " Musica Folklorica: Prof. Julio de la Cruz Rodriguez \n" +
                    " Danza Folklorica: Prof. Emmanuel Flores Don Juan \n" +
                    " Piano: Prof.Eduardo Gomez Alarcon \n" +
                    " Creacion Literaria Profa. Rosa Maria Getino \n" +
                    " Teatro: Prof. Alexis Badillo Ortiz \n"
            ,
            "Espera..."
    };
    static String[] opcionesTutorias = {
            "1. Matemáticas",
            "2. Física",
            "3. Química",
            "4. Área Humanística"
    };
    static String[] mensajeTutorias = {
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "|                                      Lunes      Martes      Miércoles      Jueves        Viernes     |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "|                                   Álgebra / Geometría y Trigonometría                                |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "| María Eugenia Flores Olvera   |             |             |             | 10:00-11:00 |  9:00-11:00  |\r\n" +
                                        "| Arturo Neumann Martínez       | 13:00-15:00 |             | 13:00-15:00 |             | 13:00-15:00  |\r\n" +
                                        "| Alicia Mata Avilés            | 10:00-12:00 |             |             |             |              |\r\n" +
                                        "| Guillermo Carrasco García     | 15:00-16:00 | 15:00-16:00 | 15:00-16:00 | 15:00-16:00 | 15:00-16:00  |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "|                             Geometría Analítica / Cálculo Diferencial                                |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "| Ubaldo Bonilla Jiménez        |             |             | 9:00-10:00  | 9:00-10:00  |              |\r\n" +
                                        "| Hermenegildo Barrera Hdz.     | 14:00-15:00 | 14:00-15:00 | 14:00-15:00 |             | 14:00-15:00  |\r\n" +
                                        "| Citlali Sofía Rincón Ruíz     |             | 11:00-12:00 |             | 10:00-12:00 | 9:00-10:00   |\r\n" +
                                        "| Xóchitl Ramírez Marquina      |             |             |             | 17:00-18:00 |              |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" +
                                        "|                       Cálculo Integral / Probabilidad y Estadística                                  |\r\n" +
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| José Antonio Cortés Pérez     |             | 13:00-15:00 |             |             | 13:00-15:00  |\r\n" + //
                                        "| Elisa Magdalena Chirinos A.   |             | 10:00-12:00 | 11:00-12:00 |             |              |\r\n" + //
                                        "| Jesús Alejandro Arreola Hdz.  | 18:00-20:00 |             | 15:00-16:00 | 13:00-14:00 | 18:00-19:00  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| TODOS SE ENCUENTRAN EN CUBÍCULOS DE MATEMÁTICAS EXCEPTO ARTURO NEUMANN (SALÓN 16).                   |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "",


                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                     Lunes      Martes      Miércoles      Jueves        Viernes      |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Ayala Falcon Raúl Moíses      | 11:00-12:00 | 13:00-14:00 | 13:00-14:00 | 12:00-13:00 |              |\r\n" + //
                                        "| Cruz Morales Pedro            | 9:00-11:00  |             |             | 10:00-12:00 |              |\r\n" + //
                                        "| González García Bernardo      | 13:00-15:00 | 14:00-15:00 | 14:00-15:00 |             | 10:00-11:00  |\r\n" + //
                                        "| Olguín García Ubaldo          | 13:00-15:00 | 13:00-15:00 | 13:00-15:00 | 13:00-15:00 | 13:00-15:00  |\r\n" + //
                                        "| Ramírez Espinosa Sergio       |             |             | 14:00-15:00 | 11:00-13:00 | 8:00-9:00    |\r\n" + //
                                        "| Trujillo Torres José          |             |             | 13:00-14:00 | 15:00-16:00 | 15:00-16:00  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                          TODOS SE ENCUENTRAN EN CUBÍCULOS DE FISICA EN TERCER PISO                   |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "",


                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                      Lunes      Martes      Miércoles      Jueves        Viernes     |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                 QUÍMICA 1                                            |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Blanca Rosa Landa Zamora      | 13:00-15:00 | 12:00-14:00 | 13:00-15:00 | 12:00-14:00 |              |\r\n" + //
                                        "| Hortencia Medina Fernández    | 14:00-15:00 | 16:00-17:00 | 17:00-18:00 |             | 17:00-18:00  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                 QUÍMICA 2                                            |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Manuel López Montecillos      | 11:00-13:00 | 9:00-10:00  | 10:00-13:00 |             |              |\r\n" + //
                                        "|                               | 15:00-17:00 |             |             |             |              |\r\n" + //
                                        "| Hortencia Medina Fernández    |             | 13:00-15:00 | 13:00-15:00 |             |              |\r\n" + //
                                        "| María Luisa Morlan S.         | 13:00-14:00 | 12:00-15:00 |             | 12:00-13:00 | 13:00-16:00  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                 QUIÍMICA 3                                           |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Felipe A. García S.           | 10:00-11:00 |  8:00-9:00  |             |             | 11:00-13:00  |\r\n" + //
                                        "|                               | 12:00-14:00 | 12:00-14:00 |             |             |              |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                 QUIÍMICA 4                                           |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Jorge Cortés Pérez            | 16:00-17:00 | 14:00-15:00 | 14:00-16:00 | 15:00-18:00 | 14:00-15:00  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                          TODOS SE ENCUENTRAN EN CUBÍCULOS DE QUÍMICA EN TERCER PISO                  |\r\n" + //
                                        "|------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "",


                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                    Ubicación             Lunes      Martes        Miércoles      Jueves        Viernes     |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                      COMUNICACIÓN CIENTÍFICA                                               |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| M. P. Sonia Barrios Sánchez  | Lab. de Biología      | 12:00-13:00 | 11:00-12:00 |             | 7:00-8:00   |             |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                               DESARROLLO DE HABILIDADES DEL PENSAMIENTO                                    |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| G. Adriana Cano Cortez       | Optativas             | 13:00-14:00 | 14:00-15:00 | 14:00-15:00 |             | 14:00-15:00 |\r\n" + //
                                        "| Ariadna Fernández López      | Optativas             |             | 17:00-18:00 |             | 19:00-20:00 | 15:00-16:00 |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                       DESARROLLO PERSONAL                                                  |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Gabriela Arroyo Castilla     | Historia              |             |             | 13:00-15:00 |             |             |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                  ENTORNO SOCIOECONÓMICO DE MÉXICO                                          |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Jorge G. Cruz Mendoza        | Entorno SE. México    | 16:00-17:00 | 14:00-15:00 | 16:00-18:00 | 15:00-16:00  | 14:00-15:00|\r\n" + //
                                        "| M. Graciela Gutiérrez Vallejo| Sistemas Digitales    | 12:00-13:00 | 9:00-11:00  |             | 10:00-12:00  | 9:00-10:00 |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                                    EXPRESIÓN ORAL Y ESCRITA                                                |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Norma A. Tello Villarreal    | Lengua y Comunicación | 14:00-15:00 | 14:00-15:00 | 14:00-15:00 | 14:00-15:00  | 14:00-15:00|\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "|                                             HISTORIA DE MÉXICO CONTEMPORÁNEO                                               |\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "| Gabriela Arroyo Castilla     | Historia              |             |             |             | 12:00-13:00  | 14:00-15:00|\r\n" + //
                                        "|----------------------------------------------------------------------------------------------------------------------------|\r\n" + //
                                        "",
    };
    static String[] opcionesEventos = {
            "1. Calendario de eventos",
            "2. Regresar al menu"
    };
    static String[] mensajeEventos = {
"|========================================================================================================================================|\r\n" + //
"|                                     TERCERA EVALUACIÓN ORDINARIA                               |       ENERO – FEBRERO 2026            |\r\n" + //
"|========================================================================================================================================|\r\n" + //
"| DÍA                | SEM | ESP | MATERIA                                                       |     MATUTINO    |      VESPERTINO     |\r\n" + //
"|========================================================================================================================================|\r\n" + //
"| Viernes 23 Enero   | 1°  | AB  | Álgebra                                                       | 09:00 - 10:50   | 16:00 - 17:50       |\r\n" + //
"|                    | 3°  | AB  | Geometría Analítica                                           | 09:00 - 10:50   | 16:00 - 17:50       |\r\n" + //
"|                    | 5°  | AB  | Cálculo Integral                                              | 09:00 - 10:50   | 16:00 - 17:50       |\r\n" + //
"|----------------------------------------------------------------------------------------------------------------------------------------|\r\n" + //
"| Lunes 26 Enero     | 1°  | AH  | Desarrollo de Habilidades del Pensamiento                     | 09:00 - 09:50   | 15:00 - 15:50       |\r\n" + //
"|                    | 1°  | AH  | Inglés I                                                      | 11:00 - 11:50   | 17:00 - 17:50       |\r\n" + //
"|                    | 3°  | AB  | Física I                                                      | 09:00 - 10:50   | 16:00 - 17:50       |\r\n" + //
"|                    | 5°  | AB  | Física III                                                    | 09:00 - 10:50   | 16:00 - 17:50       |\r\n" + //
"|                    | 1°  | AB  | Computación Básica I                                          | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|----------------------------------------------------------------------------------------------------------------------------------------|\r\n" + //
"| Martes 27 Enero    | 1°  | AH  | Desarrollo Personal                                           | 09:00 - 09:50   | 16:00 - 16:50       |\r\n" + //
"|                    | 1°  | AH  | Filosofía I                                                   | 11:00 - 11:50   | 18:00 - 18:50       |\r\n" + //
"|                    | 3°  | AH  | Comunicación Científica                                       | 08:00 - 08:50   | 15:00 - 15:50       |\r\n" + //
"|                    | 3°  | AH  | Inglés III                                                    | 10:00 - 10:50   | 16:00 - 16:50       |\r\n" + //
"|                    | 3°  | MEC | Metrología y Tecnología de Materiales                         | 12:00 - 13:50   | 18:00 - 19:50       |\r\n" + //
"|                    | 3°  | SD  | Instrumentación Electrónica                                   | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 3°  | P   | Programación Básica                                           | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 3°  | AH  | Orientación Juvenil y Profesional III                         | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 5°  | MEC | Diseño de Mecanismos Asistidos por Computadora                | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 5°  | SD  | Arquitectura de Microcontroladores                            | 08:00 - 09:50   | 15:00 - 16:50       |\r\n" + //
"|                    | 5°  | SD  | Acondicionamiento de Sistemas (Op)                            | 11:00 - 12:50   | 18:00 - 19:50       |\r\n" + //
"|                    | 5°  | P   | Pruebas de Software                                           | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 5°  | P   | Introducción a los Sistemas Distribuidos                     | PRÁCTICO        | PRÁCTICO             |\r\n" + //
"|----------------------------------------------------------------------------------------------------------------------------------------|\r\n" + //
"| Miércoles 28 Enero | 1°  | AH  | Historia de México Contemporáneo I                            | 10:00 - 10:50   | 17:00 - 17:50       |\r\n" + //
"|                    | 1°  | AB  | Química I                                                     | 08:00 - 08:50   | 15:00 - 15:50       |\r\n" + //
"|                    | 3°  | MEC | Proceso de Soldadura en Sistemas Mecatrónicos (Op)            | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 3°  | SD  | Circuitos Electrónicos                                        | 10:00 - 11:50   | 17:00 - 18:50       |\r\n" + //
"|                    | 3°  | P   | Algoritmia                                                    | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 5°  | AB  | Química III                                                   | 08:00 - 08:50   | 15:00 - 15:50       |\r\n" + //
"|                    | 5°  | MEC | Dispositivos Lógicos Programables                             | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|                    | 5°  | SD  | Dispositivos Electrónicos                                     | PRÁCTICO        | PRÁCTICO            |\r\n" + //
"|========================================================================================================================================|\r\n";
    };

    static String[] opcionesTramites = {
            "1. Solicitud de Dictamen",
            "2. Cambios de carrera o plantel",
            "3. Inscripci\u00F3n/ Reinscripci\u00F3n",
            "4. Proceso de Saberes Previos",
            "5. Trayectoria, constancias y boletas",
            "6. Bajas temporales y definitivas",
            "7. Certificados y documentacion de egreso",
            "8. Regresar al menu inicial "
    };
    static String[] mensajeTramites = {
            //1Dictamen
            "El periodo de recepci\u00F3n de solicitudes se lleva  \n" +
                    "a cabo al final del proceso de inscripci\u00F3n de cada \n" +
                    "semestre. \n" +
                    "Los alumnos que hayan incumplido con lo esta- \n" +
                    "blecido en el Reglamento General de Estudios y \n" +
                    "deseen regularizar su situaci\u00F3n escolar, deben \n" +
                    "solicitar Dictamen: \n" +
                    "Cuando el alumno a\u00FAn puede terminar sus estu- \n" +
                    "dios de nivel medio superior en los t\u00E9rminos del \n" +
                    "Art. 49 del Reglamento General de Estudios \n" +
                    "(4 años y medio). \n" +
                    "Cuando el alumno el alumno rebasa el t\u00E9rmino \n" +
                    "establecido por el Art. 49 del Reglamento General de \n" +
                    "Estudios para el t\u00E9rmino de sus estudios (m\u00E1s de 4 a\u00F1os \n" +
                    "y medio). \n" +
                    "Para solicitarlo, deben enviar un mensaje de correo electr\u00F3nico \n" +
                    "a gestion.escolar.cecyt9@gmail.com indicando nombre completo,\n" +
                    " n\u00FAmero de boleta y situaci\u00F3n escolar \n"
            ,
            //2CambiodePlantelCarrera
            "La convocatoria se publica al final de cada semestre en la siguiente p\u00E1gina web: \n" +
                    "www.dae.ipn.mx/cambiosua/ \n"
            ,
            //3InscripcionReinscripcion
            "Las fechas y los procedimientos se publican en la p\u00E1gina del \n" +
                    "CECyT y se difunden a trav\u00E9s de los medios oficiales del plantel. \n" +
                    "La reinscripci\u00F3n NUNCA es autom\u00E1tica y es obligaci\u00F3n del \n" +
                    "alumno estar atento a los comunicados que se publican en la \n" +
                    "página del plantel y de realizar los trámites correspondientes en \n" +
                    "tiempo y forma. \n" +
                    "De igual forma, el alumno debe informar de manera INMEDIATA \n" +
                    "cualquier problema que tenga con su registro de inscripci\u00F3n. \n" +
                    "Toda la informaci\u00F3n que el alumno proporciona al plantel est\u00E1 \n" +
                    "protegida por el aviso de privacidad de la instituci\u00F3n y la\n" +
                    " veracidad de los datos es responsabilidad \u00FAnica del alumno. \n" +
                    "Estos datos son utilizados para la difusi\u00F3n de informaci\u00F3n \n" +
                    "oficial, para el tr\u00E1mite de becas y otros est\u00EDmulos, de documentos \n" +
                    "de egreso y para ponerse en contacto con sus padres y/o \n" +
                    "tutores en casos de emergencia \n"
            ,
            //4SaberesPrevios
            "El proceso se lleva a cabo al inicio de cada semestre. Las fechas y \n" +
                    " procedimientos se publican en la p\u00E1gina del CECyT.\n",
            //5Trayectoria
            "El departamento de Gesti\u00F3n Escolar expide, a solicitud del alumno, \n" +
                    "boletas y constancias para diversor tr\u00E1mites. Para solicitarlas, se debe \n" +
                    "hacer el registro en las ligas abajo indicadas: \n" +
                    "Boletas de calificaciones \n" +
                    "https://forms.gle/bm3cfuW85rcozhid6 \n" +
                    "Constancias de Estudio \n" +
                    "https://forms.gle/P8b2S7SndaYynn5ZA \n",
            //6Bajas
            "BAJA TEMPORAL \n" +
                    "Se solicita en los primeros 30 d\u00EDas posteriores a la inscripci\u00F3n \n" +
                    " y puede ser por 6  meses o por 1 a\u00F1o Para solicitarla, se debe \n" +
                    "escribir un correo electr\u00F3nico al departamento solicitando la liga de\n " +
                    "registro. \n" +
                    "BAJA DEFINITIVA \n" +
                    "Para solicitarla, primero se debe hacer el registro en la siguiente liga: \n " +
                    "https://forms.gle/phqbsmwKobLqEt8i7 \n" +
                    "Despu\u00E9s se debe solicitar el tr\u00E1mite de una boleta global de calificaciones \n" +
                    "(3 firmas) en la siguiente liga: \n" +
                    "https://forms.gle/bm3cfuW85rcozhid6\n",
            //7Egreso
            "CERTIFICACIÓN INTEGRAL \n" +
                    "Se lleva a cabo \u00FAnicamente en el periodo intersemestral del mes de \n" +
                    "julio y sirve para agilizar el proceso de certificaci\u00F3n del alumno.\n " +
                    "El procedimiento se publica en la p\u00E1gina del plantel.\n" +
                    "ENTREGA DE DOCUMENTACI\u00D3N DE EGRESO \n" +
                    "Se lleva a cabo al final de cada semestre para los alumnos que han concluido \n" +
                    "satisfactoriamente sus estudios. El procedimiento se publica en la p\u00E1gina \n" +
                    "del plantel \n",
            "Espera..."
    };

    static String[] opcionesAlumnos = {
            "1. Informacion de profesores",
            "2. Horarios de profesores",
            "3. Directorio de Servicios escolares",
            "4. Regresar al menu inicial"
    };

    static String[] mensajeAlumnos = {
            // Información profesores
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              GRUPO: 3IM1                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                        CARRERA: SISTEMAS DIGITALES                                   |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Barrera Hernandez Hermenegildo                                                  |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Bernardo Gonzalez Garcia                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio: 50                                                          |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Landa Zamora Blanca Rosa                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Aviles Garcia Nidia                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Zuñiga Martinez Virginia                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Gallegos Vasquez Rosa Maria                                                    |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Circuitos Logicos Combinatorios:                                  |\r\n" + //
             "|  Nombre del profesor: Chavez Martinez Margarita                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                       Circuitos Electronicos:                                        |\r\n" + //
             "|  Nombre del profesor: Mtehuala Mayen Ma. Del Carmen                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                     Instrumentacion Electronica:                                     |\r\n" + //
             "|  Nombre del profesor: Chaves Martinez Margarita                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                             GRUPO: 3IM2                                              |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                      CARRERA: SISTEMAS DIGITALES                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Mata Aviles Alicia                                                              |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Gaspar Sanchez Angela Gabriela                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Zamora Brito Eduardo                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Aviles Garcia Nidia                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Rueda Coconi Claudia                                                           |\r\n" + //
             "|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Avelardo Quiroz Jocelyn Mitzi                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                   Circuitos Logicos Combinatorios:                                   |\r\n" + //
             "|  Nombre del profesor: Flores Orozco Anabel Aida                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                       Circuitos Electronicos:                                        |\r\n" + //
             "|  Nombre del profesor: Rosales Snachez Luis Ernesto                                                   |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                     Instrumentacion Electronica:                                     |\r\n" + //
             "|  Nombre del profesor: Chavez Martinez Margarita                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              GRUPO: 3IM3                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                       CARRERA: SISTEMAS DIGITALES                                    |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Ubaldo Bonilla Jimenez                                                          |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:bubaldo68@gmail.com                                        |\r\n" + //
             "|  Formacion academica:Licenciado. Fisica y Matematicas                                                |\r\n" + //
             "|  Experiencia docente o años de servicio: 30 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Gonzales Olivares Nydia Leydi                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                                |\r\n" + //
             "|  Materias que imparte: Quimmica I,II,III,IV                                                          |\r\n" + //
             "|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:zmandozam@ipn.mx                                           |\r\n" + //
             "|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion               |\r\n" + //
             "|  Experiencia docente o años de servicio: 12 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Cortes Sanchez Teresa                                                          |\r\n" + //
             "|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                             |\r\n" + //
             "|  Formacion academica: Licenciada. Ciencias de la informatica                                         |\r\n" + //
             "|  Experiencia docente o años de servicio: 16 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Davila Gutierrez Mirza                                                         |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                   Circuitos Logicos Combinatorios:                                   |\r\n" + //
             "|  Nombre del profesor: Gil Ladron de Guevara Israel Emanuel                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                        Circuitos Electronicos:                                       |\r\n" + //
             "|  Nombre del profesor: Hernandez Cruz Xochil                                                          |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                        Instrumentacion Electronica:                                  |\r\n" + //
             "|  Nombre del profesor: Chavez Martinez Margarita                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              GRUPO: 3IM4                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                          CARRERA: MECATRONICA                                        |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor: Barrera Hernandez Hermenegildo                                                 |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Bernardo Gonzalez Garcia                                                       |\r\n" + //
             "|  Materias que imparte: Fisica I,II,III,IV,V                                                          |\r\n" + //
             "|  Ubicacion de cubiculo: Tercer Piso                                                                  |\r\n" + //
             "|  Correo Institucional o Medio de contacto: N/A                                                       |\r\n" + //
             "|  Formacion academica: Fisico                                                                         |\r\n" + //
             "|  Experiencia docente o años de servicio: 35                                                          |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Landa Zamora Blanca Rosa                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Zamora Brito Eduardo                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Aviles Garcia Nidia                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Rueda Coconi Claudia                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Hernandez Flores Maria Felisa                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                  Metrologia y Tecnologia de Materiales:                              |\r\n" + //
             "|  Nombre del profesor: Fernandez Go nzales Oscar                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |\r\n" + //
             "|  Nombre del profesor: Lima Herrera Sara Lilia                                                        |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |\r\n" + //
             "|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                     |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              GRUPO: 3IM5                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                          CARRERA: MECATRONICA                                        |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor: Diaz Monroy Gilberto Gamaliel                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Ramierez Espinosa Sergio                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Gaspar Sanchez Angela Gabriela                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Zamora Brito Eduardo                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Aviles Garcia Nidia                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Ingles:                                                |\r\n" + //
             "|  Nombre del profesor: Silvia Lizzete Gomez Sanchez                                                   |\r\n" + //
             "|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                             |\r\n" + //
             "|  Formacion academica: Licenciada. Ciencias de la informatica                                         |\r\n" + //
             "|  Experiencia docente o años de servicio: 16 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Llerena Nuñez Angel                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                 Metrologia y Tecnologia de Materiales:                               |\r\n" + //
             "|  Nombre del profesor: Marinez Perez Rosa Elena                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |\r\n" + //
             "|  Nombre del profesor: Lima Herrera Sara Lilia                                                        |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |\r\n" + //
             "|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                     |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                             Grupo 3IM6                                               |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                          CARRERA: MECATRONICA                                        |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor: Diaz Monroy Gilbero Gamaliel                                                   |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica: Licenciado. Fisica y Matematicas                                               |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Gamiño Cruz Enesto                                                             |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                                |\r\n" + //
             "|  Materias que imparte: Quimmica I,II,III,IV                                                          |\r\n" + //
             "|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:zmandozam@ipn.mx                                           |\r\n" + //
             "|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion               |\r\n" + //
             "|  Experiencia docente o años de servicio: 12 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: artinez Montaño Luis Alonso                                                    |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Aviles Garcia Nidia                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles III:                                             |\r\n" + //
             "|  Nombre del profesor: Cmarena Garay Dafne                                                            |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Llerena Nuñez Sanchez                                                          |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                  Metrologia y Tecnologia de Materiales:                              |\r\n" + //
             "|  Nombre del profesor: Marines Perez Rosa Elena                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                        Electrotecnia de Corriente Continua y Corriente Alterna:                      |\r\n" + //
             "|  Nombre del profesor: Lima Herrera Sara Lilia                                                        |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                            Procesos de Soldadura en Sistemas Mecatronicos:                           |\r\n" + //
             "|  Nombre del profesor: Hernandeez Sanchez Joaquin                                                     |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Grupo 3IM7                                              |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                          CARRERA: PROGRAMACIÓN                                       |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Ubaldo Bonilla Jimenez                                                          |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:bubaldo68@gmail.com                                        |\r\n" + //
             "|  Formacion academica:Licenciado. Fisica y Matematicas                                                |\r\n" + //
             "|  Experiencia docente o años de servicio: 30 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Bernardo Gonzalez Garcia                                                       |\r\n" + //
             "|  Materias que imparte: Fisica I,II,III,IV,V                                                          |\r\n" + //
             "|  Ubicacion de cubiculo: Tercer Piso                                                                  |\r\n" + //
             "|  Correo Institucional o Medio de contacto: N/A                                                       |\r\n" + //
             "|  Formacion academica: Fisico                                                                         |\r\n" + //
             "|  Experiencia docente o años de servicio: 35                                                          |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Zyanya Tonantzin Mendoza Medina                                                |\r\n" + //
             "|  Materias que imparte: Quimmica I,II,III,IV                                                          |\r\n" + //
             "|  Ubicacion de cubiculo: Quimica Laboratorio II y II, 3er piso                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto:zmandozam@ipn.mx                                           |\r\n" + //
             "|  Formacion academica: Licenciada en Ciencias Ambientales con especialidad en educacion               |\r\n" + //
             "|  Experiencia docente o años de servicio: 12 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Silvia Lizzete Gomez Sanchez                                                   |\r\n" + //
             "|  Materias que imparte: Ingles I,II,III,IV,V,VI                                                       |\r\n" + //
             "|  Ubicacion de cubiculo: Al lado de prefectura                                                        |\r\n" + //
             "|  Correo Institucional o Medio de contacto: sgomez@ipn.mx                                             |\r\n" + //
             "|  Formacion academica: Licenciada. Ciencias de la informatica                                         |\r\n" + //
             "|  Experiencia docente o años de servicio: 16 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Kenia Evangelista Rivera                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                 Laboratorio de desarrollo de software:                               |\r\n" + //
             "|  Nombre del profesor: Rosa Iliana Fuentes Cruz                                                       |\r\n" + //
             "|  Materias que imparte: Programacion                                                                  |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto: rfuentescoa@gmail.com                                     |\r\n" + //
             "|  Formacion academica: Informatica                                                                    |\r\n" + //
             "|  Experiencia docente o años de servicio: N/A                                                         |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Programacion Basica:                                         |\r\n" + //
             "|  Nombre del profesor: German Gutierrez Galan                                                         |\r\n" + //
             "|  Materias que imparte: Programacion                                                                  |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion, cubiculo 2                                         |\r\n" + //
             "|  Correo Institucional o Medio de contacto: ggerdoc@gmail.com                                         |\r\n" + //
             "|  Formacion academica: Licenciado en Informatica                                                      |\r\n" + //
             "|  Experiencia docente o años de servicio: 8 años                                                      |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Algoritmia:                                             |\r\n" + //
             "|  Nombre del profesor: German Gutierrez Galan                                                         |\r\n" + //
             "|  Materias que imparte: Programacion                                                                  |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion, cubiculo 2                                         |\r\n" + //
             "|  Correo Institucional o Medio de contacto: ggerdoc@gmail.com                                         |\r\n" + //
             "|  Formacion academica: Licenciado en Informatica                                                      |\r\n" + //
             "|  Experiencia docente o años de servicio: 8 años                                                      |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                             Grupo 3IM8                                               |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         CARRERA: PROGRAMACIÓN                                        |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Hermenegildo Barrera Hernandez                                                  |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Blanca Rosa Landa Zamora                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio: 12 años                                                     |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Dafne Camarena Garay                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Kenia Evangelista Rivera                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                 Laboratorio de desarrollo de software:                               |\r\n" + //
             "|  Nombre del profesor: Octavio Ernesto Dominguez Sosa                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Programacion Basica:                                         |\r\n" + //
             "|  Nombre del profesor: Juan Angel Calvillo Perez                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Algoritmia:                                             |\r\n" + //
             "|  Nombre del profesor: Juan Angel Calvillo Perez                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                             Grupo 3IM9                                               |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                        CARRERA: PROGRAMACIÓN                                         |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor:Hermenegildo Barrera Hernandez                                                  |\r\n" + //
             "|  Materias que imparte:Geometria Analitica                                                            |\r\n" + //
             "|  Ubicacion de cubiculo:Matematicas                                                                   |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Nydia Leydi Gonzales Olivares                                                  |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Aviles Mariño Laura Elsa                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Zamora Brito Eduardo                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Cortes Sanchez Teresa                                                          |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Gallegos Vasquez Rosa Maria                                                    |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                 Laboratorio de desarrollo de software:                               |\r\n" + //
             "|  Nombre del profesor: Ramirez Solis Enrique                                                          |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Programacion Basica:                                         |\r\n" + //
             "|  Nombre del profesor: Rosa Iliana Fuentes Cruz                                                       |\r\n" + //
             "|  Materias que imparte: Programacion                                                                  |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto: rfuentescoa@gmail.com                                     |\r\n" + //
             "|  Formacion academica: Informatica                                                                    |\r\n" + //
             "|  Experiencia docente o años de servicio: N/A                                                         |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Algoritmia:                                             |\r\n" + //
             "|  Nombre del profesor: Cruz Mendoza Juan Manuel                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                             Grupo 3IM10                                              |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         CARRERA: PROGRAMACIÓN                                        |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Analitica:                                              |\r\n" + //
             "|  Nombre del profesor: Diaz Monry Gilberto Gamaliel                                                   |\r\n" + //
             "|  Materias que imparte: Geometria Analitica                                                           |\r\n" + //
             "|  Ubicacion de cubiculo: Matematicas                                                                  |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Fisica:                                                 |\r\n" + //
             "|  Nombre del profesor: Ramires Espinosa Sergio                                                        |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                               Quimica:                                               |\r\n" + //
             "|  Nombre del profesor: Garcia Silvia Felipe.A                                                         |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Comunicacion Cientifica:                                     |\r\n" + //
             "|  Nombre del profesor: Martha Sonia.P.Barrios Sanchez                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                    Entorno Socioeconomico de México:                                 |\r\n" + //
             "|  Nombre del profesor: Maria Graciela Gutierrez Vallejo                                               |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Ingles:                                                 |\r\n" + //
             "|  Nombre del profesor: Zuñiga Martines Virginia                                                       |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                           Dibujo Tecnico:                                            |\r\n" + //
             "|  Nombre del profesor: Llerena Nuñeez Angel                                                           |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                 Laboratorio de desarrollo de software:                               |\r\n" + //
             "|  Nombre del profesor: Torrojillos Jaimes Roberto Carlos                                              |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                         Programacion Basica:                                         |\r\n" + //
             "|  Nombre del profesor: Dominguez Sosa Octavio Ernesto                                                 |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo: Academia de programacion                                                     |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "|                                              Algoritmia:                                             |\r\n" + //
             "|  Nombre del profesor: Juan Angel Calvillo Perez                                                      |\r\n" + //
             "|  Materias que imparte:                                                                               |\r\n" + //
             "|  Ubicacion de cubiculo:                                                                              |\r\n" + //
             "|  Correo Institucional o Medio de contacto:                                                           |\r\n" + //
             "|  Formacion academica:                                                                                |\r\n" + //
             "|  Experiencia docente o años de servicio:                                                             |\r\n" + //
             "|------------------------------------------------------------------------------------------------------|\r\n" + //
             "                                                                                                        \r\n" + //
        
        
            "",
    
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              BONILLA JIMENEZ UBALDO                                     |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           | 3IM3    |  3IM7   |  3IM3    |  3IM9  | 3IM9   | Geometría Analítica    |\r\n" + //
                    "| 8-9           | 3IM3    |         |  3IM3    |  3IM9  | 3IM9   | Geometría Analítica    |\r\n" + //
                    "| 9-10          | 3IM7    |  3IM9   |          |        |        | Geometría Analítica    |\r\n" + //
                    "| 10-11         | 3IM7    |         |  3IM7    |  3IM3  |        | Geometría Analítica    |\r\n" + //
                    "| 11-12         |         |         |  3IM7    |        |        | Geometría Analítica    |\r\n" + //
                    "| 12-13         |         |         |          |        |        |                        |\r\n" + //
                    "| 13-14         |         |         |          |        |        |                        |\r\n" + //
                    "| 14-15         |         |         |          |        |        |                        |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    
                    "                                                                                           \r\n" + //

                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              GONZALEZ GARCIA LIC. BERNARDO                              |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         | 3IM4    | 3IM4     |  3IM1  | 3IM1   | Física 1               |\r\n" + //
                    "| 8-9           |         | 3IM4    | 3IM4     |  3IM1  | 3IM7   | Física 1               |\r\n" + //
                    "| 9-10          |         |         | 3IM1     |  3IM7  | 3IM7   | Física 1               |\r\n" + //
                    "| 10-11         |         |         | 3IM1     |  3IM7  |        | Física 1               |\r\n" + //
                    "| 11-12         |         |         |          |        |        |                        |\r\n" + //
                    "| 12-13         |         |         |          |        |        |                        |\r\n" + //
                    "| 13-14         |         | 3IM7    |          |        |        | Física 1               |\r\n" + //
                    "| 14-15         |         |         |          |        | 3IM4   | Física 1               |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              MENDOZA MEDINA ZYANYA TONANTZIN                            |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         |         |          |        |        |                        |\r\n" + //
                    "| 8-9           |         |         |          |        |        |                        |\r\n" + //
                    "| 9-10          |         |         |   3IM6   |        | 3IM3   | Química 1              |\r\n" + //
                    "| 10-11         |         |         |   3IM6   |        | 3IM3   | Química 1              |\r\n" + //
                    "| 11-12         | 3IM7    | 3IM7    |   3IM3   |        |        | Química 1              |\r\n" + //
                    "| 12-13         | 3IM7    | 3IM7    |   3IM3   |        |        | Química 1              |\r\n" + //
                    "| 13-14         | 3IM6    |         |          |        |        | Química 1              |\r\n" + //
                    "| 14-15         | 3IM6    |         |          |        |        | Química 1              |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              GOMEZ SANCHEZ SILVIA LIZZETE                               |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           | 3IM5    |         |          |        | 3IM7   | Ingles 3               |\r\n" + //
                    "| 8-9           | 3IM5    | 1IM5    |          |        | 3IM5   | Ingles 1/Ingles 3      |\r\n" + //
                    "| 9-10          |         | 1IM5    |          |        | 1IM1   | Ingles 1               |\r\n" + //
                    "| 10-11         |         |         | 1IM1     | 1IM1   | 1IM1   | Ingles 1               |\r\n" + //
                    "| 11-12         |         | 1IM4    | 1IM4     | 1IM1   | 1IM4   | Ingles 1               |\r\n" + //
                    "| 12-13         | 1IM5    | 1IM4    | 3IM7     | 1IM5   | 1IM4   | Ingles 1/Ingles 3      |\r\n" + //
                    "| 13-14         | 3IM7    | 3IM5    | 3IM7     | 1IM5   |        | Ingles 1/Ingles 3      |\r\n" + //
                    "| 14-15         |         | 3IM5    |          | 3IM7   |        | Ingles 3               |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //    
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              BARRIOS SANCHEZ MARTHA P.S.                                |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         |         |          |        |        |                        |\r\n" + //
                    "| 8-9           |         |         |          | 3IM7   |        | Comunicación Científica|\r\n" + //
                    "| 9-10          |         |         |          | 3IM1   | 3IM1   | Comunicación Científica|\r\n" + //
                    "| 10-11         |         |         |          |        | 3IM1   | Comunicación Científica|\r\n" + //
                    "| 11-12         |         |         | 3IM8     | 3IM3   | 3IM10  | Comunicación Científica|\r\n" + //
                    "| 12-13         |         |         | 3IM10    | 3IM3   |        | Comunicación Científica|\r\n" + //
                    "| 13-14         | 3IM3    |         | 3IM10    |        | 3IM8   | Comunicación Científica|\r\n" + //
                    "| 14-15         |         | 3IM7    | 3IM7     |        | 3IM8   | Comunicación Científica|\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              EVANGELISTA RIVERA KENIA                                   |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         |         |          |        |        |                        |\r\n" + //
                    "| 8-9           |         |         |          |        |        |                        |\r\n" + //
                    "| 9-10          |         |         |          |        |        |                        |\r\n" + //
                    "| 10-11         |         |         |          |        |        |                        |\r\n" + //
                    "| 11-12         |         |         |          |        | 3IM7   | Dibujo Técnico         |\r\n" + //
                    "| 12-13         |         |         |          |        | 3IM7   | Dibujo Técnico         |\r\n" + //
                    "| 13-14         |         |         |          |        | 3IM7   | Dibujo Técnico         |\r\n" + //
                    "| 14-15         |         |         |          | 5IV5   | 3IM7   | Dibujo Tec/Cálculo Dif |\r\n" + //
                    "| 15-16         |         | 5IV5    |          | 5IV5   |        | Cálculo Diferencial    |\r\n" + //
                    "| 16-17         |         |         |          |        | 5IV5   | Cálculo Diferencial    |\r\n" + //
                    "| 17-18         |         | 3IV1    | 3IV5     |        | 5IV5   | Dibujo Tec/Cálculo Dif |\r\n" + //
                    "| 18-19         |         | 3IV1    | 3IV5     |        |        | Dibujo Técnico         |\r\n" + //
                    "| 19-20         |         | 3IV1    | 3IV5     |        |        | Dibujo Técnico         |\r\n" + //
                    "| 20-21         |         | 3IV1    | 3IV5     |        |        | Dibujo Técnico         |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              GUTIERREZ VALLEJO MARIA GRACIELA                           |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         |         |          | 3IM7   |        | Entorno Sociecónomico  |\r\n" + //
                    "| 8-9           |         | 3IM7    |          |        | 3IM10  | Entorno Sociecónomico  |\r\n" + //
                    "| 9-10          |         |         | 3IM8     |        |        | Entorno Sociecónomico  |\r\n" + //
                    "| 10-11         | 3IM9    |         | 3IM8     |        | 3IM7   | Entorno Sociecónomico  |\r\n" + //
                    "| 11-12         | 3IM9    |         | 3IM10    |        |        | Entorno Sociecónomico  |\r\n" + //
                    "| 12-13         |         |         | 3IM9     |        |        | Entorno Sociecónomico  |\r\n" + //
                    "| 13-14         | 3IM8    |         |          |        |        | Entorno Sociecónomico  |\r\n" + //
                    "| 14-15         |         | 3IM10   |          |        |        | Entorno Sociecónomico  |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              GUTIERREZ GALAN GERMAN                                     |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           |         |         |          |        |        |                        |\r\n" + //
                    "| 8-9           |         |         |          |        |        |                        |\r\n" + //
                    "| 9-10          |         | 3IM7    | 3IM7     |        |        | Programación           |\r\n" + //
                    "| 10-11         |         | 3IM7    | 5IM8     |        |        | Programación/LDS       |\r\n" + //
                    "| 11-12         |         |         | 5IM8     | 3IM7   | 5IM9   | LDS/Algoritmia         |\r\n" + //
                    "| 12-13         |         |         |          | 3IM7   | 5IM9   | Algoritmia             |\r\n" + //
                    "| 13-14         | 5IM8    | 5IM9    | 5IM9     | 3IM7   | 5IM9   | LDS/PW/Algoritmia      |\r\n" + //
                    "| 14-15         | 5IM8    |         | 5IM9     |        | 5IM9   | LDS/Programación Web   |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //
            
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "|                              FUENTES CRUZ LIC. ROSA ILIANA                              |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| Horario (HRS) |  Lunes  |  Martes | Miércoles| Jueves | Viernes|    Materia             |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "| 7-8           | 3IM7    |         | 3IM7     |        |        | Lab. Des. Software     |\r\n" + //
                    "| 8-9           | 3IM7    |         | 3IM7     |        |        | Lab. Des. Software     |\r\n" + //
                    "| 9-10          |         |         |          |        |        |                        |\r\n" + //
                    "| 10-11         |         |         |          |        |        |                        |\r\n" + //
                    "| 11-12         |         |         |          |        |        |                        |\r\n" + //
                    "| 12-13         |         | 3IM9    |          |        |        | Programación           |\r\n" + //
                    "| 13-14         |         |         | 3IM9     |        |        | Programación           |\r\n" + //
                    "| 14-15         |         |         | 3IM9     |        |        | Programación           |\r\n" + //
                    "| 15-16         |         |         |          |        |        |                        |\r\n" + //
                    "| 16-17         |         |         |          |        |        |                        |\r\n" + //
                    "| 17-18         |         |         |          |        |        |                        |\r\n" + //
                    "| 18-19         |         |         |          |        |        |                        |\r\n" + //
                    "| 19-20         |         |         |          |        |        |                        |\r\n" + //
                    "| 20-21         |         |         |          |        |        |                        |\r\n" + //
                    "|-----------------------------------------------------------------------------------------|\r\n" + //
                    "                                                                                           \r\n" + //

                "",
    
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                   DIRECTORIO DE SERVICIOS ESCOLARES                                  |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                              DIRECCION                                               |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|             NOMBRE               |             CORREO           |              EXTENSION             |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Dra. Dorina Ortega Sánchez            cecyt9direccion@ipn.mx                 46263, 63825           |\r\n" + //
                    "|  Directora                                                                                           |\r\n" + //
                    "|  Direccion                                                                                           |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  M. en C. Luis Uriel Sánchez Nava          lsanchezn@ipn.mx                       63804              |\r\n" + //
                    "|  Jefe de la Unidad de Informática                                                                    |\r\n" + //
                    "|  UDI                                                                                                 |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  M. en E. Jesús Gutiérrez Castillo        jegutierrezc@ipn.mx                      63859             |\r\n" + //
                    "|  Directora                                                                                           |\r\n" + //
                    "|  Direccion                                                                                           |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. María Isabel Álvarez y Duncan          mialvarez@ipn.mx                      63817             |\r\n" + //
                    "|  Decana                                                                                              |\r\n" + //
                    "|  Decanato                                                                                            |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                         SUBDIRECCION ACADEMICA                                       |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|             NOMBRE               |             CORREO           |              EXTENSION             |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Elia Jiménez Álvarez                  ejimenez@ipn.mx                      46265               |\r\n" + //
                    "|  Subdirectora Académica                                                                              |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Amada Paez Pimentel                     apaezp@ipn.mx                       63807              |\r\n" + //
                    "|  Jefa del Departamento de Unidades de                                                                |\r\n" + //
                    "|  Aprendizaje del Área Básica                                                                         |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  M. en E. Ricardo Bladimir Peña Dominguez     rpenad@ipn.mx                      46267               |\r\n" + //
                    "|  Jefe del Departamento de Unidades de Aprendizaje                                                    |\r\n" + //
                    "|  del Área Humanística                                                                                |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  M. en C. Edgar Miguel Ramírez Rodríguez         eramirezr@ipn.mx                 63830              |\r\n" + //
                    "|  Jefe del Departamento de Unidades de Aprendizaje                                                    |\r\n" + //
                    "|  del Área Tecnológica y Especialidad                                                                 |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  M. en E. Cynthia Y. Rodríguez Romero            crodriguezro@ipn.mx               63841             |\r\n" + //
                    "|  Jefa del Departamento de Servicios Académicos                                                       |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                      SUBDIRECCION ADMINISTRATIVA                                     |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|             NOMBRE               |             CORREO           |              EXTENSION             |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Araceli Hernández Pérez               ahernandezp@ipn.mx                   46266               |\r\n" + //
                    "|  Subdirectora Administrativa                                                                         |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Carmen Berenice Serrano Juarez         cserranoj@ipn.mx                    63806               |\r\n" + //
                    "|  Jefa del Departamento de Capital Humano                                                             |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Alejandra Salazar Chávez              alsalazarc@ipn.mx                    63810               |\r\n" + //
                    "|  Jefa de Departamento de Recursos Financieros                                                        |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  TSU. Oscar Fernández González               osfernandez@ipn.mx                  63838               |\r\n" + //
                    "|  Jefe del Departamento de Recursos Materiales y Servicios                                            |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                    SUBDIRECCION DE SERVICIOS EDUCATIVOS E                            |\r\n" + //
                    "|                                             INTEGRACION SOCIAL                                       |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|             NOMBRE               |             CORREO           |              EXTENSION             |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Natisma Julieta López Salas            nlopezs@ipn.mx                      63823               |\r\n" + //
                    "|  Jefa del Departamento de Gestión Escolar                                                            |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. América Leticia Aldama Silva            alaldamas@ipn.mx                    63850              |\r\n" + //
                    "|  Jefa del Departamento de Servicios Estudiantiles                                                    |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Dr. en C. Erick Asiain De la Luz             easiaind@ipn.mx                    63853               |\r\n" + //
                    "|  Jefe del Departamento de Extensión y Apoyos Educativos                                              |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|  Lic. Laura Juana Morales Álvarez              ljmorales@ipn.mx                  63816               |\r\n" + //
                    "|  Jefa de la Unidad Politécnica de Integración Social                                                 |\r\n" + //
                    "|                                                                                                      |\r\n" + //
                    "|------------------------------------------------------------------------------------------------------|\r\n" + //









































                    "",





            "Espera..."


    };





}
