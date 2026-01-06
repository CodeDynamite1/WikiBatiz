package CLIversion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class GestorDeDatos {
    private String nombreDeArchivo;
    private File Archivo;

    GestorDeDatos(String nombreDeArchivo, String nombreDeCarpeta){
        this.nombreDeArchivo = nombreDeArchivo;
        String carpetaActual = System.getProperty("user.dir");
        File directorio = new File(carpetaActual + File.separator + nombreDeCarpeta);
        this.Archivo = new File(directorio.getAbsolutePath() +File.separator+ nombreDeArchivo);
        if(!directorio.exists()){
            directorio.mkdirs();
        }
        try {
            Archivo.createNewFile();
        }catch (IOException e){
            System.out.println("IO error, corregir");
        }
    }

    GestorDeDatos(String nombreDeArchivo){
        this.nombreDeArchivo = nombreDeArchivo;
        String carpetaActual = System.getProperty("user.dir");
        File directorio = new File(carpetaActual + File.separator +"Data");
        if(!directorio.exists()){
            directorio.mkdirs();
        }
        this.Archivo = new File(directorio.getAbsolutePath() +File.separator+ nombreDeArchivo);
        try {
            Archivo.createNewFile();
        }catch (IOException e){
            System.out.println("IO error, corregir");
        }
    }

    public void guardarDatos(String[] datos){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(Archivo,true))){
            for (int i = 0; i < datos.length; i++){
                    escritor.write(datos[i]);
                    escritor.newLine();
            }
        } catch (IOException e){
            System.out.println("Error al guardar datos");
        }
    }

    public void sobreescribirDatos(String[] datos){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(Archivo))){
            for (int i = 0; i < datos.length; i++){
                escritor.write(datos[i]);
                escritor.newLine();
            }
        } catch (IOException e){
            System.out.println("Error al sobreescribir datos");
        }
    }

    public void editarDatosEnLinea(String datos, int linea){
        String[] temp = leerDatos();
        if (temp.length == 0){
            System.out.println("Sin datos que escribir");
            return;
        }
        if (linea > temp.length){
            String[] desborde = new String[linea];
            for (int i = 0; i < desborde.length; i++) {
               desborde[i] = temp.length < i+1 ? "'\n'": temp[i];
            }
            desborde[--linea] = datos;
            sobreescribirDatos(desborde);
            return;
        }
        temp[--linea] = datos;
        sobreescribirDatos(temp);
    }

    public String[] leerDatos(){
        String linea;
        int longitud = 0;
        try(BufferedReader contador = new BufferedReader(new FileReader(Archivo))){
            while ((linea = contador.readLine()) != null) {
                longitud++;
            }
        }catch (IOException e){
            System.out.println("Error al guardar datos");
        }
        String[] datosLeidos = new String[longitud];
        try(BufferedReader lector = new BufferedReader(new FileReader(Archivo))){
            for (int i = 0; i < longitud; i++){
                datosLeidos[i] = lector.readLine();
            }
        }catch (IOException e){
            System.out.println("Error al leer datos");
        }
        return datosLeidos;
    }

    public String[] leerDatos(File archivo){
        String linea;
        int longitud = 0;
        try(BufferedReader contador = new BufferedReader(new FileReader(archivo))){
            while ((linea = contador.readLine()) != null) {
                longitud++;
            }
        }catch (IOException e){
            System.out.println("Error al guardar datos");
        }
        String[] datosLeidos = new String[longitud];
        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
            for (int i = 0; i < longitud; i++){
                datosLeidos[i] = lector.readLine();
            }
        }catch (IOException e){
            System.out.println("Error al leer datos");
        }
        return datosLeidos;
    }

    public String leerDatos(int linea){
        String lineaARetornar = "";
        int identificadorLinea = 0;
        try(BufferedReader lector = new BufferedReader(new FileReader(Archivo))){
            while ((lineaARetornar = lector.readLine()) != null) {
                identificadorLinea++;
                if(identificadorLinea == linea){
                    System.out.println(lineaARetornar);
                }
            }
        }catch (IOException e){
            System.out.println("Error al leer datos");
        }
    return lineaARetornar;
    }

    public void borrarDatos(){
        if (Archivo.exists()){
            Archivo.delete();
        }
    }

    public void copiarDatosEnArchivo(File origen, File destino){
        String linea;
        try {
            BufferedWriter transcriptor = new BufferedWriter(new FileWriter(destino));
            String [] transcripcion = leerDatos(origen);
            for (int i = 0; i < transcripcion.length; i++){
                transcriptor.write(transcripcion[i]);
                transcriptor.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
