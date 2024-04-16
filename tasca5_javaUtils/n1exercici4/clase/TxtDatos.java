package tasca5_javaUtils.n1exercici4.clase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TxtDatos {

    public void mostrarDatos(String ruta) throws IOException {
        File directorio = new File(ruta);

        if (!directorio.exists() || !directorio.isDirectory()) {
            throw new IOException("Error!!! La ruta del directorio no existe o no es válida");
        }

        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) {
            throw new IOException("Error!!! No se pueden listar los archivos del directorio. Directorio vacío o sin archivos");
        }

        Arrays.sort(archivos);

        SimpleDateFormat ultimaModificacion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Mostrando el contenido de todos los archivos TXT que se encuentran en la misma carpeta o en subcarpetas:\n");

        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println("****************************************************************\n" +
                        "(D)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
            } else {
                System.out.println("(F)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
                mostrarContenidoTxt(archivo);
            }

            mostrarSubArchivos(archivo, ruta, ultimaModificacion);
        }
    }


    private void mostrarSubArchivos(File archivo, String ruta, SimpleDateFormat ultimaModificacion) throws IOException {
        File subDirectorio = new File(ruta + "/" + archivo.getName());

        if (subDirectorio.isDirectory()) {
            String[] subSubArchivos = subDirectorio.list();

            if (subSubArchivos != null && subSubArchivos.length > 0) {
                Arrays.sort(subSubArchivos);

                for (String subSubArchivo : subSubArchivos) {
                    File archivoActual = new File(subDirectorio, subSubArchivo);

                    if (archivoActual.isDirectory()) {
                        System.out.println("****************************************************************\n" +
                                "(D)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                    } else {
                        System.out.println("(F)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                        mostrarContenidoTxt(archivoActual);
                    }
                }
            }
        }
    }


    public void mostrarContenidoTxt(File archivo) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean archivoVacio = true;

            // Verifico si el archivo está vacío
            while ((linea = reader.readLine()) != null) {
                archivoVacio = false;
                System.out.println("El archivo " + archivo.getName() + " contiene la siguente información:\n" + linea);
            }

            // Muestro mensaje de archivo vacío si corresponde
            if (archivoVacio) {
                System.out.println("El archivo " + archivo.getName() + " está vacío.");
            }

            System.out.println();
        } catch (IOException e) {
            throw new IOException("Error al leer el archivo " + archivo.getName() + ": " + e.getMessage());
        }
    }


}