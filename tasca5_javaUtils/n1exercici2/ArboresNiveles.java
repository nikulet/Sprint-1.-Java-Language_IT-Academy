package tasca5_javaUtils.n1exercici2;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArboresNiveles {

    public void mostrarDatos(String ruta) throws FileNotFoundException {

        try {
            File[] archivos = datosRuta(ruta);
            Arrays.sort(archivos);

            SimpleDateFormat ultimaModificacion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            System.out.println("Listado de los directorio/s y archivos en orden alfabético:\n");

            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    System.out.println("\n(D)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
                } else {
                    System.out.println("(F)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
                }

                    File subDirectorio = new File(ruta + "/" + archivo.getName());

                    if (subDirectorio.isDirectory()) {
                        String[] subSubArchivos = subDirectorio.list();

                        if (subSubArchivos != null && subSubArchivos.length > 0) {
                            Arrays.sort(subSubArchivos);

                            for (String subSubArchivo : subSubArchivos) {
                                File archivoActual = new File(subDirectorio, subSubArchivo);

                                if (archivoActual.isDirectory()) {
                                    System.out.println("\n(D)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                                } else {
                                    System.out.println("(F)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                                }
                            }
                        }
                    }
                }
            } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File[] datosRuta(String ruta) throws FileNotFoundException {
        File directorio = new File(ruta);

        if (!directorio.exists() || !directorio.isDirectory()) {
            throw new FileNotFoundException("Error!!! La ruta del directorio no existe o no es válida");
        }

        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) {
            throw new FileNotFoundException("Error!!! No se pueden listar los archivos del directorio. Directorio vacío o sin archivos");
        }
        return archivos;
    }

}