
public class Tabla {
    private String[][] matriz;
    private int filas;
    private int columnas;
    private String nombre;

    public void imprimirTabla() {

        imprimirEncabezado(nombre);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("║%12s",matriz[i][j]);
            }
            System.out.println("║");
            separacion();
        }
    }

    public Tabla(String[][] arr, String nombrar) {
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
            System.out.print("═");
        }
        System.out.print('\n');
    }
}
