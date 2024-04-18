package tasca5_javaUtils.n1exercici4.clase;

import org.jetbrains.annotations.NotNull;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class TxtDatos {

    public void mostrarDatos(String ruta) {
        File directorio = new File(ruta);

        try {
            validarDirectorio(directorio);  // Verifico que el directorio exista y sea un directorio

            File[] archivos = obtenerArchivos(directorio);  // Obtengo todos los archivos del directorio
            if (archivos == null || archivos.length == 0) { // Verifico que el directorio no esté vacío
                throw new IOException("No existen (archivos/directorios) en el directorio que has proporcionado.");
            }

            Arrays.sort(archivos); // Ordeno los archivos

            SimpleDateFormat ultimaModificacion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println("Mostrando el contenido de todos los archivos TXT que se encuentran en la misma carpeta o en subcarpetas:\n");

            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("****************************************************************\n" +
                            "(D)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
                    mostrarSubArchivos(archivo, ruta, ultimaModificacion);
                } else {
                    mostrarInformacionArchivo(archivo, ultimaModificacion);
                    mostrarContenidoTxt(archivo);
                }
            }
        } catch (IOException e) {  // Si ocurre un error, lo muestro por pantalla
            System.out.println(e.getMessage());
        }
    }

    private void validarDirectorio(@NotNull File directorio) throws IOException {
        if (!directorio.exists() || !directorio.isDirectory()) {  // Verifico que el directorio exista y sea un directorio
            throw new IOException("Error!!! La ruta del directorio no existe o no es válida");
        }
    }

    private File[] obtenerArchivos(@NotNull File directorio) {  // Obtengo todos los archivos del directorio
        return directorio.listFiles();  // Retorno un arreglo de archivos
    }

    private void mostrarInformacionArchivo(@NotNull File archivo, @NotNull SimpleDateFormat ultimaModificacion) {  // Muestro la información del archivo
        System.out.println("(F)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
    }

    private void mostrarContenidoTxt(File archivo) {  // Muestro el contenido de un archivo TXT
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            boolean archivoVacio = true;

            // Verifico si el archivo está vacío
            while ((linea = reader.readLine()) != null) {
                archivoVacio = false;
                System.out.println("El archivo " + archivo.getName() + " contiene la siguiente información:\n" + linea);
            }

            // Muestro mensaje de archivo vacío si corresponde
            if (archivoVacio) {
                System.out.println("El archivo " + archivo.getName() + " está vacío.");
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo " + archivo.getName() + ": " + e.getMessage());
        }
    }

    private void mostrarSubArchivos(@NotNull File directorio, String ruta, SimpleDateFormat ultimaModificacion) {
        File[] subArchivos = directorio.listFiles();
        if (subArchivos != null) {
            for (File subArchivo : subArchivos) {
                if (subArchivo.isDirectory()) {
                    System.out.println("****************************************************************\n" +
                            "(D)" + subArchivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(subArchivo.lastModified())));
                    mostrarSubArchivos(subArchivo, ruta, ultimaModificacion);
                } else {
                    mostrarInformacionArchivo(subArchivo, ultimaModificacion);
                    mostrarContenidoTxt(subArchivo);
                }
            }
        }
    }

}