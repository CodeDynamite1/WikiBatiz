import java.util.InputMismatchException;
import java.util.Scanner;

public class TablaHorarios {
    private String[][] matriz;
    private int filas;
    private int columnas;
    private String nombre;

    public void imprimirTabla() {

        imprimirEncabezado(nombre);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("|%12s",matriz[i][j]);
            }
            System.out.println("|");
            separacion();
        }
    }

    public void editarTabla(){
        System.out.println("Imprimiendo contenido de la tabla");
        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("%12d", i);
        }
        System.out.print('\n');

        for (int i = 0; i < matriz.length; i++) {
            System.out.printf("[%d]",i);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("|%12s",matriz[i][j]);
            }
            System.out.println("|");
            separacion();
        }
        System.out.print("Escribe la fila a editar");
        int fila = LeerNum();
        System.out.print("Escribe la columna a editar");
        int columna = LeerNum();
        System.out.println("Ahora escribe el nuevo contenido");
        Scanner Scanner = new Scanner(System.in);
        matriz[filas][columnas] = Scanner.nextLine();
        System.out.println("Deseas editar otra linea");
        System.out.println("1.SI 2.NO");
        int eleccion = LeerNum();
        if (eleccion == 1) editarTabla();
        return;

    }

    public static int LeerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        try {
            num = leer.nextInt();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Error, no haz ingresado un numero");
            leer.next();
        }
        return num;
    }

    public TablaHorarios(String[][] arr, String nombrar) {
        this.matriz = arr;
        this.filas = arr.length;
        this.columnas = arr[0].length;
        this.nombre = nombrar;
    }

    public void imprimirEncabezado(String titulo){
        separacion();
        System.out.println(titulo);
        separacion();
    }

    public void separacion(){
        int largoTotal = (columnas * 13) + 1;
        for (int i = 0; i < largoTotal; i++) {
            System.out.print("-");
        }
        System.out.print('\n');
    }
}
