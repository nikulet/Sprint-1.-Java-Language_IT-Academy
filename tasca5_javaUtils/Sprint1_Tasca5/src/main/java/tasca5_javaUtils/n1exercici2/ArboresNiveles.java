package tasca5_javaUtils.n1exercici2;

import org.jetbrains.annotations.NotNull;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArboresNiveles {

    public void mostrarDatos(String ruta) {
        try {
            File directorio = new File(ruta);
            if (!directorio.exists() || !directorio.isDirectory()) {
                throw new FileNotFoundException("Error!!! La ruta del directorio no existe o no es válida");
            }

            File[] archivos = directorio.listFiles();
            if (archivos == null || archivos.length == 0) {
                throw new FileNotFoundException("Error!!! No se pueden listar los archivos del directorio. Directorio vacío o sin archivos");
            }

            Arrays.sort(archivos);
            mostrarInformacionArchivos(archivos, ruta);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }


    private void mostrarInformacionArchivos(File @NotNull [] archivos, String ruta) throws FileNotFoundException {
        SimpleDateFormat ultimaModificacion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Listado de los directorios y archivos en orden alfabético:\n");

        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println("\n(D)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
                mostrarSubarchivos(archivo, ruta, ultimaModificacion);
            } else {
                System.out.println("(F)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
            }
        }
    }


    private void mostrarSubarchivos(@NotNull File archivo, String ruta, SimpleDateFormat ultimaModificacion) throws FileNotFoundException {
        File subDirectorio = new File(archivo.getAbsolutePath());

        if (!subDirectorio.exists() || !subDirectorio.isDirectory()) {
            throw new FileNotFoundException("Error!!! La ruta del directorio no existe o no es válida");
        }

        if (subDirectorio.isDirectory()) {
            File[] subSubArchivos = subDirectorio.listFiles();

            if (subSubArchivos != null && subSubArchivos.length > 0) {
                Arrays.sort(subSubArchivos);

                for (File subSubArchivo : subSubArchivos) {
                    if (subSubArchivo.isDirectory()) {
                        System.out.println("\n(D)" + subSubArchivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(subSubArchivo.lastModified())));
                        mostrarSubarchivos(subSubArchivo, ruta, ultimaModificacion);
                    } else {
                        System.out.println("(F)" + subSubArchivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(subSubArchivo.lastModified())));
                    }
                }
            }
        }
    }

}