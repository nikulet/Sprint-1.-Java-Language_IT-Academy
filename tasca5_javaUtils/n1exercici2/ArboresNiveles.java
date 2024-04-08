package tasca5_javaUtils.n1exercici2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class ArboresNiveles {

    public void mostrarDatos(String ruta) {

        File directorio = new File(ruta); // Se crea un objeto de tipo File con la ruta proporcionada por parámetro

        if (!directorio.exists() || !directorio.isDirectory()) { //Se comprueba que el directorio exista y sea un directorio
            System.out.println("Error!!! La ruta del directorio no existe o no es válida");
            return; // Si el directorio no existe o no es válido, se sale del método returnado el mensaje de error
        }

        // Se obtienen los archivos del directorio recibido por parámetro y se almacenan en un arreglo de archivos
        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) { // Si la matriz de archivos es nula, se sale del método returnando el mensaje de error
            System.out.println("Error!!! No se pueden listar los archivos del directorio. Directorio vacío o sin archivos");
            return;
        }

        Arrays.sort(archivos);  // Se ordena la matriz de archivos en orden alfabético

        SimpleDateFormat ultimaModificacion = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Listado de los directorio/s y archivos en orden alfabético : \n");

        for (File archivo : archivos) { // Se recorre la matriz de archivos y se imprimen los nombres de los archivos

            if (archivo.isDirectory()) {
                System.out.println("\n(D)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
            } else {
                System.out.println("(F)" + archivo.getName() + " - Última modificación: " + ultimaModificacion.format(new Date(archivo.lastModified())));
            }

            File subDirectorio = new File(ruta + "/" + archivo.getName()); // Se crea un objeto de tipo File con la ruta del directorio y el nombre del archivo

            if(subDirectorio.isDirectory()) {
                String[] subSubArchivos = subDirectorio.list();

                if (subSubArchivos != null && subSubArchivos.length > 0) {
                    Arrays.sort(subSubArchivos);

                    for (String subSubArchivo : subSubArchivos) {
                        File archivoActual = new File(subDirectorio, subSubArchivo);

                        if(archivoActual.isDirectory()) {
                            System.out.println("\n(D)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                        } else {
                            System.out.println("(F)" + subSubArchivo + " - Última modificación: " + ultimaModificacion.format(new Date(archivoActual.lastModified())));
                        }
                    }
                }

            }

        }

    }


}